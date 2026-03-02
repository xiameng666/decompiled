import android.content.Context;
import com.google.android.gms.tapandpay.firstparty.PassInfo;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dvnu implements gfsi {
    private final Context a;

    public dvnu(Context context0) {
        this.a = context0;
    }

    public final PassInfo a(Valuable valuable0) {
        gubi gubi0;
        PassInfo passInfo0 = new PassInfo();
        passInfo0.a = 2;
        passInfo0.b = valuable0.b;
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
        passInfo0.c = (int)efky.e((gubi0.d == null ? hjie.a : gubi0.d));
        return passInfo0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        return this.a(((Valuable)object0));
    }
}

