import android.content.Context;
import android.net.Uri;
import dagger.internal.Factory;
import dagger.internal.Provider;
import java.util.concurrent.Executor;

public final class cpwi implements Factory {
    private final Provider a;
    private final Provider b;
    private final Provider c;
    private final Provider d;

    public cpwi(Provider provider0, Provider provider1, Provider provider2, Provider provider3) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        Context context0 = (Context)this.a.get();
        frii frii0 = (frii)this.b.get();
        fgvt fgvt0 = (fgvt)this.c.get();
        Executor executor0 = (Executor)this.d.get();
        frce frce0 = new frce(context0);
        frce0.d("mdi_download");
        frce0.e("LoggingState.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)fjco.a));
        frie0.g(false);
        frie0.b(fkcu.b(context0, gfqx.a, executor0));
        return new fkcv(frii0.a(frie0.a()), new fjim(fgvt0), executor0, gftq.b);
    }
}

