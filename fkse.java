import java.nio.ByteBuffer;

public final class fkse implements fkrl {
    public final hhps a;
    private final fkjj b;

    public fkse(fkjj fkjj0, hhps hhps0) {
        this.b = fkjj0;
        this.a = hhps0;
    }

    @Override  // fkrl
    public final gmcd a(Object object0, fkrn fkrn0) {
        gftb.check(this.a.a);
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(new byte[this.a.a.a(object0)]);
        ((gvex)this.a.a).b(((String)object0), byteBuffer0);
        byteBuffer0.flip();
        gged_interceptors gged0 = gged_interceptors.l(ByteString.v(byteBuffer0));
        fkjo fkjo0 = fkjp.a();
        fkjo0.a = 1;
        fkjm fkjm0 = fkjn.a();
        fkjm0.b(fkrn0.a);
        fkjm0.c(fkrn0.b);
        fkjo0.c(fkjm0.a());
        fkjo0.d(fkrn0.c);
        fkjp fkjp0 = fkjo0.a();
        return glzd.g(this.b.a(gged0, fkjp0), new fksd(this), gmap.a);
    }
}

