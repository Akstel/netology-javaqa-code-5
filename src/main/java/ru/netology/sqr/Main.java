package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i <= 99; i++)
            if (i * i >= 700 && i * i < 1000)
//            if (i * i >= 500 && i * i < 700)
//            if (i * i >= 300 && i * i < 500)
//            if (i * i >= 200 && i * i < 300)
//            if (i * i >= 100 && i * i < 200)
                count = count + 1;
        System.out.println("Всего квадратов " +count);
        return ;

    }

}
