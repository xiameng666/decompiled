import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.List;

public final class asfz {
    public static final baun a;
    public static final bboh b;

    static {
        asfz.a = aqql.a("BackUpNowPackagesSelector");
        asfz.b = bboh.b("BackUpNowPackagesSelector", bbcu.dF);
    }

    public static final List a(List list0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            if(aqzg.f(((PackageInfo)object0))) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: list0) {
            if(hqgx.a.c().k().b.contains(((PackageInfo)object1).packageName)) {
                arrayList1.add(object1);
            }
        }
        return ibpo.ak(arrayList0, arrayList1);
    }
}

