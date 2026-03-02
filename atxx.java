import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Set;

public final class atxx implements Runnable {
    public final atxy a;

    public atxx(atxy atxy0) {
        this.a = atxy0;
    }

    @Override
    public final void run() {
        atxy atxy0 = this.a;
        Set set0 = atxy0.d;
        if(!set0.isEmpty()) {
            long v = System.currentTimeMillis();
            long v1 = v - atxy0.f;
            Set set1 = atxy0.e;
            long v2 = set1.equals(set0) ? 86400000L : 3600000L;
            if(atxy0.f == 0L || v1 >= v2) {
                set1.clear();
                set1.addAll(set0);
                cjpc cjpc0 = atxy0.c;
                cjpa cjpa0 = cjpc0.c();
                cjpa0.g("com.google.android.gms.cast.KEY_CAST_ANALYTICS_LAST_SELF_DEVICE_ROUTE_LOG_TIMESTAMP", v);
                cjpd.g(cjpa0);
                atxy0.f = v;
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: set1) {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glci.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    glci glci0 = (glci)hftp0.b_message;
                    ((String)object0).getClass();
                    glci0.b |= 1;
                    glci0.c = (String)object0;
                    arrayList0.add(((glci)hftp0.N_build()));
                    String s = atxy0.b(((String)object0));
                    String s1 = atxy.a("self_device_route_timestamp_reported_", ((String)object0));
                    if(!TextUtils.equals(s, s1)) {
                        long v3 = cjpd.b(cjpc0, s, 0L);
                        cjpa cjpa1 = cjpc0.c();
                        cjpa1.j(s);
                        cjpd.g(cjpa1);
                        if(v3 != 0L) {
                            cjpa cjpa2 = cjpc0.c();
                            cjpa2.g(s1, v3);
                            cjpd.g(cjpa2);
                        }
                    }
                }
                atxy0.b.U(arrayList0);
            }
        }
    }
}

