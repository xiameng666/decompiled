import android.net.Uri;
import android.util.Log;
import com.google.android.gms.chimera.modules.identity.credentials.shared.AppContextProvider;
import com.google.android.gms.identitycredentials.ClearRegistryRequest;
import j..util.DesugarCollections;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class bxxv implements bxxe {
    public static final SecureRandom a;
    private final frli b;

    static {
        bxxv.a = new SecureRandom();
    }

    public bxxv(bxxf bxxf0) {
        frce frce0 = new frce(AppContextProvider.a());
        frce0.d("identitycredentials");
        frce0.e(bxxf0.d);
        frce0.f(frgo.a);
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)byfr.a));
        frie0.h(new frjp(cjtd.a));
        frif frif0 = frie0.a();
        frli frli0 = cjtb.a.a(frif0);
        ibuq.f(bxxf0, "dataStoreType");
        ibuq.f(frli0, "storage");
        super();
        this.b = frli0;
    }

    @Override  // bxxe
    public final Object a(String s, List list0, ClearRegistryRequest clearRegistryRequest0, ibrl ibrl0) {
        Object object2;
        bxxo bxxo0;
        if((ibrl0 instanceof bxxo)) {
            bxxo0 = (bxxo)ibrl0;
            int v = bxxo0.c;
            if((v & 0x80000000) == 0) {
                bxxo0 = new bxxo(this, ibrl0);
            }
            else {
                bxxo0.c = v - 0x80000000;
            }
        }
        else {
            bxxo0 = new bxxo(this, ibrl0);
        }
        Object object0 = bxxo0.a;
        Object object1 = ibrx.a;
        switch(bxxo0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    ibuz ibuz0 = new ibuz();
                    bxxj bxxj0 = new bxxj(new bxxi(s, list0, clearRegistryRequest0, ibuz0));
                    gmcd gmcd0 = this.b.b(bxxj0, gmap.a);
                    bxxo0.d = ibuz0;
                    bxxo0.c = 1;
                    if(icpu.c(gmcd0, bxxo0) == object1) {
                        return object1;
                    }
                    ibuz ibuz1 = ibuz0;
                    object2 = Boolean.valueOf(ibuz1.a);
                    goto label_29;
                label_23:
                    ibuz1 = bxxo0.d;
                    ibnx.b(object0);
                    object2 = Boolean.valueOf(ibuz1.a);
                    goto label_29;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            case 1: {
                goto label_23;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        object2 = ibnx.a(throwable0);
    label_29:
        ibnx.b(object2);
        return object2;
    }

    @Override  // bxxe
    public final Object b(String s, ibrl ibrl0) {
        Object object2;
        ibuz ibuz1;
        bxxp bxxp0;
        if((ibrl0 instanceof bxxp)) {
            bxxp0 = (bxxp)ibrl0;
            int v = bxxp0.c;
            if((v & 0x80000000) == 0) {
                bxxp0 = new bxxp(this, ibrl0);
            }
            else {
                bxxp0.c = v - 0x80000000;
            }
        }
        else {
            bxxp0 = new bxxp(this, ibrl0);
        }
        Object object0 = bxxp0.a;
        Object object1 = ibrx.a;
        switch(bxxp0.c) {
            case 0: {
                ibnx.b(object0);
                if(s.length() != 0) {
                    try {
                        ArrayList arrayList0 = new ArrayList();
                        ibuz ibuz0 = new ibuz();
                        bxxl bxxl0 = new bxxl(new bxxk(s, arrayList0, ibuz0));
                        gmcd gmcd0 = this.b.b(bxxl0, gmap.a);
                        bxxp0.d = s;
                        bxxp0.e = ibuz0;
                        bxxp0.c = 1;
                        if(icpu.c(gmcd0, bxxp0) == object1) {
                            return object1;
                        }
                        ibuz1 = ibuz0;
                        object2 = Boolean.valueOf(ibuz1.a);
                        goto label_34;
                    }
                    catch(Throwable throwable0) {
                        break;
                    }
                }
                throw new IllegalArgumentException("Empty package name");
            }
            case 1: {
                try {
                    ibuz1 = bxxp0.e;
                    s = bxxp0.d;
                    ibnx.b(object0);
                    object2 = Boolean.valueOf(ibuz1.a);
                    goto label_34;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        object2 = ibnx.a(throwable0);
    label_34:
        Throwable throwable1 = ibnw.a(object2);
        if(throwable1 != null) {
            try {
                Log.e("RegistryDataStore", "Failed to delete all registries of the given package name " + s, throwable1);
                object2 = Boolean.valueOf(false);
            }
            catch(Throwable throwable2) {
                object2 = ibnx.a(throwable2);
            }
        }
        ibnx.b(object2);
        return object2;
    }

    @Override  // bxxe
    public final Object c(String s, String s1, ibrl ibrl0) {
        bxxd bxxd0;
        Object object2;
        bxxq bxxq0;
        if((ibrl0 instanceof bxxq)) {
            bxxq0 = (bxxq)ibrl0;
            int v = bxxq0.c;
            if((v & 0x80000000) == 0) {
                bxxq0 = new bxxq(this, ibrl0);
            }
            else {
                bxxq0.c = v - 0x80000000;
            }
        }
        else {
            bxxq0 = new bxxq(this, ibrl0);
        }
        Object object0 = bxxq0.a;
        Object object1 = ibrx.a;
        switch(bxxq0.c) {
            case 0: {
                ibnx.b(object0);
                if(!ibzk.D(s) && !ibzk.D(s1)) {
                    try {
                        gmcd gmcd0 = this.b.a();
                        ibuq.e(gmcd0, "getData(...)");
                        bxxq0.d = s;
                        bxxq0.e = s1;
                        bxxq0.c = 1;
                        object0 = icpu.c(gmcd0, bxxq0);
                        if(object0 == object1) {
                            return object1;
                        label_23:
                            s1 = bxxq0.e;
                            s = bxxq0.d;
                            ibnx.b(object0);
                        }
                        object2 = (byfr)object0;
                        goto label_30;
                    }
                    catch(Throwable throwable0) {
                    }
                    goto label_29;
                }
                break;
            }
            case 1: {
                goto label_23;
            label_29:
                object2 = ibnx.a(throwable0);
            label_30:
                Throwable throwable1 = ibnw.a(object2);
                if(throwable1 != null) {
                    Log.e("RegistryDataStore", "Couldn\'t read registry", throwable1);
                }
                if((object2 instanceof ibnv)) {
                    object2 = null;
                }
                if(((byfr)object2) != null) {
                    Map map0 = DesugarCollections.unmodifiableMap(((byfr)object2).b);
                    if(map0 != null) {
                        ArrayList arrayList0 = new ArrayList();
                        for(Object object3: map0.entrySet()) {
                            Map.Entry map$Entry0 = (Map.Entry)object3;
                            byfl byfl0 = (byfl)DesugarCollections.unmodifiableMap(((byfo)map$Entry0.getValue()).e).get(s);
                            if(byfl0 != null) {
                                byfq byfq0 = (byfq)DesugarCollections.unmodifiableMap(byfl0.b).get(DesugarCollections.unmodifiableMap(byfl0.c).get(s1));
                                if(byfq0 != null) {
                                    Object object4 = map$Entry0.getKey();
                                    ibuq.e(object4, "<get-key>(...)");
                                    String s2 = ((byfo)map$Entry0.getValue()).c;
                                    ibuq.e(s2, "getPackageName(...)");
                                    bxxd0 = new bxxd(((String)object4), s2, a.r(s1, s, "|"), byfq0);
                                    goto label_54;
                                }
                            }
                            bxxd0 = null;
                        label_54:
                            if(bxxd0 != null) {
                                arrayList0.add(bxxd0);
                            }
                        }
                        return arrayList0;
                    }
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return null;
    }

    @Override  // bxxe
    public final Object d(String s, ibrl ibrl0) {
        Object object2;
        bxxr bxxr0;
        if((ibrl0 instanceof bxxr)) {
            bxxr0 = (bxxr)ibrl0;
            int v = bxxr0.c;
            if((v & 0x80000000) == 0) {
                bxxr0 = new bxxr(this, ibrl0);
            }
            else {
                bxxr0.c = v - 0x80000000;
            }
        }
        else {
            bxxr0 = new bxxr(this, ibrl0);
        }
        Object object0 = bxxr0.a;
        Object object1 = ibrx.a;
        switch(bxxr0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    gmcd gmcd0 = this.b.a();
                    ibuq.e(gmcd0, "getData(...)");
                    bxxr0.d = s;
                    bxxr0.c = 1;
                    object0 = icpu.c(gmcd0, bxxr0);
                    if(object0 == object1) {
                        return object1;
                    label_21:
                        s = bxxr0.d;
                        ibnx.b(object0);
                    }
                    object2 = (byfr)object0;
                    goto label_27;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            case 1: {
                goto label_21;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        object2 = ibnx.a(throwable0);
    label_27:
        Throwable throwable1 = ibnw.a(object2);
        if(throwable1 != null) {
            Log.e("RegistryDataStore", "Couldn\'t read registry", throwable1);
        }
        Object object3 = null;
        if((object2 instanceof ibnv)) {
            object2 = null;
        }
        if(((byfr)object2) != null) {
            Map map0 = DesugarCollections.unmodifiableMap(((byfr)object2).b);
            if(map0 != null) {
                object3 = new ArrayList();
                for(Object object4: map0.entrySet()) {
                    ArrayList arrayList0 = new ArrayList();
                    String s1 = (String)((Map.Entry)object4).getKey();
                    String s2 = ((byfo)((Map.Entry)object4).getValue()).c;
                    ibuq.e(s2, "getPackageName(...)");
                    byfq byfq0 = (byfq)DesugarCollections.unmodifiableMap(((byfo)((Map.Entry)object4).getValue()).d).get(s);
                    if(byfq0 != null) {
                        ibuq.c(s1);
                        arrayList0.add(new bxxd(s1, s2, s, byfq0));
                    }
                    byfl byfl0 = (byfl)DesugarCollections.unmodifiableMap(((byfo)((Map.Entry)object4).getValue()).e).get(s);
                    if(byfl0 != null) {
                        Map map1 = DesugarCollections.unmodifiableMap(byfl0.b);
                        ibuq.e(map1, "getIdToEntryMap(...)");
                        for(Object object5: map1.entrySet()) {
                            byfq byfq1 = (byfq)((Map.Entry)object5).getValue();
                            ibuq.c(s1);
                            ibuq.c(byfq1);
                            arrayList0.add(new bxxd(s1, s2, s, byfq1));
                        }
                    }
                    ibpo.D(((Collection)object3), arrayList0);
                }
            }
        }
        return object3;
    }

    @Override  // bxxe
    public final Object e(String s, List list0, bxxw bxxw0, ibrl ibrl0) {
        boolean z;
        Object object1;
        Object object0;
        bxxu bxxu0;
        if((ibrl0 instanceof bxxu)) {
            bxxu0 = (bxxu)ibrl0;
            int v = bxxu0.c;
            if((v & 0x80000000) == 0) {
                bxxu0 = new bxxu(this, ibrl0);
            }
            else {
                bxxu0.c = v - 0x80000000;
            }
        }
        else {
            bxxu0 = new bxxu(this, ibrl0);
        }
        try {
            object0 = bxxu0.a;
            object1 = ibrx.a;
            switch(bxxu0.c) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_38;
                }
                case 2: {
                    goto label_42;
                }
            }
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            Log.w("RegistryDataStore", a.L(illegalArgumentException0, s, "The packageName, ", ", and associated signatures, did not map to any expected packageKeys. "));
            return Boolean.valueOf(false);
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ibnx.b(object0);
        String s1 = bxxw0.b;
        List list1 = bxxw0.c;
        ibuq.f(bxxw0.a, "type");
        ibuq.f(s1, "requestType");
        ibuq.f(list1, "protocolTypes");
        if(bxxw0.a.length() == 0 && s1.length() == 0 && list1.isEmpty()) {
            Log.w("RegistryDataStore", "The request, with type: " + bxxw0.a + ", requestType: " + bxxw0.b + ", and protocolTypes: " + bxxw0.c + ", is invalid.");
            return Boolean.valueOf(false);
        }
        try {
            String s2 = bxvn.a(s, list0);
            if(s2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ibuq.f(s1, "requestType");
            ibuq.f(list1, "protocolTypes");
            if(s1.length() <= 0 && list1.isEmpty()) {
                bxxu0.d = s;
                bxxu0.c = 2;
                object0 = this.f(bxxw0, s2, s, bxxu0);
                if(object0 == object1) {
                    return object1;
                }
            }
            else {
                bxxu0.d = s;
                bxxu0.c = 1;
                object0 = this.g(bxxw0, s2, s, bxxu0);
                if(object0 == object1) {
                    return object1;
                label_38:
                    s = bxxu0.d;
                    ibnx.b(object0);
                    z = ((Boolean)object0).booleanValue();
                    goto label_45;
                label_42:
                    s = bxxu0.d;
                    ibnx.b(object0);
                }
            }
            z = ((Boolean)object0).booleanValue();
        label_45:
            if(z) {
                return Boolean.valueOf(true);
            }
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            Log.w("RegistryDataStore", a.L(illegalArgumentException0, s, "The packageName, ", ", and associated signatures, did not map to any expected packageKeys. "));
        }
        return Boolean.valueOf(false);
    }

    public final Object f(bxxw bxxw0, String s, String s1, ibrl ibrl0) {
        Object object2;
        bxxs bxxs0;
        if((ibrl0 instanceof bxxs)) {
            bxxs0 = (bxxs)ibrl0;
            int v = bxxs0.c;
            if((v & 0x80000000) == 0) {
                bxxs0 = new bxxs(this, ibrl0);
            }
            else {
                bxxs0.c = v - 0x80000000;
            }
        }
        else {
            bxxs0 = new bxxs(this, ibrl0);
        }
        Object object0 = bxxs0.a;
        Object object1 = ibrx.a;
        switch(bxxs0.c) {
            case 0: {
                ibnx.b(object0);
                if(!ibzk.D(bxxw0.a)) {
                    try {
                        bxxh bxxh0 = new bxxh(new bxxg(s, s1, bxxw0));
                        gmcd gmcd0 = this.b.b(bxxh0, gmap.a);
                        bxxs0.c = 1;
                        if(icpu.c(gmcd0, bxxs0) == object1) {
                            return object1;
                        }
                        object2 = Boolean.valueOf(true);
                        goto label_27;
                    }
                    catch(Throwable throwable0) {
                        break;
                    }
                }
                Log.w("RegistryDataStore", "The request unexpectedly contains a blank type, " + bxxw0.a + ", and is invalid.");
                return Boolean.valueOf(false);
            }
            case 1: {
                try {
                    ibnx.b(object0);
                    object2 = Boolean.valueOf(true);
                    goto label_27;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        object2 = ibnx.a(throwable0);
    label_27:
        Throwable throwable1 = ibnw.a(object2);
        if(throwable1 != null) {
            try {
                Log.e("RegistryDataStore", "Failed to store registry", throwable1);
                object2 = Boolean.valueOf(false);
            }
            catch(Throwable throwable2) {
                object2 = ibnx.a(throwable2);
            }
        }
        ibnx.b(object2);
        return object2;
    }

    public final Object g(bxxw bxxw0, String s, String s1, ibrl ibrl0) {
        Object object3;
        bxxt bxxt0;
        if((ibrl0 instanceof bxxt)) {
            bxxt0 = (bxxt)ibrl0;
            int v = bxxt0.c;
            if((v & 0x80000000) == 0) {
                bxxt0 = new bxxt(this, ibrl0);
            }
            else {
                bxxt0.c = v - 0x80000000;
            }
        }
        else {
            bxxt0 = new bxxt(this, ibrl0);
        }
        Object object0 = bxxt0.a;
        Object object1 = ibrx.a;
    alab1:
        switch(bxxt0.c) {
            case 0: {
                ibnx.b(object0);
                List list0 = bxxw0.c;
                ibuq.f(bxxw0.b, "requestType");
                ibuq.f(list0, "protocolTypes");
                if(ibzk.D(bxxw0.b) || list0.isEmpty() || (list0 instanceof Collection) && list0.isEmpty()) {
                    return Boolean.valueOf(false);
                }
                Iterator iterator0 = list0.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        return Boolean.valueOf(false);
                    }
                    Object object2 = iterator0.next();
                    if(ibzk.D(((String)object2))) {
                        continue;
                    }
                    try {
                        bxxn bxxn0 = new bxxn(new bxxm(s, s1, bxxw0));
                        gmcd gmcd0 = this.b.b(bxxn0, gmap.a);
                        bxxt0.c = 1;
                        if(icpu.c(gmcd0, bxxt0) == object1) {
                            return object1;
                        label_28:
                            ibnx.b(object0);
                        }
                        object3 = Boolean.valueOf(true);
                        goto label_33;
                    }
                    catch(Throwable throwable0) {
                    }
                    break alab1;
                }
            }
            case 1: {
                goto label_28;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        object3 = ibnx.a(throwable0);
    label_33:
        Throwable throwable1 = ibnw.a(object3);
        if(throwable1 != null) {
            try {
                Log.e("RegistryDataStore", "Failed to store registry", throwable1);
                object3 = Boolean.valueOf(false);
            }
            catch(Throwable throwable2) {
                object3 = ibnx.a(throwable2);
            }
        }
        ibnx.b(object3);
        return object3;
    }
}

