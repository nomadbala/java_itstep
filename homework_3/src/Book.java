public class Book {
    private String name;

    private String authorName;

    private String releaseYear;

    private String publisherHouse;

    private String genre;

    private int countOfPages;

    public Book() {
    }

    public Book(String name, String authorName, String releaseYear, String publisherHouse, String genre, int countOfPages) {
        this.name = name;
        this.authorName = authorName;
        this.releaseYear = releaseYear;
        this.publisherHouse = publisherHouse;
        this.genre = genre;
        this.countOfPages = countOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getPublisherHouse() {
        return publisherHouse;
    }

    public void setPublisherHouse(String publisherHouse) {
        this.publisherHouse = publisherHouse;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }



    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                ", releaseYear='" + releaseYear + '\'' +
                ", publisherHouse='" + publisherHouse + '\'' +
                ", genre='" + genre + '\'' +
                ", countOfPages=" + countOfPages +
                '}';
    }
}
