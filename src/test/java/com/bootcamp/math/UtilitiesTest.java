package com.bootcamp.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import com.bootcamp.math.Utilities.Input;
import java.util.Objects;
import org.junit.Test;

public class UtilitiesTest {

  @Test
  public void testEqualWithDifferentObjectSameParameter() {
    Input input = new Input("", 0);
    Input inputOther = new Input("", 0);
    assertEquals(input, inputOther);
  }

  @Test
  public void testEqualWithDifferentObjectDifferentParameter() {
    Input input = new Input("", 0);
    Input inputOther = new Input("asd", 1);
    assertNotEquals(input, inputOther);
  }

  @Test
  public void testEqualWithDifferentObjectDifferentSecondParameter() {
    Input input = new Input("", 0);
    Input inputOther = new Input("asd", 0);
    assertNotEquals(input, inputOther);
  }

  @Test
  public void testEqualWithNullParameter() {
    Input input = new Input("", 0);
    assertNotEquals(input, null);
  }

  @Test
  public void testEqualWithDifferentTypeParameter() {
    Input input = new Input("", 0);
    assertNotEquals(input, 1);
  }

  @Test
  public void testHashCode() {
    Input input = new Input("", 123);
    assertEquals(input.hashCode(), Objects.hash("", 123));
  }

  @Test
  public void testParseGivenNothingReturnsInputWithEmptyStringAndZeroValue() {
    assertEquals(new Input("", 0), Utilities.parseInput(""));
  }

  @Test
  public void testParseGivenExitCommandReturnsInputWithExitStringAndZeroValue() {
    assertEquals(new Input("exit", 0), Utilities.parseInput("exit"));
  }

  @Test
  public void testParseGivenCancelCommandReturnsInputWithExitStringAndZeroValue() {
    assertEquals(new Input("cancel", 0), Utilities.parseInput("cancel"));
  }

  @Test
  public void testParseGivenAddCommandWithAnyIntegerValuesReturnsInputWithAddStringAndIntegerValue() {
    assertEquals(new Input("add", -5), Utilities.parseInput("add -5"));
  }
}
