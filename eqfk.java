import com.google.android.gms.smartdevice.d2d.AccountTransferResult;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

final class eqfk implements eqfu {
    final eqfo a;

    public eqfk(eqfo eqfo0) {
        Objects.requireNonNull(eqfo0);
        this.a = eqfo0;
        super();
    }

    @Override  // epyv
    public final void a(int v, String s, eqoc eqoc0) {
        this.a.x(v, s, eqoc0);
    }

    @Override  // epyv
    public final void b(MessagePayload messagePayload0) {
        this.a.m(messagePayload0);
    }

    @Override  // eqfu
    public final void c(BootstrapAccount bootstrapAccount0) {
        AccountTransferResult accountTransferResult0 = new AccountTransferResult(bootstrapAccount0, 2);
        this.a.o.add(accountTransferResult0);
    }

    @Override  // eqfu
    public final void d(List list0) {
        ArrayList arrayList0 = new ArrayList(list0);
        this.a.t(arrayList0);
    }

    @Override  // eqfu
    public final void e() {
        this.a.v();
    }

    @Override  // eqfu
    public final void f() {
    }

    @Override  // eqfu
    public final void g(List list0) {
        this.a.A(list0);
    }
}

