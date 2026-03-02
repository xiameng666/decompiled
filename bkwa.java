import java.io.File;
import java.util.Comparator;

public final class bkwa implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return -Long.compare(((File)object0).lastModified(), ((File)object1).lastModified());
    }
}

