
//package com.github.kevinsawicki.api;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

import org.eclipse.egit.github.core.RepositoryCommit;
import org.eclipse.egit.github.core.RepositoryId;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.CommitService;
import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.service.RepositoryService;

public class DevTask3 {

	public static void main(String[] args) throws IOException{
		System.out.println("Enter the name of a Github user: ");
		Scanner input = new Scanner(System.in);
		String user = input.nextLine();
		
		printRepos(user);
		pageCommits(user);
		
		//printWatchers();
		//printLanguages();
		
		input.close();
	}
	
	
	public static void pageCommits(String user)
	{
		System.out.println("Page commits for " + user);
		final int size = 25;
		RepositoryId repo = new RepositoryId(user, "githubAPI");
		final String message = "   {0} by {1} on {2}";
		final CommitService service = new CommitService();
		int pages = 1;
		for (Collection<RepositoryCommit> commits : service.pageCommits(repo,size))
		{
			System.out.println("Commit Page " + pages++);
			for (RepositoryCommit commit : commits) {
				String sha = commit.getSha().substring(0, 7);
				String author = commit.getCommit().getAuthor().getName();
				Date date = commit.getCommit().getAuthor().getDate();
				System.out.println(MessageFormat.format(message, sha, author,
						date));
			}
		}
	}
	
	public static void printRepos(String user) throws IOException
	{
		//final String user = owner;
		System.out.println(user + "'s Repositories:");
		final String format = "{0}) {1}- created on {2}, language used: {3}";
		int count = 1;
		RepositoryService service = new RepositoryService();
		for (Repository repo : service.getRepositories(user))
			System.out.println(MessageFormat.format(format, count++,
					repo.getName(), repo.getCreatedAt(), repo.getLanguage()));
	}
	
	public static void printWatchers() throws IOException
	{
		RepositoryService service = new RepositoryService();
		for (Repository repo : service.getRepositories("awarde96"))
		  System.out.println(repo.getName() + " Watchers: " + repo.getWatchers());
	}
}
