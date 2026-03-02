import java.util.List;

public final class ixv implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        jat jat3;
        jat jat2;
        jat jat1;
        ibuq.d(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        Object object1 = ((List)object0).get(0);
        hax hax0 = jah.i;
        Boolean boolean0 = Boolean.valueOf(false);
        jat jat0 = null;
        if(ibuq.m(object1, boolean0)) {
            jat1 = null;
        }
        else if(object1 != null) {
            jat1 = (jat)hax0.a(object1);
        }
        else {
            jat1 = null;
        }
        Object object2 = ((List)object0).get(1);
        if(ibuq.m(object2, boolean0)) {
            jat2 = null;
        }
        else if(object2 != null) {
            jat2 = (jat)hax0.a(object2);
        }
        else {
            jat2 = null;
        }
        Object object3 = ((List)object0).get(2);
        if(ibuq.m(object3, boolean0)) {
            jat3 = null;
        }
        else if(object3 != null) {
            jat3 = (jat)hax0.a(object3);
        }
        else {
            jat3 = null;
        }
        Object object4 = ((List)object0).get(3);
        if(!ibuq.m(object4, boolean0) && object4 != null) {
            jat0 = (jat)hax0.a(object4);
        }
        return new jbf(jat1, jat2, jat3, jat0);
    }
}

