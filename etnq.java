import android.text.TextUtils;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import java.io.IOException;

public final class etnq {
    public static final int a;

    static {
        bboh.b("TapAndPay", bbcu.aM);
    }

    static final etnp a(gfog gfog0, esgi esgi0) {
        int v = 4;
        try {
            if(gfog0 == null) {
                return new etnp(null, 1, 5);
            }
            switch((gfof.a(gfog0.c) == 0 ? 1 : gfof.a(gfog0.c)) - 1) {
                case 1: {
                    return new etnp(null, 2, 1);
                }
                case 3: {
                    String s = gfog0.d;
                    if(!bbqc.g()) {
                        AccountInfo accountInfo0 = esgi0.a();
                        AccountInfo accountInfo1 = eset.f(esgi0.d, esgi0.c);
                        if(accountInfo1 != null && !accountInfo1.a.equals(accountInfo0.a)) {
                            throw new etno();
                        }
                        if(accountInfo1 == null) {
                            eser.e(esgi0);
                        }
                    }
                    byte[] arr_b = TextUtils.isEmpty(s) ? null : etor.f(esgi0).w(s, null);
                    return new etnp(eusj.c("com.google.android.gms", esgi0.a(), null, arr_b, false, false, null, false, false, null, false, 50, null, 0, null, false, false, null, null), 4, 1);
                }
                default: {
                    return new etnp(null, 1, 5);
                }
            }
        }
        catch(IOException unused_ex) {
            v = 6;
        }
        catch(ettj | eshj | cjuh | etno unused_ex) {
        }
        return new etnp(null, 1, v);
    }
}

