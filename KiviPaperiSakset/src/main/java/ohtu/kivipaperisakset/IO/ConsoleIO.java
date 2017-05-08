
package ohtu.kivipaperisakset.IO;

import java.util.Scanner;

/**
 *
 * @author pqkallio
 */
public class ConsoleIO implements IO {
    private final Scanner scanner;

    public ConsoleIO() {
        scanner = new Scanner(System.in);
    }
    
    @Override
    public String inputString() {
        return scanner.nextLine();
    }

    @Override
    public void outputString(String output) {
        System.out.println(output);
    }
}
