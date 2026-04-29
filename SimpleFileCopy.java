import java.io.FileInputStream;
 import java.io.FileOutputStream;
 import java.io.IOException;
 import java.util.Scanner;
 public class SimpleFileCopy {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter source file name: ");
 String sourceFile = sc.nextLine();
 System.out.print("Enter destination file name: ");
 String destFile = sc.nextLine();
 try (
 FileInputStream inp = new FileInputStream(sourceFile);
FileOutputStream out = new FileOutputStream(destFile)
 ) {
 byte[] buffer = new byte[1024];
 int bytesRead;
 while ((bytesRead = inp.read(buffer)) != -1) {
 out.write(buffer, 0, bytesRead);
 }
 System.out.println("File copied successfully!");
 } catch (IOException e) {
 System.out.println("Error: " + e.getMessage());
 } finally {
 sc.close();
}
 }
 }
