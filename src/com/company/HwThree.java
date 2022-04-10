package com.company;

public class HwThree {
    public static void main(String[] args) {

        // Объявлем переменные всех примитивных типов данных
        byte varByte;
        short varShort;
        int varInt;
        long varLong;
        float varFloat;
        double varDouble;
        boolean varBoolean;

        // Инициализируем переменные
        // Используем удобные разделители "_" для больших чисел
        varByte = -11;
        varShort = 9485;
        varInt = 343_345_347;
        varLong = -222_987_876L;
        varFloat = 100_001.890_323F;
        varDouble = 333_344.977_233_234;
        varBoolean = true;

        // Задание 3. Используем таблицу unicode для символьных типов данных
        var varCharOne = '\u00A9';
        var varCharTwo = '\u00AE';
        var varCharThree = '\u00B5';

        // Выводим в консоль значение переменных
        System.out.println("Выводим значения переменных:");
        System.out.println("Значение типа varByte = " + varByte);
        System.out.println("Значение типа varShort = " + varShort);
        System.out.println("Значение типа varInt = " + varInt);
        System.out.println("Значение типа varLong = " + varLong);
        System.out.println("Значение типа varFloat = " + varFloat);
        System.out.println("Значение типа varDouble = " + varDouble);
        System.out.println("Значение типа varBoolean = " + varBoolean + '\n');

        // Выводим в консоль символы
        System.out.println("Выводим символьные значения:");
        System.out.println("Значение типа varCharOne = " + varCharOne);
        System.out.println("Значение типа varCharTwo = " + varCharTwo);
        System.out.println("Значение типа varCharThree = " + varCharThree);


    }
}
