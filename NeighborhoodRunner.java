import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
    
    BackgroundPainter dan = new BackgroundPainter();
    dan.paintBackground("white");
    
    FacePainter alex = new FacePainter();
    alex.paintface();

    TearPainter layla = new TearPainter();
    layla.paintTears();
    
  }
}
