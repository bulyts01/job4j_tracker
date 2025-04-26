package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        int row2 = 0;
        int row3 = 0;
        int cell2 = 0;
        for (int[] row : array) {
            for (int cell : row) {
                list.add(row2, array[row3][cell2]);
                row2++;
                cell2++;
            }
            cell2 = 0;
            row3++;
        }
        return list;
    }
}
