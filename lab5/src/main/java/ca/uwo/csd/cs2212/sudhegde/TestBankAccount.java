package ca.uwo.csd.cs2212.sudhegde;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBankAccount {
  BankAccount account = BankAccount(10);
  double amount = account.debit(5);
  Assert.assertEquals(5.0,amount);
}
