
//Design pattern - Singleton
//Reason - only one instance of the file manager class can exist, so the constructor is made private
// only one instance of the class exists as a private static attribute,
// and will only be initialized once, when it is null
// otherwise the same instance will be returned to the caller again and again

import java.util.Objects;

public class FileManager {
    private int fileID;
    private String filename;
    private static FileManager fileManager = null;

    public static FileManager getInstance()
    {
        if (fileManager == null)
        {
            fileManager = new FileManager();
        }

        return fileManager;
    }

    private FileManager() {
        this.fileID = 1;
        this.filename = "file";
    }

    @Override
    public boolean equals(Object obj) {
        return ((this.fileID==((FileManager) obj).getFileID()) && (Objects.equals(this.filename, ((FileManager) obj).getFilename())));
    }

    public int getFileID() {
        return fileID;
    }

    public String getFilename() {
        return filename;
    }

    public void setFileID(int fileID) {
        this.fileID = fileID;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
