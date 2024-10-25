/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dto;

/**
 *
 * @author tharu
 */
public class CategoryDto {
    private String catcode;
    private String title;
    private String description;

    public CategoryDto() {
    }

    public CategoryDto(String catcode, String title, String description) {
        this.catcode = catcode;
        this.title = title;
        this.description = description;
    }

 

    @Override
    public String toString() {
        return "CategoryDto{" + "catcode=" + getCatcode() + ", title=" + getTitle() + ", description=" + getDescription() + '}';
    }

    /**
     * @return the catcode
     */
    public String getCatcode() {
        return catcode;
    }

    /**
     * @param catcode the catcode to set
     */
    public void setCatcode(String catcode) {
        this.catcode = catcode;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
