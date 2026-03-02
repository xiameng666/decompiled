import android.content.Context;
import java.util.ArrayList;

public final class eyef {
    public static final boolean a(Context context0) {
        ibuq.f(context0, "context");
        return exks.f(context0);
    }

    public static final boolean b(Context context0) {
        ibuq.f(context0, "context");
        ibuq.f(context0, "context");
        String s = exks.c();
        ArrayList arrayList0 = new ArrayList();
        if(hokr.c()) {
            hfuo hfuo0 = homd.a.b().b().b;
            ibuq.e(hfuo0, "getDevicesList(...)");
            arrayList0.addAll(hfuo0);
        }
        if(hokr.d()) {
            hfuo hfuo1 = homd.a.b().a().b;
            ibuq.e(hfuo1, "getDevicesList(...)");
            arrayList0.addAll(hfuo1);
        }
        boolean z = true;
        if(!arrayList0.isEmpty()) {
            for(Object object0: arrayList0) {
                exla exla0 = (exla)object0;
                if(!ibuq.m((exla0.b == null ? exmi.a : exla0.b).b, s)) {
                    continue;
                }
                String s1 = (exla0.b == null ? exmi.a : exla0.b).c;
                ibuq.e(s1, "getManufacturer(...)");
                if(!exks.d(s1) || (exla0.c == null ? exni.a : exla0.c).c > exks.a(context0)) {
                    continue;
                }
                int v = (exla0.c == null ? exni.a : exla0.c).d;
                hfuo hfuo2 = exla0.d;
                ibuq.e(hfuo2, "getBuildIdPrefixesForMinSdkVersionList(...)");
                if(!exks.b(v, hfuo2)) {
                    continue;
                }
                ((ggtj)exks.b.h()).X("enableSetupEnhancements: %b isAllowlisted: %b hash: %s", Boolean.valueOf(hokr.c()), Boolean.valueOf(z), s);
                return z;
            }
        }
        if(!homc.a.j().o()) {
            z = false;
        }
        ((ggtj)exks.b.h()).X("enableSetupEnhancements: %b isAllowlisted: %b hash: %s", Boolean.valueOf(hokr.c()), Boolean.valueOf(z), s);
        return z;
    }
}

