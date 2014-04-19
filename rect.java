package rectangularCount;

public class rect {
	public static int calcRect(int height,int width)
	{
		int i0,j0,i1,j1;
		int count = 0;
		for(i0 = 0; i0 < width; i0++)
		{
			for(i1 = i0 + 1; i1 < width+1; i1++)
			{
				for(j0 = 0; j0 < height; j0++)
				{
					for(j1 = j0 + 1; j1 < height+1; j1++)
					{
						count++;
							
						if((i1 - i0) == (j1 - j0))
						{
							count--;
						}
						else
						{
							System.out.println("("+i0+","+j0+")"+" "+"("+i1+","+j1+")");
						}
					}
				}	
			}
		}
		System.out.println("有 "+count+" 个长方形");
		return count;
	}
}
