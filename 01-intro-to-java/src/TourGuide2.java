public class TourGuide2 {

    public static int getBestSightseeingPairScore(int[] places){
        int currentValue = 0;
        int maxValue = 0;
        for (int i = 0; i < places.length; i++){
            for (int j = i + 1; j < places.length; j++){
                currentValue = places[i] + places[j] + i - j;
                if(currentValue > maxValue){
                    maxValue = currentValue;
                }
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        System.out.println(getBestSightseeingPairScore(new int[]{8, 1, 5, 2, 6}));
        System.out.println(getBestSightseeingPairScore(new int[]{1, 2}));
    }
}
