package backtracking;

public class MazeWithAllDirections {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

//        printallPath("",board,0,0);
//        System.out.println(countAllPath("",board,0,0));
        int[][] arr = new int[board.length][board[0].length];
        allPathsArray("",arr,board,0,0,1);

    }

    static void allPathsArray(String p,int[][] arr, boolean[][] maze, int r, int c, int count){
        if(r == maze.length-1 && c == maze[0].length-1){
            arr[r][c] = count;
            for(int i = 0; i< arr.length;i++){
                for(int j = 0; j < arr[i].length; j++){
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
            System.out.println(p);
            System.out.println("----------------------------------------");
            arr[r][c] = 0;
            return;
        }
        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        arr[r][c] = count;

        if(r < maze.length-1){
            allPathsArray(p+"D",arr,maze,r+1,c,count+1);
        }

        if(c < maze[0].length - 1){
            allPathsArray(p+"R",arr,maze,r,c+1,count+1);
        }

        if(r>0){
            allPathsArray(p+"U",arr,maze,r-1,c,count+1);
        }

        if(c>0){
            allPathsArray(p+"L",arr,maze,r,c-1,count+1);
        }

        maze[r][c] = true;
        arr[r][c] = 0;

    }

    static void printallPath(String p, boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;

        if(r < maze.length-1){
            printallPath(p+"V",maze,r+1,c);
        }

        if(c < maze[0].length - 1){
            printallPath(p+"H",maze,r,c+1);
        }

        if(r>0){
            printallPath(p+"U",maze,r-1,c);
        }

        if(c>0){
            printallPath(p+"L",maze,r,c-1);
        }

        maze[r][c] = true;
    }

    static int countAllPath(String p, boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            return 1;
        }

        if(!maze[r][c]){
            return 0;
        }

        maze[r][c] = false;

        int vertical=0,hori=0,up=0,left=0;

        if(r < maze.length-1){
            vertical = countAllPath(p+"V",maze,r+1,c);
        }

        if(c < maze[0].length - 1){
            hori = countAllPath(p+"H",maze,r,c+1);
        }

        if(r>0){
            up = countAllPath(p+"U",maze,r-1,c);
        }

        if(c>0){
            left = countAllPath(p+"L",maze,r,c-1);
        }

        maze[r][c] = true;

        return vertical + hori + up + left;
    }
}
