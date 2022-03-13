package com.Bridgelabz.javabasic;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

    Random random = new Random();
    Scanner sc = new Scanner(System.in);
    float h;
    float t;
    public static void main(String[] args) {

            System.out.println("Enter the Number of Flips: ");
            int num = sc.nextInt();

            for (int i = 0; i < num; i++) {
                float flip = flip();
                System.out.println(flip);
                if (flip > 0.5){
                    h++;
                }
                else if (flip < 0.5){
                    t++;
                }
            }
            System.out.println(h);
            System.out.println(t);
            double percentH = (h/(h+t)) * 100;
            double percentT = 100 - percentH ;

            System.out.println("Heads: " + percentH);
            System.out.println("Tails: " + percentT);
        }
        static float flip(){
            return random.nextFloat();
        }
    }
