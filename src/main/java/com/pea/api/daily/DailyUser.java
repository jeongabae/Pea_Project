/*
date	confirmed	death	released	tested	negative
 */
package com.pea.api.daily;

import com.pea.api.daily.aggregate.TestResult;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class DailyUser {
  private int date;
  private TestResult testResult;

  public DailyUser(int date, TestResult testResult){
    this.date = date;
    this.testResult = testResult;
  }
}
