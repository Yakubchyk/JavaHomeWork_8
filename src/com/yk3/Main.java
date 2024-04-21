package com.yk3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Имя, затем ВВОД, после -  номер ID: ");
        User u1 = new User("Vova", new Pass(12345));
        User u2 = new User(scanner.nextLine(), new Pass(scanner.nextInt()));
        System.out.print("Клонировать обьект. Глубокое - 1, неГлубокое - 0 : ");
        int cl = scanner.nextInt();
        User u3 = new User("", new Pass(0));
        if (cl != 0) {
            u3 = (User) u2.clone();
            u3.getPass().setId(10000);

        } else {
            u3 = (User) u2.clone();
        }

        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);

        System.out.println("ID User 1 = "+ u1.getPass());
        System.out.println("ID User 2 = " + u2.getPass());
        System.out.println("ID User 3 = " + u3.getPass());

        System.out.println("Сравниваем User 2 и User 3: " + u2.equals(u3));



    }
}
