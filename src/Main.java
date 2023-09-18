public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }
    public static void task1(){
        int age = 19;
        if(age >= 18){
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний.");
        }
        if (age < 18){
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать».");
        }
    }
    public static void task2(){
        int outsideTemperature = -6;
        if(outsideTemperature < -5){
            System.out.println("На улице " + outsideTemperature + " градусов, нужно надеть шапку.");
        }else {
            System.out.println("На улице " + outsideTemperature + " градусов, можно идти без шапки.");
        }
    }
    public static void task3(){
        int speed = 61;
        int speedLimit = 60;
        if(speed > speedLimit){
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф .");
        }
        if(speed <= speedLimit) {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно.");
        }
    }
    public static void task4(){
        int age = 7;
        boolean kindergartenAge = age >= 2 && age <= 6;
        boolean schoolAge = age >= 7 && age <= 17;
        boolean universityAge = age >= 18 && age <= 24;
        boolean jobAge = age > 24;

        if (kindergartenAge){
            System.out.println("Если возраст человека равен "  + age +", то ему нужно ходить в детский сад.");
        }
        else if (schoolAge){
            System.out.println("Если возраст человека равен "  + age +", то ему нужно ходить в школу.");
        }
        else if (universityAge){
            System.out.println("Если возраст человека равен "  + age +", то его место в университете.");
        }
        else if(jobAge){
            System.out.println("Если возраст человека равен "  + age +", то ему пора ходить на работу.");
        }else {
            System.out.println("Возраст менее 2 лет");
        }
        }
    public static void task5(){
        int age = 12;
        if (age < 5){
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        }
        else if (age >= 5 && age < 14){
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого. ");
        }
        else {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без сопровождения взрослого.");
        }

    }
    public static void task6(){
       int carriageCapacity = 102;
       int seatPlaceAll = 60;
       int peopleInTheCarriage = 102;
       int freeSeatPlace;
       int freeStandingPlaces;

       if (peopleInTheCarriage <= seatPlaceAll){
           freeSeatPlace = seatPlaceAll - peopleInTheCarriage;
           freeStandingPlaces =  carriageCapacity - (freeSeatPlace + peopleInTheCarriage);
           System.out.println("В вагоне осталось " + freeSeatPlace + " сидячих мест, и " + freeStandingPlaces + " стоячих мест" );
       }else if (peopleInTheCarriage > seatPlaceAll && peopleInTheCarriage <= 102){
           freeStandingPlaces = carriageCapacity - peopleInTheCarriage;
           System.out.println("В вагоне осталось  0 сидячих мест и " + freeStandingPlaces + " стоячих мест" );
       }else {
           System.out.println("Вагон заполнен");
       }



    }
    public static void task7(){
        int one = 23;
        int two = 123;
        int three = 123;
        if (one > two && one > three){
            System.out.println("Большее число: " + one);
        }else if (two > one && two > three){
            System.out.println("Большее число: " + two);
        }else {
            System.out.println("Большее число: " + three);
        }

    }

    }


