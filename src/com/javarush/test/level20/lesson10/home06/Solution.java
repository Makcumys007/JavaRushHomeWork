package com.javarush.test.level20.lesson10.home06;

import java.io.*;

/* Запрет сериализации
Запретите сериализацию класса SubSolution используя NotSerializableException.
Сигнатуры классов менять нельзя
*/
public class Solution implements Serializable {
    private static final long serialVersionUID = 2L;

    public static class SubSolution extends Solution {
        private static final long serialVersionUID = 1L;
        private void writeObject(ObjectOutputStream out) throws NotSerializableException
        {
            throw new NotSerializableException();
        }

        private void readObject(ObjectInputStream ois) throws NotSerializableException
        {
            throw new NotSerializableException();
        }
    }
}
