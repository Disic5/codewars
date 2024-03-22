package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
//
//    @Test
//    void findRepeatElement() {
//        assertEquals(Set.of(4, 3, 5, 1), Main.findRepeatElement(new int[]{1, 11, 2, 3, 3,  5, 5, 5, 4, 4, 3, 12, 23, 1}));
//    }


  @Test
    public void findUniqCharTest(){
      assertEquals('s', Main.findUniqChar("QWERqwerDDEEnnsQWERqwer"));
  }
}