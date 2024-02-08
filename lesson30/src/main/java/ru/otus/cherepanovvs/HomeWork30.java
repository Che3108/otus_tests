package ru.otus.cherepanovvs;

public class HomeWork30 {

    public int[] arrayFilter(int[] array) throws RuntimeException {
        if (array.length == 0) {
            throw new RuntimeException("Массив не содержит единиц");
        }
        int startIndex = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 1) {
                startIndex = i;
                break;
            }
        }
        if (startIndex == -1) {
            throw new RuntimeException("Массив не содержит единиц");
        }
        startIndex++;
        int[] filtredArray = new int[array.length - startIndex];
        for (int i = 0; i < filtredArray.length; i++) {
            filtredArray[i] = array[i + startIndex];
        }
        return filtredArray;
    }

    public boolean arrayValueControl(int[] array) {
        if (array.length == 0) {
            return false;
        }
        boolean noTrash = true;
        boolean containsOnes = false;
        boolean containsTwos = false;
        for (int i : array) {
            if ((i != 1) & (i != 2)) {
                noTrash = false;
                break;
            }
        }
        for (int i : array) {
            if (i == 1) {
                containsOnes = true;
                break;
            }
        }
        for (int i : array) {
            if (i == 2) {
                containsTwos = true;
                break;
            }
        }

        return noTrash & containsOnes & containsTwos;
    }
}
