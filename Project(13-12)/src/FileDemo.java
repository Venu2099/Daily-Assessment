import java.io.File;

class FileDemo
    {
        public static void main(String [ ]args) throws Exception
        {
                   File f = new File("d:/jp/streams","ece.xls");
          System.out.println("File Name = "+f.getName());
          System.out.println("Parent Name = "+f.getParent());
          System.out.println("Full Path = "+f.getPath());
          System.out.println("AbsolutePath ="+f.getAbsolutePath());
          System.out.println("Is it a File: "+f.isFile());
          System.out.println("Is it a Directory: "+f.isDirectory());
          System.out.println("Length ="+f.length());
          System.out.println("Is the File Exists ="+f.exists());
        }
    }