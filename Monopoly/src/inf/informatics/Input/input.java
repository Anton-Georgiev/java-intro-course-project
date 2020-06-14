package inf.informatics.Input;
import java.util.Scanner;
public class input {
        private static Scanner scan;

        public static Scanner getScanner() {
            if (scan == null){
                scan = new Scanner(System.in);
            }
            return scan;
        }
    }
}

