import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;
import com.google.android.gms.identitycredentials.CredentialOption;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.ImportCredentialsRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class byea {
    private final bxxe a;

    public byea(bxxe bxxe0) {
        this.a = bxxe0;
    }

    public final Object a(ImportCredentialsRequest importCredentialsRequest0, String s, Context context0, ibrl ibrl0) {
        ImportCredentialsRequest importCredentialsRequest2;
        String s2;
        Iterator iterator0;
        Collection collection1;
        Collection collection0;
        Object object2;
        String s1;
        ImportCredentialsRequest importCredentialsRequest1;
        bydv bydv0;
        if((ibrl0 instanceof bydv)) {
            bydv0 = (bydv)ibrl0;
            int v = bydv0.g;
            if((v & 0x80000000) == 0) {
                bydv0 = new bydv(this, ibrl0);
            }
            else {
                bydv0.g = v - 0x80000000;
            }
        }
        else {
            bydv0 = new bydv(this, ibrl0);
        }
        Object object0 = bydv0.e;
        Object object1 = ibrx.a;
        switch(bydv0.g) {
            case 0: {
                ibnx.b(object0);
                bydv0.h = importCredentialsRequest0;
                bydv0.i = s;
                bydv0.a = context0;
                bydv0.g = 1;
                object0 = this.g("androidx.identitycredentials.TYPE_CREDENTIALS_SYNC", "", "", bydv0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_25;
            }
            case 1: {
                context0 = (Context)bydv0.a;
                s = bydv0.i;
                importCredentialsRequest0 = bydv0.h;
                ibnx.b(object0);
            label_25:
                if(((List)object0) == null) {
                    return ibps.a;
                }
                ArrayList arrayList0 = new ArrayList();
                importCredentialsRequest1 = importCredentialsRequest0;
                s1 = s;
                object2 = ((List)object0).iterator();
                collection0 = arrayList0;
                goto label_42;
            }
            case 2: {
                Object object3 = bydv0.d;
                object2 = bydv0.c;
                collection0 = (Collection)bydv0.b;
                context0 = (Context)bydv0.a;
                s1 = bydv0.i;
                importCredentialsRequest1 = bydv0.h;
                ibnx.b(object0);
                while(true) {
                    if(((Boolean)object0).booleanValue()) {
                        collection0.add(object3);
                    }
                label_42:
                    if(!((Iterator)object2).hasNext()) {
                        break;
                    }
                    object3 = ((Iterator)object2).next();
                    bydv0.h = importCredentialsRequest1;
                    bydv0.i = s1;
                    bydv0.a = context0;
                    bydv0.b = collection0;
                    bydv0.c = object2;
                    bydv0.d = object3;
                    bydv0.g = 2;
                    object0 = byea.h(context0, ((bxxd)object3));
                    if(object0 == object1) {
                        return object1;
                    }
                }
                collection1 = new ArrayList();
                iterator0 = ((List)collection0).iterator();
                s2 = s1;
                importCredentialsRequest2 = importCredentialsRequest1;
                goto label_66;
            }
            case 3: {
                iterator0 = (Iterator)bydv0.b;
                collection1 = (Collection)bydv0.a;
                s2 = bydv0.i;
                importCredentialsRequest2 = bydv0.h;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            if(((bydl)object0) != null) {
                collection1.add(((bydl)object0));
            }
        label_66:
            if(!iterator0.hasNext()) {
                return (List)collection1;
            }
            Object object4 = iterator0.next();
            ibuk ibuk0 = new ibuk(bydl.class);
            bydv0.h = importCredentialsRequest2;
            bydv0.i = s2;
            bydv0.a = collection1;
            bydv0.b = iterator0;
            bydv0.c = null;
            bydv0.d = null;
            bydv0.g = 3;
            object0 = byeb.a(((bxxd)object4), importCredentialsRequest2.a, s2, null, ibuk0);
        }
        while(object0 != object1);
        return object1;
    }

    public final Object b(CreateCredentialRequest createCredentialRequest0, String s, Context context0, ibrl ibrl0) {
        Object object3;
        String s3;
        String s2;
        bydw bydw0;
        CreateCredentialRequest createCredentialRequest1 = createCredentialRequest0;
        if((ibrl0 instanceof bydw)) {
            bydw0 = (bydw)ibrl0;
            int v = bydw0.d;
            if((v & 0x80000000) == 0) {
                bydw0 = new bydw(this, ibrl0);
            }
            else {
                bydw0.d = v - 0x80000000;
            }
        }
        else {
            bydw0 = new bydw(this, ibrl0);
        }
        Object object0 = bydw0.b;
        Object object1 = ibrx.a;
        switch(bydw0.d) {
            case 0: {
                ibnx.b(object0);
                String s1 = createCredentialRequest1.e;
                if(s1 == null || ibzk.D(s1)) {
                    Log.e("RegistryClient", "Empty request json. Cannot match.");
                    return ibps.a;
                }
                bydw0.e = createCredentialRequest1;
                bydw0.f = s;
                bydw0.a = context0;
                bydw0.g = s1;
                bydw0.d = 1;
                Object object2 = this.g(createCredentialRequest1.a, "", "", bydw0);
                if(object2 != object1) {
                    s2 = s;
                    s3 = s1;
                    object0 = object2;
                    object3 = context0;
                    goto label_38;
                }
                return object1;
            }
            case 1: {
                String s4 = bydw0.g;
                object3 = bydw0.a;
                s2 = bydw0.f;
                CreateCredentialRequest createCredentialRequest2 = bydw0.e;
                ibnx.b(object0);
                s3 = s4;
                createCredentialRequest1 = createCredentialRequest2;
            label_38:
                if(((List)object0) == null) {
                    return ibps.a;
                }
                if(Long.compare(((List)object0).size(), hufl.b()) >= 0) {
                    bydw0.e = null;
                    bydw0.f = null;
                    bydw0.a = null;
                    bydw0.g = null;
                    bydw0.d = 2;
                    object0 = this.f(s2, ((Context)object3), createCredentialRequest1.a, s3, ((List)object0), createCredentialRequest1.d, bydw0);
                    if(object0 != object1) {
                        return (List)object0;
                    }
                }
                else {
                    bydw0.e = null;
                    bydw0.f = null;
                    bydw0.a = null;
                    bydw0.g = null;
                    bydw0.d = 3;
                    object0 = this.d(s2, ((Context)object3), createCredentialRequest1.a, s3, ((List)object0), createCredentialRequest1.d, bydw0);
                    if(object0 != object1) {
                        return (List)object0;
                    }
                }
                return object1;
            }
            case 2: {
                ibnx.b(object0);
                return (List)object0;
            }
            case 3: {
                ibnx.b(object0);
                return (List)object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object c(GetCredentialRequest getCredentialRequest0, String s, Context context0, ibrl ibrl0) {
        String s4;
        Object object16;
        Object object15;
        Object object14;
        GetCredentialRequest getCredentialRequest4;
        String s3;
        Object object13;
        Object object12;
        Object object11;
        Object object10;
        GetCredentialRequest getCredentialRequest3;
        Object object9;
        Object object8;
        bydx bydx2;
        CredentialOption credentialOption0;
        String s1;
        bydx bydx1;
        Object object4;
        Object object3;
        Object object2;
        GetCredentialRequest getCredentialRequest1;
        bydx bydx0;
        byea byea0 = this;
        if((ibrl0 instanceof bydx)) {
            bydx0 = (bydx)ibrl0;
            int v = bydx0.f;
            if((v & 0x80000000) == 0) {
                bydx0 = new bydx(byea0, ibrl0);
            }
            else {
                bydx0.f = v - 0x80000000;
            }
        }
        else {
            bydx0 = new bydx(byea0, ibrl0);
        }
        Object object0 = bydx0.d;
        Object object1 = ibrx.a;
        switch(bydx0.f) {
            case 0: {
                ibnx.b(object0);
                getCredentialRequest1 = getCredentialRequest0;
                ArrayList arrayList0 = new ArrayList();
                object2 = getCredentialRequest1.a.iterator();
                object3 = arrayList0;
                object4 = context0;
                bydx1 = bydx0;
                s1 = s;
                goto label_59;
            }
            case 1: {
                credentialOption0 = bydx0.i;
                Object object5 = bydx0.c;
                Object object6 = bydx0.b;
                Object object7 = bydx0.a;
                String s2 = bydx0.h;
                GetCredentialRequest getCredentialRequest2 = bydx0.g;
                ibnx.b(object0);
                bydx2 = bydx0;
                s1 = s2;
                object8 = object6;
                object9 = object7;
                getCredentialRequest3 = getCredentialRequest2;
                object10 = object5;
                goto label_77;
            }
            case 2: {
                object11 = bydx0.c;
                object12 = bydx0.b;
                object13 = bydx0.a;
                s3 = bydx0.h;
                getCredentialRequest4 = bydx0.g;
                ibnx.b(object0);
                goto label_102;
            }
            case 3: {
                object14 = bydx0.c;
                object15 = bydx0.b;
                object16 = bydx0.a;
                s4 = bydx0.h;
                getCredentialRequest4 = bydx0.g;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            List list0 = (List)object0;
            bydx1 = bydx0;
            s1 = s4;
            object3 = object15;
            object2 = object14;
            object4 = object16;
            while(true) {
                ibpo.D(((Collection)object3), list0);
                byea0 = this;
                getCredentialRequest1 = getCredentialRequest4;
            label_59:
                if(!((Iterator)object2).hasNext()) {
                    break alab1;
                }
                Object object17 = ((Iterator)object2).next();
                bydx1.g = getCredentialRequest1;
                bydx1.h = s1;
                bydx1.a = object4;
                bydx1.b = object3;
                bydx1.c = object2;
                bydx1.i = (CredentialOption)object17;
                bydx1.f = 1;
                Object object18 = byea0.g(((CredentialOption)object17).a, ((CredentialOption)object17).e, ((CredentialOption)object17).f, bydx1);
                if(object18 == object1) {
                    return object1;
                }
                getCredentialRequest3 = getCredentialRequest1;
                object9 = object4;
                object8 = object3;
                credentialOption0 = (CredentialOption)object17;
                object0 = object18;
                bydx2 = bydx1;
                object10 = object2;
            label_77:
                if(((List)object0) == null) {
                    list0 = ibps.a;
                    bydx1 = bydx2;
                    object2 = object10;
                    object3 = object8;
                    object4 = object9;
                    getCredentialRequest4 = getCredentialRequest3;
                }
                else {
                    if(Long.compare(((List)object0).size(), hufl.b()) < 0) {
                        break;
                    }
                    bydx2.g = getCredentialRequest3;
                    bydx2.h = s1;
                    bydx2.a = object9;
                    bydx2.b = object8;
                    bydx2.c = object10;
                    bydx2.i = null;
                    bydx2.f = 2;
                    Object object19 = byea0.f(s1, ((Context)object9), credentialOption0.a, credentialOption0.d, ((List)object0), getCredentialRequest3.c, bydx2);
                    if(object19 == object1) {
                        return object1;
                    }
                    s3 = s1;
                    object0 = object19;
                    bydx0 = bydx2;
                    object11 = object10;
                    object12 = object8;
                    object13 = object9;
                    getCredentialRequest4 = getCredentialRequest3;
                label_102:
                    list0 = (List)object0;
                    bydx1 = bydx0;
                    s1 = s3;
                    object3 = object12;
                    object2 = object11;
                    object4 = object13;
                }
            }
            bydx2.g = getCredentialRequest3;
            bydx2.h = s1;
            bydx2.a = object9;
            bydx2.b = object8;
            bydx2.c = object10;
            bydx2.i = null;
            bydx2.f = 3;
            Object object20 = this.d(s1, ((Context)object9), credentialOption0.a, credentialOption0.d, ((List)object0), getCredentialRequest3.c, bydx2);
            if(object20 != object1) {
                s4 = s1;
                object0 = object20;
                bydx0 = bydx2;
                object14 = object10;
                object15 = object8;
                object16 = object9;
                getCredentialRequest4 = getCredentialRequest3;
                continue;
            }
            return object1;
        }
        return object3;
    }

    public final Object d(String s, Context context0, String s1, String s2, List list0, String s3, ibrl ibrl0) {
        String s11;
        Object object5;
        Object object4;
        Object object3;
        String s7;
        Object object2;
        bydz bydz1;
        String s6;
        String s5;
        String s4;
        bydz bydz0;
        if((ibrl0 instanceof bydz)) {
            bydz0 = (bydz)ibrl0;
            int v = bydz0.f;
            if((v & 0x80000000) == 0) {
                bydz0 = new bydz(this, ibrl0);
            }
            else {
                bydz0.f = v - 0x80000000;
            }
        }
        else {
            bydz0 = new bydz(this, ibrl0);
        }
        Object object0 = bydz0.d;
        Object object1 = ibrx.a;
        switch(bydz0.f) {
            case 0: {
                ibnx.b(object0);
                ArrayList arrayList0 = new ArrayList();
                s4 = s;
                s5 = s2;
                s6 = s3;
                bydz1 = bydz0;
                object2 = list0.iterator();
                s7 = s1;
                object3 = arrayList0;
                object4 = context0;
                goto label_40;
            }
            case 1: {
                object2 = bydz0.c;
                object3 = bydz0.b;
                String s8 = bydz0.j;
                String s9 = bydz0.i;
                String s10 = bydz0.h;
                object5 = bydz0.a;
                s11 = bydz0.g;
                ibnx.b(object0);
                bydz1 = bydz0;
                s6 = s8;
                s7 = s10;
                s5 = s9;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            if(((bydl)object0) != null) {
                ((Collection)object3).add(((bydl)object0));
            }
            object4 = object5;
            s4 = s11;
        label_40:
            if(!((Iterator)object2).hasNext()) {
                break;
            }
            Object object6 = ((Iterator)object2).next();
            bydz1.g = s4;
            bydz1.a = object4;
            bydz1.h = s7;
            bydz1.i = s5;
            bydz1.j = s6;
            bydz1.b = object3;
            bydz1.c = object2;
            bydz1.f = 1;
            Object object7 = this.e(((bxxd)object6), s5, s4, ((Context)object4), s6, bydz1);
            if(object7 == object1) {
                return object1;
            }
            s11 = s4;
            object5 = object4;
            object0 = object7;
        }
        return object3;
    }

    public final Object e(bxxd bxxd0, String s, String s1, Context context0, String s2, ibrl ibrl0) {
        Object object2;
        bydy bydy0;
        if((ibrl0 instanceof bydy)) {
            bydy0 = (bydy)ibrl0;
            int v = bydy0.c;
            if((v & 0x80000000) == 0) {
                bydy0 = new bydy(this, ibrl0);
            }
            else {
                bydy0.c = v - 0x80000000;
            }
        }
        else {
            bydy0 = new bydy(this, ibrl0);
        }
        Object object0 = bydy0.a;
        Object object1 = ibrx.a;
        switch(bydy0.c) {
            case 0: {
                ibnx.b(object0);
                bydy0.d = bxxd0;
                bydy0.e = s;
                bydy0.f = s1;
                bydy0.g = s2;
                bydy0.c = 1;
                object0 = byea.h(context0, bxxd0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_27;
            }
            case 1: {
                s2 = bydy0.g;
                s1 = bydy0.f;
                s = bydy0.e;
                bxxd0 = bydy0.d;
                ibnx.b(object0);
            label_27:
                if(((Boolean)object0).booleanValue()) {
                    try {
                        ibuk ibuk0 = new ibuk(bydl.class);
                        bydy0.d = null;
                        bydy0.e = null;
                        bydy0.f = null;
                        bydy0.g = null;
                        bydy0.c = 2;
                        object2 = byeb.a(bxxd0, s, s1, s2, ibuk0);
                        return object2 != object1 ? object2 : object1;
                    }
                    catch(Exception exception0) {
                        Log.e("RegistryClient", "Failed matching entries from the RegistryRuntime. " + exception0.toString());
                        return null;
                    }
                    return object2;
                }
                Log.w("RegistryClient", "Skipping invalid package: " + bxxd0.b);
                return null;
            }
            case 2: {
                try {
                    ibnx.b(object0);
                    return object0;
                }
                catch(Exception exception0) {
                    Log.e("RegistryClient", "Failed matching entries from the RegistryRuntime. " + exception0.toString());
                    return null;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    private final Object f(String s, Context context0, String s1, String s2, List list0, String s3, ibrl ibrl0) {
        return iccl.a(new bydu(list0, this, s1, s2, s, context0, s3, null), ibrl0);
    }

    private final Object g(String s, String s1, String s2, ibrl ibrl0) {
        ibuq.f(s, "type");
        ibuq.f(s1, "requestType");
        ibuq.f(s2, "protocolType");
        if(bxvm.a(s1, s2)) {
            ibuq.f(s1, "requestType");
            ibuq.f(s2, "protocolType");
            if(!ibzk.D(s1) && !ibzk.D(s2)) {
                return bxvm.a(s1, s2) ? this.a.c(s1, s2, ibrl0) : this.a.d(s, ibrl0);
            }
        }
        else {
            ibuq.f(s, "type");
            if(!ibzk.D(s)) {
                return bxvm.a(s1, s2) ? this.a.c(s1, s2, ibrl0) : this.a.d(s, ibrl0);
            }
        }
        Log.w("RegistryClient", a.ak(s2, s1, new StringBuilder(), s, "The CredentialOption, with type: ", ", requestType: ", ", and protocolType: ", ", is invalid."));
        return null;
    }

    private static final Object h(Context context0, bxxd bxxd0) {
        try {
            List list0 = bxyk.a(context0, bxxd0.b);
            String s = bxvn.a(bxxd0.b, list0);
            return Boolean.valueOf(ibuq.m(bxxd0.a, s));
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return Boolean.valueOf(false);
        }
    }
}

