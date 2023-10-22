public class DataCenter2 {

    public static int getCommunicatingServersCount(int[][] map){
        int result = 0;
        int height = map.length;
        int width = map[0].length;
        int[][] connectedServers = new int[height][width];
        //iterate by rows
        for (int i = 0; i < height; i++){
            int firstServerIndex = -1;
            int secondServerIndex = -1;
            for(int j = 0; j < width; j++){
                if (map[i][j] == 1){
                    if(firstServerIndex == -1){
                        firstServerIndex = j;
                    }
                    else if(secondServerIndex == -1){
                        secondServerIndex = j;
                        connectedServers[i][firstServerIndex] = 1;
                        connectedServers[i][secondServerIndex] = 1;
                    }
                    else{
                        connectedServers[i][j] = 1;
                    }
                }
            }
        }
        //iterate by columns
        for (int i = 0; i < width; i++) {
            int firstServerIndex = -1;
            int secondServerIndex = -1;
            for(int j = 0; j < height; j++){
                if (map[j][i] == 1){
                    if(firstServerIndex == -1){
                        firstServerIndex = j;
                    }
                    else if(secondServerIndex == -1){
                        secondServerIndex = j;
                        connectedServers[firstServerIndex][i] = 1;
                        connectedServers[secondServerIndex][i] = 1;
                    }
                    else{
                        connectedServers[j][i] = 1;
                    }
                }
            }
        }
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                result += connectedServers[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getCommunicatingServersCount(new int[][]{ {1, 0}, {0, 1} }));
        System.out.println(getCommunicatingServersCount(new int[][]{ {1, 0}, {1, 1} }));
        System.out.println(getCommunicatingServersCount(new int[][]{ {1, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 1} }));
    }
}
