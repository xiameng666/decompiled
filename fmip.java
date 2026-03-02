import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.io.File;
import java.util.concurrent.Callable;

public final class fmip implements Callable {
    public final fmiv a;
    public final fmic b;
    public final fmga c;
    public final AccountContext d;

    public fmip(fmiv fmiv0, fmic fmic0, fmga fmga0, AccountContext accountContext0) {
        this.a = fmiv0;
        this.b = fmic0;
        this.c = fmga0;
        this.d = accountContext0;
    }

    @Override
    public final Object call() {
        fmiv fmiv0 = this.a;
        fmga fmga0 = this.c;
        fmic fmic0 = this.b;
        fmjm fmjm0 = fmic0.a;
        File file0 = new File(fmiv0.b(fmga0.c, fmjm0.a));
        if(file0.exists()) {
            return Uri.fromFile(file0).toString();
        }
        fmij fmij0 = new fmij(fmiv0);
        return (String)((glyq)glzd.f(glzd.g(gmbt.h(fmiv0.g.e(fmij0)), new fmik(fmiv0, this.d, fmjm0, fmga0, fmic0), fmiv0.g), new fmil(fmiv0, fmga0, fmjm0), fmiv0.g)).u();
    }
}

