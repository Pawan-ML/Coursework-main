/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.entity;

/**
 *
 * @author tharu
 */
public class IssueEntity {
    private String nic;
    private String bookid;
    private String issuedate;
    private String duedate;
    private String returnBook;

    public IssueEntity() {
    }

    public IssueEntity(String nic, String bookid, String issuedate, String duedate,String returnbook) {
        this.nic = nic;
        this.bookid = bookid;
        this.issuedate = issuedate;
        this.duedate = duedate;
        this.returnBook = returnbook;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the bookid
     */
    public String getBookid() {
        return bookid;
    }

    /**
     * @param bookid the bookid to set
     */
    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    /**
     * @return the issuedate
     */
    public String getIssuedate() {
        return issuedate;
    }

    /**
     * @param issuedate the issuedate to set
     */
    public void setIssuedate(String issuedate) {
        this.issuedate = issuedate;
    }

    /**
     * @return the duedate
     */
    public String getDuedate() {
        return duedate;
    }

    /**
     * @param duedate the duedate to set
     */
    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }
   
    /**
     * @return the returnBook
     */
    public String getReturnBook() {
        return returnBook;
    }

    /**
     * @param returnBook the returnBook to set
     */
    public void setReturnBook(String returnBook) {
        this.returnBook = returnBook;
    }

    @Override
    public String toString() {
        return "IssueEntity{" + "nic=" + nic + ", bookid=" + bookid + ", issuedate=" + issuedate + ", duedate=" + duedate + ", returnBook=" + returnBook + '}';
    }
    
    
}
