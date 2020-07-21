package ru.geekbrains.thirdTask;

/*      3. Большая задача:
        a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
        b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта,
        поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        c. Для хранения фруктов внутри коробки можете использовать ArrayList;
        d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и
        вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
        e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той,
        которую подадут в compare в качестве параметра, true - если их веса равны,
        false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
        f. Написать метод, который позволяет пересыпать фрукты из текущей коробки
        в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами),
        соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты,
        которые были в этой коробке;
        g. Не забываем про метод добавления фрукта в коробку.*/

public class FruitMain
{
    public static void main(String[] args)
    {
        // write your code here

        Box<Orange> orangeBox = new Box<>(new Orange());
        orangeBox.addToBox(3);
        System.out.println("Вес коробки с апальсинами №1: " + orangeBox.getWeight());
        Box<Apple> appleBox = new Box<>(new Apple());
        appleBox.addToBox(5);
        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());
        System.out.println("Сравнение веса коробки с апельсинами №1 и с яблоками: " + orangeBox.compare(appleBox));
        Box<Orange> orangeBox1 = new Box<>(new Orange());
        System.out.println("Вес коробки с апальсинами №2: " + orangeBox1.getWeight());
        orangeBox.toAnotherBox(orangeBox1);
        System.out.println("Вес коробки с апальсинами №1 после пересыпания в коробку №2: " + orangeBox.getWeight());
//        System.out.println(orangeBox.getWeight());
        System.out.println("Вес коробки с апальсинами №2 после пересыпания из коробки №1: " + orangeBox1.getWeight());
//        System.out.println(orangeBox1.getWeight());
        orangeBox.addToBox(5);
        System.out.println("Вес коробки с апальсинами №1: " + orangeBox.getWeight());
//        System.out.println(orangeBox.getWeight());
        System.out.println("Сравнение веса коробки с яблоками и с апельсинами №2: " + appleBox.compare(orangeBox1));
        System.out.println("Сравнение веса коробки с апельсинами №1 и с апельсинами №2: " + orangeBox1.compare(orangeBox));



    }
}
