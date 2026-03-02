import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class byhh extends ibsl implements ibtw {
    int a;
    final bxvt b;
    final Context c;
    final byhi d;
    final byea e;

    public byhh(byea byea0, bxvt bxvt0, Context context0, byhi byhi0, ibrl ibrl0) {
        this.e = byea0;
        this.b = bxvt0;
        this.c = context0;
        this.d = byhi0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((byhh)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new byhh(this.e, this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        bzcf bzcf0;
        String s3;
        Object object6;
        hkn hkn1;
        byht byht2;
        Iterator iterator3;
        Object object4;
        byht byht1;
        Iterator iterator1;
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ibuq.e(this.b.a, "getImportCredentialsRequest(...)");
            ibuq.e(this.b.c, "getAppPackageName(...)");
            this.a = 1;
            object2 = this.e.a(this.b.a, this.b.c, this.c, this);
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
            ArrayList arrayList0 = new ArrayList();
            Iterator iterator0 = list0.iterator();
            while(iterator0.hasNext()) {
                Object object3 = iterator0.next();
                bydl bydl0 = (bydl)object3;
                PackageManager packageManager0 = context0.getPackageManager();
                ibuq.e(packageManager0, "getPackageManager(...)");
                String s = bydl0.a;
                ibns ibns0 = byca.d(packageManager0, s);
                if(ibns0 == null) {
                    iterator1 = iterator0;
                    byht1 = byht0;
                    object4 = null;
                }
                else {
                    String s1 = (String)ibns0.a;
                    Drawable drawable0 = (Drawable)ibns0.b;
                    ArrayList arrayList1 = new ArrayList();
                    for(Object object5: bydl0.b.entrySet()) {
                        Map.Entry map$Entry0 = (Map.Entry)object5;
                        bydk bydk0 = (bydk)map$Entry0.getValue();
                        if((bydk0 instanceof bydo)) {
                            byhw byhw0 = byhj.a(((bydj)map$Entry0.getKey()));
                            iterator3 = iterator0;
                            hkn hkn0 = byhj.c(((bydo)bydk0).e);
                            if(hkn0 == null) {
                                byht2 = byht0;
                                hkn1 = new hkn(jxv.b(drawable0, 0, 0, 7));
                            }
                            else {
                                byht2 = byht0;
                                hkn1 = hkn0;
                            }
                            String s2 = ((bydo)bydk0).d;
                            object6 = new bzch(s, byhw0, s1, hkn1, (s2 == null ? ((bydo)bydk0).c : s2), (s2 == null ? null : ((bydo)bydk0).c));
                            s3 = s1;
                        }
                        else {
                            iterator3 = iterator0;
                            byht2 = byht0;
                            s3 = s1;
                            object6 = null;
                        }
                        if(object6 != null) {
                            arrayList1.add(object6);
                        }
                        s1 = s3;
                        iterator0 = iterator3;
                        byht0 = byht2;
                    }
                    iterator1 = iterator0;
                    byht1 = byht0;
                    object4 = arrayList1.isEmpty() ? null : new bzce(s, s1, arrayList1);
                }
                if(object4 != null) {
                    arrayList0.add(object4);
                }
                iterator0 = iterator1;
                byht0 = byht1;
            }
            ibuq.f(this.b, "requestInfo");
            ibuq.f(context0, "context");
            PackageManager packageManager1 = context0.getPackageManager();
            ibuq.e(packageManager1, "getPackageManager(...)");
            String s4 = this.b.c;
            ibuq.e(s4, "getAppPackageName(...)");
            Drawable drawable1 = byca.a(packageManager1, s4);
            String s5 = bybz.a(null);
            if(s5 == null) {
            label_89:
                PackageManager packageManager2 = context0.getPackageManager();
                ibuq.e(packageManager2, "getPackageManager(...)");
                ibuq.e(s4, "getAppPackageName(...)");
                s5 = byca.c(packageManager2, s4);
                bzcf0 = s5 == null ? null : new bzcf(s5, drawable1, s4);
            }
            else {
                if(s5.length() == 0) {
                    s5 = null;
                }
                if(s5 != null) {
                    bzcf0 = new bzcf(s5, drawable1, s4);
                    goto label_94;
                }
                goto label_89;
            }
        label_94:
            if(bzcf0 == null) {
                throw new IllegalStateException("Failed to initialize import display info.");
            }
            byhi0.l(byht.a(byht0, null, null, new bzcc(arrayList0, bzcf0, bzcg.a), null, null, null, 0x70));
        }
        catch(IllegalStateException illegalStateException0) {
            Log.e("CredentialSelector", "Failed to initialize import ui state from request", illegalStateException0);
            this.d.i();
        }
        return ibom.a;
    }
}

