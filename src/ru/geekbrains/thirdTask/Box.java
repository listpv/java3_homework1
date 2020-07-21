package ru.geekbrains.thirdTask;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Box<T extends Fruit>
{
    private ArrayList<T> arrayList;
    private T obj;

    public Box(T obj)
    {
        arrayList = new ArrayList<>();
        this.obj = obj;
        arrayList.add(obj);

    }


    public Double getWeight()
    {
        return (arrayList.size() * obj.weight);
    }

    public void addToBox(int num)
    {
        for (int i = 0; i < num; i++)
        {
            arrayList.add(obj);
        }
    }

    public boolean compare(@NotNull Box<?> anotherBox)
    {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    public void toAnotherBox(@NotNull Box<T> anotherBox)
    {
        anotherBox.addToBox(arrayList.size());
        arrayList.clear();
    }

}
