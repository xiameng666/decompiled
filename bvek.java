public final class bvek {
    public final eoqf a;

    public bvek(eoqf eoqf0, cmdi cmdi0) {
        ibuq.f(eoqf0, "owner");
        ibuq.f(cmdi0, "activityLauncher");
        super();
        this.a = eoqf0;
    }

    public final void a(bvgw bvgw0, goz goz0, int v) {
        ibuq.f(bvgw0, "uiModel");
        goz goz1 = goz0.ao(0xF4204578);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(bvgw0) : goz1.Z(bvgw0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(this) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            gze gze0 = gzf.e(-2080960902, new bvej(bvgw0, this), goz1);
            cmig.g(bvgw0.d, gze0, goz1, 0x30);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bvei(this, bvgw0, v);
        }
    }
}

