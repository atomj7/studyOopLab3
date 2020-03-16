import java.util.Scanner;
import labaratory_3.list.StateArrayList;

public class Main {
    public static void  main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        boolean isTrue = false;
        StateArrayList stateArrayList = new StateArrayList();
        while(!isTrue) {
            System.out.println("______________________________________");
            System.out.println("1 - add last");
            System.out.println("2 - add");
            System.out.println("3 - delete by index");
            System.out.println("4 - delete all");
            System.out.println("5 - get item by index");
            System.out.println("6 - change item by index");
            System.out.println("7 - sort list");
            System.out.println("8 - output all");
            System.out.println("9 - exit");
            System.out.println("10 - For example!");
            switch(scanner.nextInt()) {
                case 10:
                    stateArrayList.forExample();
                    break;
                case 1:
                    stateArrayList.addLast();
                    break;
                case 2:
                    stateArrayList.add();
                    break;
                case 3:
                    stateArrayList.deleteByIndex();
                    break;
                case 4:
                    stateArrayList.deleteAll();
                    break;
                case 5:
                    stateArrayList.getByIndex();
                    break;
                case 6:
                    stateArrayList.changeItemByIndex();
                    break;
                case 7:
                    stateArrayList.sortList();
                    break;
                case 8:
                    stateArrayList.outputAll();
                    break;
                case 9:
                    isTrue = true;
                    break;
            }
        }
    }
}

