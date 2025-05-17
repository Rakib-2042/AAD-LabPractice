package algorithm.withOOP.huffmancoding;

import java.util.PriorityQueue;

public class Huffman {
	public static void printcode(HuffmanNode root,String s) {
		if(root.left==null && root.right==null && Character.isLetter(root.c)) {
			System.out.println(root.c+":"+s);
			return;
		}
		printcode(root.left,s+"0");
		printcode(root.right,s+"1");
	}
	public static void main(String[] args) {
		char[] charArray= {'a','b','c','d','e','f'};
		int[] charfreq= {5,9,12,13,16,45};
		int n = charArray.length;
		
		PriorityQueue<HuffmanNode> q = new PriorityQueue<>(n,new HuffmanComparator());
		
		for(int i=0;i<n;i++) {
			HuffmanNode hn = new HuffmanNode();
			hn.c=charArray[i];
			hn.data=charfreq[i];
			hn.left=null;
			hn.right=null;
			q.add(hn);
		}
		
		HuffmanNode root= null;
		
		while(q.size() > 1) {
			HuffmanNode x = q.poll();
			HuffmanNode y = q.poll();
			
			HuffmanNode f = new HuffmanNode();
			f.data=x.data+y.data;
			f.c='-';
			f.left=x;
			f.right=y;
			root=f;
			q.add(f);
		}
		System.out.println("Huffman Codes:");
		printcode(root,"");
	}

}
