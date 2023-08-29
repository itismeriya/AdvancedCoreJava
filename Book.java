package ArrayOfObject;

public class Book {
	private int id;
	private String name;
	private int price;
	
//entity reference - aggregation
	private Author author;
	private Publisher publisher;

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

	public Book(int id, String name, int price, Author author,Publisher publisher) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
		this.publisher=publisher;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", author=" + author + ", publisher="
				+ publisher + "]";
	}
}