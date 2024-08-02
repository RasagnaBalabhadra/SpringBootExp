package bookclient;

public class ClientMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ClientBookApp client=new ClientBookApp();
		BookModel book1 = new BookModel("1234","C programming");
		String msg = client.createBook(book1);
		System.out.println(msg);
		
		BookModel book2 = new BookModel("1235","Python programming");
		msg = client.createBook(book2);
		System.out.println(msg);
		
		BookModel book3 = new BookModel("1236","Java programming");
		msg = client.createBook(book3);
		System.out.println(msg);
		
		BookModel book[] = client.getAllBooks();
		for(BookModel bk:book) {
			System.out.println(bk);
		}
		BookModel mybook = client.getBookByIsbn("1234");
		System.out.println(mybook);
	}

}
