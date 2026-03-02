import android.content.Context;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.InAppCvmConfig;

public final class etmj {
    private static final bboh a;
    private final boolean b;

    static {
        etmj.a = bboh.b("TapAndPay", bbcu.aM);
    }

    public etmj() {
        this(false);
    }

    public etmj(boolean z) {
        this.b = z;
    }

    public final boolean a(Context context0, String s, String s1) {
        int v1;
        int v;
        CardInfo cardInfo0;
        esgi esgi0;
        InAppCvmConfig inAppCvmConfig0 = null;
        if(s != null && s1 != null) {
            try {
                esgi0 = esgj.d(s, context0);
            }
            catch(IllegalArgumentException unused_ex) {
                ((ggtj)etmj.a.j()).x("getCardInfo: account not found");
                cardInfo0 = null;
                goto label_10;
            }
            cardInfo0 = etre.b(esgi0).a(s1);
        }
        else {
            cardInfo0 = null;
        }
    label_10:
        if(cardInfo0 != null) {
            inAppCvmConfig0 = cardInfo0.u;
        }
        if(inAppCvmConfig0 == null) {
            v = glwy.h(hypz.a.d().b());
            v1 = 600;
        }
        else {
            v1 = inAppCvmConfig0.a;
            v = inAppCvmConfig0.b;
        }
        boolean z = this.b;
        if(z && hypz.b() > 0L) {
            v1 = glwy.h(hypz.b());
        }
        if(z && hypz.c() > 0L) {
            v = glwy.h(hypz.c());
        }
        return new eubv(context0).a() < v && new etmk(context0).b(v1);
    }
}

