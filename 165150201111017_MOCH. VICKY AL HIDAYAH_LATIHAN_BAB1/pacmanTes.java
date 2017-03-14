package game;

import java.util.Scanner;

public class pacmanTes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //instansiasi
        pacman pc = new pacman();
        //variabel
        int stepleft = 20, score = 0;
        String tekan;
        //set awal
        pc.setAwal();
        //membuat array 2 dimensi
        int[][] array = new int[10][10];
        array[1][5] = 2;
        array[1][6] = 2;
        array[4][5] = 2;
        array[6][2] = 2;
        array[7][1] = 2;
        System.out.println("Mulai Game Pacman");
        do {      
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (array[i][j] != 2) {
                        array[i][j] = 0;
                        if (i == 0 || i == 9 || j == 0 || j == 9
                                || i == 2 && j == 5 || i == 2 && j == 6
                                || i == 2 && j == 7 || i == 2 && j == 8
                                || i == 4 && i == 1 || i == 4 && j == 6
                                || i == 6 && j == 3 || i == 6 && j == 4
                                || i == 7 && j == 5 || i == 7 && j == 6
                                || i == 8 && j == 3 || i == 8 && j == 4
                                || i == 8 && j == 5) {
                            array[i][j] = 1;
                        }
                    }
                }
            }
            if (array[pc.getY()][pc.getX()] == 2) {
                array[pc.getY()][pc.getX()] = 3;
                score = score + 1;
            }
            array[pc.getY()][pc.getX()] = 3;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (array[i][j] == 1) {
                        System.out.print("#");
                    } else if (array[i][j] == 0) {
                        System.out.print(" ");
                    } else if (array[i][j] == 2) {
                        System.out.print("@");
                    } else if (array[i][j] == 3) {
                        System.out.print("<");
                    }
                }
                System.out.println(" ");
            }
            System.out.println("step left : " + stepleft);
            System.out.println("score : " + score);
            System.out.print("enter move (w,a,s,d,and q for quit)>> ");
            tekan = in.nextLine();
            switch (tekan) {
                case "w":
                    pc.setW();
                    if (pc.getY() == 0) {
                        pc.setS();
                    } else if (array[pc.getY()][pc.getX()] == 1) {
                        pc.setS();
                    }
                    break;
                case "a":
                    pc.setA();
                    if (pc.getX() == 0) {
                        pc.setD();
                    } else if (array[pc.getY()][pc.getX()] == 1) {
                        pc.setD();
                    }
                    break;
                case "s":
                    pc.setS();

                    if (pc.getY() == 9) {
                        pc.setW();
                    } else if (array[pc.getY()][pc.getX()] == 1) {
                        pc.setW();
                    }
                    break;
                case "d":
                    pc.setD();
                    if (pc.getX() == 9) {
                        pc.setA();
                    } else if (array[pc.getY()][pc.getX()] == 1) {
                        pc.setA();
                    }
                    break;
            }
            stepleft = stepleft - 1;
            System.out.println("Step left : " + stepleft);
            System.out.println("Score : " + score);
        } while (score < 5 && stepleft > 0);
        
        if (score > 3) {
            System.out.println("You WIN");
        } else if (stepleft == 0) {
            System.out.println("You LOSE");
        } else if (stepleft == 0 && score < 3) {
            System.out.println("Play Again");
        }
    }
}
