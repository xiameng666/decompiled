import android.net.Uri;
import com.google.android.gms.chimera.modules.location.base.AppContextProvider;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class fxor {
    public final Executor a;
    public final frli b;

    public fxor(Executor executor0) {
        frce frce0 = new frce(AppContextProvider.a());
        frce0.d("location");
        frce0.e("ea_qrt_sil.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)fwqx.a));
        frif frif0 = frie0.a();
        this.b = cjtb.a.a(frif0);
        this.a = executor0;
    }

    public static final void a(gmcd gmcd0) {
        try {
            gmbu.r(gmcd0);
        }
        catch(ExecutionException | CancellationException unused_ex) {
        }
    }
}

