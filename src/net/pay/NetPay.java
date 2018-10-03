/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pay;

/**
 * Nicolas Lei,
 * September 17
 * To find how much employees get played
 */
public class NetPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double hours = 40;
        double perhour = 5.00;
        double insureance = 2.00;
        double netpay = 0.0;
        double tax = 0.22;
        
        // Net pay for an imployee
        netpay = (hours * perhour * insureance) - tax * (hours * perhour * insureance);
        System.out.println("The net play is " + "$"  + netpay + " for emloyees");
    }
    
}
