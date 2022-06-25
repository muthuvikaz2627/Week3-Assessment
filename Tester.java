package com.prodapt;
import java.util.*;

class Library{
	int id;
	String name;
	String author;
	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	public Library(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}}
// Business Logic	
class BusinessLogic{
	 ArrayList<Library> addBooks(){
		
		Library  l1 = new Library (1,"Alice In Wonderland","Lewis");
		Library  l2 = new Library (2,"Half Girlfriend","Chetan");
		Library  l3 = new Library (3,"Harry Potter","Rowling");
		Library  l4 = new Library (4,"Sherlock Holmes","Arthur");
		Library  l5 = new Library (5,"Romeo and Juliet","William");
		ArrayList<Library> LibraryDetail= new ArrayList<Library>();
		LibraryDetail.add(l1);
		LibraryDetail.add(l2);
		LibraryDetail.add(l3);
		LibraryDetail.add(l4);
		LibraryDetail.add(l5);
		return LibraryDetail;
}
// Display Records
	void displayRecord(ArrayList<Library> LibraryDetail){
		System.out.println("Books In The Library");
		for(Library l:LibraryDetail) {
			System.out.println(l);
		}}
// Update Books		
	void updateBooks(ArrayList<Library> LibraryDetail) {
			System.out.println("Updated Books");
			 LibraryDetail.set(2, new Library(6,"Harry Potter","Vikaz"));
			 for(Library l:LibraryDetail) {
					System.out.println(l);
		}}
// Delete Details
	void deleteBooks(ArrayList<Library> LibraryDetail) {
			System.out.println("Details are Deleted");
			 LibraryDetail.clear();
			 System.out.println("Library "+LibraryDetail);
			 
			 }
}
public class Tester {

	public static void main(String[] args) {
		BusinessLogic bl =new BusinessLogic ();
		ArrayList<Library> LibraryDetail = bl.addBooks();
		bl.displayRecord(LibraryDetail);
		bl.updateBooks(LibraryDetail);
		bl.deleteBooks(LibraryDetail);
		System.out.println("Thank You");
	}
}
