import java.io.File;
import java.io.FileFilter;

public final class gabp implements FileFilter {
    @Override
    public final boolean accept(File file0) {
        return file0.getName().endsWith(".apk");
    }
}

