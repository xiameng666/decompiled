import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public final class bwqf {
    public final File a;
    public final long b;
    private final Context c;
    private long d;
    private long e;
    private long f;
    private boolean g;

    public bwqf(Context context0, File file0, String s) {
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = false;
        if(file0 == null) {
            throw new NullPointerException("Index file directory must be set");
        }
        File file1 = hrnt.i() ? new File(ccsb.a.b(file0, "AppDataSearch")) : new File(file0, "AppDataSearch");
        if(!file1.exists()) {
            if(file1.mkdirs()) {
                goto label_11;
            }
            throw new IOException("The index path could not be created");
        }
        if(!file1.isDirectory()) {
            throw new IOException("The index path is not a directory");
        }
    label_11:
        this.c = context0;
        File file2 = hrnt.i() ? new File(ccsb.a.b(file1, s)) : new File(file1, s);
        this.a = file2;
        if(!file2.exists() && !file2.mkdirs()) {
            throw new IOException("Cannot create directory " + file2.toString());
        }
        long v = file2.getTotalSpace();
        this.b = v;
        if(v == 0L) {
            bwne.f("There is no storage capacity, icing will not index");
        }
    }

    public final double a() {
        this.k();
        return this.e < this.f ? ((double)(this.f - this.e)) / ((double)this.f) : 0.0;
    }

    public final long b() {
        this.k();
        return this.f;
    }

    final long c() {
        return this.a.getUsableSpace();
    }

    public final long d() {
        return bwqf.j(this.a);
    }

    public final long e() {
        this.k();
        return this.e;
    }

    final boolean f() {
        return bwto.a(this.c);
    }

    public static final boolean g(bwpz bwpz0) {
        long v1 = 0L;
        long v2 = 0L;
        for(int v = 0; v < bwpz0.b.size(); ++v) {
            bwpy bwpy0 = (bwpy)bwpz0.b.get(v);
            v1 += bwpy0.e;
            v2 += bwpy0.f;
        }
        long v3 = v1 + v2;
        return v3 == 0L ? false : ((double)v2) / ((double)v3) >= Math.min(1.0, ((double)huar.a.d().w()) / 100.0);
    }

    public final int h(double f) {
        if(f > 0.05) {
            this.k();
            if(this.e >= this.f) {
                this.k();
                if(!this.g) {
                    bwne.k("Not enough disk space for indexing trimmable");
                    return 3;
                }
                bwne.f("Not enough disk space for indexing");
                return 4;
            }
            return 2;
        }
        bwne.k("Design limits for indexing reached");
        return 5;
    }

    public static String i(int v) {
        try {
            return bwqe.a[v - 2];
        }
        catch(IndexOutOfBoundsException unused_ex) {
            return "unknown";
        }
    }

    private static long j(File file0) {
        if(file0.isDirectory()) {
            long v = 0L;
            Iterator iterator0 = new bwnd(file0.list(), file0).iterator();
            while(iterator0.hasNext()) {
                v += bwqf.j(((bwnc)iterator0).a());
            }
            return v;
        }
        return file0.length();
    }

    private final void k() {
        long v = SystemClock.elapsedRealtime();
        if(v - this.d >= 10000L) {
            this.d = v;
            this.e = this.d();
            boolean z = this.f();
            this.g = z;
            if(z) {
                this.f = 0L;
                return;
            }
            long v1 = huba.a.b().a();
            long v2 = huba.a.b().b();
            long v3 = this.c() + this.e;
            this.f = Math.min(0x7FFFFFFFFFFFFFFFL, Math.max((Math.max(v3 - v1, v3 - this.b * v2 / 100L) - 0x1400000L) / 2L, 0L));
        }
    }
}

