public final class ddyg {
    public static final ibts a(gui gui0) {
        return (ibts)gui0.a();
    }

    public static final void b(ibts ibts0, goz goz0, int v) {
        ibuq.f(ibts0, "onNewIntent");
        goz goz1 = goz0.ao(0xD4A988B0);
        if((((v & 6) == 0 ? (goz1.Z(ibts0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            gui gui0 = guf.a(ibts0, goz1);
            Object object0 = goz1.h(ddyi.a);
            xnb xnb0 = (object0 instanceof xnb) ? ((xnb)object0) : null;
            ibom ibom0 = ibom.a;
            goz1.M(-1633490746);
            int v1 = goz1.Z(xnb0) | goz1.X(gui0);
            Object object1 = goz1.j();
            if(v1 != 0 || object1 == gop.a) {
                object1 = new ddyc(xnb0, gui0);
                goz1.P(object1);
            }
            goz1.x();
            gqe.c(ibom0, ((ibts)object1), goz1);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddyd(ibts0, v);
        }
    }
}

