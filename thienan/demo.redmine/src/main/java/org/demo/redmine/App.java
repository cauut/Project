package org.demo.redmine;

import java.util.List;

import com.taskadapter.redmineapi.IssueManager;
import com.taskadapter.redmineapi.RedmineException;
import com.taskadapter.redmineapi.RedmineManager;
import com.taskadapter.redmineapi.RedmineManagerFactory;
import com.taskadapter.redmineapi.bean.Issue;





/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws RedmineException
    {
    	System.setProperty("http.proxyHost", "10.225.3.1");
    	System.setProperty("http.proxyPort", "3128");
    	 String uri = "http://apis.ifisolution.local:8080/projects/training-project";
    	    String apiAccessKey = "a3221bfcef5750219bd0a2df69519416dba17fc9";
    	    String projectKey = "training-project";
    	    Integer queryId = null; // any

    	    RedmineManager mgr = RedmineManagerFactory.createWithUserAuth(uri, "fresher12","12345678");
    	    IssueManager issueManager = mgr.getIssueManager();
    	    List<Issue> issues = issueManager.getIssues(projectKey, queryId);
    	    for (Issue issue : issues) {
    	        System.out.println(issue.toString());
    	    }

//    	    // Create issue
//    	    Issue issueToCreate = IssueFactory.createWithSubject("some subject");
//    	    Issue createdIssue = issueManager.createIssue(projectKey , issueToCreate);
//
//    	    // Get issue by ID:
//    	    Issue issue = issueManager.getIssueById(123);
    }
}
