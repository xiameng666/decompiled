import android.content.Context;
import com.google.android.gms.chimera.modules.location.base.AppContextProvider;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class fxkx implements fxox {
    private final Context a;

    public fxkx(Context context0) {
        this.a = context0;
    }

    @Override  // fxox
    public final void a(Object object0, Object object1) {
        this.b(((fxkw)object0), ((fxkw)object1));
    }

    public final void b(fxkw fxkw0, fxkw fxkw1) {
        gmcd gmcd0;
        if(huqb.A()) {
            gmcd0 = fxme.a().a.b(new fxma(fxkw1.a), gmap.a);
            gmcd0.hB(new fxmi(this.a), gmap.a);
        }
        else {
            gmcd0 = fxmj.a(AppContextProvider.a(), (fxkw1.a ? gxol.g : gxol.a));
        }
        try {
            ((glyq)gmcd0).v(3000L, TimeUnit.MILLISECONDS);
        }
        catch(InterruptedException | ExecutionException | TimeoutException | CancellationException unused_ex) {
        }
        if(fxkw0 != null && fxkw1 != null) {
            gwlt gwlt0 = fxky.c(fxkw0);
            gwlt gwlt1 = fxky.c(fxkw1);
            cczb cczb0 = cedq.v().b(((gful_cronetEngineProvider)new fxnf(gwlt0, gwlt1)));
            cczb0.c = (int)42;
            cczb0.a();
        }
    }
}

