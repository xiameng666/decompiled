import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.SigningInfo;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.service.credentials.BeginCreateCredentialRequest;
import android.service.credentials.CallingAppInfo;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.identity.credentialprovider.AuxiliaryCreateCredentialResponse;
import com.google.android.gms.identity.credentialprovider.AuxiliaryGetCredentialResponse;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;
import com.google.android.gms.identitycredentials.CredentialOption;
import com.google.android.gms.identitycredentials.ui.CredentialChooserChimeraActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

public final class bybg {
    public static final Object a(Context context0, bxvr bxvr0, bxql bxql0, kvx kvx0, long v, ibrl ibrl0) {
        byaw byaw0;
        bxzv bxzv0;
        Iterator iterator2;
        Context context1;
        long v2;
        Object object3;
        bxvr bxvr1;
        CallingAppInfo callingAppInfo0;
        bybd bybd0;
        kvx kvx1 = kvx0;
        if((ibrl0 instanceof bybd)) {
            bybd0 = (bybd)ibrl0;
            int v1 = bybd0.c;
            if((v1 & 0x80000000) == 0) {
                bybd0 = new bybd(ibrl0);
            }
            else {
                bybd0.c = v1 - 0x80000000;
            }
        }
        else {
            bybd0 = new bybd(ibrl0);
        }
        Object object0 = bybd0.b;
        Object object1 = ibrx.a;
        switch(bybd0.c) {
            case 0: {
                ibnx.b(object0);
                kva kva0 = kuz.a(bxvr0.a.a, bxvr0.a.c, kvx1);
                String s = bxvo.a(v);
                ahpw ahpw0 = bxql0.b;
                Bundle bundle0 = new Bundle();
                if(Build.VERSION.SDK_INT >= 34) {
                    kvx kvx2 = kva0.c;
                    if(kvx2 == null) {
                        callingAppInfo0 = null;
                    }
                    else {
                        SigningInfo signingInfo0 = kvx2.a();
                        callingAppInfo0 = new CallingAppInfo(kvx2.a, signingInfo0, kvx2.b);
                    }
                    bundle0.putParcelable("androidx.credentials.provider.BeginCreateCredentialRequest", new BeginCreateCredentialRequest(kva0.a, kva0.b, callingAppInfo0));
                }
                else {
                    bundle0.putString("androidx.credentials.provider.extra.BEGIN_CREATE_CREDENTIAL_REQUEST_TYPE", kva0.a);
                    bundle0.putBundle("androidx.credentials.provider.extra.BEGIN_CREATE_CREDENTIAL_REQUEST_CANDIDATE_QUERY_DATA", kva0.b);
                    kvx kvx3 = kva0.c;
                    if(kvx3 != null) {
                        kvu.b(bundle0, kvx3);
                    }
                }
                azzc azzc0 = new azzc();
                azzc0.a = new ahui(((ahul)ahpw0), bundle0, s);
                azzc0.d = 0x6AF;
                azzc0.c = new Feature[]{amju.k};
                bxsy bxsy0 = bxsy.g(((azts)ahpw0).iG(azzc0.a())).k(new bxqi()).e(new bxlw(aztb.class).a(new bxqj()));
                bybd0.f = (CredentialChooserChimeraActivity)context0;
                bybd0.d = bxvr0;
                bybd0.e = kvx1;
                bybd0.a = v;
                bybd0.c = 1;
                Object object2 = icpu.c(bxsy0, bybd0);
                if(object2 != object1) {
                    bxvr1 = bxvr0;
                    object3 = object2;
                    v2 = v;
                    context1 = context0;
                    break;
                }
                return object1;
            }
            case 1: {
                long v3 = bybd0.a;
                kvx kvx4 = bybd0.e;
                bxvr1 = bybd0.d;
                CredentialChooserChimeraActivity credentialChooserChimeraActivity0 = bybd0.f;
                ibnx.b(object0);
                context1 = credentialChooserChimeraActivity0;
                object3 = object0;
                v2 = v3;
                kvx1 = kvx4;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.c(((ggfp)object3));
        List list0 = ibpo.ar(((ggfp)object3));
        ibuq.f(bxvr1, "request");
        ibuq.f(kvx1, "callingAppInfo");
        Intent intent0 = new Intent();
        CreateCredentialRequest createCredentialRequest0 = bxvr1.a;
        if(Build.VERSION.SDK_INT >= 34) {
            SigningInfo signingInfo1 = kvx1.a();
            ibuq.c(intent0.putExtra("android.service.credentials.extra.CREATE_CREDENTIAL_REQUEST", new android.service.credentials.CreateCredentialRequest(new CallingAppInfo(bxvr1.c, signingInfo1, createCredentialRequest0.d), createCredentialRequest0.a, createCredentialRequest0.b)));
        }
        else {
            intent0.putExtra("android.service.credentials.extra.CREATE_CREDENTIAL_REQUEST", kwu.a(new kwv(kip.a(createCredentialRequest0.a, createCredentialRequest0.b, createCredentialRequest0.c, false, createCredentialRequest0.d), kvx1, null)));
        }
        ibuq.f(context1, "context");
        ibuq.f(list0, "providerDataList");
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = list0.iterator();
        while(iterator0.hasNext()) {
            Object object4 = iterator0.next();
            AuxiliaryCreateCredentialResponse auxiliaryCreateCredentialResponse0 = (AuxiliaryCreateCredentialResponse)object4;
            kle kle0 = auxiliaryCreateCredentialResponse0.c;
            if(kle0 == null) {
                kvc kvc0 = auxiliaryCreateCredentialResponse0.b;
                String s1 = auxiliaryCreateCredentialResponse0.a;
                if(kvc0 != null && s1 != null) {
                    PackageManager packageManager0 = context1.getPackageManager();
                    ibuq.e(packageManager0, "getPackageManager(...)");
                    ibns ibns0 = byca.d(packageManager0, s1);
                    if(ibns0 == null) {
                        continue;
                    }
                    String s2 = (String)ibns0.a;
                    Drawable drawable0 = (Drawable)ibns0.b;
                    ArrayList arrayList1 = new ArrayList(ibpo.q(kvc0.a, 10));
                    for(Object object5: kvc0.a) {
                        arrayList1.add(new bybm(((kwa)object5), "key", "subkey", intent0, null));
                    }
                    List list1 = bybo.b(context1, s1, arrayList1);
                    kxc kxc0 = kvc0.b;
                    if(kxc0 == null) {
                        iterator2 = iterator0;
                        bxzv0 = null;
                    }
                    else {
                        iterator2 = iterator0;
                        bxzv0 = bybq.a(s1, new bybr(kxc0, "key", "subkey", intent0));
                    }
                    arrayList0.add(new byat(drawable0, s1, s2, list1, bxzv0));
                }
                else {
                    iterator2 = iterator0;
                    Log.e("CredentialSelector", "Unexpected null response from provider");
                }
                iterator0 = iterator2;
            }
            else {
                Objects.toString(kle0);
                Log.e("CredentialSelector", "Provider returned exception: " + kle0.toString());
            }
        }
        ibps ibps0 = ibps.a;
        ibuq.f(bxvr1, "<this>");
        ibuq.f(context1, "context");
        try {
            ibuq.e(bxvr1.c, "getAppPackageName(...)");
            byaw0 = bybo.a(context1, createCredentialRequest0.a, createCredentialRequest0.b, createCredentialRequest0.c, false, createCredentialRequest0.d, bxvr1.c, false, ibpu.a);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            Log.e("CredentialSelector", "Failed to initialize RequestDisplayInfo for create flow", illegalArgumentException0);
            byaw0 = null;
        }
        return byaw0 == null ? new byaf(new bybi(bxvr1.b, v2)) : new byad(new bxzr(arrayList0, ibps0, byaw0), new bybi(bxvr1.b, v2), null);
    }

    public static final Object b(Context context0, bxvs bxvs0, bxql bxql0, kvx kvx0, long v, ibrl ibrl0) {
        Context context1;
        kvi kvi1;
        long v3;
        bybe bybe0;
        bxvs bxvs1 = bxvs0;
        kvx kvx1 = kvx0;
        if((ibrl0 instanceof bybe)) {
            bybe0 = (bybe)ibrl0;
            int v1 = bybe0.c;
            if((v1 & 0x80000000) == 0) {
                bybe0 = new bybe(ibrl0);
            }
            else {
                bybe0.c = v1 - 0x80000000;
            }
        }
        else {
            bybe0 = new bybe(ibrl0);
        }
        Object object0 = bybe0.b;
        Object object1 = ibrx.a;
        switch(bybe0.c) {
            case 0: {
                ibnx.b(object0);
                ArrayList arrayList0 = new ArrayList(ibpo.q(bxvs1.a.a, 10));
                int v2 = 0;
                for(Object object2: bxvs1.a.a) {
                    if(v2 < 0) {
                        ibpo.m();
                    }
                    String s = String.valueOf(v2);
                    ibuq.f(s, "id");
                    ibuq.f(((CredentialOption)object2).a, "type");
                    ibuq.f(((CredentialOption)object2).c, "candidateQueryData");
                    arrayList0.add(kvf.a(s, ((CredentialOption)object2).a, ((CredentialOption)object2).c));
                    ++v2;
                }
                kvi kvi0 = new kvi(arrayList0, kvx1);
                String s1 = bxvo.a(v);
                Bundle bundle0 = kvh.a(kvi0);
                azzc azzc0 = new azzc();
                azzc0.a = new ahuj(((ahul)bxql0.b), bundle0, s1);
                azzc0.d = 1710;
                azzc0.c = new Feature[]{amju.k};
                azzd azzd0 = azzc0.a();
                bxsy bxsy0 = bxsy.g(((azts)bxql0.b).iG(azzd0)).k(new bxqg()).e(new bxlw(aztb.class).a(new bxqh()));
                bybe0.g = (CredentialChooserChimeraActivity)context0;
                bybe0.d = bxvs1;
                bybe0.e = kvx1;
                bybe0.f = kvi0;
                v3 = v;
                bybe0.a = v3;
                bybe0.c = 1;
                Object object3 = icpu.c(bxsy0, bybe0);
                if(object3 != object1) {
                    kvi1 = kvi0;
                    object0 = object3;
                    context1 = context0;
                    break;
                }
                return object1;
            }
            case 1: {
                long v4 = bybe0.a;
                kvi1 = bybe0.f;
                kvx kvx2 = bybe0.e;
                bxvs bxvs2 = bybe0.d;
                context1 = bybe0.g;
                ibnx.b(object0);
                v3 = v4;
                kvx1 = kvx2;
                bxvs1 = bxvs2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.c(((ggfp)object0));
        List list0 = ibpo.ar(((ggfp)object0));
        ibuq.f(list0, "providerDataList");
        ibuq.f(context1, "context");
        ibuq.f(kvx1, "callingAppInfo");
        ibuq.f(bxvs1, "requestInfo");
        ibuq.f(kvi1, "beginGetCredentialRequest");
        ArrayList arrayList1 = new ArrayList();
        for(Object object4: list0) {
            AuxiliaryGetCredentialResponse auxiliaryGetCredentialResponse0 = (AuxiliaryGetCredentialResponse)object4;
            kln kln0 = auxiliaryGetCredentialResponse0.c;
            if(kln0 == null) {
                kvl kvl0 = auxiliaryGetCredentialResponse0.b;
                String s2 = auxiliaryGetCredentialResponse0.a;
                if(kvl0 != null && s2 != null) {
                    PackageManager packageManager0 = context1.getPackageManager();
                    ibuq.e(packageManager0, "getPackageManager(...)");
                    ibns ibns0 = byca.d(packageManager0, s2);
                    if(ibns0 == null) {
                        continue;
                    }
                    List list1 = bybc.c(context1, kvl0.a, kvx1, bxvs1, kvi1, s2, ((String)ibns0.a));
                    List list2 = bybc.b(kvl0.c, kvx1, bxvs1, kvi1, s2, ((String)ibns0.a), ((Drawable)ibns0.b));
                    bxzv bxzv0 = bybc.d(kvl0.d, kvx1, bxvs1, s2);
                    List list3 = bybc.a(kvl0.b, kvx1, bxvs1, kvi1, s2, ((Drawable)ibns0.b));
                    arrayList1.add(new bybv(s2, ((Drawable)ibns0.b), ((String)ibns0.a), list1, list2, bxzv0, list3));
                }
                else {
                    Log.e("CredentialSelector", "Unexpected null response from provider");
                }
            }
            else {
                Objects.toString(kln0);
                Log.e("CredentialSelector", "Provider returned exception: " + kln0.toString());
            }
        }
        ibuq.f(bxvs1, "requestInfo");
        ibuq.f(context1, "context");
        Bundle bundle1 = bxvs1.a.b;
        String s3 = bxvs1.a.c;
        String s4 = bxvs1.c;
        ibuq.e(s4, "getAppPackageName(...)");
        ibuq.e(bxvs1.a, "getGetCredentialRequest(...)");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object5: bxvs1.a.a) {
            Integer integer0 = bybp.a(((CredentialOption)object5).c, ((CredentialOption)object5).a);
            linkedHashMap0.put(((CredentialOption)object5).a, integer0);
        }
        bybx bybx0 = bybp.e(context1, bundle1, s3, s4, false, linkedHashMap0);
        return bybx0 == null ? new ibns(new byaf(new bybi(bxvs1.b, v3)), null) : new ibns(new byae(new bxzx(arrayList1, bybx0, false), new bybi(bxvs1.b, v3), null), new bybh(bxvs1, kvx1, kvi1));
    }

    public static final Object c(Intent intent0, Context context0, bxql bxql0, ibrl ibrl0) {
        long v1;
        Long long0;
        bybf bybf0;
        if((ibrl0 instanceof bybf)) {
            bybf0 = (bybf)ibrl0;
            int v = bybf0.b;
            if((v & 0x80000000) == 0) {
                bybf0 = new bybf(ibrl0);
            }
            else {
                bybf0.b = v - 0x80000000;
            }
        }
        else {
            bybf0 = new bybf(ibrl0);
        }
        Object object0 = bybf0.a;
        Object object1 = ibrx.a;
        switch(bybf0.b) {
            case 0: {
                ibnx.b(object0);
                bxvv bxvv0 = bxvu.b(intent0);
                String s = intent0.getStringExtra("com.google.android.gms.identitycredentials.extra.session_id");
                if(s == null) {
                    v1 = bxzl.a();
                }
                else {
                    try {
                        long0 = null;
                        long0 = glxd.c(Base64.decode(s, 11));
                    }
                    catch(IllegalArgumentException unused_ex) {
                    }
                    v1 = long0 == null ? bxzl.a() : ((long)long0);
                }
                if(bxvv0 == null) {
                    return new ibns(new byaf(new bybi(new Binder(), v1)), null);
                }
                if((bxvv0 instanceof bxvs)) {
                    ibuq.e(((bxvs)bxvv0).c, "getAppPackageName(...)");
                    kvx kvx0 = byca.b(context0, ((bxvs)bxvv0).c, ((bxvs)bxvv0).a.c);
                    if(kvx0 == null) {
                        Log.e("CredentialSelector", "Failed to get calling app info");
                        return new ibns(new byaf(new bybi(((bxvs)bxvv0).b, v1)), null);
                    }
                    bybf0.b = 1;
                    Object object2 = bybg.b(context0, ((bxvs)bxvv0), bxql0, kvx0, v1, bybf0);
                    return object2 == object1 ? object1 : object2;
                }
                if((bxvv0 instanceof bxvr)) {
                    ibuq.e(((bxvr)bxvv0).c, "getAppPackageName(...)");
                    kvx kvx1 = byca.b(context0, ((bxvr)bxvv0).c, ((bxvr)bxvv0).a.d);
                    if(kvx1 == null) {
                        Log.e("CredentialSelector", "Failed to get calling app info");
                        return new ibns(new byaf(new bybi(((bxvr)bxvv0).b, v1)), null);
                    }
                    bybf0.b = 2;
                    object0 = bybg.a(context0, ((bxvr)bxvv0), bxql0, kvx1, v1, bybf0);
                    return object0 == object1 ? object1 : new ibns(object0, null);
                }
                return new ibns(new byaf(new bybi(bxvv0.b, v1)), null);
            }
            case 1: {
                ibnx.b(object0);
                return object0;
            }
            case 2: {
                ibnx.b(object0);
                return new ibns(object0, null);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

