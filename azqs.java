import java.util.List;

final class azqs {
    public String a;
    public long b;
    private gged_interceptors c;
    private gged_interceptors d;

    public azqs() {
        this.a = null;
        this.b = -1L;
        this.c = ggna.a;
        this.d = ggna.a;
    }

    final azqt a() {
        if(this.a == null) {
            throw new IllegalStateException("packageName must be defined");
        }
        if(this.b < 0L) {
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        if(this.c.isEmpty() && this.d.isEmpty()) {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        return new azqt(this.a, this.b, this.c, this.d);
    }

    final void b(List list0) {
        batl.s(list0);
        this.d = gged_interceptors.i(list0);
    }

    final void c(List list0) {
        batl.s(list0);
        this.c = gged_interceptors.i(list0);
    }
}

