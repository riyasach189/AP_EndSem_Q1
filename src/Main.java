public class Main {
    public static void main(String[] args) {
        FileManager fileManager1 = FileManager.getInstance();
        FileManager fileManager2 = FileManager.getInstance();

        //FileManager fileManager2 = new FileManager();
        //this will throw an error as constructor is private

        fileManager1.setFileID(2);
        fileManager2.setFileID(5);
        fileManager1.setFilename("abc");
        fileManager2.setFilename("xyz");

        System.out.println(fileManager1.equals(fileManager2));
        //returns true even if attribute values are changed by two different objects of FileManager class
    }
}