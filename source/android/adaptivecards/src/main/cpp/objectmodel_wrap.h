/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

#ifndef SWIG_AdaptiveCardObjectModel_WRAP_H_
#define SWIG_AdaptiveCardObjectModel_WRAP_H_

class SwigDirector_ActionElementParser : public AdaptiveCards::ActionElementParser, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_ActionElementParser(JNIEnv *jenv);
    virtual ~SwigDirector_ActionElementParser();
    virtual std::shared_ptr< AdaptiveCards::BaseActionElement > Deserialize(AdaptiveCards::ParseContext &context,Json::Value const &value);
    virtual std::shared_ptr< AdaptiveCards::BaseActionElement > DeserializeFromString(AdaptiveCards::ParseContext &context,std::string const &value);
public:
    bool swig_overrides(int n) {
      return (n < 2 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<2> swig_override;
};

class SwigDirector_BaseCardElementParser : public AdaptiveCards::BaseCardElementParser, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_BaseCardElementParser(JNIEnv *jenv);
    virtual ~SwigDirector_BaseCardElementParser();
    virtual std::shared_ptr< AdaptiveCards::BaseCardElement > Deserialize(AdaptiveCards::ParseContext &context,Json::Value const &value);
    virtual std::shared_ptr< AdaptiveCards::BaseCardElement > DeserializeFromString(AdaptiveCards::ParseContext &context,std::string const &value);
public:
    bool swig_overrides(int n) {
      return (n < 2 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<2> swig_override;
};

class SwigDirector_BaseElement : public AdaptiveCards::BaseElement, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_BaseElement(JNIEnv *jenv);
    SwigDirector_BaseElement(JNIEnv *jenv,AdaptiveCards::BaseElement const &arg0);
    SwigDirector_BaseElement(JNIEnv *jenv,AdaptiveCards::BaseElement &&arg0);
    virtual ~SwigDirector_BaseElement();
    virtual void SetId(std::string &&value);
    virtual void SetId(std::string const &value);
    virtual std::string Serialize() const;
    virtual Json::Value SerializeToJsonValue() const;
    virtual void GetResourceInformation(std::vector< AdaptiveCards::RemoteResourceInformation > &resourceUris);
public:
    bool swig_overrides(int n) {
      return (n < 5 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<5> swig_override;
};

class SwigDirector_BaseCardElement : public AdaptiveCards::BaseCardElement, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_BaseCardElement(JNIEnv *jenv,AdaptiveCards::CardElementType type,AdaptiveCards::Spacing spacing,bool separator,AdaptiveCards::HeightType height);
    SwigDirector_BaseCardElement(JNIEnv *jenv,AdaptiveCards::CardElementType type);
    SwigDirector_BaseCardElement(JNIEnv *jenv);
    SwigDirector_BaseCardElement(JNIEnv *jenv,AdaptiveCards::BaseCardElement const &arg0);
    SwigDirector_BaseCardElement(JNIEnv *jenv,AdaptiveCards::BaseCardElement &&arg0);
    virtual ~SwigDirector_BaseCardElement();
    virtual void SetId(std::string &&value);
    virtual void SetId(std::string const &value);
    virtual std::string Serialize() const;
    virtual Json::Value SerializeToJsonValue() const;
    virtual void GetResourceInformation(std::vector< AdaptiveCards::RemoteResourceInformation > &resourceUris);
    virtual bool GetSeparator() const;
    virtual void SetSeparator(bool value);
    virtual AdaptiveCards::Spacing GetSpacing() const;
    virtual void SetSpacing(AdaptiveCards::Spacing value);
public:
    bool swig_overrides(int n) {
      return (n < 9 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<9> swig_override;
};

class SwigDirector_BaseActionElement : public AdaptiveCards::BaseActionElement, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_BaseActionElement(JNIEnv *jenv,AdaptiveCards::ActionType type);
    SwigDirector_BaseActionElement(JNIEnv *jenv);
    SwigDirector_BaseActionElement(JNIEnv *jenv,AdaptiveCards::BaseActionElement const &arg0);
    SwigDirector_BaseActionElement(JNIEnv *jenv,AdaptiveCards::BaseActionElement &&arg0);
    virtual ~SwigDirector_BaseActionElement();
    virtual void SetId(std::string &&value);
    virtual void SetId(std::string const &value);
    virtual std::string Serialize() const;
    virtual Json::Value SerializeToJsonValue() const;
    virtual void GetResourceInformation(std::vector< AdaptiveCards::RemoteResourceInformation > &resourceUris);
    virtual void SetTitle(std::string &&value);
    virtual void SetTitle(std::string const &value);
    virtual void SetTooltip(std::string &&value);
    virtual void SetTooltip(std::string const &value);
public:
    bool swig_overrides(int n) {
      return (n < 9 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<9> swig_override;
};


#endif
