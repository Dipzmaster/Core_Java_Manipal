package com.tests;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.kg.programs.ClassToBeTested;

public class RuleExceptionTesterExample {

  @Rule
  public ExpectedException exception = ExpectedException.none();

  @Test
  public void throwsArithmeticException() {
    exception.expect(ArithmeticException.class);
    exception.expectMessage("ZERO value not allowed");
    ClassToBeTested t = new ClassToBeTested();
    t.methodToBeTested(0);
    
  }
  
  
} 