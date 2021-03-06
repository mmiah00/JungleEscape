//API : http://mabe02.github.io/lanterna/apidocs/2.1/
import com.googlecode.lanterna.terminal.Terminal.SGR;
import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.input.Key.Kind;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.Terminal.Color;
import com.googlecode.lanterna.terminal.TerminalSize;
import com.googlecode.lanterna.LanternaException;
import com.googlecode.lanterna.input.CharacterPattern;
import com.googlecode.lanterna.input.InputDecoder;
import com.googlecode.lanterna.input.InputProvider;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.input.KeyMappingProfile;

public abstract class Scene {
  String[] path;
  int index = 0; //where player is on the path
  int minNum; //number of remaining minutes
  int secNum; //number of remaining seconds

  public String toString() {
    String s = " ";
    for (int i = 0; i < path.length; i++) {
      s = s + path[i];
    }
    return s;
  }

  public void moveLeft() { //moves player left
    if (index != 0) {
      path[index-1] = "o";
      path[index] = " ";
      index--;
    }
  }

  public void moveRight() { //move player right
    if (index != path.length-1) {
      path[index+1] = "o";
      path[index] = " ";
      index++;
    }
  }

  public boolean isLastSpot() { //checks if player is at end of path
    return index == path.length-1;
  }

  public static void putString(int r, int c,Terminal t, String s){
    t.moveCursor(r,c);
    for(int i = 0; i < s.length();i++){
      t.putCharacter(s.charAt(i));
    }
  }

  public int getMinLeft() {
    return minNum;
  }

  public int getSecLeft() {
    return secNum;
  }

  public void setMinLeft(int newNum) {
    minNum = newNum; //change min left
  }

  public void setSecLeft(int newNum) {
    secNum = newNum; //change sec left
  }
}
