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

public class JungleEscape {

  public static void putString(int r, int c,Terminal t, String s){
    t.moveCursor(r,c);
    for(int i = 0; i < s.length();i++){
      t.putCharacter(s.charAt(i));
    }
  }

  public static void play2028(Terminal t) {
    NumberPuzzle A = new NumberPuzzle();
    putString(1, 1, t, A.toString());
    running = false;
  }

  public static void main(String[] args) {

    Terminal terminal = TerminalFacade.createTextTerminal();
    terminal.enterPrivateMode();

    TerminalSize size = terminal.getTerminalSize();
    terminal.setCursorVisible(false);

    boolean running = true;
    int mode = 0;
    long lastTime =  System.currentTimeMillis();
    long currentTime = lastTime;
    long timer = 0;


    while(running){
      play2028();
    }
  }

}
  /*
  create terminal
  scene1 (forest and clears terminal for 2048)
  play2048
   -takes in keystrokes and calls appropriate moves
   -clears once iscomplete
  scene2 (approaching the river and clears terminal for fifteenpuzzle)
  playfifteen
   -takes keystrokes and calls appropriate moves
   -clears once is isComplete
  scene 3 (walk across bridge and sees highway)
  playfrogger
  victory
  */