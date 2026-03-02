import java.io.Closeable;

final class cjcy implements Closeable {
    public int a;
    public boolean b;
    final cjdc c;

    public cjcy(cjdc cjdc0) {
        this.c = cjdc0;
        super();
    }

    @Override
    public final void close() {
        int v = this.a - 1;
        this.a = v;
        if(v == 0 && this.b) {
            this.b = false;
            this.c.B();
        }
    }
}

