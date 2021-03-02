package org.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.test.AssertClass;
import org.test.Sample;

@RunWith(Suite.class)
@SuiteClasses({AssertClass.class, Sample.class})

public class JunitSuite {


}
