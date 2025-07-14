package backtracking;

import java.util.ArrayList;

public class Maze {
    //counting the number  of paths  of the maze

    static int count(int r, int c) {
        if (r == 1 || c == 1) {

            System.out.println();
            return 1;

        }
        int left = count(r - 1, c);
        int right = count(r, c - 1);
        return left + right;

    }

    //printing the paths of the dice
    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;

        }
        if (r > 1) {
            path(p + "D", r - 1, c);

        }
        if (c > 1) {
            path(p + "R", r, c - 1);

        }

    }

    static ArrayList<String> pathArray(String p, int r, int c) {

        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(pathArray(p + "D", r - 1, c));

        }
        if (c > 1) {
            list.addAll(pathArray(p + "R", r, c - 1));

        }
        return list;


    }


    //DIAGNOL ALSO INCLUDED
    static ArrayList<String> pathArrayDiagonal(String p, int r, int c) {

        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1 && c > 1) {
            list.addAll(pathArrayDiagonal(p + 'D', r - 1, c - 1));
        }
        if (r > 1) {
            list.addAll(pathArrayDiagonal(p + "v", r - 1, c));

        }
        if (c > 1) {
            list.addAll(pathArrayDiagonal(p + "H", r, c - 1));

        }
        return list;


    }

    //path restrictions(disturbances)


    static void pathrestrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;

        }
        if (!maze[r][c]) {
            return;

        }
        if (r < maze.length - 1) {
            pathrestrictions(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            pathrestrictions(p + 'R', maze, r, c + 1);
        }


    }

    public static void main(String[] args) {
        boolean[][] maze = {{true, true, true}, {true, false, true}, {true, true, true}};
        pathrestrictions("", maze, 0, 0);
    }
}
