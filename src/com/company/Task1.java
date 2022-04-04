package com.company;

public class Task1 {
    public static void main(String[] args) {
        int a = 15, b = 30, c = 50, x = 45, y = 25;
        if (a <= x || b <= y && b <= x || c <= y && a <= x || c <= y && a <= y || b <= x && a <= y || c <= x && b <= y || c <= x) {
            System.out.println("Yes!"); }
        else {
            System.out.println("No!");
        }
    }
}
