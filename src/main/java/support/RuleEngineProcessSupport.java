package support;

import result.BaseResult;
import result.Person;

public class RuleEngineProcessSupport {


    public  static BaseResult process(final SupportCallBack supportCallBack) {

        BaseResult result =null;
        try {
               a= supportCallBack.getActiveRule();
                supportCallBack.applyRules(a);
                supportCallBack.getRules();
//                supportCallBack.endSession();
                xyz.close();
                supportCallBack.buildResult(result);
        }
        catch (Exception ex)
        {

        }
        return  result;
    }


}
