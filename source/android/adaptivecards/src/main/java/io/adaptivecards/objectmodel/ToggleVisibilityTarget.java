/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class ToggleVisibilityTarget {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected ToggleVisibilityTarget(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ToggleVisibilityTarget obj) {
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
        AdaptiveCardObjectModelJNI.delete_ToggleVisibilityTarget(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ToggleVisibilityTarget() {
    this(AdaptiveCardObjectModelJNI.new_ToggleVisibilityTarget(), true);
  }

  public String GetElementId() {
    return AdaptiveCardObjectModelJNI.ToggleVisibilityTarget_GetElementId(swigCPtr, this);
  }

  public void SetElementId(String value) {
    AdaptiveCardObjectModelJNI.ToggleVisibilityTarget_SetElementId(swigCPtr, this, value);
  }

  public IsVisible GetIsVisible() {
    return IsVisible.swigToEnum(AdaptiveCardObjectModelJNI.ToggleVisibilityTarget_GetIsVisible(swigCPtr, this));
  }

  public void SetIsVisible(IsVisible value) {
    AdaptiveCardObjectModelJNI.ToggleVisibilityTarget_SetIsVisible(swigCPtr, this, value.swigValue());
  }

  public String Serialize() {
    return AdaptiveCardObjectModelJNI.ToggleVisibilityTarget_Serialize(swigCPtr, this);
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue(AdaptiveCardObjectModelJNI.ToggleVisibilityTarget_SerializeToJsonValue(swigCPtr, this), true);
  }

  public static ToggleVisibilityTarget Deserialize(ParseContext context, JsonValue root) {
    long cPtr = AdaptiveCardObjectModelJNI.ToggleVisibilityTarget_Deserialize(ParseContext.getCPtr(context), context, JsonValue.getCPtr(root), root);
    return (cPtr == 0) ? null : new ToggleVisibilityTarget(cPtr, true);
  }

  public static ToggleVisibilityTarget DeserializeFromString(ParseContext context, String jsonString) {
    long cPtr = AdaptiveCardObjectModelJNI.ToggleVisibilityTarget_DeserializeFromString(ParseContext.getCPtr(context), context, jsonString);
    return (cPtr == 0) ? null : new ToggleVisibilityTarget(cPtr, true);
  }

}
