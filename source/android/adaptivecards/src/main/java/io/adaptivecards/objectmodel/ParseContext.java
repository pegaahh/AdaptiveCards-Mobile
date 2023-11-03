/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class ParseContext {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected ParseContext(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ParseContext obj) {
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
        AdaptiveCardObjectModelJNI.delete_ParseContext(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ParseContext() {
    this(AdaptiveCardObjectModelJNI.new_ParseContext__SWIG_0(), true);
  }

  public ParseContext(ElementParserRegistration elementRegistration, ActionParserRegistration actionRegistration) {
    this(AdaptiveCardObjectModelJNI.new_ParseContext__SWIG_1(ElementParserRegistration.getCPtr(elementRegistration), elementRegistration, ActionParserRegistration.getCPtr(actionRegistration), actionRegistration), true);
  }

  public void setElementParserRegistration(ElementParserRegistration value) {
    AdaptiveCardObjectModelJNI.ParseContext_elementParserRegistration_set(swigCPtr, this, ElementParserRegistration.getCPtr(value), value);
  }

  public ElementParserRegistration getElementParserRegistration() {
    long cPtr = AdaptiveCardObjectModelJNI.ParseContext_elementParserRegistration_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ElementParserRegistration(cPtr, true);
  }

  public void setActionParserRegistration(ActionParserRegistration value) {
    AdaptiveCardObjectModelJNI.ParseContext_actionParserRegistration_set(swigCPtr, this, ActionParserRegistration.getCPtr(value), value);
  }

  public ActionParserRegistration getActionParserRegistration() {
    long cPtr = AdaptiveCardObjectModelJNI.ParseContext_actionParserRegistration_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ActionParserRegistration(cPtr, true);
  }

  public void setWarnings(AdaptiveCardParseWarningVector value) {
    AdaptiveCardObjectModelJNI.ParseContext_warnings_set(swigCPtr, this, AdaptiveCardParseWarningVector.getCPtr(value), value);
  }

  public AdaptiveCardParseWarningVector getWarnings() {
    long cPtr = AdaptiveCardObjectModelJNI.ParseContext_warnings_get(swigCPtr, this);
    return (cPtr == 0) ? null : new AdaptiveCardParseWarningVector(cPtr, false);
  }

  public void PushElement(String idJsonProperty, InternalId internalId, boolean isFallback) {
    AdaptiveCardObjectModelJNI.ParseContext_PushElement__SWIG_0(swigCPtr, this, idJsonProperty, InternalId.getCPtr(internalId), internalId, isFallback);
  }

  public void PushElement(String idJsonProperty, InternalId internalId) {
    AdaptiveCardObjectModelJNI.ParseContext_PushElement__SWIG_1(swigCPtr, this, idJsonProperty, InternalId.getCPtr(internalId), internalId);
  }

  public void PopElement() {
    AdaptiveCardObjectModelJNI.ParseContext_PopElement(swigCPtr, this);
  }

  public boolean GetCanFallbackToAncestor() {
    return AdaptiveCardObjectModelJNI.ParseContext_GetCanFallbackToAncestor(swigCPtr, this);
  }

  public void SetCanFallbackToAncestor(boolean value) {
    AdaptiveCardObjectModelJNI.ParseContext_SetCanFallbackToAncestor(swigCPtr, this, value);
  }

  public void SetLanguage(String value) {
    AdaptiveCardObjectModelJNI.ParseContext_SetLanguage(swigCPtr, this, value);
  }

  public String GetLanguage() {
    return AdaptiveCardObjectModelJNI.ParseContext_GetLanguage(swigCPtr, this);
  }

  public ContainerStyle GetParentalContainerStyle() {
    return ContainerStyle.swigToEnum(AdaptiveCardObjectModelJNI.ParseContext_GetParentalContainerStyle(swigCPtr, this));
  }

  public void SetParentalContainerStyle(ContainerStyle style) {
    AdaptiveCardObjectModelJNI.ParseContext_SetParentalContainerStyle(swigCPtr, this, style.swigValue());
  }

  public InternalId PaddingParentInternalId() {
    return new InternalId(AdaptiveCardObjectModelJNI.ParseContext_PaddingParentInternalId(swigCPtr, this), true);
  }

  public void SaveContextForStyledCollectionElement(StyledCollectionElement current) {
    AdaptiveCardObjectModelJNI.ParseContext_SaveContextForStyledCollectionElement(swigCPtr, this, StyledCollectionElement.getCPtr(current), current);
  }

  public void RestoreContextForStyledCollectionElement(StyledCollectionElement current) {
    AdaptiveCardObjectModelJNI.ParseContext_RestoreContextForStyledCollectionElement(swigCPtr, this, StyledCollectionElement.getCPtr(current), current);
  }

  public ContainerBleedDirection GetBleedDirection() {
    return ContainerBleedDirection.swigToEnum(AdaptiveCardObjectModelJNI.ParseContext_GetBleedDirection(swigCPtr, this));
  }

  public void PushBleedDirection(ContainerBleedDirection direction) {
    AdaptiveCardObjectModelJNI.ParseContext_PushBleedDirection(swigCPtr, this, direction.swigValue());
  }

  public void PopBleedDirection() {
    AdaptiveCardObjectModelJNI.ParseContext_PopBleedDirection(swigCPtr, this);
  }

}
