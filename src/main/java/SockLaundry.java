import java.util.*;
import java.util.stream.Collectors;

public class SockLaundry {
    //Do not delete or edit this method, you can only modify the block
    public int getMaximumPairOfSocks(int noOfWashes, int[] cleanPile, int[] dirtyPile) {
        //You can edit from here down
        Set<Integer> uniqueCleanPile = getUniqueSocks(cleanPile);
        Set<Integer> uniqueDirtyPile = getUniqueSocks(dirtyPile);
        int pair = 0;
        int noOfWashesLeft = noOfWashes;
        int unmatchedDirtySocks = 0;


        List<Integer> unmatchedCleanPairs = new ArrayList<>();

        if (uniqueCleanPile.size() < cleanPile.length) {
            for (Integer i: uniqueCleanPile) {
                int freePairCount = (int) Arrays.stream(cleanPile).boxed().filter(c -> c.equals(i)).count();
                if (freePairCount >= 2) {
                    pair += freePairCount / 2;

                    if (freePairCount % 2 != 0) {
                        unmatchedCleanPairs.add(i);
                    }
                } else {
                    unmatchedCleanPairs.add(i);
                }
            }
        } else {
            unmatchedCleanPairs.addAll(uniqueCleanPile);
        }

        for (Integer d: uniqueDirtyPile) {
            if (noOfWashesLeft == 0)
                return pair;

            int freePairCount = (int) Arrays.stream(dirtyPile).boxed().filter(c -> c.equals(d)).count();
            if (unmatchedCleanPairs.contains(d)) {
                noOfWashesLeft--;
                freePairCount--;
                unmatchedCleanPairs.remove(d);
                pair++;
            }

            if (freePairCount >= 2) {
                unmatchedDirtySocks += freePairCount / 2;
            }
        }

        noOfWashesLeft = noOfWashesLeft / 2;
        if (noOfWashesLeft > 0 && unmatchedDirtySocks > 0) {
            if (noOfWashes > unmatchedDirtySocks) pair += unmatchedDirtySocks;
            else pair += noOfWashesLeft;
        }

        return pair;
    }

    private Set<Integer> getUniqueSocks(int[] sockPile) {
        return Arrays.stream(sockPile).boxed().collect(Collectors.toSet());
    }
}
