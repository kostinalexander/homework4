public class Main {
    public static void main (String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
    }
    public static void Task1() {
        System.out.println("Задание1");
        int age = 18;
        if (age >=18){
            System.out.println("Человеку 18 лет и более");
            if(age<18) {
                    System.out.println("Человеку нет 18-ти, вводить нельзя");
            }
            int children = 15;
            if (children >18) {
                System.out.println("Человеку есть 18 лет");
            }
            if (children < 18) {
                System.out.println("Человеку ещё нет 18-ти лет");
                // Решение первой задачи
            }
        }
    }
    public static void Task2(){
        System.out.println("Задание2");
        int t = 3;
        if (t < 5) {
            System.out.println("На улице "+ t+ " градуса, нужно надеть шапку");
        }
        if (t> 5) {
            System.out.println("На улице "+ t+ " градуса, шапку надевать не надо");
        }
        int T = 17;
        if (T > 5) {
            System.out.println("На улице "+ T+ " градусов, можно идти без шапки");
        }
        if (T < 5) {
            System.out.println("На улице "+ T+ " градусов, надо надеть шапку");
            // Здесь решение задания 2
        }
    }

    public static void Task3(){
        System.out.println("Задание3");
        int speed = 69;
        if (speed >= 60) {
            System.out.println("Скорость равна "+ speed+ " придётся заплатить штраф");
        }
        if (speed <= 60) {
            System.out.println("Скорость равна "+ speed+ " штраф платить не прийдётся");
        }
        int speeed = 53;
        if (speeed <= 60) {
            System.out.println("Скорость равна "+ speeed+ " штраф платить не прийдётся");
        }
        if (speeed >= 60) {
            System.out.println("Скорость равна "+ speeed+ "штраф прийдётся заплатить");
        }
        // Здесь решение задания 3
    }
    public static void Task4(){
       System.out.println("задание4");
       int children = 5;
       if (children>=2 && children<6) {
           System.out.println("Возраст = "+ children+ " Ему нужно ходить в детский сад");
        }else {
          System.out.println("Ему не нужно ходить в детский сад");
       }
       int schoolBoy = 16;
       if (schoolBoy >= 7 && schoolBoy < 18) {
           System.out.println("Возарст= "+ schoolBoy+ " Ему нужно ходить в школу");
       }else {
           System.out.println("Ему не нужно ходить в школу");
       }
       int student = 21;
       if (student > 18 && student < 24) {
           System.out.println("Возраст= "+ student+ " Ему пора ходить в универ");
       } else {
           System.out.println("Ему не нужно ходить в универ");
       }
       int big = 59;
       if (big > 24) {
           System.out.println("Возраст= "+ big+ " Пора на работу");
       }else {
           System.out.println("Ему ещё рано на работу");
       }
    }
    public static void Task5() {
        System.out.println("Задание5");
        int children = 3;
        if (children < 5) {
            System.out.println("Возраст = "+children+ " Ребёнок ещё мал, ему нельзя кататься на аттракционах");
        }else {
            System.out.println("Он уже большой, кататься можно");
        }
        int teenager = 11;
        if (teenager>5 && teenager<14) {
            System.out.println("Возраст = "+ teenager+ " Подросток может кататься под присмотром родителей, без родителей кататься нельзя");

        }else {
            System.out.println("Кататься нельзя");
        }
        int abult = 21;
        if (abult > 14) {
            System.out.println("Возраст = "+ abult+ " Человек взрослый и может кататься один");
        }
    }
    public static void Task6() {
        System.out.println("Задание6");
        int van = 102;
        int seed = 60;
        int stand = van - seed;
        if (seed <=60) {
            System.out.println("Сидячие места есть");
        }else {
            System.out.println("Сидячих мест нет");
        }
        if (stand < van - stand) {
            System.out.println("Стоячие места есть");
        } else {
            System.out.println("Стоячих мест нет");

        }
        if (van >102){
            System.out.println("В вагоне мест нет");
        }else {
            System.out.println("В вагоне есть места");
        }
    }
      public static void Task7() {
        System.out.println("Задание7");
        int one = 1;
        int two = 2;
        int three = 3;
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        if (three > one && three> two) {
            System.out.println(" Число "+ three+ " самое большое");
        } else {
            System.out.println("Число "+ two+ "самое большое");

        }
      }


}