
package tubespbo;

public abstract class Ledger {
    private String ledgerName;
    private double totalDebit;
    private double totalCredit;

    public String getLedgerName() {
        return ledgerName;
    }

    public void setLedgerName(String ledgerName) {
        this.ledgerName = ledgerName;
    }
    
    public void ledger(String ledgerName){
        setLedgerName(ledgerName);
    }
    
}
