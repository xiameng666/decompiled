import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public final class ehmc implements ehlq {
    private static final bboh a;
    private final Context b;
    private ggfd c;
    private final PackageManager d;

    static {
        ehmc.a = bboh.b("ServicePermissionProvider", bbcu.dO);
    }

    public ehmc(Context context0, ggfd ggfd0) {
        ibuq.f(context0, "context");
        Set set0;
        ibuq.f(ggfd0, "servicePermissionsMap");
        super();
        this.b = context0;
        this.c = ggfd0;
        PackageManager packageManager0 = context0.getPackageManager();
        ibuq.e(packageManager0, "getPackageManager(...)");
        this.d = packageManager0;
        String[] arr_s = packageManager0.getPackageInfo("com.google.android.gms", 0x1000).requestedPermissions;
        if(arr_s == null) {
            set0 = ibpu.a;
        }
        else {
            set0 = ibpg.Q(arr_s);
            if(set0 == null) {
                set0 = ibpu.a;
            }
        }
        ggez ggez0 = new ggez();
        for(Object object0: this.c.n()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(set0.contains(map$Entry0.getValue())) {
                ggez0.g(map$Entry0);
            }
        }
        this.c = ggez0.e();
    }

    public final Object a(hgiq hgiq0, ibrl ibrl0) {
        Object object3;
        Object object2;
        ehlz ehlz0;
        if((ibrl0 instanceof ehlz)) {
            ehlz0 = (ehlz)ibrl0;
            int v = ehlz0.e;
            if((v & 0x80000000) == 0) {
                ehlz0 = new ehlz(this, ibrl0);
            }
            else {
                ehlz0.e = v - 0x80000000;
            }
        }
        else {
            ehlz0 = new ehlz(this, ibrl0);
        }
        Object object0 = ehlz0.c;
        Object object1 = ibrx.a;
        switch(ehlz0.e) {
            case 0: {
                ibnx.b(object0);
                ggds ggds0 = this.c.a(hgiq0);
                ibuq.e(ggds0, "get(...)");
                LinkedHashSet linkedHashSet0 = new LinkedHashSet();
                ggqj ggqj0 = ggds0.om();
                ibuq.e(ggqj0, "iterator(...)");
                while(ggqj0.hasNext()) {
                    String s = (String)ggqj0.next();
                    try {
                        if(this.d.getPermissionInfo(s, 0x80).getProtection() != 1) {
                            continue;
                        }
                        ibuq.c(s);
                        linkedHashSet0.add(s);
                    }
                    catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                        a.e(ehmc.a.i(), "couldn\'t fetch info for %s", s, packageManager$NameNotFoundException0);
                    }
                }
                ((ggtj)ehmc.a.h()).B("dangerous permissions: %s", linkedHashSet0);
                object2 = new ArrayList();
                object3 = linkedHashSet0.iterator();
                goto label_37;
            }
            case 1: {
                object3 = ehlz0.b;
                object2 = ehlz0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            if(((String)object0) != null) {
                ((Collection)object2).add(((String)object0));
            }
        label_37:
            if(!((Iterator)object3).hasNext()) {
                break;
            }
            Object object4 = ((Iterator)object3).next();
            ehlz0.a = object2;
            ehlz0.b = object3;
            ehlz0.e = 1;
            object0 = this.b(((String)object4), ehlz0);
            if(object0 != object1) {
                continue;
            }
            return object1;
        }
        ibuq.f(object2, "<this>");
        Object object5 = new TreeSet();
        ibpo.aL(((Iterable)object2), ((Collection)object5));
        return object5;
    }

    public final Object b(String s, ibrl ibrl0) {
        String s2;
        ehma ehma0;
        if((ibrl0 instanceof ehma)) {
            ehma0 = (ehma)ibrl0;
            int v = ehma0.c;
            if((v & 0x80000000) == 0) {
                ehma0 = new ehma(this, ibrl0);
            }
            else {
                ehma0.c = v - 0x80000000;
            }
        }
        else {
            ehma0 = new ehma(this, ibrl0);
        }
        Object object0 = ehma0.a;
        Object object1 = ibrx.a;
        switch(ehma0.c) {
            case 0: {
                ibnx.b(object0);
                ibuq.e(gmap.a, "directExecutor(...)");
                ehma0.c = 1;
                icbk icbk0 = new icbk(ibsc.c(ehma0), 1);
                icbk0.z();
                ehmb ehmb0 = new ehmb(icbk0);
                this.d.getGroupOfPlatformPermission(s, gmap.a, ehmb0);
                object0 = icbk0.k();
                if(object0 == object1) {
                    ibsi.b(ehma0);
                }
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        String s1 = (String)object0;
        if(s1 == null) {
            return null;
        }
        try {
            s2 = this.d.getPermissionGroupInfo(s1, 0).loadLabel(this.d).toString();
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            a.e(ehmc.a.i(), "couldn\'t fetch label from android framework for %s", s1, packageManager$NameNotFoundException0);
            s2 = null;
        }
        if(s2 == null) {
            try {
                int v1 = bazo.b(s1);
                return this.b.getString(v1);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                a.e(ehmc.a.i(), "couldn\'t fetch label from gmscore mapping for %s", s1, illegalArgumentException0);
                return null;
            }
        }
        return s2;
    }
}

