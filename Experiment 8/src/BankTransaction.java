/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dvd
 */
public abstract class BankTransaction {
    public final void performTransaction() {
        getNumber();
        doBusiness();
    }

    public void getNumber() {
        System.out.println("Get & Queue user account number...");
    }

    public abstract void doBusiness();
}
