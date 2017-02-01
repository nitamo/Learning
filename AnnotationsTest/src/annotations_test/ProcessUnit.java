package annotations_test;

/**
 * Created by Sergey 2 on 17.01.2017.
 */
public class ProcessUnit {
    @UseCase(id = 42, description = "The answer to the ultimate question")
    public String getTheAnswer() { return "42"; }

    @UseCase(id = 13)
    public int getBadNumber() { return 13; }
}
