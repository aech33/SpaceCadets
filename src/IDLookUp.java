import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class IDLookUp {
  public IDLookUp()
      throws IOException
  {
    BufferedReader conReader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter email id:");
    String id = conReader.readLine();
    URL url = new URL("https://www.ecs.soton.ac.uk/people/" + id);

    Pattern re = Pattern.compile("title.*t=\"(.*)\"");
    Matcher matcher;
    BufferedReader urlReader = new BufferedReader(new InputStreamReader(url.openStream()));
    String curLine;
    do {
      curLine = urlReader.readLine();
      matcher = re.matcher(curLine);

    } while (!matcher.find());
    System.out.println(matcher.group(1));
  }
}
