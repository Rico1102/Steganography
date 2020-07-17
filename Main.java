//package steganography;

public class Main 
{
  public static void main(String[] args) 
  {
    try
    {
      Embedder emb = new Embedder("awesome", "matrix.png", "garden.jpg", "answer.png");
       emb.embed();
      // Extractor ext = new Extractor("awesome", "D:/answer.png", "D:");
      // ext.extract();
      
    }
    catch(Exception ex)
    {
      System.out.println("Err: " + ex);
    }
  }
}
