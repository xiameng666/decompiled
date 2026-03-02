import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class ethi implements AndroidInjector {
    final Provider a;
    private final esev b;

    public ethi(esev esev0) {
        this.b = esev0;
        this.a = DoubleCheck.b(new esey());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        RequestTokenizeChimeraActivity requestTokenizeChimeraActivity0 = (RequestTokenizeChimeraActivity)object0;
        requestTokenizeChimeraActivity0.N = new fsbq(new fsch(new fscu(esfl.a())), esfl.a());
        requestTokenizeChimeraActivity0.O = (foeg)this.a.get();
        requestTokenizeChimeraActivity0.G = new etho();
        requestTokenizeChimeraActivity0.z = fcfo.a(esfl.a());
        requestTokenizeChimeraActivity0.A = fcfo.d(esfl.a());
        Preconditions.f(cclw.a);
        requestTokenizeChimeraActivity0.B = cclw.a;
        requestTokenizeChimeraActivity0.H = new azts(esex.b(this.b), null);
    }
}

