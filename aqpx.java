import android.accounts.Account;
import android.util.Base64;
import java.io.IOException;

public final class aqpx extends aqqa {
    private final aqqa a;
    private final aqpy b;

    public aqpx(aqqa aqqa0, aqpy aqpy0) {
        this.a = aqqa0;
        this.b = aqpy0;
    }

    @Override  // aqqa
    public final arzs a(Account account0) {
        arzp arzp0;
        gfsx gfsx0;
        aqpy aqpy0 = this.b;
        String s = aqpy0.a.getString(aqpy.a(account0), null);
        if(s == null) {
            gfsx0 = gfqx.a;
        }
        else {
            try {
                try {
                    byte[] arr_b = Base64.decode(s, 0);
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)arzp.a), arr_b, 0, arr_b.length, hftc.a);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    arzp0 = (arzp)hftv0;
                }
                catch(IllegalArgumentException | hfur exception0) {
                    throw new IOException(exception0);
                }
                gfsx0 = gfsx.m(new aqpz((arzp0.c == null ? arzs.a : arzp0.c), System.currentTimeMillis() - arzp0.d < aqpy0.c.toMillis(aqpy0.b)));
            }
            catch(IOException unused_ex) {
                aqpy0.a.edit().remove(aqpy.a(account0)).apply();
                gfsx0 = gfqx.a;
            }
        }
        if(gfsx0.i() && ((aqpz)gfsx0.d()).b) {
            return ((aqpz)gfsx0.d()).a;
        }
        try {
            arzs arzs0 = this.a.a(account0);
            aqpy aqpy1 = this.b;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)arzp.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            arzp arzp1 = (arzp)hftp0.b_message;
            arzs0.getClass();
            arzp1.c = arzs0;
            arzp1.b |= 1;
            long v = System.currentTimeMillis();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            arzp arzp2 = (arzp)hftp0.b_message;
            arzp2.b |= 2;
            arzp2.d = v;
            String s1 = Base64.encodeToString(((arzp)hftp0.N_build()).toBytesArray(), 0);
            aqpy1.a.edit().putString(aqpy.a(account0), s1).apply();
            return arzs0;
        }
        catch(IOException iOException0) {
            if(gfsx0.i()) {
                return ((aqpz)gfsx0.d()).a;
            }
            throw iOException0;
        }
    }
}

