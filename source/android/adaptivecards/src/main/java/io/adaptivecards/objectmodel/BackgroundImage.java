/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class BackgroundImage {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected BackgroundImage(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BackgroundImage obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwn = own;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_BackgroundImage(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BackgroundImage() {
    this(AdaptiveCardObjectModelJNI.new_BackgroundImage__SWIG_0(), true);
  }

  public BackgroundImage(String url) {
    this(AdaptiveCardObjectModelJNI.new_BackgroundImage__SWIG_1(url), true);
  }

  public BackgroundImage(String url, ImageFillMode fillMode, HorizontalAlignment hAlignment, VerticalAlignment vAlignment) {
    this(AdaptiveCardObjectModelJNI.new_BackgroundImage__SWIG_2(url, fillMode.swigValue(), hAlignment.swigValue(), vAlignment.swigValue()), true);
  }

  public String GetUrl() {
    return AdaptiveCardObjectModelJNI.BackgroundImage_GetUrl(swigCPtr, this);
  }

  public void SetUrl(String value) {
    AdaptiveCardObjectModelJNI.BackgroundImage_SetUrl(swigCPtr, this, value);
  }

  public ImageFillMode GetFillMode() {
    return ImageFillMode.swigToEnum(AdaptiveCardObjectModelJNI.BackgroundImage_GetFillMode(swigCPtr, this));
  }

  public void SetFillMode(ImageFillMode value) {
    AdaptiveCardObjectModelJNI.BackgroundImage_SetFillMode(swigCPtr, this, value.swigValue());
  }

  public HorizontalAlignment GetHorizontalAlignment() {
    return HorizontalAlignment.swigToEnum(AdaptiveCardObjectModelJNI.BackgroundImage_GetHorizontalAlignment(swigCPtr, this));
  }

  public void SetHorizontalAlignment(HorizontalAlignment value) {
    AdaptiveCardObjectModelJNI.BackgroundImage_SetHorizontalAlignment(swigCPtr, this, value.swigValue());
  }

  public VerticalAlignment GetVerticalAlignment() {
    return VerticalAlignment.swigToEnum(AdaptiveCardObjectModelJNI.BackgroundImage_GetVerticalAlignment(swigCPtr, this));
  }

  public void SetVerticalAlignment(VerticalAlignment value) {
    AdaptiveCardObjectModelJNI.BackgroundImage_SetVerticalAlignment(swigCPtr, this, value.swigValue());
  }

  public boolean ShouldSerialize() {
    return AdaptiveCardObjectModelJNI.BackgroundImage_ShouldSerialize(swigCPtr, this);
  }

  public String Serialize() {
    return AdaptiveCardObjectModelJNI.BackgroundImage_Serialize(swigCPtr, this);
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue(AdaptiveCardObjectModelJNI.BackgroundImage_SerializeToJsonValue(swigCPtr, this), true);
  }

  public static BackgroundImage Deserialize(JsonValue json) {
    long cPtr = AdaptiveCardObjectModelJNI.BackgroundImage_Deserialize(JsonValue.getCPtr(json), json);
    return (cPtr == 0) ? null : new BackgroundImage(cPtr, true);
  }

  public static BackgroundImage DeserializeFromString(String jsonString) {
    long cPtr = AdaptiveCardObjectModelJNI.BackgroundImage_DeserializeFromString(jsonString);
    return (cPtr == 0) ? null : new BackgroundImage(cPtr, true);
  }

}
