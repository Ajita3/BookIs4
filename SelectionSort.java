/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BookIs.controller.algorithms;
import com.bookis.model.Bookmodel;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ajita
 */
public class SelectionSort {
    List<Bookmodel> BookSortList;
    
    public SelectionSort(){
        BookSortList = new ArrayList<>();
    }
    /**
     * Sorts a list of Bookmodel objects by their ISBN in ascending or
     * descending order.
     *
     * @param BookList the list of Bookmodel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public List<Bookmodel> sortByIsbn(List<Bookmodel> BookList, boolean isDesc) {
        this.BookSortList.clear();
        this.BookSortList.addAll(BookList);
        if (BookSortList == null || BookSortList.isEmpty()) {
            throw new IllegalArgumentException("Student list cannot be null or empty.");
        }
        for (int i = 0; i < BookSortList.size() - 1; i++) {
            int extremumIndex = findExtremumIndex(BookSortList, i, isDesc);
            if (i != extremumIndex) {
                swap(BookSortList, i, extremumIndex);
            }
        }
        return BookSortList;
    }
    /**
     * Finds the index of the extremum value (minimum or maximum) in the list
     * from the start index.
     *
     * @param BookSortList the list of StudentModel objects
     * @param startIndex the index to start searching from
     * @param isDesc specifies whether to find the maximum (true) or minimum
     * (false)
     * @return the index of the extremum value
     */
    private int findExtremumIndex(List<Bookmodel> BookSortList, int startIndex, boolean isDesc) {
        int extremumIndex = startIndex;
        for (int j = startIndex + 1; j < BookSortList.size(); j++) {
            if (shouldSwap(BookSortList.get(j).getIsbn(), BookSortList.get(extremumIndex).getIsbn(), isDesc)) {
                extremumIndex = j;
            }
        }
        return extremumIndex;
    }
    /**
     * Determines whether the current value should replace the current extremum
     * based on sort order.
     *
     * @param current the current value
     * @param extremum the current extremum value
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return true if the current value should replace the extremum; false
     * otherwise
     */
    private boolean shouldSwap(int current, int extremum, boolean isDesc) {
        return isDesc ? current > extremum : current < extremum;
    }
    /**
     * Swaps two elements in the list.
     *
     * @param BookSortList the list of StudentModel objects
     * @param i the index of the first element
     * @param j the index of the second element
     */
    private void swap(List<Bookmodel> studentSortList, int i, int j) {
        Bookmodel temp = BookSortList.get(i);
        BookSortList.set(i, studentSortList.get(j));
        BookSortList.set(j, temp);
    }
}