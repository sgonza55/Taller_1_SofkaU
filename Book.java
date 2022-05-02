/**
 * Library in order to create the Array.
 */
import java.util.ArrayList;

/**
 * This class represents a book and its main characteristics.
 * @author Santiago González
 */
public class Book {
    
    /**
     * It means the title of the book.
     */
    public String title;
    /**
     * It means the number of pages.
     */
    public Integer numberOfPages;
    /**
     * It means who wrote the book.
     */
    public String author;
    /**
     * It means the kind of book. Example: horror, thriller, romantic. 
     */
    public ArrayList<String> kind = new ArrayList<>();
    /**
     * It means which is the editorial published the book. 
     */
    public String editorial;

    /**
     * Gets the title of the book.
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book. 
     * @param title Title of the book.
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * Gets the number of pages.
     * @return The number of pages.
     */
    public Integer getNumberOfPages() {
        return numberOfPages;
    }
    /**
     * Sets the number of pages. 
     * @param numberOfPages Number of pages 
     */
    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    /**
     * Gets the book's author. 
     * @return the author's name.
     */
    public String getAuthor() {
        return author;
    }
    /**
     * Sets the book's author.
     * @param author the author's name.
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    /**
     * Gets a list of the kinds or genres of the book. 
     * @return a list of the kinds or genres of the book. 
     */
    public ArrayList<String> getKind() {
        return kind;
    }
    /**
     * Sets kinds or genres of the book and saves it within of a list. 
     * @param kind kinds or genres of the book. 
     */
    public void setKind(String kind) {
        this.kind.add(kind);
    }
    /**
     * Gets which publisher published the book.
     * @return publisher published the book.
     */
    public String getEditorial() {
        return editorial;
    }
    /**
     * Sets which publisher published the book.
     * @param editorial publisher published the book.
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
   
}
