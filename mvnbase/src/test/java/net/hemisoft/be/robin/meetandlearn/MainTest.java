package net.hemisoft.be.robin.meetandlearn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import net.hemisoft.be.robin.meetandlearn.Main;

/**
 * @author sairaghava.com
 */
public class MainTest {

  @Test
  public void testHello() {
    assertEquals("Hell! 00", new Main().sayHello());
  }
}
