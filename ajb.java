import android.util.ArrayMap;
import com.google.android.gms.appsearch.AppSearchSchema;
import com.google.android.gms.appsearch.GetSchemaResponse;
import com.google.android.gms.appsearch.InternalVisibilityConfig;
import com.google.android.gms.appsearch.SchemaVisibilityConfig;
import j..util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class ajb implements kas {
    @Override  // kas
    public final Object a(Object object0) {
        Map map4;
        Map map2;
        aer aer0;
        kay.i(((GetSchemaResponse)object0));
        afd afd0 = new afd();
        Iterator iterator0 = ((GetSchemaResponse)object0).b().iterator();
        while(true) {
            int v = 0;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object1 = iterator0.next();
            kay.i(((AppSearchSchema)object1));
            aef aef0 = new aef(((AppSearchSchema)object1).a);
            List list0 = ((AppSearchSchema)object1).b();
            List list1 = ((AppSearchSchema)object1).a();
            for(int v1 = 0; v1 < list1.size(); ++v1) {
                aef0.b(((String)list1.get(v1)));
            }
            while(v < list0.size()) {
                achb achb0 = (achb)list0.get(v);
                kay.i(achb0);
                if((achb0 instanceof achc)) {
                    aeq aeq0 = new aeq(((achc)achb0).e());
                    aeq0.b(((achc)achb0).d());
                    aeq0.c(((achc)achb0).a());
                    aeq0.e(((achc)achb0).c());
                    aeq0.d(((achc)achb0).b());
                    aer0 = aeq0.a();
                    aef0.c(aer0);
                    ++v;
                    continue;
                }
                if((achb0 instanceof acha)) {
                    aen aen0 = new aen(achb0.e());
                    aen0.b(achb0.d());
                    aen0.c(((acha)achb0).a());
                    aer0 = aen0.a();
                    aef0.c(aer0);
                    ++v;
                    continue;
                }
                if((achb0 instanceof acgy)) {
                    aek aek0 = new aek(achb0.e());
                    aek0.b(achb0.d());
                    aer0 = aek0.a();
                    aef0.c(aer0);
                    ++v;
                    continue;
                }
                if((achb0 instanceof acgu)) {
                    aed aed0 = new aed(achb0.e());
                    aed0.b(achb0.d());
                    aer0 = aed0.a();
                    aef0.c(aer0);
                    ++v;
                    continue;
                }
                if((achb0 instanceof acgw)) {
                    aeg aeg0 = new aeg(achb0.e());
                    aeg0.b(achb0.d());
                    aer0 = aeg0.a();
                    aef0.c(aer0);
                    ++v;
                    continue;
                }
                if(!(achb0 instanceof acgx)) {
                    throw new IllegalArgumentException("Invalid property type " + achb0.getClass() + ": " + achb0);
                }
                aei aei0 = new aei(((acgx)achb0).e(), ((acgx)achb0).a());
                aei0.c(((acgx)achb0).d());
                aei0.a = ((acgx)achb0).c();
                aei0.b(((acgx)achb0).b());
                aer0 = aei0.a();
                aef0.c(aer0);
                ++v;
                continue;
            }
            afd0.b(aef0.a());
        }
        afd0.h(((GetSchemaResponse)object0).a);
        List list2 = ((GetSchemaResponse)object0).a();
        if(((GetSchemaResponse)object0).d == null) {
            bxf bxf0 = new bxf();
            for(int v2 = 0; v2 < list2.size(); ++v2) {
                if(((InternalVisibilityConfig)list2.get(v2)).b) {
                    bxf0.add(((InternalVisibilityConfig)list2.get(v2)).a);
                }
            }
            ((GetSchemaResponse)object0).d = DesugarCollections.unmodifiableSet(bxf0);
        }
        for(Object object2: ((GetSchemaResponse)object0).d) {
            afd0.c(((String)object2));
        }
        List list3 = ((GetSchemaResponse)object0).a();
        if(((GetSchemaResponse)object0).e == null) {
            ArrayMap arrayMap0 = new ArrayMap();
            for(int v3 = 0; v3 < list3.size(); ++v3) {
                InternalVisibilityConfig internalVisibilityConfig0 = (InternalVisibilityConfig)list3.get(v3);
                List list4 = internalVisibilityConfig0.c.b();
                if(!list4.isEmpty()) {
                    Set set0 = DesugarCollections.unmodifiableSet(new bxf(list4));
                    arrayMap0.put(internalVisibilityConfig0.a, set0);
                }
            }
            ((GetSchemaResponse)object0).e = DesugarCollections.unmodifiableMap(arrayMap0);
        }
        Map map0 = ((GetSchemaResponse)object0).e;
        if(map0 != null) {
            for(Object object3: map0.entrySet()) {
                bxf bxf1 = new bxf(((Set)((Map.Entry)object3).getValue()).size());
                for(Object object4: ((Set)((Map.Entry)object3).getValue())) {
                    bxf1.add(new afj(((achw)object4).a(), ((achw)object4).b()));
                }
                afd0.g(((String)((Map.Entry)object3).getKey()), bxf1);
            }
        }
        List list5 = ((GetSchemaResponse)object0).a();
        if(((GetSchemaResponse)object0).f == null) {
            ArrayMap arrayMap1 = new ArrayMap();
            for(int v4 = 0; v4 < list5.size(); ++v4) {
                InternalVisibilityConfig internalVisibilityConfig1 = (InternalVisibilityConfig)list5.get(v4);
                Set set1 = internalVisibilityConfig1.c.c();
                if(!set1.isEmpty()) {
                    Set set2 = DesugarCollections.unmodifiableSet(set1);
                    arrayMap1.put(internalVisibilityConfig1.a, set2);
                }
            }
            ((GetSchemaResponse)object0).f = DesugarCollections.unmodifiableMap(arrayMap1);
        }
        for(Object object5: ((GetSchemaResponse)object0).f.entrySet()) {
            afd0.e(((String)((Map.Entry)object5).getKey()), ((Set)((Map.Entry)object5).getValue()));
        }
        List list6 = ((GetSchemaResponse)object0).a();
        if(((GetSchemaResponse)object0).g == null) {
            ArrayMap arrayMap2 = new ArrayMap();
            for(int v5 = 0; v5 < list6.size(); ++v5) {
                InternalVisibilityConfig internalVisibilityConfig2 = (InternalVisibilityConfig)list6.get(v5);
                achw achw0 = internalVisibilityConfig2.c.a();
                if(achw0 != null) {
                    arrayMap2.put(internalVisibilityConfig2.a, achw0);
                }
            }
            ((GetSchemaResponse)object0).g = DesugarCollections.unmodifiableMap(arrayMap2);
        }
        Map map1 = ((GetSchemaResponse)object0).g;
        if(map1.isEmpty()) {
            map2 = Collections.EMPTY_MAP;
        }
        else {
            bxd bxd0 = new bxd(map1.size());
            for(Object object6: map1.entrySet()) {
                bxd0.put(((String)((Map.Entry)object6).getKey()), new afj(((achw)((Map.Entry)object6).getValue()).a(), ((achw)((Map.Entry)object6).getValue()).b()));
            }
            map2 = bxd0;
        }
        if(!map2.isEmpty()) {
            for(Object object7: map2.entrySet()) {
                afd0.d(((String)((Map.Entry)object7).getKey()), ((afj)((Map.Entry)object7).getValue()));
            }
        }
        List list7 = ((GetSchemaResponse)object0).a();
        if(((GetSchemaResponse)object0).h == null) {
            ArrayMap arrayMap3 = new ArrayMap();
            for(int v6 = 0; v6 < list7.size(); ++v6) {
                InternalVisibilityConfig internalVisibilityConfig3 = (InternalVisibilityConfig)list7.get(v6);
                bxf bxf2 = new bxf(internalVisibilityConfig3.d);
                if(!bxf2.isEmpty()) {
                    Set set3 = DesugarCollections.unmodifiableSet(bxf2);
                    arrayMap3.put(internalVisibilityConfig3.a, set3);
                }
            }
            ((GetSchemaResponse)object0).h = DesugarCollections.unmodifiableMap(arrayMap3);
        }
        Map map3 = ((GetSchemaResponse)object0).h;
        if(map3.isEmpty()) {
            map4 = Collections.EMPTY_MAP;
        }
        else {
            bxd bxd1 = new bxd(map3.size());
            for(Object object8: map3.entrySet()) {
                bxf bxf3 = new bxf(((Set)((Map.Entry)object8).getValue()).size());
                for(Object object9: ((Set)((Map.Entry)object8).getValue())) {
                    kay.i(((SchemaVisibilityConfig)object9));
                    afq afq0 = new afq();
                    List list8 = ((SchemaVisibilityConfig)object9).b();
                    for(int v7 = 0; v7 < list8.size(); ++v7) {
                        afq0.b(new afj(((achw)list8.get(v7)).a(), ((achw)list8.get(v7)).b()));
                    }
                    for(Object object10: ((SchemaVisibilityConfig)object9).c()) {
                        afq0.c(((Set)object10));
                    }
                    achw achw1 = ((SchemaVisibilityConfig)object9).a();
                    if(achw1 != null) {
                        afq0.d(new afj(achw1.a(), achw1.b()));
                    }
                    bxf3.add(afq0.a());
                }
                bxd1.put(((String)((Map.Entry)object8).getKey()), bxf3);
            }
            map4 = bxd1;
        }
        if(!map4.isEmpty()) {
            for(Object object11: map4.entrySet()) {
                afd0.f(((String)((Map.Entry)object11).getKey()), ((Set)((Map.Entry)object11).getValue()));
            }
        }
        return afd0.a();
    }
}

