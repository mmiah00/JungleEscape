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

public class Scene5 extends Scene {

  public static void playScene5(Terminal terminal) {
    putString(0, 0, terminal, "           x");
    putString(0, 1, terminal, ".-. _______|");
    putString(0, 2, terminal, "|=|/     /  \\");
    putString(0, 3, terminal, "| |_____|_\"\"_|");
    putString(0, 4, terminal, "|_|_[X]_|____|");
    putString(0, 12, terminal, "| Great Job! You are SAFE! |");
    putString(0, 13, terminal, "| Your escape took time t  |");
    putString(0, 14, terminal, "|                          |");
    putString(0, 15, terminal, "|  Press ESC to exit game  |");
    boolean running = true;
    while (running) {
      Key key = terminal.readInput();
      if (key != null){
        if (key.getKind() == Key.Kind.Escape) {
          terminal.exitPrivateMode();
          running = false;
        }
      }
    }
    terminal.clearScreen();
  }
}