package ru.geekbrains.twoFirstTasks;

public class TwoElements<T>
{
    private T[] mass;

    public TwoElements(T[] mass)
    {
        this.mass = mass;
    }

    public void changeElements(int num1, int num2)
    {
        try
        {
            T var = mass[num1];
            mass[num1] = mass[num2];
            mass[num2] = var;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
            System.out.println("Заданные индексы выходят за границу массива. " + "Длина массива равна " + mass.length );
        }

    }

    public T[] getMass()
    {
        return mass;
    }

    public void info()
    {
        for(int i = 0; i < mass.length; i++)
        {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
    }
}
