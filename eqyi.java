import android.content.Context;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import java.util.ArrayList;

public final class eqyi implements Runnable {
    public final eqyw a;
    public final Context b;

    public eqyi(eqyw eqyw0, Context context0) {
        this.a = eqyw0;
        this.b = context0;
    }

    @Override
    public final void run() {
        gmcd gmcd0;
        erqh.a();
        eqyw eqyw0 = this.a;
        eqyw0.J = erqi.a(this.b);
        String s = eqyw0.J;
        ArrayList arrayList0 = eqyw.q(eqyw0.I);
        if(arrayList0.isEmpty()) {
            gmcd0 = null;
        }
        else {
            if(s == null) {
                s = ((BootstrapAccount)arrayList0.get(0)).b;
            }
            gmcd0 = eqyw0.l.b(s);
        }
        eqyw0.n = gmcd0;
    }
}

