import j..util.DesugarCollections;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public final class fvob {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    private final boolean f;

    public fvob(boolean z) {
        this.a = 0;
        this.b = 0;
        this.f = z;
    }

    public final int a() {
        synchronized(this) {
        }
        return this.a;
    }

    public final int b() {
        synchronized(this) {
        }
        return this.b;
    }

    public static int c(BufferedReader bufferedReader0) {
        String s = bufferedReader0.readLine();
        if(s != null) {
            return Integer.parseInt(s);
        }
        throw new IOException("missing data");
    }

    public static File d(String s) {
        return huqs.c() ? new File(ccsb.a.d(s, "sessionSummary")) : new File(s, "sessionSummary");
    }

    final void e(gwvh gwvh0) {
        synchronized(this) {
            for(Object object0: DesugarCollections.unmodifiableList(((gwvi)gwvh0.b_message).f)) {
                gwtl gwtl0 = (gwtl)object0;
                if((gwtl0.b & 0x20) != 0) {
                    gwuv gwuv0 = gwtl0.h == null ? gwuv.a : gwtl0.h;
                    for(Object object1: gwuv0.j) {
                        gwtr gwtr0 = (gwtr)object1;
                        if((gwtr0.b & 0x40) != 0 && (gwtq.a(gwtr0.f) == 0 || gwtq.a(gwtr0.f) == 1)) {
                            ++this.a;
                        }
                    }
                    this.b += gwuv0.i.size();
                    for(Object object2: gwuv0.u) {
                        if((((gwse)object2).b & 2) != 0) {
                            ++this.c;
                        }
                    }
                }
            }
        }
    }

    final void f(int v) {
        synchronized(this) {
            this.e = v;
        }
    }

    final void g(String s) {
        synchronized(this) {
            PrintWriter printWriter0 = new PrintWriter(fvob.d(s));
            printWriter0.println(4);
            printWriter0.println(this.a);
            printWriter0.println(this.b);
            printWriter0.println((this.f ? "1" : "0"));
            printWriter0.println(this.c);
            printWriter0.println(this.d);
            printWriter0.println(this.e);
            printWriter0.close();
        }
    }

    public final boolean h() {
        synchronized(this) {
        }
        return this.f;
    }

    @Override
    public final String toString() {
        int v4;
        int v3;
        int v2;
        int v1;
        synchronized(this) {
            v1 = this.a;
            v2 = this.c;
            v3 = this.d;
            v4 = this.b;
        }
        return "SessionSummary [gpsCount=" + v1 + ", gpsMeasurementsCount=" + v2 + ", gpsNavigationMessagesCount=" + v3 + ", wifiScanCount=" + v4 + ", forceUpload=" + this.f + "]";
    }
}

