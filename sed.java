import android.os.PersistableBundle;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class sed implements sdg {
    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        throw null;
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        throw null;
    }

    public static final see d(ibwv ibwv0, ibwv[] arr_ibwv, Map map0, Map map1) {
        List list0;
        ibuq.f(ibwv0, "source");
        Annotation[] arr_annotation = ibtf.a(ibwv0).getAnnotations();
        ibuq.e(arr_annotation, "getAnnotations(...)");
        ArrayList arrayList0 = new ArrayList();
        int v = 0;
        while(v < arr_annotation.length) {
            Annotation annotation0 = arr_annotation[v];
            ibuq.c(annotation0);
            try {
                Class class0 = ibtf.a(ibtf.c(annotation0));
                if(class0.getMethods().length == 5) {
                    Method method0 = class0.getMethod("value", null);
                    if(method0 != null && method0.getReturnType().isArray()) {
                        Class class1 = method0.getReturnType().getComponentType();
                        if(class1 != null && class1.isAnnotation()) {
                            Object object0 = method0.invoke(annotation0, null);
                            ibuq.d(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Annotation>");
                            list0 = ibpg.e(((Annotation[])object0));
                            goto label_19;
                        }
                    }
                }
            }
            catch(Throwable unused_ex) {
            }
            list0 = ibpo.b(annotation0);
        label_19:
            ibpo.D(arrayList0, list0);
            ++v;
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: arrayList0) {
            if(ibpg.V(arr_ibwv, ibtf.c(((Annotation)object1)))) {
                arrayList1.add(object1);
            }
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object2: arrayList1) {
            ibwv ibwv1 = ibtf.c(((Annotation)object2));
            Object object3 = linkedHashMap0.get(ibwv1);
            if(object3 == null) {
                object3 = new ArrayList();
                linkedHashMap0.put(ibwv1, object3);
            }
            ((List)object3).add(object2);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap0.size());
        for(Object object4: linkedHashMap0.entrySet()) {
            ibwv ibwv2 = (ibwv)((Map.Entry)object4).getKey();
            List list1 = (List)((Map.Entry)object4).getValue();
            String s = (String)ibpz.g(map1, ibwv2);
            ibts ibts0 = (ibts)ibpz.g(map0, ibwv2);
            ArrayList arrayList3 = new ArrayList(ibpo.q(list1, 10));
            for(Object object5: list1) {
                arrayList3.add(((sec)ibts0.a(((Annotation)object5))));
            }
            arrayList2.add(new ibns(s, sdq.a.a(arrayList3)));
        }
        Map map2 = ibpz.p(arrayList2);
        String s1 = ibwv0.b();
        if(s1 != null) {
            return new see(s1, map2);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final see e(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        String s = persistableBundle0.getString("QUALIFIED_NAME");
        if(s == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Map map0 = new sdr(sdx.a, sdu.a).d(persistableBundle0);
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibpz.a(((ibqu)map0).g));
        for(Object object0: map0.entrySet()) {
            linkedHashMap0.put(((sdx)((Map.Entry)object0).getKey()).b, ((Map.Entry)object0).getValue());
        }
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(ibpz.a(linkedHashMap0.size()));
        for(Object object1: linkedHashMap0.entrySet()) {
            linkedHashMap1.put(((Map.Entry)object1).getKey(), ((sdu)((Map.Entry)object1).getValue()).b);
        }
        return new see(s, linkedHashMap1);
    }

    @Override  // rna
    public final Object fm(Object object0) {
        throw null;
    }
}

