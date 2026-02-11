/**
 * Activity 2.2.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  public static String owner = "PLTW";
  public static int numEntries = 0;
  private static int numBooks = 0;
  private static int numMovies = 0;
  private static int numSongs = 0;

  private Book book;
  private Movie movie;
  private Song song;

  public void addBook(Book b)
  {
    book = b;
    numEntries++;
    numBooks++;

    if (numEntries > 1) {
      System.out.println("one book only");
    }
  }

  public void addMovie(Movie m)
  {
    movie = m;
    numEntries++;
    numMovies++;  

    if (numEntries > 1) {
      System.out.println("one movie only");
    }
  }

  public void addSong(Song s)
  {
    song = s;
    numEntries++;
    numSongs++;

    if (numEntries > 1) {
      System.out.println("one song only");
    }
  }


  public static int getNumEntries()
  {
    return numEntries;
  }

  public static int getNumBooks()
  {
    return numBooks;
  }

  public static int getNumMovies()
  {
    return numMovies;
  }

  public static int getNumSongs()
  {
    return numSongs;
  }

  public static String getOwner()
  {
    return owner;
  }

  public static void changeOwner(String newOwner)
  {
    owner = newOwner;
  }

  public String toString() 
  {
    String info = "";
    
    // show state of MediaLib
    info += "MediaLib contains: \n";
    info += book + "\n";
    info += movie + "\n";
    info += song + "\n";
    return info;
  }

  public Book getBook()
  {
    return book;
  }

  public void testBook(Book tester)
  {
    tester.setTitle("Changed Title");
  }
}