/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public enum ImageSize {
  None(0),
  Auto,
  Stretch,
  Small,
  Medium,
  Large;

  public final int swigValue() {
    return swigValue;
  }

  public static ImageSize swigToEnum(int swigValue) {
    ImageSize[] swigValues = ImageSize.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (ImageSize swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + ImageSize.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private ImageSize() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private ImageSize(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private ImageSize(ImageSize swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

