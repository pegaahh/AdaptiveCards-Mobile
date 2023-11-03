/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class AdaptiveCardParseException extends java.lang.Exception {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected AdaptiveCardParseException(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AdaptiveCardParseException obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(AdaptiveCardParseException obj) {
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
        AdaptiveCardObjectModelJNI.delete_AdaptiveCardParseException(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public String getMessage() {
    return what();
  }

  public AdaptiveCardParseException(ErrorStatusCode statusCode, String message) {
    this(AdaptiveCardObjectModelJNI.new_AdaptiveCardParseException(statusCode.swigValue(), message), true);
  }

  public String what() {
    return AdaptiveCardObjectModelJNI.AdaptiveCardParseException_what(swigCPtr, this);
  }

  public ErrorStatusCode GetStatusCode() {
    return ErrorStatusCode.swigToEnum(AdaptiveCardObjectModelJNI.AdaptiveCardParseException_GetStatusCode(swigCPtr, this));
  }

  public String GetReason() {
    return AdaptiveCardObjectModelJNI.AdaptiveCardParseException_GetReason(swigCPtr, this);
  }

}
