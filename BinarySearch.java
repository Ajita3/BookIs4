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

public class BinarySearch {

    
    public Bookmodel searchByName(List<Bookmodel> BookList, String searchTerm) {
        int low = 0;
        int high = BookList.size() - 1;

        // Convert the search term to lowercase
        String searchTermLowerCase = searchTerm.toLowerCase();

        while (low <= high) {
            int mid = (low + high) / 2;

            // Get the name of the book and convert it to lowercase for case-insensitive comparison
            String bookNameLowerCase = BookList.get(mid).getName().toLowerCase();

            // Compare the book name with the search term (case-insensitive)
            int comparisonResult = bookNameLowerCase.compareTo(searchTermLowerCase);

            if (comparisonResult == 0) {
                return BookList.get(mid);  // Book found
            } else if (comparisonResult < 0) {
                low = mid + 1;  // Search the right half
            } else {
                high = mid - 1;  // Search the left half
            }
        }

        return null;  // Book not found
    }
}
  


