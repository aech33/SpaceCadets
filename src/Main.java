import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    try {
      IDLookUp challenge1 = new IDLookUp();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}