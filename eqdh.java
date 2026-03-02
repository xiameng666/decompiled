import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

final class eqdh implements eqcy {
    final eqdn a;

    public eqdh(eqdn eqdn0) {
        Objects.requireNonNull(eqdn0);
        this.a = eqdn0;
        super();
    }

    @Override  // eqcy
    public final void a(BootstrapAccount bootstrapAccount0) {
        BootstrapProgressResult bootstrapProgressResult0 = new BootstrapProgressResult(7, Bundle.EMPTY);
        this.a.s(bootstrapProgressResult0);
    }

    @Override  // eqcy
    public final void b(List list0) {
        eqdn eqdn0 = this.a;
        if(eqdn0.x()) {
            eqdn.f.h("accountTransferListener.onAccountsAdded ignored as Fido is on", new Object[0]);
            return;
        }
        eqdn0.s(new BootstrapProgressResult(4, eqdn0.p(new ArrayList(list0), eqdn0.k, eqdn0.l)));
        eqdn0.w(eqsh.k(list0));
        eqdn0.n = list0.isEmpty() ^ 1;
    }

    @Override  // eqcy
    public final void c() {
        eqdn eqdn0 = this.a;
        if(eqdn0.x()) {
            eqdn.f.h("accountTransferListener.onCompleted ignored as Fido is on", new Object[0]);
            return;
        }
        eqdn0.r();
    }

    @Override  // eqcy
    public final void d(int v, String s) {
        eqdn eqdn0 = this.a;
        if(eqdn0.x()) {
            eqdn.f.m(a.f(v, "accountTransferListener.onError: ", " ignored as Fido is on"), new Object[0]);
            return;
        }
        eqdn0.l(v);
        eqdn0.d.d(v, null);
    }

    @Override  // eqcy
    public final void e(String s, String s1) {
        this.a.v(s, s1);
    }

    @Override  // eqcy
    public final void f(PendingIntent pendingIntent0) {
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("pendingIntent", pendingIntent0);
        BootstrapProgressResult bootstrapProgressResult0 = new BootstrapProgressResult(1, bundle0);
        this.a.s(bootstrapProgressResult0);
    }

    @Override  // eqcy
    public final void g(List list0) {
        ArrayList arrayList0 = new ArrayList(list0);
        BootstrapProgressResult bootstrapProgressResult0 = new BootstrapProgressResult(1, this.a.p(arrayList0, this.a.k, this.a.l));
        this.a.s(bootstrapProgressResult0);
    }

    @Override  // eqcy
    public final void h(MessagePayload messagePayload0) {
        this.a.n(messagePayload0);
    }
}

