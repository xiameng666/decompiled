import java.util.Arrays;

public final class bnrc implements gfsi {
    public final ByteString a;

    public bnrc(ByteString hfsf0) {
        this.a = hfsf0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        long v = bnrm.a(this.a);
        int v1 = Arrays.binarySearch(((bnrl)object0).a, v);
        return v1 < 0 ? gfqx.a : gfsx.m(((bnrl)object0).d[((bnrl)object0).b[v1]]);
    }
}

