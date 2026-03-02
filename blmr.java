import j..util.Objects;
import java.util.List;

final class blmr implements gmbg {
    final blms a;

    public blmr(blms blms0) {
        Objects.requireNonNull(blms0);
        this.a = blms0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        this.a.o = true;
    }

    @Override  // gmbg
    public final void b(Object object0) {
        blzx blzx0 = ((blzu)object0).a;
        if(blzx0.equals(blzx.a) || blzx0.equals(blzx.H) || blzx0.equals(blzx.T)) {
            List list0 = this.a.g;
            if(!list0.isEmpty() && list0.size() > this.a.k) {
                return;
            }
        }
        this.a.e.z(this.a.n, blhl.k, Long.valueOf(this.a.m));
        this.a.o = true;
    }
}

