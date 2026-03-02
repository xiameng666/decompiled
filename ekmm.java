import android.util.Log;
import com.google.android.gms.people.account.categories.ClassifyAccountTypeRequest;
import com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.romanesco.protomodel.SourceStats;
import j..util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

final class ekmm implements gmbg {
    final String a;
    final ekmo b;

    public ekmm(ekmo ekmo0, String s) {
        this.a = s;
        Objects.requireNonNull(ekmo0);
        this.b = ekmo0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        Log.e("ContactsRestoreSourceLD", String.format("Fetch device backups for current account failed."), throwable0);
        ejze.a().r(12, this.b.i.g(), this.b.i.c, true);
        ArrayList arrayList0 = new ArrayList();
        this.b.ii(arrayList0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        ejze ejze0 = ejze.a();
        ekmo ekmo0 = this.b;
        ejyv ejyv0 = ekmo0.i;
        ejze0.r(9, ejyv0.g(), ejyv0.c, false);
        ejze.a().r(15, ejyv0.g(), ejyv0.c, false);
        if(((List)object0) != null && !((List)object0).isEmpty()) {
            ekmo0.j = true;
            Set set0 = ejyv0.m();
            Set set1 = ekav.a(ekmo0.h);
            HashSet hashSet0 = new HashSet();
            HashSet hashSet1 = new HashSet();
            for(Object object1: ((List)object0)) {
                BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity0 = (BackedUpContactsPerDeviceEntity)object1;
                boolean z = ekmo0.k;
                if(!z || backedUpContactsPerDeviceEntity0.g() != null && (set0.isEmpty() || set0.contains(backedUpContactsPerDeviceEntity0.a))) {
                    for(Object object2: backedUpContactsPerDeviceEntity0.g()) {
                        hashSet0.add(((SourceStats)object2).c());
                        hashSet1.add(backedUpContactsPerDeviceEntity0);
                    }
                    if(!z && (backedUpContactsPerDeviceEntity0.g() == null || backedUpContactsPerDeviceEntity0.g().isEmpty())) {
                        hashSet1.add(backedUpContactsPerDeviceEntity0);
                    }
                }
            }
            ejze.a().j(((List)object0).size(), hashSet1.size());
            if(hashSet1.isEmpty()) {
                ekmo0.ii(new ArrayList());
            }
            ScheduledExecutorService scheduledExecutorService0 = clhl.b.h(1, clhr.b);
            ArrayList arrayList0 = new ArrayList();
            for(Object object3: hashSet0) {
                arrayList0.add(new ClassifyAccountTypeRequest(((String)object3), null));
            }
            gmbu.t(gmbu.q(fhra.b(ekmo0.a.a(arrayList0)), hxuf.a.b().a(), TimeUnit.MILLISECONDS, scheduledExecutorService0), new ekmn(ekmo0, hashSet1, set1, this.a, ((List)object0), set0), gmap.a);
            return;
        }
        ekmo0.ii(new ArrayList());
    }
}

