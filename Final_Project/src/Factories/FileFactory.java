package Factories;


import Files.*;

public class FileFactory {

    public file getArchive(FileType type) {
        file toReturn = null;
        switch (type) {
            case xml:
                toReturn = new xml();
                break;
            case txt:
                toReturn = new txt();
                break;
            case json:
                toReturn = new json();
                break;
            default:
                throw new IllegalArgumentException("Wrong File type:" + type);
        }
        return toReturn;
    }
}
