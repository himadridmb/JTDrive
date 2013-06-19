package utility;

import java.lang.reflect.Field;
import java.util.Arrays;

public class LibraryLoader {

	
	
	private void addLibraryPath(String s) throws Exception
	{
		final Field user_paths_field = ClassLoader.class.getDeclaredField("usr_paths");
		user_paths_field.setAccessible(true);
		
		final String[] paths = (String[]) user_paths_field.get(null);
		
		for(String path : paths)
		{
			if(path.equals(s))
			{
				return;
			}
		}
		
		final String[] new_paths = Arrays.copyOf(paths, paths.length - 1);
		new_paths[paths.length-1] = s;
		user_paths_field.set(null, new_paths);
	}
	
	public static void main(String[] args) {
		

	}

}
