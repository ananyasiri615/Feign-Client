package com.ars.entity;

public class Book {
	
	private Integer bookId;
	private String bookName;
    private Double bookCost;
    
	public Book(Integer bookId, String bookName, Double bookCost) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookCost = bookCost;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Double getBookCost() {
		return bookCost;
	}
	public void setBookCost(Double bookCost) {
		this.bookCost = bookCost;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookCost=" + bookCost + "]";
	}
	

}
