import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class lfc implements ldr {
    public static final lfc a;

    static {
        lfc.a = new lfc();
    }

    @Override  // ldr
    public final Object a() {
        return new lfa(true);
    }

    // This method was un-flattened
    @Override  // ldr
    public final Object b(InputStream inputStream0) {
        int v;
        leq leq1;
        try {
            leq leq0 = leq.DEFAULT_INSTANCE;
            lfw lfw0 = new lfw(inputStream0);
            lgi lgi0 = lgi.a;
            if(lgi0 == null) {
                synchronized(lgi.class) {
                    lgi lgi1 = lgi.a;
                    if(lgi1 == null) {
                        lgi lgi2 = null;
                        Class class1 = lgg.a;
                        if(class1 != null) {
                            try {
                                lgi2 = (lgi)class1.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            }
                            catch(Exception unused_ex) {
                            }
                        }
                        if(lgi2 == null) {
                            lgi2 = lgi.b;
                        }
                        lgi.a = lgi2;
                        lgi1 = lgi2;
                    }
                    lgi0 = lgi1;
                }
            }
            lgs lgs0 = leq0.l();
            try {
                lie lie0 = lib.a.b(lgs0);
                lie0.h(lgs0, (lfw0.g == null ? new lfy(lfw0) : lfw0.g), lgi0);
                lie0.d(lgs0);
            }
            catch(lgz lgz1) {
                if(lgz1.a) {
                    lgz1 = new lgz(lgz1);
                }
                throw lgz1;
            }
            catch(lin lin0) {
                throw lin0.a();
            }
            catch(IOException iOException0) {
                throw (iOException0.getCause() instanceof lgz) ? ((lgz)iOException0.getCause()) : new lgz(iOException0);
            }
            catch(RuntimeException runtimeException0) {
                if((runtimeException0.getCause() instanceof lgz)) {
                    throw (lgz)runtimeException0.getCause();
                }
                throw runtimeException0;
            }
            if(lgs0 != null && !lgs0.t()) {
                throw new lin().a();
            }
            leq1 = (leq)lgs0;
            ibuq.c(leq1);
        }
        catch(lgz lgz0) {
            throw new laf("Unable to parse preferences proto.", lgz0);
        }
        lfa lfa0 = lfb.a(new lez[0]);
        Map map0 = DesugarCollections.unmodifiableMap(leq1.preferences_);
        ibuq.e(map0, "getPreferencesMap(...)");
        for(Object object0: map0.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            les les0 = (les)((Map.Entry)object0).getValue();
            ibuq.c(s);
            ibuq.c(les0);
            switch(les0.valueCase_) {
                case 0: {
                    break;
                }
                case 1: {
                    v = 1;
                    break;
                }
                case 2: {
                    v = 2;
                    break;
                }
                case 3: {
                    v = 3;
                    break;
                }
                case 4: {
                    v = 4;
                    break;
                }
                case 5: {
                    v = 5;
                    break;
                }
                case 6: {
                    v = 6;
                    break;
                }
                case 7: {
                    v = 7;
                    break;
                }
                case 8: {
                    v = 8;
                    break;
                }
                default: {
                    throw new laf("Value case is null.");
                }
            }
            switch(v - 1) {
                case 0: {
                    ibuq.f(s, "name");
                    lfa0.e(new ley(s), Boolean.valueOf((les0.valueCase_ == 1 ? ((Boolean)les0.value_).booleanValue() : false)));
                    break;
                }
                case 1: {
                    ibuq.f(s, "name");
                    lfa0.e(new ley(s), Float.valueOf((les0.valueCase_ == 2 ? ((float)(((Float)les0.value_))) : 0.0f)));
                    break;
                }
                case 2: {
                    ibuq.f(s, "name");
                    lfa0.e(new ley(s), Integer.valueOf((les0.valueCase_ == 3 ? ((int)(((Integer)les0.value_))) : 0)));
                    break;
                }
                case 3: {
                    lfa0.e(lfd.b(s), Long.valueOf((les0.valueCase_ == 4 ? ((long)(((Long)les0.value_))) : 0L)));
                    break;
                }
                case 4: {
                    ibuq.f(s, "name");
                    lfa0.e(new ley(s), (les0.valueCase_ == 5 ? ((String)les0.value_) : ""));
                    break;
                }
                case 5: {
                    ibuq.f(s, "name");
                    ley ley0 = new ley(s);
                    lgw lgw0 = (les0.valueCase_ == 6 ? ((ler)les0.value_) : ler.DEFAULT_INSTANCE).strings_;
                    ibuq.e(lgw0, "getStringsList(...)");
                    lfa0.e(ley0, ibpo.ay(lgw0));
                    break;
                }
                case 6: {
                    ibuq.f(s, "name");
                    lfa0.e(new ley(s), Double.valueOf((les0.valueCase_ == 7 ? ((double)(((Double)les0.value_))) : 0.0)));
                    break;
                }
                case 7: {
                    lfa0.e(lfd.a(s), (les0.valueCase_ == 8 ? ((lfu)les0.value_) : lfu.b).l());
                    break;
                }
                default: {
                    throw new laf("Value not set.");
                }
            }
        }
        return new lfa(ibpz.r(lfa0.b()), true);
    }

    @Override  // ldr
    public final Object c(Object object0, OutputStream outputStream0) {
        les les0;
        Map map0 = ((lfa)object0).b();
        lgp lgp0 = leq.DEFAULT_INSTANCE.i();
        for(Object object1: map0.entrySet()) {
            ley ley0 = (ley)((Map.Entry)object1).getKey();
            Object object2 = ((Map.Entry)object1).getValue();
            String s = ley0.a;
            if((object2 instanceof Boolean)) {
                lgp lgp1 = les.b();
                lgp1.f();
                ((les)lgp1.b).valueCase_ = 1;
                ((les)lgp1.b).value_ = (Boolean)object2;
                lgs lgs0 = lgp1.c();
                ibuq.e(lgs0, "build(...)");
                les0 = (les)lgs0;
            }
            else {
                if((object2 instanceof Float)) {
                    lgp lgp2 = les.b();
                    float f = ((Number)object2).floatValue();
                    lgp2.f();
                    ((les)lgp2.b).valueCase_ = 2;
                    ((les)lgp2.b).value_ = f;
                    lgs lgs1 = lgp2.c();
                    ibuq.e(lgs1, "build(...)");
                    les0 = (les)lgs1;
                    goto label_142;
                }
                if((object2 instanceof Double)) {
                    lgp lgp3 = les.b();
                    double f1 = ((Number)object2).doubleValue();
                    lgp3.f();
                    ((les)lgp3.b).valueCase_ = 7;
                    ((les)lgp3.b).value_ = f1;
                    lgs lgs2 = lgp3.c();
                    ibuq.e(lgs2, "build(...)");
                    les0 = (les)lgs2;
                    goto label_142;
                }
                if((object2 instanceof Integer)) {
                    lgp lgp4 = les.b();
                    int v = ((Number)object2).intValue();
                    lgp4.f();
                    ((les)lgp4.b).valueCase_ = 3;
                    ((les)lgp4.b).value_ = v;
                    lgs lgs3 = lgp4.c();
                    ibuq.e(lgs3, "build(...)");
                    les0 = (les)lgs3;
                    goto label_142;
                }
                if((object2 instanceof Long)) {
                    lgp lgp5 = les.b();
                    long v1 = ((Number)object2).longValue();
                    lgp5.f();
                    ((les)lgp5.b).valueCase_ = 4;
                    ((les)lgp5.b).value_ = v1;
                    lgs lgs4 = lgp5.c();
                    ibuq.e(lgs4, "build(...)");
                    les0 = (les)lgs4;
                    goto label_142;
                }
                if((object2 instanceof String)) {
                    lgp lgp6 = les.b();
                    lgp6.f();
                    les les1 = (les)lgp6.b;
                    ((String)object2).getClass();
                    les1.valueCase_ = 5;
                    les1.value_ = (String)object2;
                    lgs lgs5 = lgp6.c();
                    ibuq.e(lgs5, "build(...)");
                    les0 = (les)lgs5;
                    goto label_142;
                }
                if((object2 instanceof Set)) {
                    lgp lgp7 = les.b();
                    lgp lgp8 = ler.DEFAULT_INSTANCE.i();
                    ibuq.d(object2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    lgp8.f();
                    ler ler0 = (ler)lgp8.b;
                    lgw lgw0 = ler0.strings_;
                    if(!lgw0.c()) {
                        int v2 = lgw0.size();
                        ler0.strings_ = lgw0.d((v2 == 0 ? 10 : v2 + v2));
                    }
                    lgw lgw1 = ler0.strings_;
                    lgx.c(((Set)object2));
                    if((((Set)object2) instanceof lhd)) {
                        int v3 = lgw1.size();
                        for(Object object3: ((lhd)(((Set)object2))).a()) {
                            if(object3 == null) {
                                String s1 = "Element at index " + (((lhd)lgw1).size() - v3) + " is null.";
                                int v4 = ((lhd)lgw1).size();
                                while(true) {
                                    --v4;
                                    if(v4 < v3) {
                                        break;
                                    }
                                    ((lhd)lgw1).remove(v4);
                                }
                                throw new NullPointerException(s1);
                            }
                            if((object3 instanceof lfu)) {
                                lfu lfu0 = (lfu)object3;
                                ((lhd)lgw1).b();
                            }
                            else if((object3 instanceof byte[])) {
                                lfu.j(((byte[])object3));
                                ((lhd)lgw1).b();
                            }
                            else {
                                ((lhd)lgw1).add(((String)object3));
                            }
                        }
                    }
                    else if((((Set)object2) instanceof lia)) {
                        lgw1.addAll(((Set)object2));
                    }
                    else {
                        if((lgw1 instanceof ArrayList) && (((Set)object2) instanceof Collection)) {
                            ((ArrayList)lgw1).ensureCapacity(lgw1.size() + ((Set)object2).size());
                        }
                        int v5 = lgw1.size();
                        for(Object object4: ((Set)object2)) {
                            if(object4 == null) {
                                String s2 = "Element at index " + (lgw1.size() - v5) + " is null.";
                                int v6 = lgw1.size();
                                while(true) {
                                    --v6;
                                    if(v6 < v5) {
                                        break;
                                    }
                                    lgw1.remove(v6);
                                }
                                throw new NullPointerException(s2);
                            }
                            lgw1.add(object4);
                        }
                    }
                    lgp7.f();
                    les les2 = (les)lgp7.b;
                    ler ler1 = (ler)lgp8.c();
                    ler1.getClass();
                    les2.value_ = ler1;
                    les2.valueCase_ = 6;
                    lgs lgs6 = lgp7.c();
                    ibuq.e(lgs6, "build(...)");
                    les0 = (les)lgs6;
                    goto label_142;
                }
                if(!(object2 instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: " + object2.getClass().getName());
                }
                lgp lgp9 = les.b();
                lfu lfu1 = lfu.j(((byte[])object2));
                lgp9.f();
                ((les)lgp9.b).valueCase_ = 8;
                ((les)lgp9.b).value_ = lfu1;
                lgs lgs7 = lgp9.c();
                ibuq.e(lgs7, "build(...)");
                les0 = (les)lgs7;
            }
        label_142:
            s.getClass();
            les0.getClass();
            lgp0.f();
            leq leq0 = (leq)lgp0.b;
            lhm lhm0 = leq0.preferences_;
            if(!lhm0.b) {
                leq0.preferences_ = lhm0.a();
            }
            leq0.preferences_.put(s, les0);
            continue;
        }
        leq leq1 = (leq)lgp0.c();
        int v7 = leq1.h();
        if(v7 > 0x1000) {
            v7 = 0x1000;
        }
        lfz lfz0 = new lfz(outputStream0, v7);
        leq1.s(lfz0);
        if(lfz0.c > 0) {
            lfz0.i();
        }
        return ibom.a;
    }
}

