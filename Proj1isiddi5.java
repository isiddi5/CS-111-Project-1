
// write any needed import statements for system libraries
import java.awt.Color;

// Note the name of the class in the following line MUST
// match the name of the file. 
public class Proj1isiddi5
{
  
  public static void main (String[] args)
{
    System.out.println("Begin Java Exection"); System.out.println("");

   // put your Java Program here
    // create a PICTURE on which the turtle is to live
    String filename;
    filename = FileChooser.pickAFile();
    Picture p;
    p = new Picture ( filename );   // use the picture selected by pickAFile()
    
    
    
    int height = p.getHeight(); 
    p.addMessage ("I AM AMAZING", 20, height - 20 );

    p.show ();
    
    filename = FileChooser.pickAFile ();
    p.write (filename);
    

    System.out.println(""); System.out.println("End Java Exection");
}
} // end of Template class
