package com.bootcamp.alimath;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import com.bootcamp.alimath.Utilities.Input;
import com.bootcamp.alimath.Utilities.Input.Command;
import java.util.Objects;
import org.junit.Test;

public class UtilitiesTest {

  @Test
  public void testEqualWithDifferentObjectSameParameter() {
    Input input = new Input(Command.NO_COMMAND, 0);
    Input inputOther = new Input(Command.NO_COMMAND, 0);
    assertEquals(input, inputOther);
  }

  @Test
  public void testEqualWithDifferentObjectDifferentParameter() {
    Input input = new Input(Command.NO_COMMAND, 0);
    Input inputOther = new Input(Command.NO_COMMAND, 1);
    assertNotEquals(input, inputOther);
  }

  @Test
  public void testEqualWithDifferentObjectDifferentSecondParameter() {
    Input input = new Input(Command.NO_COMMAND, 0);
    Input inputOther = new Input(Command.EXIT, 0);
    assertNotEquals(input, inputOther);
  }

  @Test
  public void testEqualWithNullParameter() {
    Input input = new Input(Command.NO_COMMAND, 0);
    assertNotEquals(input, null);
  }

  @Test
  public void testEqualWithDifferentTypeParameter() {
    Input input = new Input(Command.NO_COMMAND, 0);
    assertNotEquals(input, 1);
  }

  @Test
  public void testHashCode() {
    Input input = new Input(Command.NO_COMMAND, 123);
    assertEquals(input.hashCode(), Objects.hash(Command.NO_COMMAND, 123));
  }

  @Test
  public void testParseGivenNothingReturnsInputWithEmptyStringAndZeroValue() {
    assertEquals(new Input(Command.NO_COMMAND, 0), Utilities.parseInput(""));
  }

  @Test
  public void testParseGivenExitCommandReturnsInputWithExitStringAndZeroValue() {
    assertEquals(new Input(Command.EXIT, 0), Utilities.parseInput("exit"));
  }

  @Test
  public void testParseGivenCancelCommandReturnsInputWithExitStringAndZeroValue() {
    assertEquals(new Input(Command.CANCEL, 0), Utilities.parseInput("cancel"));
  }

  @Test
  public void testParseGivenAddCommandWithAnyIntegerValuesReturnsInputWithAddStringAndIntegerValue() {
    assertEquals(new Input(Command.ADD, -5), Utilities.parseInput("add -5"));
  }
}
