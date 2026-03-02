import android.util.Log;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

final class ekml implements gmbg {
    final String a;
    final ekmo b;

    public ekml(ekmo ekmo0, String s) {
        this.a = s;
        Objects.requireNonNull(ekmo0);
        this.b = ekmo0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        Log.e("ContactsRestoreSourceLD", "Fetch gms backups for current account failed.", throwable0);
        ejze.a().r(12, this.b.i.g(), this.b.i.c, true);
        ArrayList arrayList0 = new ArrayList();
        this.b.ii(arrayList0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        List list0 = (List)object0;
        ejze ejze0 = ejze.a();
        ekmo ekmo0 = this.b;
        ejyv ejyv0 = ekmo0.i;
        ejze0.r(14, ejyv0.g(), ejyv0.c, true);
        String s = this.a;
        try {
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: ekgr.c(list0)) {
                aqfl aqfl0 = (aqfl)object1;
                if(ekgr.d(aqfl0)) {
                    ejyx ejyx0 = new ejyx("", aqfl0.e);
                    ejyx0.b = (long)aqfl0.c;
                    ejyx0.l = aqfl0;
                    ejyx0.d = aqfl0.d;
                    arrayList0.add(new ejyy(ejyx0));
                }
                else {
                    ((ggtj)((ggtj)ekgr.a.h()).ar(0x3512)).B("Skipping GMS backup from API level P and below : %s", aqfl0.e);
                }
            }
            ekmo0.j = true;
            if(ekmo0.k) {
                Set set0 = ejyv0.m();
                if(set0.isEmpty()) {
                    Log.w("ContactsRestoreSourceLD", "No promoted device backup;");
                    ekmo0.ii(new ArrayList());
                    return;
                }
                ArrayList arrayList1 = new ArrayList();
                for(Object object2: arrayList0) {
                    ejyy ejyy0 = (ejyy)object2;
                    if(set0.contains(Long.toString(ejyy0.b.longValue()))) {
                        arrayList1.add(ejyy0);
                    }
                }
                ekmo0.ii(ekmo0.b(s, arrayList1));
                return;
            }
            ekmo0.ii(arrayList0);
        }
        catch(hfur unused_ex) {
            Log.e("ContactsRestoreSourceLD", "Failed to convert to restore sources.");
            ekmo0.ii(new ArrayList());
        }
    }
}

