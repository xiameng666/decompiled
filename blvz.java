import j..util.Objects;
import java.util.List;

final class blvz implements gmbg {
    final bnae a;
    final blwa b;

    public blvz(blwa blwa0, bnae bnae0) {
        this.a = bnae0;
        Objects.requireNonNull(blwa0);
        this.b = blwa0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        blwa.e(this.b);
        blwa.d(this.b);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        blzx blzx0 = ((blzu)object0).a;
        blzx blzx1 = blzx.a;
        if(blzx0.equals(blzx1)) {
            List list0 = this.b.h;
            if(list0.isEmpty() || list0.size() <= this.b.k) {
                goto label_5;
            }
        }
        else {
        label_5:
            if(hsvd.l()) {
                this.b.i.z(this.a, blhl.k, Long.valueOf(this.b.m));
            }
            blwa.e(this.b);
        }
        if(!blzx0.equals(blzx1)) {
            blwa.d(this.b);
        }
    }
}

