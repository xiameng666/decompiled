import j..time.Duration;
import j..time.Instant;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class aqko implements ibts {
    public final List a;

    public aqko(List list0) {
        this.a = list0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        long v3;
        ibuq.f(((aqdq)object0), "allPackagesBackupRecords");
        Object object1 = new ArrayList();
        for(Object object2: this.a) {
            aqkr aqkr0 = (aqkr)object2;
            String s = aqkr0.a;
            aqkq aqkq0 = aqkr0.b;
            if(ibuq.m(s, "@pm@")) {
                aqks.a.h("Should back up @pm@: it\'s exempt from FTT enforcement.", new Object[0]);
                ((Collection)object1).add(object2);
            }
            else {
                aqhv aqhv0 = (aqhv)DesugarCollections.unmodifiableMap(((aqdq)object0).b).get(s);
                Object object3 = null;
                if(aqhv0 != null) {
                    hfuo hfuo0 = aqhv0.b;
                    ibuq.e(hfuo0, "getBackupRecordsList(...)");
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object4: hfuo0) {
                        aqfv aqfv0 = aqfv.b(((aqep)object4).d);
                        if(aqfv0 == null) {
                            aqfv0 = aqfv.a;
                        }
                        ibuq.e(aqfv0, "getBackupType(...)");
                        if((aqfv0 == aqfv.d ? aqkq.b : aqkq.a) == aqkq0) {
                            arrayList0.add(object4);
                        }
                    }
                    Iterator iterator2 = arrayList0.iterator();
                    if(iterator2.hasNext()) {
                        object3 = iterator2.next();
                        if(iterator2.hasNext()) {
                            long v = ((aqep)object3).c;
                            while(true) {
                                Object object5 = iterator2.next();
                                long v1 = ((aqep)object5).c;
                                int v2 = Long.compare(v, v1);
                                if(v2 < 0) {
                                    v = v1;
                                }
                                if(v2 < 0) {
                                    object3 = object5;
                                }
                                if(iterator2.hasNext()) {
                                    continue;
                                }
                                goto label_41;
                            }
                        }
                        else {
                            goto label_41;
                        }
                    }
                    else {
                    label_41:
                        object3 = (aqep)object3;
                    }
                }
                if(object3 == null) {
                    aqks.a.h("Should back up %s: no previous backup record found.", new Object[]{aqkr0});
                    ((Collection)object1).add(object2);
                }
                else {
                    Instant instant0 = Instant.now();
                    ibuq.e(instant0, "now(...)");
                    Instant instant1 = Instant.ofEpochMilli(object3.c);
                    ibuq.e(instant1, "ofEpochMilli(...)");
                    Duration duration0 = glyc.a(instant0, instant1);
                    if(aqkq0 == aqkq.b) {
                        v3 = hqgx.a.c().d();
                    }
                    else {
                        v3 = hqgx.a.c().i().b.contains(s) ? hqgx.a.c().g() : hqgx.a.c().c();
                    }
                    Duration duration1 = Duration.ofMillis(v3 - hqgx.a.c().f());
                    ibuq.e(duration1, "ofMillis(...)");
                    if(duration0.compareTo(duration1) > 0) {
                        Object[] arr_object = {aqkr0, aqks.b(duration0), aqks.b(duration1)};
                        aqks.a.h("Should back up %s: time since last backup = %s, needed at least %s", arr_object);
                        ((Collection)object1).add(object2);
                    }
                    else {
                        Object[] arr_object1 = {aqkr0, aqks.b(duration0), aqks.b(duration1)};
                        aqks.a.j("Shouldn\'t back up %s: time since last backup = %s, needed at least %s", arr_object1);
                    }
                }
            }
        }
        return object1;
    }
}

