import android.content.Context;
import com.google.android.gms.ads.identifier.settings.d;
import j..util.DesugarCollections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.Callable;

public final class aclc implements Callable {
    public final acln a;
    public final List b;
    public final String c;
    public final Context d;
    public final ProtoLiteBuilder e;

    public aclc(acln acln0, List list0, String s, ProtoLiteBuilder hftp0, Context context0) {
        this.a = acln0;
        this.b = list0;
        this.c = s;
        this.e = hftp0;
        this.d = context0;
    }

    @Override
    public final Object call() {
        String s;
        ProtoLiteBuilder hftp0;
        Iterator iterator0 = this.b.iterator();
        while(true) {
            hftp0 = this.e;
            s = this.c;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            if(s.equals(((aclv)gmbu.r(((gmcd)object0))).a)) {
                return (acmr)hftp0.N_build();
            }
        }
        Context context0 = this.d;
        this.a.a.b(context0, s);
        hftp0.bn(s);
        if(hoti.h()) {
            d.d(context0, "PvidReset", "PVID reset because all apps with that PVID were uninstalled from the device.");
        }
        for(Object object1: DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((acmr)hftp0.b_message).c)).entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            if(s.equals(((acmm)map$Entry0.getValue()).c)) {
                hftp0.bm(((String)map$Entry0.getKey()));
            }
        }
        return (acmr)hftp0.N_build();
    }
}

