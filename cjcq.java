import java.io.Closeable;

final class cjcq implements Closeable {
    public int a;
    public bxf b;
    final cjcr c;

    public cjcq(cjcr cjcr0) {
        this.c = cjcr0;
        super();
    }

    @Override
    public final void close() {
        int v = this.a - 1;
        this.a = v;
        if(v == 0) {
            bxf bxf0 = this.b;
            if(bxf0 != null) {
                this.b = null;
                cjcr cjcr0 = this.c;
                synchronized(cjcr0.a) {
                    int v2 = bxf0.c;
                    for(int v3 = 0; v3 < v2; ++v3) {
                        cjcr0.x(((cjdm)bxf0.b(v3)));
                    }
                }
            }
        }
    }
}

