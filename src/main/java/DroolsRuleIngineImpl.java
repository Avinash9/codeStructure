import result.BaseResult;
import result.Person;
import support.RuleEngineProcessSupport;
import support.SupportCallBack;

public class DroolsRuleIngineImpl implements IRuleEngine{


    public Person process(Object ip , Person op) {

        final Person op1 = (Person) RuleEngineProcessSupport.process(new SupportCallBack()
        {
            public void getActiveRule() {

            }

            public void applyRules() {

            }

            public void getRules() {

            }

            public void fireAllRules() {

            }

//            public Void endSession() {
//                return null;
//            }

            public void buildResult(BaseResult baseResult) {

            }
        });
        return op1;

    }

    public void execute() {

    }
}
