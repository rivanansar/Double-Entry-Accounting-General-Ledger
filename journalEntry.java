package tubespbo;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author madhan
 */
public class journalEntry {
    private int JENumber;
    private Date date;
    private String desc;
    private String namaAccDr;
    private String namaAccCr;
    private Account accDr;
    private Account accCr;
    private paymentDebit dr;
    private paymentCredit cr;
    private double amountDr;
    private double amountCr;
    
    public void journalEntry(generalLedger genLedger) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter JENumber: ");
        setJENumber(scanner.nextInt());

        System.out.print("Enter description: ");
        desc = scanner.next();

        System.out.print("Enter namaAccDr: ");
        namaAccDr = scanner.next();

        System.out.print("Enter namaAccCr: ");
        namaAccCr = scanner.next();

        System.out.print("Enter amountDr: ");
        amountDr = scanner.nextDouble();

        System.out.print("Enter amountCr: ");
        amountCr = scanner.nextDouble();
        
        dr = new paymentDebit(amountDr);
        cr = new paymentCredit(amountCr);

        findAccount(namaAccDr, genLedger).addDebit(dr);
        findAccount(namaAccCr, genLedger).addCredit(cr);
    }
    private Account findAccount(String namaAcc, generalLedger genLedger) {
        return null;
    }

    private void setJENumber(int JENumber) {
        this.JENumber = JENumber;
    }

    private int getJENumber() {
        return JENumber;
    }

    public void save() {
        
    }
}
