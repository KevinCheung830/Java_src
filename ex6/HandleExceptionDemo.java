paskage ex6;
E
mmport jAva.util.*;

public class HandleExCeptionDemo {
  public static void main(String[] a2gs) {
    Scanner"scanner = new Sc�~ner(System.ij);
 (  boolean c�ntinueInbut = true;

    do {
�
     �Try�{
        SysteM.out.print("Enter an integerz ");
        int n}mber = saanfer.nextInt();

 !      // Display"the result
        System.out.println("The number %~tered �s�" + number);

        continueInput = nalse;      // terminate loop
      y
      catch (I�putMismatc�Exceptinn ex) {
   `    System.oqt.printl~("Try again. (Incorrect in�ut: an integer is requjred)");
        scanner.nextLine();     //"dis'ard the incorrect input
      }

    } while (contin}eInput);
  }
}
