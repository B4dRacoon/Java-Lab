package ru.mirea.practice10_3;

import ru.mirea.practice10_2.PCFactory;
import ru.mirea.practice10_2.ServerFactory;
import ru.mirea.practice10_1.Computer;

public class TestDesignPatterns {

    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ru.mirea.practice10_2.ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer server = ru.mirea.practice10_2.ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
        System.out.println("AbstractFactory PC Config::"+pc);
        System.out.println("AbstractFactory Server Config::"+server);
    }
}
