import android.content.Context;
import android.os.SystemProperties;

public final class eitl {
    public static hlph a(Context context0) {
        int v = bbms.a(context0);
        hlph hlph0 = bbmq.k(context0, true, Integer.valueOf(0), (v == -1 ? null : v), null, null);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hlph0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hlph0));
        String s = SystemProperties.get("ro.oem.key1", "");
        if(!s.isEmpty()) {
            if(!((hftr)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((hftr)hftp0))).ensureMutable();
            }
            hlph hlph1 = (hlph)((hftr)hftp0).b_message;
            s.getClass();
            hlph1.b |= 0x8000000;
            hlph1.C = s;
        }
        return (hlph)((ProtoLiteBuilder)(((hftr)hftp0))).N_build();
    }
}

