public class TourGuide {

    public static int getBestSightseeingPairScore(int[] places){
        int maxPairScore = 0;
        int currPairScore;
        int first = 0;
        int second = 0;
        for(int i = 0; i < places.length - 1 ; i++){
            for(int j = i + 1; j < places.length; j++){
                currPairScore = places[i] + places[j] + (i - j);
                if(currPairScore > maxPairScore){
                    maxPairScore = currPairScore;
                    first = i;
                    second = j;
                }
            }
        }
        return maxPairScore;
    }

    public static void main(String[] args) {
        System.out.println(getBestSightseeingPairScore(new int[]{8, 1, 5, 2, 6}));
        System.out.println(getBestSightseeingPairScore(new int[]{1, 2}));
    }
}
