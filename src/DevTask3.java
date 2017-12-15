
//package com.github.kevinsawicki.api;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.Date;

import org.eclipse.egit.github.core.RepositoryCommit;
import org.eclipse.egit.github.core.RepositoryId;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.CommitService;
import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.service.RepositoryService;

public class DevTask3 {

	public static void main(String[] args) throws IOException{
		//pageCommits();
		//printRepos();
		//Basic authentication
		/*
		GitHubClient client = new GitHubClient();
		client.setCredentials("damienos96", "WroC!aW96");*/
		printWatchers();
	}
	
	
	/*public static void pageCommits()
	{
		final int size = 25;
		final RepositoryId repo = new RepositoryId("github", "hubot");
		final String message = "   {0} by {1} on {2}";
		final CommitService service = new CommitService();
		int pages = 1;
		for (Collection<RepositoryCommit> commits : service.pageCommits(repo,
				size)) {
			System.out.println("Commit Page " + pages++);
			for (RepositoryCommit commit : commits) {
				String sha = commit.getSha().substring(0, 7);
				String author = commit.getCommit().getAuthor().getName();
				Date date = commit.getCommit().getAuthor().getDate();
				System.out.println(MessageFormat.format(message, sha, author,
						date));
			}
		}
	}*/
	
	/*public static void printRepos() throws IOException
	{
		final String user = "defunkt";
		final String format = "{0}) {1}- created on {2}";
		int count = 1;
		RepositoryService service = new RepositoryService();
		for (Repository repo : service.getRepositories(user))
			System.out.println(MessageFormat.format(format, count++,
					repo.getName(), repo.getCreatedAt()));
	}*/
	
	public static void printWatchers() throws IOException
	{
		RepositoryService service = new RepositoryService();
		for (Repository repo : service.getRepositories("damienos96"))
		  System.out.println(repo.getName() + " Watchers: " + repo.getWatchers());
	}
}
