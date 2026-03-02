import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;
import java.util.concurrent.TimeUnit;

public final class cqdv implements Factory {
    private final Provider a;
    private final Provider b;

    public cqdv(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        Context context0 = (Context)this.a.get();
        frmi frmi0 = (frmi)this.b.get();
        cqdl cqdl0 = new cqdl();
        frhf frhf0 = new frhf();
        frhf0.b(context0);
        frhf0.a();
        frhf0.e = cqdl0;
        frhf0.f = TimeUnit.SECONDS;
        bblp bblp0 = new bblp(0x7FFFFFFF, 10);
        frhf0.b = new cpyy(context0.getApplicationContext(), bblp0, frmi0);
        frhf0.d = new bblf(new bblg(9));
        frhf0.g = new bbll(1, 9);
        frhf0.h = frmi0;
        frhf0.i = new cqdm();
        return new frhi(frhf0);
    }
}

