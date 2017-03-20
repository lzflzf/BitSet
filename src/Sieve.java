
import java.util.BitSet;

public class Sieve {
	
	public static void main(String[] s)
	{
		long startMem = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		
		long start = System.currentTimeMillis();
		TestClass[] ints = new TestClass[10000000];
		
		for(int i =0 ;i<10000000;i++)
		{
			TestClass item = new TestClass(i,i+1,i+2,i+3,i+4);
			ints[i] = item ;
		}
		
		long endMem = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		System.out.println((endMem - startMem)/1024/1024 + "M" );
		
		System.exit(0);
		
		
		long end = System.currentTimeMillis();
		System.out.println((end - start) + " milliseconds" );		
		System.exit(0);
		
		int n = 2140000000;
		
		BitSet b = new BitSet(n+1);	
		int count = 0;
		int i ;
		for (i = 2; i <= n; i++)
		{
			b.set(i);
		}
		
		i = 2;
		
		while(i * i <= n)          // 将 根号n 内的素数 
		{
			if(b.get(i))           // 如果 i 是 素数
			{
				count ++ ;
				int k = i * i;
				while(k <= n )
				{
					b.clear(k);    // 将 i 的倍数标记 为非素数
					k += i;
				}
			}		
			i++ ;
		}
		
		while(i <= n)
		{
			if(b.get(i))
			{
				count ++;
			}
			i++;
		}
						
		System.out.println(count +" primes");				
	}		
}
