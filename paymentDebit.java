/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;
import java.util.Date;
/**
 *
 * @author ACER
 */
public class paymentDebit {
    private Date tanggal;
    private double amount;

    public paymentDebit(double amount, Date tanggal) {
        this.amount = amount;
        this.tanggal = tanggal;
    }

    public void setDebit(double amount) {
        this.amount = amount;
    }

    public double getDebit() {
        return amount;
    }
}
