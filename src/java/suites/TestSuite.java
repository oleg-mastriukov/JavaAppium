package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.*;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        ArticleTests.class,
        ChangeAppConditionTests.class,
        GetStartedTests.class,
        MyListTests.class,
        SearchTests.class
})

public class TestSuite {
}
