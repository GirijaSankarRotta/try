import java.io.File;
import java.util.Scanner;
class Files{
	public static void main(String[] args){
		String fn;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a file name : ");
		fn = sc.nextLine();
		File f1 = new File(fn);
		System.out.println("File name : "+f1.getName());
		System.out.println("Absolute Path : "+f1.getAbsolutePath());
		System.out.println(f1.exists() ? "The file exists" : "The file does not exist");
		System.out.println(f1.canWrite() ? "It is Writable" : "It is not Writable");
		System.out.println(f1.canRead() ? "It is readable" : "It is not readable");
		System.out.println(f1.isDirectory() ? "It is a isDirectory " : "It is not a directory");
		System.out.println(f1.isFile() ? "It is Normal file" : "It might be a name Pipe");
		System.out.println(f1.isAbsolute() ? "It is an absolute file" : "It is not absolute file");
		System.out.println("File size : "+f1.length() + "Bytes");
	}
}