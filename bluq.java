public final class bluq implements kba {
    public final bluv a;

    public bluq(bluv bluv0) {
        this.a = bluv0;
    }

    @Override  // kba
    public final Object a() {
        bluv bluv0 = this.a;
        if(bluv0.d.i() && bluv0.ag.i()) {
            try {
                return glzd.g(((blpi)bluv0.d.d()).g(((byte[])bluv0.ag.d())), new blum(bluv0), gmap.a);
            }
            catch(bxma bxma0) {
                return gmbu.h(bxma0);
            }
        }
        bluv0.c = new bluw(0, null, bluv0.ah);
        return blul.d();
    }
}

