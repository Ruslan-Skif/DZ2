public class Main {
    public static void main(String[] args) {
        //Task 1
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Task 1");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(" ");
        //Task 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Task 2");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(" ");
        //Task 3
        var newDog = (float)dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Task 3");
        System.out.println(newDog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(" ");
        //Task 4
        System.out.println("Task 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println(" ");
        //Task 5
        System.out.println("Task 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println(" ");
        //Task 6
        System.out.println("Task 6");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var diffWeight = weightBoxer2 - weightBoxer1;
        System.out.println("Разница в весе " + diffWeight + " кг.");
        System.out.println(" ");
        //Task 7
        System.out.println("Task 7");
        var ostDiv = weightBoxer2 % weightBoxer1;
        System.out.println(ostDiv);
        System.out.println(" ");
        //Task 8
        System.out.println("Task 8");
        var allTime = 640;
        var workTime = 8;
        var workers = allTime / workTime;
        System.out.println("Всего работников в компании - " + workers + " человек.");
        var workers2 = workers + 94;
        var allTime2 = workers2 * workTime;
        System.out.println("Если в компании работает " + workers2 + " человек, то всего " + allTime2 + " часов работы может быть поделено между сотрудниками.");
    }
}