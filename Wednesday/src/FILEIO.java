import java.io.*;


public class FILEIO {
	public static void main(String args[]) throws IOException{
		FileReader i = null;
		FileWriter o = null;
		try{
		i = new FileReader("input.txt");
		o = new FileWriter("output.txt");
		
		int c;
		
		while((c = i.read()) != -1){
			o.write(c);
		}
		}finally{
			if(i!=null){
				i.close();
			}
			if(o!=null){
				o.close();
			}
		}
	}

}
