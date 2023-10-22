public class  DataCenter {

    public static int getCommunicatingServersCount(int[][] map){
        int sum = 0;
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                if(serverExists(map[i][j]) && isCommunicating(i, j, map)){
                    sum++;
                }
            }
        }
        return sum;
    }

    private static boolean serverExists(int x){
        return x == 1;
    }

    private static boolean isCommunicating(int x, int y, int[][] map){
        for (int j = 0; j < map.length; j++) {
            if (map[j][y] == 1 && j != x) {
                return true;
            }
        }

        for(int i = 0; i < map[x].length; i++){
            if (map[x][i] == 1 && i != y) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(getCommunicatingServersCount(new int[][]{ {1, 0}, {0, 1} }));
        System.out.println(getCommunicatingServersCount(new int[][]{ {1, 0}, {1, 1} }));
        System.out.println(getCommunicatingServersCount(new int[][]{ {1, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}}));
    }
}
