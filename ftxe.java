import androidx.compose.runtime.ParcelableSnapshotMutableState;

final class ftxe implements ibtw {
    final ftxi a;
    final hfc b;

    public ftxe(ftxi ftxi0, hfc hfc0) {
        this.a = ftxi0;
        this.b = hfc0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        eaa eaa0;
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        ftxi ftxi0 = this.a;
        long v = ftxi0.h ? fpu.a(((goz)object0)).F : hll.h;
        crk crk0 = ibog.c(v, hll.h) ? crl.a(1.0f, fpu.a(((goz)object0)).B) : null;
        if(ftxi0.o) {
            ((goz)object0).M(-498308373);
            eaa0 = fulh.a(ftxi0.n, ((goz)object0));
        }
        else {
            ((goz)object0).M(0xE24D55B8);
            switch(ftxi0.k.ordinal()) {
                case 0: {
                    ((goz)object0).M(-1401543534);
                    eaa0 = fpu.c(((goz)object0)).f;
                    ((goz)object0).A();
                    break;
                }
                case 1: {
                    ((goz)object0).M(-1401541458);
                    eaa0 = fpu.c(((goz)object0)).e;
                    ((goz)object0).A();
                    break;
                }
                default: {
                    ((goz)object0).M(-1401545604);
                    ((goz)object0).A();
                    throw new ibnq();
                }
            }
        }
        ((goz)object0).A();
        ftwu ftwu0 = new ftwu(eaa0, v, crk0);
        hfc hfc0 = hfc.e;
        fufv fufv0 = (fufv)((goz)object0).h(fugo.a);
        if(ftxi0.i) {
            fuca fuca0 = ftxi0.g;
            if((fuca0 instanceof fubs)) {
                ((goz)object0).M(0xA2BC62F5);
                ((goz)object0).A();
                ctp ctp0 = fxh.b(false, 0.0f, 0L, 7);
                hfc0 = dzu.c(hfc0, ((fubs)fuca0).a, null, ctp0, ((fubs)fuca0).b);
            }
            else {
                if((fuca0 instanceof fubw)) {
                    ((goz)object0).M(0xD82143D);
                    boolean z = ((fubw)fuca0).a;
                    its its0 = new its(3);
                    ((goz)object0).M(-1633490746);
                    int v1 = ((goz)object0).Z(fufv0) | ((goz)object0).Z(ftxi0);
                    Object object2 = ((goz)object0).k();
                    if(v1 != 0 || object2 == gop.a) {
                        object2 = new ftwx(fufv0, ftxi0);
                        ((goz)object0).R(object2);
                    }
                    ((goz)object0).A();
                    hfc0 = dzp.c(hfc0, z, its0, ((ibth)object2));
                }
                else if(ftxi0.j == null) {
                    ((goz)object0).M(226640909);
                }
                else {
                    ((goz)object0).M(0xD823384);
                    ((goz)object0).M(-1633490746);
                    int v2 = ((goz)object0).Z(fufv0) | ((goz)object0).Z(ftxi0);
                    Object object3 = ((goz)object0).k();
                    if(v2 != 0 || object3 == gop.a) {
                        object3 = new ftwy(fufv0, ftxi0);
                        ((goz)object0).R(object3);
                    }
                    ((goz)object0).A();
                    hfc0 = cru.d(hfc0, false, null, null, null, ((ibth)object3), 15);
                }
                ((goz)object0).A();
            }
        }
        else {
            ((goz)object0).M(0xD81E8CD);
            ((goz)object0).A();
        }
        ((goz)object0).M(0x6E3C21FE);
        Object object4 = ((goz)object0).k();
        if(object4 == gop.a) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(Boolean.valueOf(false), gul.a);
            ((goz)object0).R(parcelableSnapshotMutableState0);
            object4 = parcelableSnapshotMutableState0;
        }
        ((goz)object0).A();
        hfc hfc1 = iqn.a(hhi.a(this.b, ftwu0.a).a(hfc0), "FopRow");
        gze gze0 = gzf.e(0xF6D9B9F3, new ftxd(ftxi0, ((gra)object4)), ((goz)object0));
        gaq.c(hfc1, ftwu0.a, ftwu0.b, 0L, 0.0f, 0.0f, ftwu0.c, gze0, ((goz)object0), 56);
        return ibom.a;
    }
}

