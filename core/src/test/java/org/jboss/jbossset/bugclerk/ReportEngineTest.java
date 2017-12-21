package org.jboss.jbossset.bugclerk;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


import org.jboss.jbossset.bugclerk.checks.utils.CollectionUtils;
import org.jboss.jbossset.bugclerk.reports.ReportEngine;
import org.jboss.jbossset.bugclerk.reports.StringReportEngine;
import org.junit.Before;
import org.junit.Test;

public class ReportEngineTest {

    private ReportEngine<String> engine;

    @Before
    public void buildEngine() {
        this.engine = new StringReportEngine();
    }

    public Candidate buildCandidateWithViolations(String bugId, String checkname) {
        Candidate candidate = new Candidate(MockUtils.mockBzIssue(bugId, "summary"));
        for ( Violation v : MockUtils.mockViolationsListWithOneItem(bugId, checkname) )
            candidate.addViolation(v);
        return candidate;
    }

    @Test
    public void testMinorDisplay() {
        final String dummyUrl = "https://bugzilla.redhat.com/show_bug.cgi?id=168875";
        final String bugId = "168875";
        final String checkname = "checkname";

        final String report = engine.createReport(CollectionUtils.asSetOf(buildCandidateWithViolations(bugId, checkname)));
        assertTrue(report.contains(dummyUrl));
        assertTrue(report.contains(checkname));
    }

    @Test
    public void testTrivialLackOfDisplay() {
        final String dummyUrl = "https://bugzilla.redhat.com/show_bug.cgi?id=168875";
        final String bugId = "168875";
        final String checkname = "checkname";

        Candidate candidate = new Candidate(MockUtils.mockBzIssue(bugId, "summary"));
        candidate.addViolation(MockUtils.mockViolationWithSeverity(bugId, checkname, Severity.TRIVIAL));
        final String report = engine.createReport(CollectionUtils.asSetOf(candidate));
        assertTrue(report.contains(dummyUrl));
        assertFalse(report.contains(checkname));
    }
}
