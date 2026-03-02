import android.os.Bundle;

final class bvev implements ibtx {
    final int a;
    final bvgr b;
    final bvgq c;
    final cmdi d;

    public bvev(int v, bvgr bvgr0, bvgq bvgq0, cmdi cmdi0) {
        this.a = v;
        this.b = bvgr0;
        this.c = bvgq0;
        this.d = cmdi0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        eag eag0;
        Bundle bundle0 = (Bundle)object0;
        ((Number)object2).intValue();
        hey hey0 = hfc.e;
        ((goz)object1).M(5004770);
        int v = this.a;
        boolean z = ((goz)object1).V(v);
        Object object3 = ((goz)object1).k();
        if(z || object3 == gop.a) {
            object3 = new bvet(v);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        hfc hfc0 = iuc.d(hey0, ((ibts)object3));
        bvgr bvgr0 = this.b;
        int v1 = this.c.c.size();
        if(v1 == 1) {
            eag0 = bvex.d;
        }
        else if(v == 0) {
            eag0 = bvex.a;
        }
        else {
            eag0 = v == v1 - 1 ? bvex.c : bvex.b;
        }
        ((goz)object1).M(-1633490746);
        int v2 = ((goz)object1).Z(bvgr0);
        cmdi cmdi0 = this.d;
        int v3 = v2 | ((goz)object1).Z(cmdi0);
        Object object4 = ((goz)object1).k();
        if(v3 != 0 || object4 == gop.a) {
            object4 = new bveu(bvgr0, cmdi0);
            ((goz)object1).R(object4);
        }
        ((goz)object1).A();
        bvew.b(hfc0, bvgr0.a, eag0, ((ibth)object4), bvgr0.c, ((goz)object1), 0);
        return ibom.a;
    }
}

