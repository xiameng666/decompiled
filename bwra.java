import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

final class bwra implements Closeable {
    final OutputStream a;
    final CodedOutputStream b;
    int c;

    public bwra(File file0) {
        FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
        this.a = fileOutputStream0;
        this.b = new hfsn(fileOutputStream0, 0x1000);
    }

    @Override
    public final void close() {
        this.a.close();
    }
}

