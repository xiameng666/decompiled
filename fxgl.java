import android.content.Context;
import android.net.Uri;
import com.google.android.gms.chimera.modules.location.base.AppContextProvider;
import j..util.Optional;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public final class fxgl implements Supplier {
    public final fxgr a;
    public final fxdn b;
    public final fxfh c;
    public final fxfp d;
    public final Optional e;
    public final Supplier f;
    public final fxot g;

    public fxgl(fxgr fxgr0, fxdn fxdn0, fxfh fxfh0, fxfp fxfp0, Optional optional0, Supplier supplier0, fxot fxot0) {
        this.a = fxgr0;
        this.b = fxdn0;
        this.c = fxfh0;
        this.d = fxfp0;
        this.e = optional0;
        this.f = supplier0;
        this.g = fxot0;
    }

    @Override
    public final Object get() {
        fxhg fxhg0 = new fxhg();
        Optional optional0 = this.e.map(fxhg0);
        Context context0 = AppContextProvider.a();
        ibuq.e(context0, "getApplicationContext(...)");
        bblp bblp0 = new bblp(1, 9);
        ibuq.f(context0, "context");
        frce frce0 = new frce(context0);
        frce0.d("location");
        frce0.e("Osr.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)fwqy.a));
        frif frif0 = frie0.a();
        frli frli0 = cjtb.a.a(frif0);
        bboh.c("EQMon", bbcu.g, "Osr");
        ibuq.c(frli0);
        fxns fxns0 = new fxns(frli0, new fxnr(), bblp0);
        fxhe fxhe0 = new fxhe(this.a.f);
        fxdv fxdv0 = new fxdv(this.a.e);
        bblp bblp1 = new bblp(new LinkedBlockingQueue(4), new fxew());
        return new fxfk(this.a.e, this.b, this.c, this.d, optional0, bblp1, this.f, fxns0, fxhe0, this.g, fxdv0);
    }
}

