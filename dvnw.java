import android.content.Context;
import com.google.android.gms.tapandpay.firstparty.ValuableInfo;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dvnw implements gfsi {
    private final Context a;

    public dvnw(Context context0) {
        this.a = context0;
    }

    public final ValuableInfo a(Valuable valuable0) {
        gubi gubi0;
        gumi gumi0 = valuable0.q;
        if(fsce.a(this.a)) {
            gubi0 = gumi0.d;
            if(gubi0 == null) {
                gubi0 = gubi.a;
            }
        }
        else {
            gubi0 = gumi0.c;
            if(gubi0 == null) {
                gubi0 = gubi.a;
            }
        }
        int v = (int)efky.e((gubi0.d == null ? hjie.a : gubi0.d));
        gupc gupc0 = gumi0.i == null ? gupc.a : gumi0.i;
        return esni.a(null, null, null, null, v, 0xFF000000, 8, null, null, null, null, (gupc0.b == null ? gupb.a : gupc0.b).e, null, null, null, 2, valuable0.b);
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        return this.a(((Valuable)object0));
    }
}

