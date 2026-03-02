public final class bluo implements kba {
    public final bluv a;

    public bluo(bluv bluv0) {
        this.a = bluv0;
    }

    @Override  // kba
    public final Object a() {
        bluv bluv0 = this.a;
        if(bluv0.d.i() && (!((blpi)bluv0.d.d()).d().i() || !((blpi)bluv0.d.d()).q()) && !((blpi)bluv0.d.d()).k()) {
            try {
                ((blpi)bluv0.d.d()).j();
                return blul.c(bluu.d);
            }
            catch(bxma bxma0) {
                return gmbu.h(bxma0);
            }
        }
        return blul.c(bluu.d);
    }
}

