import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class cqdp implements Factory {
    private final Provider a;
    private final Provider b;
    private final Provider c;

    public cqdp(Provider provider0, Provider provider1, Provider provider2) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        Context context0 = (Context)this.a.get();
        fgvt fgvt0 = (fgvt)this.b.get();
        frmr frmr0 = ((cqdt)this.c).a();
        int v = (int)hves.a.b().a();
        cqdh cqdh0 = new cqdh();
        cqdi cqdi0 = new cqdi();
        cqdj cqdj0 = new cqdj();
        frmh frmh0 = frmi.f(context0);
        frmh0.b = new bblp(1, 10);
        frmh0.a(fiyq.a(fgvt0, frmr0.a(), v));
        frmh0.e = cqdh0;
        frmh0.f = cqdi0;
        frmh0.g = cqdj0;
        return new frmi(frmh0);
    }
}

