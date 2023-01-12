package Factories;

import Archivators.*;

public class ArchiveFactory {

    public archive getArchive(ArchiveType type) {
        archive toReturn = null;
        switch (type) {
            case zip:
                toReturn = new zip();
                break;
            case rar:
                toReturn = new rar();
                break;
            default:
                throw new IllegalArgumentException("Wrong archive type:" + type);
        }
        return toReturn;
    }
}
