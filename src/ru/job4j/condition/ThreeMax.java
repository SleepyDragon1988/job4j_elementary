package ru.job4j.condition;

public class ThreeMax{
        public static int max(int first, int second, int third) {
            int result = third;
            if (first >= second && first >= third) {
                result = first;
            }
            if (second >= first && second >= third) {
                result = second;
            }
            return result;
        }
        public static void main(String [] args){
            int mx1 = ThreeMax.max(10, 5, 3);
            System.out.println(mx1);
            int mx2 = ThreeMax.max(10, 50, 1);
            System.out.println(mx2);
            int mx3 = ThreeMax.max(1, 5, 100);
            System.out.println(mx3);
            int mx4 = ThreeMax.max(1,1,1);
            System.out.println(mx4);
            int mx5 = ThreeMax.max(10, 10, 1);
            System.out.println(mx5);
            int mx6 = ThreeMax.max(100,1, 100);
            System.out.println(mx6);
            int mx7 = ThreeMax.max(1, 100, 100);
            System.out.println(mx7);

        }
}