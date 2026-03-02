import android.text.TextUtils;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class auiq {
    public String a;
    private final avjh b;
    private final gful_cronetEngineProvider c;
    private final Map d;
    private final Map e;

    public auiq(auip auip0) {
        this.b = new avjh("AppAvailabilityInfo");
        this.c = gfus.a(((gful_cronetEngineProvider)new auio()));
        Map map0 = DesugarCollections.synchronizedMap(new HashMap());
        this.d = map0;
        map0.putAll(auip0.a);
        Map map1 = DesugarCollections.synchronizedMap(new HashMap());
        this.e = map1;
        map1.putAll(auip0.b);
        this.a = auip0.c;
    }

    public final Map a() {
        Map map0 = this.e;
        return map0 != null ? map0 : new HashMap();
    }

    public final Map b() {
        Map map0 = this.d;
        return map0 != null ? map0 : new HashMap();
    }

    final Set c() {
        Set set0 = new HashSet();
        Map map0 = this.e;
        if(map0 != null) {
            set0.addAll(map0.keySet());
        }
        return set0;
    }

    final Set d() {
        Set set0 = new HashSet();
        Map map0 = this.d;
        if(map0 != null) {
            set0.addAll(map0.keySet());
        }
        return set0;
    }

    public final void e(Set set0, Set set1, String s, boolean z) {
        synchronized(this) {
            int v1 = this.f(s);
            if(v1 == 2) {
                Map map0 = this.d;
                if(map0 != null) {
                    map0.clear();
                }
                Map map1 = this.e;
                if(map1 != null) {
                    map1.clear();
                }
            }
            else {
                Map map2 = this.d;
                if(map2 != null && set1 != null) {
                    map2.keySet().removeAll(set1);
                }
                Map map3 = this.e;
                if(map3 != null) {
                    map3.keySet().removeAll(set0);
                }
            }
            Map map4 = this.d;
            long v2 = System.currentTimeMillis();
            if(map4 != null) {
                for(Object object0: set0) {
                    batl.s(map4);
                    map4.put(((String)object0), Long.valueOf(v2));
                }
            }
            Map map5 = this.e;
            if(map5 != null && set1 != null) {
                for(Object object1: set1) {
                    batl.s(map5);
                    map5.put(((String)object1), Long.valueOf(v2));
                }
            }
            if(v1 != 3) {
                if(map4 != null) {
                    for(Object object2: new HashSet(map4.keySet())) {
                        String s1 = (String)object2;
                        batl.s(map4);
                        Long long0 = (Long)map4.get(s1);
                        if(long0 != null && v2 - ((long)long0) > ((long)(((Long)this.c.mr())))) {
                            batl.s(map4);
                            map4.remove(s1);
                        }
                    }
                }
                if(map5 != null) {
                    for(Object object3: new HashSet(map5.keySet())) {
                        String s2 = (String)object3;
                        batl.s(map5);
                        Long long1 = (Long)map5.get(s2);
                        if(long1 != null && v2 - ((long)long1) > ((long)(((Long)this.c.mr())))) {
                            batl.s(map5);
                            map5.remove(s2);
                        }
                    }
                }
            }
            if(z) {
                if(map4 != null) {
                    for(Object object4: new HashSet(map4.keySet())) {
                        String s3 = (String)object4;
                        if(aurf.t(s3) && !set0.contains(s3)) {
                            batl.s(map4);
                            map4.remove(s3);
                        }
                    }
                }
                if(map5 != null && set1 != null) {
                    for(Object object5: new HashSet(map5.keySet())) {
                        String s4 = (String)object5;
                        if(aurf.t(s4) && !set1.contains(s4)) {
                            batl.s(map5);
                            map5.remove(s4);
                        }
                    }
                }
            }
            Object[] arr_object = {this.d(), this.c()};
            this.b.c("updated criteria: supported (%s) and not supported (%s)", arr_object);
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof auiq) ? Objects.equals(this.d(), ((auiq)object0).d()) && Objects.equals(this.c(), ((auiq)object0).c()) && aurf.u(this.a, ((auiq)object0).a) : false;
    }

    private final int f(String s) {
        int v1;
        synchronized(this) {
            if(s != null && TextUtils.equals(s, this.a)) {
                v1 = 3;
            }
            else {
                v1 = s != null || this.a != null ? 2 : 1;
            }
            this.a = s;
        }
        return v1;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.d(), this.c(), this.a});
    }

    @Override
    public final String toString() {
        return String.format(Locale.ROOT, "supported-%s, notSupported-%s, configTimestamp-%s", auin.a(this.d()), auin.a(this.c()), this.a);
    }
}

