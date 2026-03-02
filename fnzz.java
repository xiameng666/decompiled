import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class fnzz implements Factory {
    private final Provider a;
    private final Provider b;

    public fnzz(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        Context context0 = eyxu.a();
        gfsx gfsx0 = eymg.a();
        foeg foeg0 = (foeg)this.a.get();
        ficq ficq0 = (ficq)this.b.get();
        ExecutorService executorService0 = (ExecutorService)gfsx0.f(Executors.newCachedThreadPool(fnwu.a()));
        fnxq fnxq0 = fnxt.a(context0, foeg0);
        fnzw fnzw0 = fnzx.a(context0);
        fnzw0.c = fnxq0;
        fnzw0.d(executorService0);
        fnzw0.e(ficq0);
        return fnzw0.a();
    }
}

