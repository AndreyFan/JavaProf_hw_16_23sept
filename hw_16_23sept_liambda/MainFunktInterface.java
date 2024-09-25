package de.telran.hw_16_23sept_liambda;

import java.util.function.Consumer;

public class MainFunktInterface {
    //     1) Написать функциональный интерфейс Printable,
//     который содержит один метод void print(String text).
//    Используя этот интерфейс, напишите lambda выражения
//    для печати переданного текста большими буквами,
//    или маленькими буквами.
//    Возможно ли данный интерфейс заменить одним из стандартных
//    функциональных интерфейсов?
//    Если да, приведите пример.
    public static void main(String[] args) {
        Printable printable1 = new Printable() {  // реализация через анонимный класс
            @Override
            public void print(String text) {
                System.out.println(text.toUpperCase());

            }
        };
        printable1.print("task1---print text in UpperCase");
        System.out.println();

        // lambda выражение
        //   для печати переданного текста большими буквами
        Printable printable2 = text -> System.out.println(text.toUpperCase());
        printable2.print("task1-lambda выражение-print text in UpperCase");
        System.out.println();

        //  lambda выражение для печати текста маленькими буквами
        Printable printable3 = text -> System.out.println(text.toLowerCase());
        printable3.print("Task1-lambda выражение-print text in LowerCase");
        System.out.println();

        //    Возможно также  данный интерфейс заменить одним из стандартных
//    функциональных интерфейсов. Используем стандартный интерфейс Consumer

        Consumer<String> consumerPrintUpp = text -> System.out.println(text.toUpperCase());
        consumerPrintUpp.accept("task1-Consumer-print text in UpperCase");
        System.out.println();

        // Consumer для печати текста маленькими буквами
        Consumer<String> consumerPrintLower = text -> System.out.println(text.toLowerCase());
        consumerPrintLower.accept("task1-Consumer-print text in LowerCase");


    }
}








