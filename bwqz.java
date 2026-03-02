import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public final class bwqz implements Closeable {
    public final String a;
    public final File b;
    final InputStream c;
    public final hfsl d;

    public bwqz(String s, File file0) {
        this.a = s;
        this.b = file0;
        FileInputStream fileInputStream0 = new FileInputStream(file0);
        this.c = fileInputStream0;
        this.d = hfsl.N(fileInputStream0);
    }

    @Override
    public final void close() {
        this.c.close();
    }
}

