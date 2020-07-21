package ru.geekbrains.twoFirstTasks;

import java.util.ArrayList;

public class ToArrayList <T>
{
    private T[] mass;
    private ArrayList<T> arrayList;

    public ToArrayList(T[] mass)
    {
        this.mass = mass;
        arrayList = new ArrayList<>();
        toArrayList();
    }

    public void toArrayList()
    {
        for(int i = 0; i < mass.length; i++)
        {
            arrayList.add(mass[i]);
        }
    }

    public void info()
    {
        System.out.println(arrayList.toString());
    }

    public ArrayList<T> getArrayList()
    {
        return arrayList;
    }
}
