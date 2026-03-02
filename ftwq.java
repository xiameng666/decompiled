public final class ftwq {
    public static final void a(hfc hfc0, ftwn ftwn0, goz goz0, int v, int v1) {
        hfc hfc3;
        float f;
        goz goz2;
        hfc hfc1;
        int v2;
        ibuq.f(ftwn0, "state");
        goz goz1 = goz0.ao(0x1AF81FBC);
        if(v1 != 0) {
            v2 = v | 6;
            hfc1 = hfc0;
        }
        else if((v & 6) == 0) {
            hfc1 = hfc0;
            v2 = (goz1.X(hfc1) ? 4 : 2) | v;
        }
        else {
            hfc1 = hfc0;
            v2 = v;
        }
        if((v & 0x30) == 0) {
            v2 |= (goz1.Z(ftwn0) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            if(v1 != 0) {
                hfc1 = hfc.e;
            }
            ftwo ftwo0 = ftwn0.b;
            switch(ftwo0.ordinal()) {
                case 1: {
                    f = 16.0f;
                    break;
                }
                case 2: {
                    f = 32.0f;
                    break;
                }
                default: {
                    f = 0.0f;
                }
            }
            float f1 = ftwo0.ordinal() == 1 ? 16.0f : 0.0f;
            fryv fryv0 = ftwn0.a;
            if(fryv0 == null) {
                goz2 = goz1;
                hfc3 = hfc1;
            }
            else {
                hfc hfc2 = dla.j(hfc1, 0.0f, f, 0.0f, f1, 5);
                hfc3 = hfc1;
                jbn jbn0 = fpu.d(goz1).l;
                goz2 = goz1;
                ftzd.a(fryv0, hfc2, fpu.a(goz1).q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, goz2, 0, 0, 0x1FFF8);
            }
            hfc1 = hfc3;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new ftwp(hfc1, ftwn0, v, v1);
        }
    }
}

