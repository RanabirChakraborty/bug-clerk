package org.jboss.jbossset.bugclerk;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ 
        org.jboss.jbossset.bugclerk.checks.AssignedButStillOnSET.class,
        org.jboss.jbossset.bugclerk.checks.BZDepsShouldAlsoHaveFlags.class,
        org.jboss.jbossset.bugclerk.checks.BZShouldHaveDevAckFlag.class,
        org.jboss.jbossset.bugclerk.checks.BZShouldHaveQaAckFlag.class,
        org.jboss.jbossset.bugclerk.checks.BZShouldHaveTimeEstimate.class,
        org.jboss.jbossset.bugclerk.checks.CommunityBZ.class,
        org.jboss.jbossset.bugclerk.checks.ComponentUpgradeMissingFixList.class,
        org.jboss.jbossset.bugclerk.checks.FilterIssueEntries.class,
        org.jboss.jbossset.bugclerk.checks.IssueNotAssigned.class,
        org.jboss.jbossset.bugclerk.checks.OneOffPatchNotForSet.class,
        org.jboss.jbossset.bugclerk.checks.PostMissingPmAck.class,
        org.jboss.jbossset.bugclerk.checks.PostMissingPR.class,
        org.jboss.jbossset.bugclerk.checks.RegressionMayImpactOneOffRelease.class,
        org.jboss.jbossset.bugclerk.checks.ReleaseVersionMismatch.class,
        org.jboss.jbossset.bugclerk.checks.SummaryContainsPatchButTypeIsNotSupportPatch.class,
        org.jboss.jbossset.bugclerk.checks.TargetRelease.class,
        org.jboss.jbossset.bugclerk.checks.SprintVersionMismatch.class,
        org.jboss.jbossset.bugclerk.checks.TargetRelease.class,
        org.jboss.jbossset.bugclerk.checks.MilestonesSanityCheck.class,
        org.jboss.jbossset.bugclerk.checks.BZMissingUpstream.class,
        org.jboss.jbossset.bugclerk.checks.FixVersionAndSprintMustMatchBetweenSiblings.class,
        org.jboss.jbossset.bugclerk.checks.PRAgainstProperBranch.class,
        org.jboss.jbossset.bugclerk.checks.ComponentUpgradeReadyForQaDepsCheck.class,
        org.jboss.jbossset.bugclerk.checks.ComponentUpgradeModifiedAfterSetToReadyForQA.class,
        org.jboss.jbossset.bugclerk.checks.IssueOnPayloadButNotAssigned.class,
        org.jboss.jbossset.bugclerk.checks.HighPriorityIssueNotAssigned.class,
        org.jboss.jbossset.bugclerk.checks.ResolvedIssueWithFixVersionShouldHaveComponentUpgrade.class,
        org.jboss.jbossset.bugclerk.checks.IssueComponentVersionVsPullRequestBranch.class,
        org.jboss.jbossset.bugclerk.checks.BZMatchStreamForBlockers.class,
        org.jboss.jbossset.bugclerk.ReportEngineTest.class,
        // FIXME: Fails within Eclipse: org.jboss.jbossset.bugclerk.BuildReportToUpdateTracker.class,
        org.jboss.jbossset.bugclerk.comments.CommentPatternMatcherTest.class,
        org.jboss.jbossset.bugclerk.utils.URLUtilsTest.class,
        })
public class TestSuite {

}
