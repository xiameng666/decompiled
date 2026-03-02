import java.util.List;

public final class jaa implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        Object object8;
        jjw jjw0;
        ixr ixr0;
        jki jki0;
        ibuq.d(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        Object object1 = ((List)object0).get(0);
        Boolean boolean0 = Boolean.valueOf(false);
        ibuq.m(object1, boolean0);
        jkk jkk0 = null;
        jjy jjy0 = object1 == null ? null : ((jjy)jah.x.a(object1));
        ibuq.c(jjy0);
        Object object2 = ((List)object0).get(1);
        ibuq.m(object2, boolean0);
        jka jka0 = object2 == null ? null : ((jka)jah.y.a(object2));
        ibuq.c(jka0);
        Object object3 = ((List)object0).get(2);
        ibuq.m(object3, boolean0);
        jlp jlp0 = object3 == null ? null : ((jlp)jah.A.a(object3));
        ibuq.c(jlp0);
        Object object4 = ((List)object0).get(3);
        hax hax0 = jah.m;
        if(ibuq.m(object4, boolean0)) {
            jki0 = null;
        }
        else if(object4 != null) {
            jki0 = (jki)hax0.a(object4);
        }
        else {
            jki0 = null;
        }
        Object object5 = ((List)object0).get(4);
        hax hax1 = jas.a;
        if(ibuq.m(object5, boolean0)) {
            ixr0 = null;
        }
        else if(object5 != null) {
            ixr0 = (ixr)hax1.a(object5);
        }
        else {
            ixr0 = null;
        }
        Object object6 = ((List)object0).get(5);
        hax hax2 = jah.v;
        if(ibuq.m(object6, boolean0)) {
            jjw0 = null;
        }
        else if(object6 != null) {
            jjw0 = (jjw)hax2.a(object6);
        }
        else {
            jjw0 = null;
        }
        Object object7 = ((List)object0).get(6);
        hax hax3 = jas.c;
        if(ibuq.m(object7, boolean0)) {
            object8 = null;
        }
        else if(object7 != null) {
            object8 = (jjr)hax3.a(object7);
        }
        else {
            object8 = null;
        }
        ibuq.c(object8);
        Object object9 = ((List)object0).get(7);
        ibuq.m(object9, boolean0);
        jjn jjn0 = object9 == null ? null : ((jjn)jah.z.a(object9));
        ibuq.c(jjn0);
        Object object10 = ((List)object0).get(8);
        hax hax4 = jas.d;
        if(!ibuq.m(object10, boolean0) && object10 != null) {
            jkk0 = (jkk)hax4.a(object10);
        }
        return new ixo(jjy0.a, jka0.a, jlp0.b, jki0, ixr0, jjw0, object8.c, jjn0.a, jkk0);
    }
}

