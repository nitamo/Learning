class Base {
	String name = "Name";

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Base)) return false;

		return this.name.equals(((Base)obj).name);
	}
}
