public final class zxu {
    public static final void a(gged_interceptors gged0, hfc hfc0, goz goz0, int v) {
        ibuq.f(gged0, "contentUnits");
        goz goz1 = goz0.ao(0x348FE897);
        int v1 = (v & 6) == 0 ? (goz1.Z(gged0) ? 4 : 2) | v : v;
        if(((v1 | 0x30) & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hey hey0 = hfc.e;
            ggqk ggqk0 = gged0.E();
            ibuq.e(ggqk0, "iterator(...)");
            while(ggqk0.hasNext()) {
                znu znu0 = (znu)ggqk0.next();
                if((znu0 instanceof znt)) {
                    goz1.M(0x5038371C);
                    zxg.a(((znt)znu0), hey0, goz1, (v1 | 0x30) & 0x70);
                    goz1.x();
                }
                else if((znu0 instanceof znr)) {
                    goz1.M(0x50383EDD);
                    zvz.a(((znr)znu0), hey0, goz1, (v1 | 0x30) & 0x70 | 8);
                    goz1.x();
                }
                else if((znu0 instanceof znz)) {
                    goz1.M(1345865900);
                    hfc hfc1 = dla.j(hey0, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                    zzr.a(((znz)znu0).b, ((znz)znu0).a, ((znz)znu0).c, ((znz)znu0).d, hfc1, 0L, goz1, 0, 0x20);
                    goz1.x();
                    hey0 = hey0;
                }
                else {
                    if((znu0 instanceof zod)) {
                        goz1.M(0x50386D7A);
                        hey0 = hey0;
                        aaau.a(((zod)znu0), dla.j(hey0, 0.0f, 8.0f, 0.0f, 0.0f, 13), goz1, 0, 0);
                    }
                    else {
                        hey0 = hey0;
                        if((znu0 instanceof znx)) {
                            goz1.M(0x503878F2);
                            zzi.a(((znx)znu0), dla.j(hey0, 0.0f, 12.0f, 0.0f, 0.0f, 13), goz1, 0);
                        }
                        else if((znu0 instanceof zof)) {
                            goz1.M(0x503882BB);
                        }
                        else {
                            goz1.M(0xB6D7FAEB);
                        }
                    }
                    goz1.x();
                }
            }
            hfc0 = hey0;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new zxt(gged0, hfc0, v);
        }
    }
}

