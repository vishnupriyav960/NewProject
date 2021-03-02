package org.suite;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.test.AssertClass;
import org.test.Sample;

public class SuiteCounts {
@Test
public void test2() {
Result r = JUnitCore.runClasses(AssertClass.class, Sample.class);
System.out.println("\nRun Time:"+r.getRunTime());
System.out.println("\nRun Count:"+r.getRunCount());
System.out.println("\nIgnore Count:"+r.getIgnoreCount());
System.out.println("\nFailure Count:"+r.getFailureCount());
System.out.println("\nTc status:"+r.wasSuccessful());

List<Failure> failures = r.getFailures();
System.out.println("\nFailure List");
for (Failure f : failures) {
	System.out.println(f);
}
}
}
