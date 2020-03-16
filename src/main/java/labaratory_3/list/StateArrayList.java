package labaratory_3.list;

import java.util.ArrayList;
import java.util.Scanner;
import labaratory_3.classes.*;

public  class StateArrayList  {
    ArrayList <State> arrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void forExample() {
        arrayList.add(new Kingdom("Сисилия","Андора",123444,1244));
        arrayList.add(new Kingdom("Висилия","Андора",123444,1244));
        arrayList.add(new Monarchy("Папа Франциск","Ватикан",122231,1241));
        arrayList.add(new Monarchy("Аапа Франциск","Ватикан",122231,1241));
        arrayList.add(new Monarchy("Вапа Франциск","Ватикан",122231,1241));
        arrayList.add(new Republic("Александр Григорьевич" ,"Беларусь",1009,12300));
        arrayList.add(new Republic("Ялександр Григорьевич" ,"Беларусь",100000,12300));
        arrayList.add(new Federation(85,"Россия",14600000,123123123));
    }

    public void addLast() {
        System.out.println("1:Federation\n2:Kingdom\n3:Monarchy\n4:Republic\n");
        switch (scanner.nextInt()) {
            case 1 :
                Federation federation = new Federation();
                federation.infoHowToInput();
                arrayList.add(federation.input());
                break;
            case 2 :
                Kingdom kingdom = new Kingdom();
                kingdom.infoHowToInput();
                arrayList.add(kingdom.input());
                break;
            case 3 :
                Monarchy monarchy = new Monarchy();
                monarchy.infoHowToInput();
                arrayList.add(monarchy.input());
                break;
            case 4 :
                Republic republic = new Republic();
                republic.infoHowToInput();
                arrayList.add(republic.input());
                break;
            default:
                System.out.println("\nError!\n");
        }
    }

    public void add() {
        System.out.println("Position: ");
        int i = scanner.nextInt();
        System.out.println("1:Federation\n2:Kingdom\n3:Monarchy\n4:Republic");
        switch (scanner.nextInt()) {
            case 1 :
                Federation federation = new Federation();
                federation.infoHowToInput();
                arrayList.add(i, federation.input());
                break;
            case 2 :
                Kingdom kingdom = new Kingdom();
                kingdom.infoHowToInput();
                arrayList.add(i, kingdom.input());
                break;
            case 3 :
                Monarchy monarchy = new Monarchy();
                monarchy.infoHowToInput();
                arrayList.add(i, monarchy.input());
                break;
            case 4 :
                Republic republic = new Republic();
                republic.infoHowToInput();
                arrayList.add(i, republic.input());
                break;
            default:
                System.out.println("\nError!\n");
        }
    }

    public void deleteByIndex() {
        System.out.println("Input delete position:");
        int i = scanner.nextInt();
        arrayList.remove(i);
    }

    public void deleteAll() {
        arrayList.clear();
    }

    public void getByIndex() {
        System.out.println("Input index:");
        int i = scanner.nextInt();
        arrayList.get(i).toString();
    }

    public void changeItemByIndex() {
        System.out.println("Change's index :");
        int i = scanner.nextInt();
        System.out.println("1:Federation\n2:Kingdom\n3:Monarchy\n4:Republic");
        switch (scanner.nextInt()) {
            case 1 :
                Federation federation = new Federation();
                federation.infoHowToInput();
                arrayList.set(i, federation.input());
                break;
            case 2 :
                Kingdom kingdom = new Kingdom();
                kingdom.infoHowToInput();
                arrayList.set(i, kingdom.input());
                break;
            case 3 :
                Monarchy monarchy = new Monarchy();
                monarchy.infoHowToInput();
                arrayList.set(i, monarchy.input());
                break;
            case 4 :
                Republic republic = new Republic();
                republic.infoHowToInput();
                arrayList.set(i, republic.input());
                break;
            default:
                System.out.println("\nError!\n");
        }
    }

    public void outputAll() {
        if(arrayList.size() != 0) {
            for (State state : arrayList)
                System.out.println(state.toString());
        } else System.out.println("arrayList is empty!");
    }

    public void sortList() {
        int k;
        String str;
        int returnState;
        for (int i = 0; i < arrayList.size(); i++) {
            k = i;
            str = arrayList.get(i).getClass().getName();
            for (int j = i; j < arrayList.size(); j++) {
                returnState = arrayList.get(j).compareState(arrayList.get(k));
                if (returnState == 2) {
                    k = j;
                }
            }
            State copy = arrayList.get(i);
            arrayList.set(i, arrayList.get(k));
            arrayList.set(k, copy);
        }
        outputAll();
    }

}

