import java.util.Set;

final class ctkk implements ibtx {
    final Set a;
    final ibts b;
    final gra c;

    public ctkk(Set set0, ibts ibts0, gra gra0) {
        this.a = set0;
        this.b = ibts0;
        this.c = gra0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dim)object0), "$this$DropdownMenu");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dim)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        ctkj ctkj0 = new ctkj();
        for(Object object3: ibpo.ao(this.a, ctkj0)) {
            ctho ctho0 = (ctho)object3;
            gze gze0 = gzf.e(0x74A4CDAD, new ctki(ctho0, ((dim)object0)), ((goz)object1));
            ((goz)object1).M(0x97EA02AA);
            ibts ibts0 = this.b;
            int v1 = ((goz)object1).X(ibts0) | ((goz)object1).Z(ctho0);
            gra gra0 = this.c;
            Object object4 = ((goz)object1).k();
            if(v1 != 0 || object4 == gop.a) {
                object4 = new ctkh(ibts0, ctho0, gra0);
                ((goz)object1).R(object4);
            }
            ((goz)object1).A();
            ezn.b(gze0, ((ibth)object4), null, null, null, false, null, null, null, ((goz)object1), 6, 508);
        }
        return ibom.a;
    }
}

