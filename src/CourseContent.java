

public class CourseContent {
	public static void main (String [] args) throws Exception{
		int[][] array2d = {
				{0, 1, 2},
				{3, 4, 5},
				{6, 7, 8}
		};
		for(int i = 0; i < array2d.length; i++) {
			for(int j = 0; j < array2d[i].length; j++) {
				System.out.print(array2d[i][j] + " ");
			}
			System.out.println();
		}
	}
}
