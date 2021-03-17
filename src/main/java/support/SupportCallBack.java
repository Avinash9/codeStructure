package support;

import result.BaseResult;

public interface SupportCallBack {


    void convertToInnerObject();
    void getActiveRule();

    void applyRules();

    void getRules();

    void fireAllRules();

//    Void endSession();

    void buildResult(BaseResult baseResult);
}
