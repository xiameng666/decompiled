import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import j..util.Objects;

final class dvku implements gmbg {
    final dokz a;
    final gged_interceptors b;
    final dvko c;
    final gged_interceptors d;
    final dvkv e;

    public dvku(dvkv dvkv0, dokz dokz0, gged_interceptors gged0, dvko dvko0, gged_interceptors gged1) {
        this.a = dokz0;
        this.b = gged0;
        this.c = dvko0;
        this.d = gged1;
        Objects.requireNonNull(dvkv0);
        this.e = dvkv0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        xob xob0 = this.a.an();
        if(xob0 == null) {
            return;
        }
        xob0.runOnUiThread(() -> {
            Valuable valuable0 = (Valuable)gggq.o(this.d, null);
            gftb.check(valuable0);
            this.e.d.ap(this.e.c, this.b);
            String s = this.e.b.getString(0x7F1520B8, new Object[]{valuable0.d});  // string:pay_s2gpt_activation_error_content "Please contact %1$s for help."
            this.c.a("We could not activate this ticket", s);
        });
    }

    @Override  // gmbg
    public final void b(Object object0) {
        xob xob0 = this.a.an();
        if(xob0 == null) {
            return;
        }
        xob0.runOnUiThread(new dvkt(this, ((gged_interceptors)object0), this.b, this.c));
    }

    // Detected as a lambda impl.
    public final void c() {
        Valuable valuable0 = (Valuable)gggq.o(this.d, null);
        gftb.check(valuable0);
        this.e.d.ap(this.e.c, this.b);
        String s = this.e.b.getString(0x7F1520B8, new Object[]{valuable0.d});  // string:pay_s2gpt_activation_error_content "Please contact %1$s for help."
        this.c.a("We could not activate this ticket", s);
    }
}

