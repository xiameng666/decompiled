import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.util.Log;
import j..util.Map.-EL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

final class byhf extends ibsl implements ibtw {
    int a;
    final bxvr b;
    final Context c;
    final byhi d;
    final byea e;

    public byhf(byea byea0, bxvr bxvr0, Context context0, byhi byhi0, ibrl ibrl0) {
        this.e = byea0;
        this.b = bxvr0;
        this.c = context0;
        this.d = byhi0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((byhf)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new byhf(this.e, this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        bynv bynv0;
        bynx bynx0;
        String s3;
        Iterator iterator2;
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ibuq.e(this.b.a, "getCreateCredentialRequest(...)");
            ibuq.e(this.b.c, "getAppPackageName(...)");
            this.a = 1;
            object2 = this.e.b(this.b.a, this.b.c, this.c, this);
            if(object2 == object1) {
                return object1;
            }
        }
        else {
            object2 = object0;
        }
        List list0 = (List)object2;
        try {
            byhi byhi0 = this.d;
            byht byht0 = byhi0.b();
            Context context0 = this.c;
            ibuq.f(list0, "providerDataList");
            ibuq.f(context0, "context");
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            Iterator iterator0 = list0.iterator();
            while(iterator0.hasNext()) {
                Object object3 = iterator0.next();
                bydr bydr0 = (bydr)object3;
                PackageManager packageManager0 = context0.getPackageManager();
                ibuq.e(packageManager0, "getPackageManager(...)");
                String s = bydr0.a;
                ibns ibns0 = byca.d(packageManager0, s);
                if(ibns0 != null) {
                    String s1 = (String)ibns0.a;
                    Drawable drawable0 = (Drawable)ibns0.b;
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object4: bydr0.b.entrySet()) {
                        Map.Entry map$Entry0 = (Map.Entry)object4;
                        bydk bydk0 = (bydk)map$Entry0.getValue();
                        if((bydk0 instanceof byeg)) {
                            String s2 = ((byeg)bydk0).c;
                            if(ibzk.D(s2)) {
                                iterator2 = iterator0;
                                s3 = s1;
                                goto label_51;
                            }
                            else {
                                iterator2 = iterator0;
                                String s4 = byhj.b(bydk0.a, "androidx.credentials.registry.provider.action.CREATE_CREDENTIAL");
                                bynx0 = new bynx(s, byhj.a(((bydj)map$Entry0.getKey())), s4, drawable0, s1, byhj.c(((byeg)bydk0).e), s2, ((byeg)bydk0).d);
                                s3 = s1;
                                goto label_52;
                            }
                            goto label_47;
                        }
                        else {
                        label_47:
                            iterator2 = iterator0;
                            s3 = s1;
                            if(!(bydk0 instanceof byee) && (!(bydk0 instanceof byds) && !(bydk0 instanceof bydo) && !(bydk0 instanceof bydp))) {
                                throw new ibnq();
                            }
                        }
                    label_51:
                        bynx0 = null;
                    label_52:
                        if(bynx0 != null) {
                            arrayList0.add(bynx0);
                        }
                        s1 = s3;
                        iterator0 = iterator2;
                    }
                    if(!arrayList0.isEmpty()) {
                        Map.-EL.compute(linkedHashMap0, s, new bygb(new byga(bydr0, drawable0, s1, arrayList0)));
                    }
                    iterator0 = iterator0;
                }
            }
            Collection collection0 = linkedHashMap0.values();
            ibuq.e(collection0, "<get-values>(...)");
            List list1 = ibpo.ar(collection0);
            bxvr bxvr0 = this.b;
            ibuq.f(context0, "context");
            String s5 = bybz.a(bxvr0.a.d);
            if(s5 == null) {
            label_73:
                PackageManager packageManager1 = context0.getPackageManager();
                ibuq.e(packageManager1, "getPackageManager(...)");
                if(bxvr0 == null) {
                    bynv0 = null;
                }
                else {
                    String s6 = bxvr0.c;
                    if(s6 == null) {
                        bynv0 = null;
                    }
                    else {
                        s5 = byca.c(packageManager1, s6);
                        bynv0 = s5 == null ? null : new bynv(s5);
                    }
                }
            }
            else {
                if(s5.length() == 0) {
                    s5 = null;
                }
                if(s5 != null) {
                    bynv0 = new bynv(s5);
                    goto label_87;
                }
                goto label_73;
            }
        label_87:
            if(bynv0 == null) {
                throw new IllegalStateException("Failed to initialize display info.");
            }
            ibuq.f(list1, "providerInfoList");
            ArrayList arrayList1 = new ArrayList();
            for(Object object5: list1) {
                ibpo.D(arrayList1, ((bynu)object5).d);
            }
            bynt bynt0 = new bynt(arrayList1);
            bynx bynx1 = (bynx)ibpo.T(bynt0.a);
            byhi0.l(byht.a(byht0, null, new byns(bynv0, bynt0, bynw.a, bynx1, byib.a), null, null, null, null, 0x70));
        }
        catch(IllegalStateException illegalStateException0) {
            Log.e("CredentialSelector", "Failed to initialize ui state from request", illegalStateException0);
            this.d.i();
        }
        return ibom.a;
    }
}

