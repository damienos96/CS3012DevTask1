//Author: Damian Debny
//Student No. 15315535
//The libraries used in this program:
// https://github.com/eclipse/egit-github
// https://github.com/google/gson

import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
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
		String fileName = "C:/Eclipse/CS3012 Development Task 1/src/data.tsv";
		FileWriter write = new FileWriter(fileName, false);
		PrintWriter printLine = new PrintWriter(write);
		printLine.print("date close\n");
		printLine.close();
		
		System.out.println("Enter the name of a Github user: ");
		Scanner input = new Scanner(System.in);
		String user = input.nextLine();
		printRepos(user);
		System.out.println("Enter the name of one of the given repositories: ");
		String repo = input.nextLine();
		pageCommits(user, repo);
		
		//printWatchers();
		input.close();
	}
	
	
	public static void pageCommits(String user, String rep) throws IOException
	{
		System.out.println("Page commits for " + user);
		final int size = 25;
		RepositoryId repo = new RepositoryId(user, rep);
		final String message = "   {0} by {1} on {2} {3}";
		final CommitService service = new CommitService();
		int pages = 1;
		int totalCommits = 0;
		int commitsOnDay = 0;
		Date prevDate = new Date(0);
		for (Collection<RepositoryCommit> commits : service.pageCommits(repo,size))
		{
			totalCommits += commits.size();
			System.out.println("Commit Page " + pages++);
			for (RepositoryCommit commit : commits) {
				String sha = commit.getSha().substring(0, 7);
				String author = commit.getCommit().getAuthor().getName();
				Date date = commit.getCommit().getAuthor().getDate();
				String msgFrmt = "{0}";
				String arg1 = MessageFormat.format(msgFrmt, date).substring(0,2);
				String arg2 = MessageFormat.format(msgFrmt, prevDate).substring(0,2);
				String arg3 = date.toString().substring(4,7);
				String arg4 = prevDate.toString().substring(4,7);
				String arg5 = MessageFormat.format(msgFrmt, date).substring(6,8);
				String arg6 = MessageFormat.format(msgFrmt, prevDate).substring(6,8);
				if(!( (arg1).equals(arg2) && arg3.equals(arg4) && arg5.equals(arg6) ))
				{
					printToFile(prevDate, commitsOnDay);
					prevDate = date;
					commitsOnDay = 1;
				}
				else
				{
					commitsOnDay++;
				}
				
				//printToFile(date, commitsOnDay);
				String comment = commit.getCommit().getMessage();
				System.out.println(MessageFormat.format(message, sha, author, date, comment));
			}
		}
		System.out.println("Total number of commits " + totalCommits);
	}
	
	public static void printRepos(String user) throws IOException
	{
		System.out.println(user + "'s Repositories:");
		final String format = "{0}) {1}- created on {2}, language used: {3}";
		int count = 1;
		RepositoryService service = new RepositoryService();
		for (Repository repo : service.getRepositories(user))
			System.out.println(MessageFormat.format(format, count++, repo.getName(), repo.getCreatedAt(), repo.getLanguage()));
	}
	
	public static void printWatchers() throws IOException
	{
		RepositoryService service = new RepositoryService();
		for (Repository repo : service.getRepositories("awarde96"))
		  System.out.println(repo.getName() + " Watchers: " + repo.getWatchers());
	}
	
	public static void printToFile(Date date, int commits) throws IOException
	{
		if(!date.equals(new Date(0)))
		{
			String fileName = "C:/Eclipse/CS3012 Development Task 1/src/data.tsv";
			FileWriter write = new FileWriter(fileName, true);
			PrintWriter printLine = new PrintWriter(write);
			String output = "{0}";
			printLine.print((MessageFormat.format(output, date)).substring(0,3)+ date.toString().substring(4, 7)+ (MessageFormat.format(output, date)).substring(5,8) + " ");
			printLine.print(commits + "\n");
			printLine.close();
		}
		
	}
}
