package edu.cnm.deepdive;

import static edu.cnm.deepdive.CodingBatTheTenRun.tenRun;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatTheTenRunTest {

  private int[][] tenParams = {
      {2, 10, 3, 4, 20, 5},
      {10, 1, 20, 2},
      {10, 1, 9, 20},
      {1, 2, 50, 1},
      {1, 20, 50, 1},
      {10, 10},
      {10, 2},
      {0, 2},
      {1, 2},
      {1},
      {}
  };

  private int[][] tenExpected = {
      {2, 10, 10, 10, 20, 20},
      {10, 10, 20, 20},
      {10, 10, 10, 20},
      {1, 2, 50, 50},
      {1, 20, 50, 50},
      {10, 10},
      {10, 10},
      {0, 0},
      {1, 2},
      {1},
      {}

  };


  @Test
  void tenTest() {
    for (int i = 0; i < tenParams.length; i++) {
      String actual = Arrays.toString(tenRun(tenParams[i]));
      Assertions.assertEquals(actual, Arrays.toString(tenExpected[i]));
    }
  }


}