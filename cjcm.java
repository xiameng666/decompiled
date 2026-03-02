import j..util.Objects;
import java.io.Closeable;
import java.util.Map.Entry;

final class cjcm implements Closeable {
    public bxf a;
    final cjcn b;
    private int c;

    public cjcm(cjcn cjcn0) {
        Objects.requireNonNull(cjcn0);
        this.b = cjcn0;
        super();
        this.c = 0;
        this.a = null;
    }

    final boolean a() {
        synchronized(this.b.a) {
        }
        return this.c != 0;
    }

    final void b() {
        synchronized(this.b.a) {
            ++this.c;
        }
    }

    @Override
    public final void close() {
        cjcn cjcn0 = this.b;
        synchronized(cjcn0.a) {
            gftb.q(this.c > 0);
            int v2 = this.c - 1;
            this.c = v2;
            bxf bxf0 = null;
            if(v2 == 0) {
                bxf bxf1 = this.a;
                this.a = null;
                bxf0 = bxf1;
            }
            if(bxf0 == null) {
                return;
            }
            try(cjcv cjcv0 = cjcn0.r()) {
                int v3 = bxf0.c;
                for(int v = 0; true; ++v) {
                    if(v >= v3) {
                        break;
                    }
                    Map.Entry map$Entry0 = (Map.Entry)bxf0.b(v);
                    cjcn0.ix(map$Entry0.getKey(), ((cjdf)map$Entry0.getValue()));
                }
            }
        }
    }
}

