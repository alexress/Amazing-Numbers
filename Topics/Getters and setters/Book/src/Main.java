class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public String getTitle() {
        return title;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setYearOfPublishing(final int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public void setAuthors(final String[] authors) {
        this.authors = authors;
    }
}