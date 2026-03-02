import java.util.List;

public final class bgdh implements ibty {
    final List a;
    final bgds b;
    final ibtw c;

    public bgdh(List list0, bgds bgds0, ibtw ibtw0) {
        this.a = list0;
        this.b = bgds0;
        this.c = ibtw0;
        super();
    }

    @Override  // ibty
    public final Object a(Object object0, Object object1, Object object2, Object object3) {
        bgay bgay0;
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        int v2 = 1;
        int v3 = (v1 & 6) == 0 ? (((goz)object2).X(((dnj)object0)) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v3 |= (((goz)object2).V(v) ? 0x20 : 16);
        }
        if(((goz)object2).ad((v3 & 0x93) != 0x92, v3 & 1)) {
            bgfa bgfa0 = (bgfa)this.a.get(v);
            ((goz)object2).M(0x4AF1B103);
            hfc hfc0 = dni.a();
            if(hsam.d() && bgfa0.f.c) {
                bgay0 = new bgay(bgat.e);
            }
            else {
                bgfe bgfe0 = bgfa0.a;
                if((bgfe0 instanceof bgfb)) {
                    bgay0 = new bgba(((bgfb)bgfe0).a);
                    goto label_22;
                }
                if((bgfe0 instanceof bgfc)) {
                    bgay0 = new bgaz();
                    goto label_22;
                }
                if(!(bgfe0 instanceof bgfd)) {
                    throw new ibnq();
                }
                bgay0 = new bgaz();
            }
        label_22:
            String s = bgfa0.b;
            ((goz)object2).M(1271186040);
            String s1 = ((int)bgfa0.c) <= 1 ? null : isq.d(0x7F152695, new Object[]{bgfa0.c}, ((goz)object2));  // string:pwm_credentials_list_number_of_accounts "%1$d accounts"
            ((goz)object2).A();
            boolean z = false;
            boolean z1 = bgfa0.d;
            if(v == ibpo.d(this.b.d)) {
                z = true;
            }
            ((goz)object2).M(0x97EA02AA);
            ibtw ibtw0 = this.c;
            int v4 = ((goz)object2).X(ibtw0);
            if(((v3 & 0x70 ^ 0x30) <= 0x20 || !((goz)object2).V(v)) && (v3 & 0x30) != 0x20) {
                v2 = 0;
            }
            int v5 = v4 | v2 | ((goz)object2).Z(bgfa0);
            Object object4 = ((goz)object2).k();
            if(v5 != 0 || object4 == gop.a) {
                object4 = new bgde(ibtw0, v, bgfa0);
                ((goz)object2).R(object4);
            }
            ((goz)object2).A();
            bgdq.b(hfc0, bgay0, s, s1, z1, 0L, false, z, ((ibth)object4), "Credential#" + v, ((goz)object2), 0, 0x60);
            ((goz)object2).A();
            return ibom.a;
        }
        ((goz)object2).G();
        return ibom.a;
    }
}

