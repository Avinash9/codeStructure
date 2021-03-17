import result.Person;

public interface IRuleEngine {

    Object process(Object ip , Person op);
    void execute();
}
