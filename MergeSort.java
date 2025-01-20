/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BookIs.controller.algorithms;
import com.bookis.model.Bookmodel;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ajita
 */

public class MergeSort {

    // Sorts the list of Bookmodel objects by name using MergeSort
    public List<Bookmodel> sortByName(List<Bookmodel> BookList) {
        if (BookList == null || BookList.size() <= 1) {
            return BookList; // Base case: a list of one or zero elements is already sorted
        }

        // Split the list into two halves
        int mid = BookList.size() / 2;
        List<Bookmodel> left = BookList.subList(0, mid);
        List<Bookmodel> right = BookList.subList(mid, BookList.size());

        // Recursively sort each half
        left = sortByName(left);
        right = sortByName(right);

        // Merge the sorted halves
        return merge(left, right);
    }

    // Merges two sorted lists of Bookmodel objects by name
    private List<Bookmodel> merge(List<Bookmodel> left, List<Bookmodel> right) {
        List<Bookmodel> result = new ArrayList<>();
        int i = 0, j = 0;

        // Merge the two lists in sorted order
        while (i < left.size() && j < right.size()) {
            // Compare the names of the books from both halves
            if (left.get(i).getName().compareTo(right.get(j).getName()) <= 0) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        // Add remaining elements if any
        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }
}

