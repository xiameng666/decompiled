import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;

final class atju implements Closeable {
    final File a;
    final File b;
    final File c;
    final File d;
    public final boolean e;
    public String f;
    public boolean g;
    public static final int h;
    private static final aqql i;
    private static final Map j;

    static {
        atju.i = new aqql(new String[]{"BackupDataStore"});
        atju.j = new HashMap();
    }

    public atju(File file0, File file1, File file2, File file3, String s, boolean z) {
        this.a = file0;
        this.b = file1;
        this.c = file2;
        this.d = file3;
        this.f = s;
        this.e = z;
        this.e(1);
    }

    public static File a(File file0, String s) {
        file0.mkdirs();
        if(!file0.isDirectory()) {
            throw new IOException("not a directory and couldn\'t mkdirs: " + file0.toString());
        }
        File file1 = hrnt.i() ? new File(ccsb.a.b(file0, s)) : new File(file0, s);
        if(file1.exists()) {
            atju.i.d("deleting already existing file: %s", new Object[]{file1});
            file1.delete();
        }
        gftb.u(file1.createNewFile(), "file %s unexpectedly exists after deletion", file1);
        return file1;
    }

    public final RandomAccessFile b() {
        gftb.r(((boolean)(this.g ^ 1)), "already closed");
        return new RandomAccessFile(this.a, this.f);
    }

    public final RandomAccessFile c() {
        gftb.r(((boolean)(this.g ^ 1)), "already closed");
        return new RandomAccessFile(this.c, this.f);
    }

    @Override
    public final void close() {
        if(!this.g) {
            this.g = true;
            this.e(-1);
            ggdy ggdy0 = new ggdy();
            gged_interceptors gged0 = gged_interceptors.o(this.a, this.b, this.c, this.d);
            int v = ((ggna)gged0).c;
            for(int v1 = 0; v1 < v; ++v1) {
                File file0 = (File)gged0.get(v1);
                if(((int)(((Integer)atju.j.get(file0)))) == 0) {
                    ggdy0.i(file0);
                }
            }
            gged_interceptors gged1 = ggdy0.h();
            gfsx gfsx0 = gfqx.a;
            ggqk ggqk0 = gged1.E();
            while(ggqk0.hasNext()) {
                Object object0 = ggqk0.next();
                File file1 = (File)object0;
                try {
                    if(!file1.exists() || file1.delete()) {
                        continue;
                    }
                    throw new IOException(file1.toString());
                }
                catch(IOException iOException0) {
                    if(gfsx0.i()) {
                        ((IOException)gfsx0.d()).addSuppressed(iOException0);
                    }
                    else {
                        gfsx0 = gfsx.m(iOException0);
                    }
                }
            }
            if(gfsx0.i()) {
                throw (Throwable)gfsx0.d();
            }
        }
    }

    public final RandomAccessFile d() {
        gftb.r(((boolean)(this.g ^ 1)), "already closed");
        return new RandomAccessFile(this.b, this.f);
    }

    private final void e(int v) {
        gged_interceptors gged0 = gged_interceptors.o(this.a, this.b, this.c, this.d);
        int v1 = ((ggna)gged0).c;
        for(int v2 = 0; v2 < v1; ++v2) {
            File file0 = (File)gged0.get(v2);
            Integer integer0 = (Integer)atju.j.get(file0);
            int v3 = (integer0 == null ? 0 : ((int)integer0)) + v;
            gftb.u(v3 >= 0, "reached negative reference count for file: %s", file0);
            atju.j.put(file0, Integer.valueOf(v3));
        }
    }
}

