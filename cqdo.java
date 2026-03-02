import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class cqdo implements Factory {
    private final Provider a;

    public cqdo(Provider provider0) {
        this.a = provider0;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        Context context0 = (Context)this.a.get();
        if(hrnt.f()) {
            frcb frcb0 = new frcb(context0);
            frcb0.d = cjsi.a;
            frcb0.a(cjsw.a);
            return new ccsd(new frcc(frcb0));
        }
        frcb frcb1 = new frcb(context0);
        frcb1.d = cjsi.a;
        frcb1.a(cjsw.a);
        return new frcc(frcb1);
    }
}

