package md.tekwill.bonus;

public class PrivateProp {
    private String book;
    private String author;
    private long pages;

    public String getBook(){
        return book;
    }
    public void setBook (String someBook){
        book = someBook;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor (String someAuthor){
        author = someAuthor;
    }

    public long getPages(){
        return pages;
    }
    public void setPages (long somePages){
        pages = somePages;
    }

    public void execute(){
        System.out.println("Autorul este " + getAuthor());
        System.out.println("care a scris cartea "+ getBook());
        System.out.println("cu un numar total de " + getPages() + " pagini.");
    }
}
