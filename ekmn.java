import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.people.account.categories.ClassifyAccountTypeResult;
import com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.romanesco.protomodel.SourceStats;
import j..util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

final class ekmn implements gmbg {
    final Set a;
    final Set b;
    final String c;
    final List d;
    final Set e;
    final ekmo f;

    public ekmn(ekmo ekmo0, Set set0, Set set1, String s, List list0, Set set2) {
        this.a = set0;
        this.b = set1;
        this.c = s;
        this.d = list0;
        this.e = set2;
        Objects.requireNonNull(ekmo0);
        this.f = ekmo0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        ejyy ejyy0;
        Log.e("ContactsRestoreSourceLD", "An error has occurred when retrieving categorization results", throwable0);
        if(hxun.c()) {
            ejze.a().r(20, this.f.i.g(), this.f.i.c, false);
        }
        ekmo ekmo0 = this.f;
        String s = this.c;
        List list0 = this.d;
        Set set0 = this.e;
        Set set1 = this.b;
        HashMap hashMap0 = new HashMap();
        for(Object object0: list0) {
            BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity0 = (BackedUpContactsPerDeviceEntity)object0;
            if(backedUpContactsPerDeviceEntity0.g() != null) {
                if(backedUpContactsPerDeviceEntity0.g() == null) {
                    ejyy0 = null;
                }
                else {
                    ejyx ejyx0 = new ejyx(backedUpContactsPerDeviceEntity0.a, backedUpContactsPerDeviceEntity0.c);
                    ejyx0.b = backedUpContactsPerDeviceEntity0.b;
                    for(Object object1: backedUpContactsPerDeviceEntity0.g()) {
                        SourceStats sourceStats0 = (SourceStats)object1;
                        if(!set1.contains(sourceStats0.c()) || TextUtils.equals("com.google", sourceStats0.c())) {
                            ejyx0.a(sourceStats0);
                        }
                    }
                    ejyx0.d = (long)backedUpContactsPerDeviceEntity0.d;
                    ejyy0 = new ejyy(ejyx0);
                }
                if(ejyy0 == null) {
                    return;
                }
                if(ejyy0.d > 0) {
                    String s1 = ejyy0.a;
                    if(set0.isEmpty() || set0.contains(s1)) {
                        hashMap0.put(s1, ejyy0);
                    }
                }
            }
        }
        ejze.a().j(list0.size(), hashMap0.size());
        if(hashMap0.isEmpty()) {
            ekmo0.ii(new ArrayList());
        }
        ekmo0.ii(ekmo0.b(s, new ArrayList(hashMap0.values())));
    }

    @Override  // gmbg
    public final void b(Object object0) {
        ArrayList arrayList0 = new ArrayList();
        if(((List)object0).isEmpty() && hxun.c()) {
            ejze.a().r(20, this.f.i.g(), this.f.i.c, false);
        }
        for(Object object1: this.a) {
            Set set0 = this.b;
            ejyx ejyx0 = new ejyx(((BackedUpContactsPerDeviceEntity)object1).a, ((BackedUpContactsPerDeviceEntity)object1).c);
            HashMap hashMap0 = new HashMap();
            for(Object object2: ((List)object0)) {
                ClassifyAccountTypeResult classifyAccountTypeResult0 = (ClassifyAccountTypeResult)object2;
                String s = classifyAccountTypeResult0.a;
                if(s != null) {
                    hashMap0.put(s, classifyAccountTypeResult0.c);
                }
            }
            ejyx0.i = hashMap0;
            ejyx0.b = ((BackedUpContactsPerDeviceEntity)object1).b;
            for(Object object3: ((BackedUpContactsPerDeviceEntity)object1).g()) {
                SourceStats sourceStats0 = (SourceStats)object3;
                if(!set0.contains(sourceStats0.c()) || TextUtils.equals("com.google", sourceStats0.c())) {
                    ejyx0.a(sourceStats0);
                }
            }
            ejyx0.d = (long)((BackedUpContactsPerDeviceEntity)object1).d;
            ejyy ejyy0 = new ejyy(ejyx0);
            if(!this.f.k || ejyy0.d > 0) {
                arrayList0.add(ejyy0);
            }
        }
        List list0 = this.f.b(this.c, arrayList0);
        this.f.ii(list0);
    }
}

