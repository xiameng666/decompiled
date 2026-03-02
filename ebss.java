import android.content.Context;
import java.util.Collection;
import java.util.Set;

public final class ebss {
    public static final fhvu a(long v, int v1, String s) {
        hfta hfta0 = fhwx.a;
        gjmk gjmk0 = gjmj.a(((ProtoLiteMessage)gjml.a).v_newBuilder());
        hhyy hhyy0 = hhyx.a(((hftr)((ProtoLiteMessage)hhzc.a).v_newBuilder()));
        hfsv hfsv0 = hfsu.a(((ProtoLiteMessage)hfst.a).v_newBuilder());
        hfsv0.c(v / 1000L);
        hfsv0.b(((int)(v % 1000L * 1000000L)));
        hhyy0.b(hfsv0.a());
        hhza hhza0 = hhyz.a(((ProtoLiteMessage)hhzb.a).v_newBuilder());
        hhza0.b(v1);
        if(s != null) {
            hhza0.c(s);
        }
        hhyy0.c(hhza0.a());
        gjmk0.b(hhyy0.a());
        return new fhvu(hfta0, gjmk0.a());
    }

    public static final boolean b(Context context0) {
        ibuq.f(context0, "context");
        int v = bbmq.af(context0, "com.google.android.apps.walletnfcrel");
        return bbmq.af(context0, "com.google.commerce.tapandpay.dev") | v;
    }

    public static fhvu c(long v, int v1, int v2) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        return ebss.a(v, v1, null);
    }

    public static final boolean d(Context context0) {
        ibuq.f(context0, "context");
        Set set0 = ebst.a;
        if(!(set0 instanceof Collection) || !set0.isEmpty()) {
            for(Object object0: set0) {
                if(!bbmq.af(context0, ((String)object0))) {
                    return ebss.b(context0) & 0;
                }
            }
        }
        return ebss.b(context0) & 1;
    }
}

