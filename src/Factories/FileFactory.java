package Factories;

import Files.*;

public class FileFactory {

    public file getFile(FileType type) {
        file toReturn = null;
        switch (type) {
            case zip:
                toReturn = new zip();
                break;
            case rar:
                toReturn = new rar();
                break;
            case txt:
                toReturn = new txt();
                break;
            case json:
                toReturn = new json();
                break;
            case xml:
                toReturn = new xml();
                break;
            default:
                throw new IllegalArgumentException("Wrong archive type:" + type);
        }
        return toReturn;
    }
}
