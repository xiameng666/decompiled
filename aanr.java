import android.content.Context;
import com.google.android.gms.chimera.modules.accountsettings.AppContextProvider;

public final class aanr implements zgz {
    @Override  // zgz
    public final Object a(Object object0, Object object1) {
        String s = (String)((gfsx)object0).g();
        Context context0 = AppContextProvider.a();
        aaby aaby0 = aaby.a(((zhq)object1).c, context0);
        if(aaby0 == null) {
            if(s == null) {
                return gfsx.l(null);
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grwe.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grwe grwe0 = (grwe)hftp0.b_message;
            grwe0.b |= 1;
            grwe0.c = 19;
            aaby0 = new aaby(s, null, null, ((grwe)hftp0.N_build()), false, null);
        }
        return gfsx.l(aaby0);
    }
}

