/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public enum FallbackType {
  None,
  Drop,
  Content;

  public final int swigValue() {
    return swigValue;
  }

  public static FallbackType swigToEnum(int swigValue) {
    FallbackType[] swigValues = FallbackType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (FallbackType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + FallbackType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private FallbackType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private FallbackType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private FallbackType(FallbackType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

