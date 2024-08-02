package bookclient;



public class BookModel {
	String isbn;
	String title;
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public BookModel(String isbn, String title) {
		super();
		this.isbn = isbn;
		this.title = title;
	}
	public BookModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BookModel [isbn=" + isbn + ", title=" + title + "]";
	}
	
	
	
}
