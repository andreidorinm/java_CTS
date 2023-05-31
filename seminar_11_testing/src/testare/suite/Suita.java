package testare.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testare.unitstests.AgentieTurismTest;
import testare.unitstests.PachetTuristicTest;
@RunWith(Suite.class)
@Suite.SuiteClasses({
        AgentieTurismTest.class, PachetTuristicTest.class
})
public class Suita {}
