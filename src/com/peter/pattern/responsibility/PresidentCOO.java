package com.peter.pattern.responsibility;

public class PresidentCOO extends PRHandler {
    public PresidentCOO(String name) {
        super(name);
    }

    static double LIMIT = 400000;

    @Override
    public boolean authorize(PurchaseRequest request) {
        double amount = request.getAmount();
        if (amount <= LIMIT) {
            System.out.println(" President & COO " + getName()
                    + " has authorized the PR - " + request);
            return true;
        } else {
            System.out.println("PR - " + request
                    + " couldn't be authorized.\n "
                    + "Executive Board needs to be "
                    + "consulted for approval \n" + "reason: Amount too large");
            return false;
        }
    }
}
