
package tubespbo;
import java.util.HashMap;
import java.util.Map;


public class generalLedger extends Ledger {
    private String subLedgerName;
    private Map<String, subLedger> subLedgers;
//    private double totalDebit;
//    private double totalCredit;
    
    public void generalLedger(String ledgerName){
        setLedgerName(ledgerName);
    }
    
    public void ceateSubledger(String subledgerName) {
        subLedger newSubledger = new subLedger();
        subLedgers.put(subledgerName, newSubledger);
    }
    
    public void updateGeneralLedger(){
        //sega dah buat
    }
}
