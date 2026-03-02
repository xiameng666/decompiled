import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.chimera.modules.people.AppContextProvider;
import java.util.Arrays;

public final class egkx {
    public static ProtoLiteBuilder a(String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsru.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gsru)hftp0.b_message).c = "GMS GAL2";
        String s1 = bbmq.q(AppContextProvider.a());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsru gsru0 = (gsru)hftp0.b_message;
        s1.getClass();
        gsru0.d = s1;
        if(hxdy.a.f().t()) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gssz.a).v_newBuilder();
            if(!TextUtils.isEmpty(s)) {
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gssz gssz0 = (gssz)hftp1.b_message;
                s.getClass();
                gssz0.b = s;
                Context context0 = AppContextProvider.a();
                try {
                    String s2 = Arrays.toString(bbms.k(context0, s));
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gssz gssz1 = (gssz)hftp1.b_message;
                    s2.getClass();
                    gssz1.c = s2;
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                }
                boolean z = azql.c(context0).g(s);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gssz)hftp1.b_message).d = z;
            }
            gssz gssz2 = (gssz)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gsru gsru1 = (gsru)hftp0.b_message;
            gssz2.getClass();
            gsru1.e = gssz2;
            gsru1.b |= 1;
        }
        return hftp0;
    }
}

