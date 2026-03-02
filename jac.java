import java.util.List;

public final class jac implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        jjz jjz0;
        jii jii0;
        jkh jkh0;
        jjk jjk0;
        jen jen0;
        jem jem0;
        jeu jeu0;
        ibuq.d(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        Object object1 = ((List)object0).get(0);
        jag jag0 = jah.w;
        Boolean boolean0 = Boolean.valueOf(false);
        ibuq.m(object1, boolean0);
        hll hll0 = object1 == null ? null : ((hll)jag0.a(object1));
        ibuq.c(hll0);
        Object object2 = ((List)object0).get(1);
        jag jag1 = jah.A;
        ibuq.m(object2, boolean0);
        jlp jlp0 = object2 == null ? null : ((jlp)jag1.a(object2));
        ibuq.c(jlp0);
        Object object3 = ((List)object0).get(2);
        hax hax0 = jah.n;
        if(ibuq.m(object3, boolean0)) {
            jeu0 = null;
        }
        else if(object3 != null) {
            jeu0 = (jeu)hax0.a(object3);
        }
        else {
            jeu0 = null;
        }
        Object object4 = ((List)object0).get(3);
        hax hax1 = jah.r;
        if(ibuq.m(object4, boolean0)) {
            jem0 = null;
        }
        else if(object4 != null) {
            jem0 = (jem)hax1.a(object4);
        }
        else {
            jem0 = null;
        }
        Object object5 = ((List)object0).get(4);
        hax hax2 = jah.s;
        if(ibuq.m(object5, boolean0)) {
            jen0 = null;
        }
        else if(object5 != null) {
            jen0 = (jen)hax2.a(object5);
        }
        else {
            jen0 = null;
        }
        Object object6 = ((List)object0).get(6);
        String s = object6 == null ? null : ((String)object6);
        Object object7 = ((List)object0).get(7);
        ibuq.m(object7, boolean0);
        jlp jlp1 = object7 == null ? null : ((jlp)jag1.a(object7));
        ibuq.c(jlp1);
        Object object8 = ((List)object0).get(8);
        hax hax3 = jah.o;
        if(ibuq.m(object8, boolean0)) {
            jjk0 = null;
        }
        else if(object8 != null) {
            jjk0 = (jjk)hax3.a(object8);
        }
        else {
            jjk0 = null;
        }
        Object object9 = ((List)object0).get(9);
        hax hax4 = jah.l;
        if(ibuq.m(object9, boolean0)) {
            jkh0 = null;
        }
        else if(object9 != null) {
            jkh0 = (jkh)hax4.a(object9);
        }
        else {
            jkh0 = null;
        }
        Object object10 = ((List)object0).get(10);
        hax hax5 = jah.t;
        if(ibuq.m(object10, boolean0)) {
            jii0 = null;
        }
        else if(object10 != null) {
            jii0 = (jii)hax5.a(object10);
        }
        else {
            jii0 = null;
        }
        Object object11 = ((List)object0).get(11);
        ibuq.m(object11, boolean0);
        hll hll1 = object11 == null ? null : ((hll)jag0.a(object11));
        ibuq.c(hll1);
        Object object12 = ((List)object0).get(12);
        hax hax6 = jah.k;
        if(ibuq.m(object12, boolean0)) {
            jjz0 = null;
        }
        else if(object12 != null) {
            jjz0 = (jjz)hax6.a(object12);
        }
        else {
            jjz0 = null;
        }
        Object object13 = ((List)object0).get(13);
        hax hax7 = jah.q;
        if(!ibuq.m(object13, boolean0) && object13 != null) {
            hmt hmt0 = (hmt)hax7.a(object13);
            return new jat(hll0.j, jlp0.b, jeu0, jem0, jen0, null, s, jlp1.b, jjk0, jkh0, jii0, hll1.j, jjz0, hmt0, 0xC020);
        }
        return new jat(hll0.j, jlp0.b, jeu0, jem0, jen0, null, s, jlp1.b, jjk0, jkh0, jii0, hll1.j, jjz0, null, 0xC020);
    }
}

