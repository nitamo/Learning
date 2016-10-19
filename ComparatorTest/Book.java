class Book implements Comparable<Book> {
	int id;
	String name;

	public Book(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void setId(int id) { this.id = id; }
	public int getId() { return id; }

	public void setName(String name) { this.name = name; }
	public String getName() { return name; }

	@Override
	public String toString() {
		return "[" + name + "," + id + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Book))
			return false;
		return name.equals(((Book) obj).getName());
	}

	@Override
	public int compareTo(Book b) {
		return name.compareTo(b.name);
	}
}
