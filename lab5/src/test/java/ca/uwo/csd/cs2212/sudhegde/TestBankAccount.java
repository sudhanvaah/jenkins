package ca.uwo.csd.cs2212.sudhegde;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBankAccount {
  @Test
  public void testDebitWithSufficientFunds(){
  BankAccount account = new BankAccount(10);
  double amount = account.debit(12);
  Assert.assertEquals(10.0,amount);
  }
}
