import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import j..util.Map.-EL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

final class byhg extends ibsl implements ibtw {
    int a;
    final bxvs b;
    final Context c;
    final byhi d;
    final byea e;

    public byhg(byea byea0, bxvs bxvs0, Context context0, byhi byhi0, ibrl ibrl0) {
        this.e = byea0;
        this.b = bxvs0;
        this.c = context0;
        this.d = byhi0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((byhg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new byhg(this.e, this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        bywm bywm0;
        ibns ibns1;
        String s7;
        boolean z1;
        Object object16;
        byhx byhx0;
        Object object10;
        bzbf bzbf0;
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ibuq.e(this.b.a, "getGetCredentialRequest(...)");
            ibuq.e(this.b.c, "getAppPackageName(...)");
            this.a = 1;
            object2 = this.e.c(this.b.a, this.b.c, this.c, this);
            if(object2 == object1) {
                return object1;
            }
        }
        else {
            object2 = object0;
        }
        List list0 = (List)object2;
        try {
            bxvs bxvs0 = this.b;
            Context context0 = this.c;
            GetCredentialRequest getCredentialRequest0 = bxvs0.a;
            String s = getCredentialRequest0.c;
            ibuq.f(context0, "context");
            if(bxvs0 != null && getCredentialRequest0 != null) {
                String s1 = bybz.a(s);
                if(s1 == null) {
                label_24:
                    PackageManager packageManager0 = context0.getPackageManager();
                    ibuq.e(packageManager0, "getPackageManager(...)");
                    ibuq.e(bxvs0.c, "getAppPackageName(...)");
                    s1 = byca.c(packageManager0, bxvs0.c);
                    if(s1 == null) {
                        bzbf0 = null;
                    }
                    else {
                    label_29:
                        boolean z = getCredentialRequest0.b.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS");
                        PackageManager packageManager1 = context0.getPackageManager();
                        ibuq.e(packageManager1, "getPackageManager(...)");
                        ibuq.e(bxvs0.c, "getAppPackageName(...)");
                        bzbf0 = new bzbf(s1, z, byca.a(packageManager1, bxvs0.c));
                    }
                }
                else {
                    if(s1.length() == 0) {
                        s1 = null;
                    }
                    if(s1 == null) {
                        goto label_24;
                    }
                    else {
                        goto label_29;
                    }
                }
            }
            else {
                bzbf0 = null;
            }
            if(bzbf0 == null) {
                throw new IllegalStateException("Failed to initialize display info.");
            }
            byhi byhi0 = this.d;
            byht byht0 = byhi0.b();
            Object object3 = null;
            String s2 = bzbf0.a;
            ibuq.f(list0, "providerDataList");
            ibuq.f(context0, "context");
            ibuq.f(s2, "appName");
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            Iterator iterator0 = list0.iterator();
            while(iterator0.hasNext()) {
                Object object4 = iterator0.next();
                bydr bydr0 = (bydr)object4;
                PackageManager packageManager2 = context0.getPackageManager();
                ibuq.e(packageManager2, "getPackageManager(...)");
                String s3 = bydr0.a;
                ibns ibns0 = byca.d(packageManager2, s3);
                if(ibns0 != null) {
                    String s4 = (String)ibns0.a;
                    Drawable drawable0 = (Drawable)ibns0.b;
                    ArrayList arrayList0 = new ArrayList();
                    LinkedHashMap linkedHashMap1 = bydr0.b;
                    for(Object object5: linkedHashMap1.entrySet()) {
                        byhu byhu0 = byhs.c(((bydk)((Map.Entry)object5).getValue()), ((bydj)((Map.Entry)object5).getKey()), s3, s4, s2, null);
                        if(byhu0 != null) {
                            arrayList0.add(byhu0);
                        }
                        s3 = s3;
                        s2 = s2;
                    }
                    String s5 = s2;
                    String s6 = s3;
                    Iterator iterator2 = bydr0.c.iterator();
                    while(iterator2.hasNext()) {
                        Object object6 = iterator2.next();
                        bydm bydm0 = (bydm)object6;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(ibpz.a(bydm0.c.size()));
                        Iterator iterator3 = bydm0.c.entrySet().iterator();
                        while(iterator3.hasNext()) {
                            Object object7 = iterator3.next();
                            Object object8 = ((Map.Entry)object7).getKey();
                            LinkedHashMap linkedHashMap3 = ((bydn)((Map.Entry)object7).getValue()).a;
                            ArrayList arrayList1 = new ArrayList();
                            for(Object object9: linkedHashMap3.entrySet()) {
                                byhu byhu1 = byhs.c(((bydk)((Map.Entry)object9).getValue()), ((bydj)((Map.Entry)object9).getKey()), s6, s4, s5, bydm0.a);
                                if(byhu1 != null) {
                                    arrayList1.add(byhu1);
                                }
                                bydm0 = bydm0;
                                s6 = s6;
                                s4 = s4;
                                linkedHashMap1 = linkedHashMap1;
                                context0 = context0;
                                s5 = s5;
                                byht0 = byht0;
                            }
                            byhu byhu2 = (byhu)ibpo.T(arrayList1);
                            if(byhu2 == null) {
                                object10 = object3;
                                byhx0 = null;
                            }
                            else {
                                object10 = object3;
                                byhx0 = new byhx(arrayList1, byhu2);
                            }
                            linkedHashMap2.put(object8, byhx0);
                            bydm0 = bydm0;
                            s6 = s6;
                            s4 = s4;
                            linkedHashMap1 = linkedHashMap1;
                            iterator3 = iterator3;
                            bzbf0 = bzbf0;
                            object3 = object10;
                            context0 = context0;
                            s5 = s5;
                            byht0 = byht0;
                        }
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        for(Object object11: linkedHashMap2.entrySet()) {
                            Map.Entry map$Entry0 = (Map.Entry)object11;
                            if(((byhx)map$Entry0.getValue()) != null) {
                                linkedHashMap4.put(map$Entry0.getKey(), map$Entry0.getValue());
                            }
                        }
                        LinkedHashMap linkedHashMap5 = new LinkedHashMap(ibpz.a(linkedHashMap4.size()));
                        for(Object object12: linkedHashMap4.entrySet()) {
                            Object object13 = ((Map.Entry)object12).getKey();
                            Object object14 = ((Map.Entry)object12).getValue();
                            ibuq.d(object14, "null cannot be cast to non-null type com.google.android.gms.identitycredentials.ui.common.EntriesAtIndex");
                            linkedHashMap5.put(object13, ((byhx)object14));
                        }
                        if(!linkedHashMap5.isEmpty()) {
                            arrayList0.add(new byhz(bydm0.a, bydm0.b, linkedHashMap5));
                        }
                        s6 = s6;
                        s4 = s4;
                        linkedHashMap1 = linkedHashMap1;
                        iterator2 = iterator2;
                        iterator0 = iterator0;
                        bzbf0 = bzbf0;
                        object3 = object3;
                        context0 = context0;
                        s5 = s5;
                        byht0 = byht0;
                    }
                    if(arrayList0.isEmpty()) {
                        Set set0 = linkedHashMap1.entrySet();
                        ibuq.e(set0, "<get-entries>(...)");
                        for(Object object15: set0) {
                            if(!(((Map.Entry)object15).getValue() instanceof bydp)) {
                                continue;
                            }
                            goto label_158;
                        }
                        object15 = null;
                    label_158:
                        if(((Map.Entry)object15) == null) {
                            s7 = s4;
                            object16 = null;
                        }
                        else {
                            Object object17 = ((Map.Entry)object15).getValue();
                            ibuq.d(object17, "null cannot be cast to non-null type com.google.android.gms.identitycredentials.registry.InlineIssuanceDisplayContent");
                            PackageManager packageManager3 = context0.getPackageManager();
                            ibuq.e(packageManager3, "getPackageManager(...)");
                            ibuq.f(packageManager3, "<this>");
                            ibuq.f(s6, "packageName");
                            try {
                                ApplicationInfo applicationInfo0 = packageManager3.getPackageInfo(s6, 0x100000).applicationInfo;
                                if(applicationInfo0 == null || (applicationInfo0.flags & 1) == 0) {
                                    while(true) {
                                    label_170:
                                        z1 = false;
                                        break;
                                    }
                                }
                                else {
                                    goto label_174;
                                }
                                goto label_175;
                            }
                            catch(PackageManager.NameNotFoundException unused_ex) {
                                Log.w("CredentialSelector", "Preinstalled package not found");
                                goto label_170;
                            }
                        label_174:
                            z1 = 1;
                        label_175:
                            object16 = new bzbb(s6, byhj.a(((bydj)((Map.Entry)object15).getKey())), byhj.b(((bydp)object17).a, "androidx.credentials.registry.provider.action.GET_CREDENTIAL"), s4, ((hkn)byhs.a(byhj.c(((bydp)object17).e), new hkn(jxv.b(drawable0, 0, 0, 7)), z1)), ((String)byhs.a(((bydp)object17).c, s4, z1)), ((bydp)object17).d);
                            s7 = s4;
                        }
                        ibns1 = new ibns(arrayList0, object16);
                    }
                    else {
                        s7 = s4;
                        ibns1 = new ibns(arrayList0, null);
                    }
                    List list1 = (List)ibns1.a;
                    bzbb bzbb0 = (bzbb)ibns1.b;
                    if(!list1.isEmpty() || bzbb0 != null) {
                        byhl byhl0 = new byhl(new byhk(bydr0, drawable0, s7, list1, bzbb0));
                        Map.-EL.compute(linkedHashMap0, bydr0.a, byhl0);
                    }
                    iterator0 = iterator0;
                    bzbf0 = bzbf0;
                    object3 = object3;
                    context0 = context0;
                    s2 = s5;
                    byht0 = byht0;
                }
            }
            Collection collection0 = linkedHashMap0.values();
            ibuq.e(collection0, "<get-values>(...)");
            List list2 = ibpo.ar(collection0);
            ArrayList arrayList2 = new ArrayList();
            for(Object object18: list2) {
                arrayList2.addAll(((bzbe)object18).d);
            }
            if(!arrayList2.isEmpty()) {
                for(Object object19: arrayList2) {
                    byhy byhy0 = (byhy)object19;
                    if((byhy0 instanceof byhz)) {
                        if(((byhz)byhy0).b == 1 && ((byhz)byhy0).c.size() == 1) {
                            continue;
                        }
                        bywm0 = new bywm(arrayList2);
                        goto label_214;
                    }
                    if((byhy0 instanceof byhu)) {
                        continue;
                    }
                    throw new ibnq();
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator iterator10 = arrayList2.iterator();
            while(true) {
            label_212:
                if(!iterator10.hasNext()) {
                    bywm0 = new bywm(arrayList3);
                label_214:
                    byhy byhy1 = (byhy)ibpo.T(bywm0.a);
                    super(list2, bzbf0, bywm0, bzba.a, null, byhy1, byib.a, null);
                    byhi0.l(byht.a(byht0, ((bzaz)object3), null, null, null, null, null, 0x70));
                    return ibom.a;
                }
                Object object20 = iterator10.next();
                byhy byhy2 = (byhy)object20;
                if((byhy2 instanceof byhz)) {
                    for(Object object21: ((byhz)byhy2).c.values()) {
                        arrayList3.addAll(((byhx)object21).a);
                    }
                }
                else {
                    if(!(byhy2 instanceof byhu)) {
                        throw new ibnq();
                    }
                    arrayList3.add(byhy2);
                }
            }
        }
        catch(Exception exception0) {
            Log.e("CredentialSelector", "Failed to initialize ui state from request", exception0);
            this.d.i();
            return ibom.a;
        }
        goto label_212;
    }
}

