/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dvd
 */
public class WithdrawMoney extends BankTransaction{
    @Override
    public void doBusiness() {
        System.out.println("Do Bussiness : Withdraw Money");
    }
}
