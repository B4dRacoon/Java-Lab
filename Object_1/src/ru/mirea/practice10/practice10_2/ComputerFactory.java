package ru.mirea.practice10_2;

import ru.mirea.practice10_1.Computer;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
