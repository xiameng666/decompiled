import java.util.List;

public final class izs implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.d(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        Boolean boolean0 = Boolean.valueOf(false);
        Object object1 = ((List)object0).get(0);
        String s = null;
        iwp iwp0 = object1 == null ? null : ((iwp)object1);
        ibuq.c(iwp0);
        Object object2 = ((List)object0).get(2);
        Integer integer0 = object2 == null ? null : ((Integer)object2);
        ibuq.c(integer0);
        int v = integer0.intValue();
        Object object3 = ((List)object0).get(3);
        Integer integer1 = object3 == null ? null : ((Integer)object3);
        ibuq.c(integer1);
        int v1 = integer1.intValue();
        Object object4 = ((List)object0).get(4);
        String s1 = object4 == null ? null : ((String)object4);
        ibuq.c(s1);
        switch(iwp0.ordinal()) {
            case 0: {
                Object object5 = ((List)object0).get(1);
                hax hax0 = jah.h;
                if(!ibuq.m(object5, boolean0) && object5 != null) {
                    s = (ixo)hax0.a(object5);
                }
                ibuq.c(s);
                return new iwh(s, v, v1, s1);
            }
            case 1: {
                Object object6 = ((List)object0).get(1);
                hax hax1 = jah.i;
                if(!ibuq.m(object6, boolean0) && object6 != null) {
                    s = (jat)hax1.a(object6);
                }
                ibuq.c(s);
                return new iwh(s, v, v1, s1);
            }
            case 2: {
                Object object7 = ((List)object0).get(1);
                hax hax2 = jah.d;
                if(!ibuq.m(object7, boolean0) && object7 != null) {
                    s = (jbp)hax2.a(object7);
                }
                ibuq.c(s);
                return new iwh(s, v, v1, s1);
            }
            case 3: {
                Object object8 = ((List)object0).get(1);
                hax hax3 = jah.e;
                if(!ibuq.m(object8, boolean0) && object8 != null) {
                    s = (jbq)hax3.a(object8);
                }
                ibuq.c(s);
                return new iwh(s, v, v1, s1);
            }
            case 4: {
                Object object9 = ((List)object0).get(1);
                hax hax4 = jah.f;
                if(!ibuq.m(object9, boolean0) && object9 != null) {
                    s = (iwz)hax4.a(object9);
                }
                ibuq.c(s);
                return new iwh(s, v, v1, s1);
            }
            case 5: {
                Object object10 = ((List)object0).get(1);
                hax hax5 = jah.g;
                if(!ibuq.m(object10, boolean0) && object10 != null) {
                    s = (iwy)hax5.a(object10);
                }
                ibuq.c(s);
                return new iwh(s, v, v1, s1);
            }
            case 6: {
                Object object11 = ((List)object0).get(1);
                if(object11 != null) {
                    s = (String)object11;
                }
                ibuq.c(s);
                return new iwh(new jaw(s), v, v1, s1);
            }
            default: {
                throw new ibnq();
            }
        }
    }
}

