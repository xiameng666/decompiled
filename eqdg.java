import android.os.Bundle;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import j..util.Collection.-EL;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

final class eqdg implements eqfu {
    final eqdn a;

    public eqdg(eqdn eqdn0) {
        Objects.requireNonNull(eqdn0);
        this.a = eqdn0;
        super();
    }

    @Override  // epyv
    public final void a(int v, String s, eqoc eqoc0) {
        eqdn.f.m(s, new Object[0]);
        this.a.l(v);
        this.a.d.d(v, eqoc0);
    }

    @Override  // epyv
    public final void b(MessagePayload messagePayload0) {
        this.a.n(messagePayload0);
    }

    @Override  // eqfu
    public final void c(BootstrapAccount bootstrapAccount0) {
        BootstrapProgressResult bootstrapProgressResult0 = new BootstrapProgressResult(7, Bundle.EMPTY);
        this.a.s(bootstrapProgressResult0);
    }

    @Override  // eqfu
    public final void d(List list0) {
        ArrayList arrayList0 = new ArrayList(((gged_interceptors)Collection.-EL.stream(list0).map(new eqrx()).collect(ggaf.a)));
        BootstrapProgressResult bootstrapProgressResult0 = new BootstrapProgressResult(4, this.a.p(arrayList0, this.a.k, this.a.l));
        this.a.s(bootstrapProgressResult0);
        this.a.w(list0);
        this.a.n = list0.isEmpty() ^ 1;
    }

    @Override  // eqfu
    public final void e() {
        this.a.r();
    }

    @Override  // eqfu
    public final void f() {
    }

    @Override  // eqfu
    public final void g(List list0) {
        ArrayList arrayList0 = new ArrayList(list0);
        BootstrapProgressResult bootstrapProgressResult0 = new BootstrapProgressResult(1, this.a.p(arrayList0, this.a.k, this.a.l));
        this.a.s(bootstrapProgressResult0);
    }
}

