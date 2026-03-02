import android.app.PendingIntent;
import com.google.android.gms.smartdevice.d2d.AccountTransferResult;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import j..util.Objects;
import java.util.List;

final class eqfl implements eqcy {
    final eqfo a;

    public eqfl(eqfo eqfo0) {
        Objects.requireNonNull(eqfo0);
        this.a = eqfo0;
        super();
    }

    @Override  // eqcy
    public final void a(BootstrapAccount bootstrapAccount0) {
        AccountTransferResult accountTransferResult0 = new AccountTransferResult(bootstrapAccount0, 2);
        this.a.o.add(accountTransferResult0);
    }

    @Override  // eqcy
    public final void b(List list0) {
        eqfo eqfo0 = this.a;
        if(eqfo0.q != null) {
            eqfo.h.h("accountTransferListener.onAccountsAdded ignored as Fido is on", new Object[0]);
            return;
        }
        eqfo0.t(eqsh.k(list0));
    }

    @Override  // eqcy
    public final void c() {
        eqfo eqfo0 = this.a;
        if(eqfo0.q != null) {
            eqfo.h.h("accountTransferListener.onCompleted ignored as Fido is on", new Object[0]);
            return;
        }
        eqfo0.v();
    }

    @Override  // eqcy
    public final void d(int v, String s) {
        eqfo eqfo0 = this.a;
        if(eqfo0.q != null) {
            eqfo.h.m(a.f(v, "accountTransferListener.onError: ", " ignored as Fido is on"), new Object[0]);
            return;
        }
        eqfo0.x(v, s, null);
    }

    @Override  // eqcy
    public final void e(String s, String s1) {
        eqfo.h.j("onRestoreAccountInformationAvailable.", new Object[0]);
    }

    @Override  // eqcy
    public final void f(PendingIntent pendingIntent0) {
        eqfo.h.h("Sending pending intent (3pmfm) to listener", new Object[0]);
        this.a.l.c(pendingIntent0);
    }

    @Override  // eqcy
    public final void g(List list0) {
        this.a.A(list0);
    }

    @Override  // eqcy
    public final void h(MessagePayload messagePayload0) {
        this.a.m(messagePayload0);
    }
}

