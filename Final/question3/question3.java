import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class question3 
{
	public static Callable<Integer> WordCount(String filename)
	{
		return () ->
		{
			List<String> lines = Files.readAllLines(Paths.get(filename));
			int counter = 0;
			for(String line:lines)
			{
				String[] words = line.split("[\\PL]+");
				for(String word:words)
				{
					if (word.length() >= 4)
					{
						counter++;
					}
				}
			}
			return counter;
		};
	}
	
	public static void main(String[] args) throws Exception
	{
		String[] filenames = 
			{ 
	            "alice30.txt",
	            "war-and-peace.txt",
	            "crsto10.txt"
			};
		ExecutorService service = Executors.newCachedThreadPool();
		List<Callable<Integer>> tasks = new ArrayList<>();
		for(String filename:filenames)
		{
			tasks.add(WordCount(filename));
		}
		List<Future<Integer>> results = service.invokeAll(tasks);
		int totalCount = 0;
		for(Future<Integer> result:results)
		{
			totalCount += result.get();
		}
		for(int i=0;i<filenames.length;i++)
		{
			System.out.println(filenames[i] + " word count bigger than 4: " + results.get(i).get());
		}
		System.out.println("Total Count: " + totalCount);
	}
}
