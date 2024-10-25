/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dto;

/**
 *
 * @author tharu
 */
public class BookDto {
    private String bookId;
    private String btitle;
    private String Author;
    private String date;
    private String bcategory;

    public BookDto() {
    }

    public BookDto(String bookId, String btitle, String Author, String date, String bcategory) {
        this.bookId = bookId;
        this.btitle = btitle;
        this.Author = Author;
        this.date = date;
        this.bcategory = bcategory;
    }

    

    /**
     * @return the bookId
     */
    public String getBookId() {
        return bookId;
    }

    /**
     * @param bookId the bookId to set
     */
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    /**
     * @return the btitle
     */
    public String getBtitle() {
        return btitle;
    }

    /**
     * @param btitle the btitle to set
     */
    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    /**
     * @return the Author
     */
    public String getAuthor() {
        return Author;
    }

    /**
     * @param Author the Author to set
     */
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the bcategory
     */
    public String getBcategory() {
        return bcategory;
    }

    /**
     * @param bcategory the bcategory to set
     */
    public void setBcategory(String bcategory) {
        this.bcategory = bcategory;
    }

    @Override
    public String toString() {
        return "BookDto{" + "bookId=" + bookId + ", btitle=" + btitle + ", Author=" + Author + ", date=" + date + ", bcategory=" + bcategory + '}';
    }
    
    
}
