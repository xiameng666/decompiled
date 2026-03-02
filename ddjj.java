public final class ddjj {
    public static final void a(ibts ibts0, goz goz0, int v) {
        ibuq.f(ibts0, "onDuration");
        goz goz1 = goz0.ao(0x90683A3B);
        if((((v & 6) == 0 ? (goz1.Z(ibts0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            gui gui0 = guf.a(ibts0, goz1);
            ibom ibom0 = ibom.a;
            goz1.M(5004770);
            boolean z = goz1.X(gui0);
            Object object0 = goz1.j();
            if(z || object0 == gop.a) {
                object0 = new ddjg(gui0);
                goz1.P(object0);
            }
            goz1.x();
            gqe.c(ibom0, ((ibts)object0), goz1);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddjh(ibts0, v);
        }
    }
}

