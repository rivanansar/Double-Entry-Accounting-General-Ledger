
package tubespbo;

import java.util.HashMap;
import java.util.Map;

public class subLedger extends Ledger {
    private Map<String, Account> accounts;
    private String accName;
    private boolean isDebit;
//    private double totalDebit;
//    private double totalCredit;
    
    public void Subledger(String ledgerName){
        setLedgerName(ledgerName);
    }
    
    public void createAccount(String accName, boolean isDebit) {
        Account newAccount = new Account();
        accounts.put(accName, newAccount);
        this.isDebit = isDebit;
    }
    
    public void updateSubLedger(){ 
        //sega dah buat
    
    }
}
