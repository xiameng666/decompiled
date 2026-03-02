public final class bvco {
    public final void a(bvgp bvgp0, goz goz0, int v) {
        ibuq.f(bvgp0, "uiModel");
        goz goz1 = goz0.ao(0x750473DF);
        if((((v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(bvgp0) : goz1.Z(bvgp0)) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            gze gze0 = gzf.e(611050653, new bvcn(bvgp0), goz1);
            cmig.g(bvgp0.d, gze0, goz1, 0x30);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bvcm(this, bvgp0, v);
        }
    }
}

