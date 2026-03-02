import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class ehxo {
    public static final long a;
    private static final long b;
    private static final long c;
    private static final long d;

    static {
        ehxo.a = ibzy.h(1250, ibzz.c);
        ehxo.b = ibzy.h(7000, ibzz.c);
        ehxo.c = ibzy.h(1000, ibzz.c);
        ehxo.d = ibzy.h(1000, ibzz.c);
    }

    public static final ibzw a(cld cld0) {
        eiaw eiaw0 = eiaw.d;
        eiaw eiaw1 = eiaw.a;
        if(!clc.a(cld0, eiaw0, eiaw1)) {
            eiaw eiaw2 = eiaw.c;
            if(!clc.a(cld0, eiaw2, eiaw1)) {
                eiaw eiaw3 = eiaw.b;
                if(!clc.a(cld0, eiaw3, eiaw1)) {
                    eiaw eiaw4 = ((ehzi)cld0).a;
                    if(eiaw4 != eiaw3 && ((ehzi)cld0).b == eiaw3 || eiaw4 == eiaw3 && ((ehzi)cld0).b != eiaw3) {
                        return new ibzw(ehxo.c);
                    }
                    if(!clc.a(cld0, eiaw1, eiaw3) && !clc.a(cld0, eiaw1, eiaw2)) {
                        return clc.a(cld0, eiaw0, eiaw2) || clc.a(cld0, eiaw2, eiaw2) ? new ibzw(ehxo.a) : null;
                    }
                    return new ibzw(ehxo.d);
                }
            }
        }
        return new ibzw(ehxo.b);
    }

    public static final void b(gra gra0, boolean z) {
        gra0.b(Boolean.valueOf(z));
    }

    public static final clj c(gui gui0, String s, goz goz0, int v) {
        ibuq.f(gui0, "state");
        goz0.M(21000893);
        goz0.M(0x6E3C21FE);
        Object object0 = goz0.j();
        Object object1 = gop.a;
        if(object0 == object1) {
            object0 = new cjh(gui0.a());
            goz0.P(object0);
        }
        goz0.x();
        goz0.M(0x6E3C21FE);
        Object object2 = goz0.j();
        if(object2 == object1) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(Boolean.valueOf(true), gul.a);
            goz0.P(parcelableSnapshotMutableState0);
            object2 = parcelableSnapshotMutableState0;
        }
        goz0.x();
        goz0.M(0xB2EEE5B2);
        if(((Boolean)((gra)object2).a()).booleanValue()) {
            goz0.M(5004770);
            Object object3 = goz0.j();
            if(object3 == object1) {
                object3 = new ehxm(((gra)object2));
                goz0.P(object3);
            }
            goz0.x();
            ehxo.d(((cjh)object0), gui0, ((ibth)object3), goz0, v << 3 & 0x70 | 0x180);
        }
        else if(ehxo.a(ehzj.a(((ehwv)((cjh)object0).b()), ((ehwv)gui0.a()))) == null) {
            ((cjh)object0).d(gui0.a());
        }
        else {
            ehxo.b(((gra)object2), true);
        }
        goz0.x();
        clj clj0 = clz.f(((cjh)object0), s, goz0, 0x30);
        goz0.x();
        return clj0;
    }

    public static final void d(cjh cjh0, gui gui0, ibth ibth0, goz goz0, int v) {
        goz goz1 = goz0.ao(116070964);
        int v1 = 1;
        int v2 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(cjh0) : goz1.Z(cjh0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v2 |= (goz1.X(gui0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v2 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            ibom ibom0 = ibom.a;
            goz1.M(0x97EA02AA);
            int v3 = (v2 & 14) == 4 || (v2 & 8) != 0 && goz1.Z(cjh0) ? 1 : 0;
            if((v2 & 0x380) != 0x100) {
                v1 = 0;
            }
            Object object0 = goz1.j();
            if((v3 | ((v2 & 0x70) == 0x20 ? 1 : 0) | v1) != 0 || object0 == gop.a) {
                object0 = new ehxn(cjh0, gui0, ibth0, null);
                goz1.P(object0);
            }
            goz1.x();
            gqe.f(ibom0, ((ibtw)object0), goz1);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ehxl(cjh0, gui0, ibth0, v);
        }
    }
}

