import android.text.TextUtils;
import java.io.IOException;

public final class etns {
    public static final int a;
    private static final bboh b;

    static {
        etns.b = bboh.b("TapAndPay", bbcu.aM);
    }

    public static final boolean a(esgi esgi0, String s) {
        batl.b(((boolean)(TextUtils.isEmpty(s) ^ 1)));
        synchronized(etns.class) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkcl.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s.getClass();
            ((hkcl)hftv0).b = s;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hkcl)hftp0.b_message).c = 1;
            hkcl hkcl0 = (hkcl)hftp0.N_build();
            try {
                etsy.b(esgi0, etti.c, ((MessageLite)hkcl0), ((MessageLite)hkcm.a));
            }
            catch(ettj ettj0) {
                ((ggtj)((ggtj)((ggtj)etns.b.i()).s(ettj0)).ar(0x3E3D)).x("TapAndPayApiError sending GCM id");
                eshk.b(esgi0, ettj0.a, 2);
                return false;
            }
            catch(IOException unused_ex) {
                return false;
            }
            eshc.e(esgi0.d).c().execSQL("UPDATE Wallets SET gcm_id = ? WHERE account_id = ? AND environment = ?;", new String[]{s, esgi0.a, esgi0.c});
            etmv etmv0 = new etmv(esgi0);
            etmv0.l(etmv0.f(gjsj.e));
        }
        return true;
    }
}

