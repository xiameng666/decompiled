import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public final class iglz {
    private final File a;
    private final List b;

    public iglz() {
        File file0 = new File(System.getProperty("java.io.tmpdir"));
        this.a = file0;
        if(!file0.exists()) {
            file0.mkdirs();
        }
        this.b = new ArrayList();
    }

    public final void a() {
        for(Object object0: this.b) {
            igma igma0 = (igma)object0;
            try {
                igma0.a();
            }
            catch(Exception exception0) {
                igln.m.logp(Level.WARNING, "org.nanohttpd.protocols.http.tempfiles.DefaultTempFileManager", "clear", "could not delete file ", exception0);
            }
        }
        this.b.clear();
    }
}

