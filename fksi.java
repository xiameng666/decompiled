import java.nio.ByteBuffer;

public final class fksi implements glzn {
    public final fkso a;
    public final gfsx b;
    public final ByteBuffer c;
    public final fkrn d;

    public fksi(fkso fkso0, gfsx gfsx0, ByteBuffer byteBuffer0, fkrn fkrn0) {
        this.a = fkso0;
        this.b = gfsx0;
        this.c = byteBuffer0;
        this.d = fkrn0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gfsx gfsx0 = this.b;
        if(gfsx0.i()) {
            fkml fkml0 = (fkml)gfsx0.d();
            Long.valueOf(((fkjn)object0).b).getClass();
            fkml0.c = ((fkjn)object0).b;
            fkml fkml1 = (fkml)gfsx0.d();
            fkml1.d = ((fkjn)object0).c;
        }
        gged_interceptors gged0 = gged_interceptors.l(ByteString.v(this.c));
        fkjo fkjo0 = fkjp.a();
        fkjo0.a = 1;
        fkjo0.c(((fkjn)object0));
        fkjo0.d(this.d.c);
        fkjp fkjp0 = fkjo0.a();
        return this.a.a.b(gged0, fkjp0, gfsx0);
    }
}

