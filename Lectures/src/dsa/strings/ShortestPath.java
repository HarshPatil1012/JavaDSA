package dsa.strings;

public class ShortestPath {

    // Function to find the shortest path in a 2D plane given a sequence of directions
    public static float getShortestPath(String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            if (direction == 'N') {
                y++;
            } 
            else if (direction == 'S') {
                y--;
            } 
            else if (direction == 'E') {
                x++;
            } 
            else if (direction == 'W') {
                x--;
            }
        }
                            
        
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }

    public static float getShortestPath2(String path) {
        int x = 0, y = 0;
        for (char direction : path.toCharArray()) {
            switch (direction) {
                case 'N' : y++; 
                break;
                case 'S' : y--; 
                break;
                case 'E' : x++; 
                break;
                case 'W' : x--; 
                break;
            }
        }        
        return (float) Math.sqrt(x * x + y * y);
    }
    


    public static void main(String args[]) {
        String path = "WNEENESENNN";
        System.out.println("Shortest Path: " + getShortestPath(path));
        System.out.println("Shortest Path: " + getShortestPath2(path));

    }
}