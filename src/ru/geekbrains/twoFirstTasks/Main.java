package ru.geekbrains.twoFirstTasks;

//      1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
//        2. Написать метод, который преобразует массив в ArrayList;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        //  1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
        System.out.println("Задание №1.");
        Integer[] intMass = {1, 2, 3, 4, 5, 6, 7};
        TwoElements<Integer> integerTwoElements = new TwoElements<>(intMass);
        integerTwoElements.info();
        integerTwoElements.changeElements(2, 6);
        integerTwoElements.info();
        String[] strMass = {"Hello", "Bye", "I", "You", "We", "She", "He"};
        TwoElements<String> stringTwoElements = new TwoElements<>(strMass);
        stringTwoElements.info();
        stringTwoElements.changeElements(2, 6);
        stringTwoElements.info();

        //   2. Написать метод, который преобразует массив в ArrayList;

        System.out.println("Задание №2.");
        Integer[] intMass1 = {1, 2, 3, 4, 5, 6, 7};
        ToArrayList<Integer> integerToArrayList = new ToArrayList<>(intMass1);
        integerToArrayList.info();
        String[] strMass1 = {"Hello", "Bye", "I", "You", "We", "She", "He"};
        ToArrayList<String> stringToArrayList = new ToArrayList<>(strMass1);
        System.out.println(stringToArrayList.getArrayList());

    }
}
