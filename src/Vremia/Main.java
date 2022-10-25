package Vremia;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Поле для красивых выражений");
        String input = sc1.nextLine();
        Vremia vr1 = new Vremia(input);
    }
    }
