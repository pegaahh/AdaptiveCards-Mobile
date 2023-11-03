/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class StdOptionalLong {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected StdOptionalLong(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StdOptionalLong obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(StdOptionalLong obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_StdOptionalLong(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StdOptionalLong() {
    this(AdaptiveCardObjectModelJNI.new_StdOptionalLong__SWIG_0(), true);
  }

  public StdOptionalLong(long arg0) {
    this(AdaptiveCardObjectModelJNI.new_StdOptionalLong__SWIG_1(arg0), true);
  }

  public boolean has_value() {
    return AdaptiveCardObjectModelJNI.StdOptionalLong_has_value(swigCPtr, this);
  }

  public long value() {
    return AdaptiveCardObjectModelJNI.StdOptionalLong_value(swigCPtr, this);
  }

}
