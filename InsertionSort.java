/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BookIs.controller.algorithms;

import com.bookis.model.Bookmodel;
import java.util.List;

/**
 *
 * @author ajita
 */

public class InsertionSort {

    // Sorts the BookList by price in ascending or descending order
    public List<Bookmodel> sortByPrice(List<Bookmodel> BookList, boolean isDesc) {
        if (BookList == null || BookList.isEmpty()) {
            throw new IllegalArgumentException("Book list cannot be null or empty.");
        }

        // Insertion sort implementation
        for (int i = 1; i < BookList.size(); i++) {
            Bookmodel currentBook = BookList.get(i);
            int j = i - 1;

            // Find the correct position for the current book based on price
            while (j >= 0 && shouldSwap(BookList.get(j).getPrice(), currentBook.getPrice(), isDesc)) {
                BookList.set(j + 1, BookList.get(j)); // Shift the books
                j--;
            }
            // Insert the current book into the correct position
            BookList.set(j + 1, currentBook);
        }
        return BookList;
    }

    // Determines whether the current book should replace the previous one based on price and sort order
    private boolean shouldSwap(double currentPrice, double extremumPrice, boolean isDesc) {
        return isDesc ? currentPrice > extremumPrice : currentPrice < extremumPrice;
    }
}

