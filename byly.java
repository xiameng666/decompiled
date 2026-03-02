public final class byly {
    public static final void a(vms vms0, goz goz0, int v) {
        vms vms1;
        ibuq.f(vms0, "sysUiController");
        goz goz1 = goz0.ao(1680726694);
        if((((v & 6) == 0 ? (goz1.X(vms0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
            vms1 = vms0;
        }
        else {
            goz1.M(0xFBCB17E);
            long v1 = hll.h(fpu.a(goz1).C, 0.32f);
            goz1.x();
            vmr.b(vms0, v1, false);
            vms1 = vms0;
            vmr.a(vms1, feq.b(fpu.a(goz1), 1.0f), false, false, 12);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bylw(vms1, v);
        }
    }

    public static final void b(vms vms0, goz goz0, int v) {
        vms vms1;
        ibuq.f(vms0, "sysUiController");
        goz goz1 = goz0.ao(-1008456056);
        if((((v & 6) == 0 ? (goz1.X(vms0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
            vms1 = vms0;
        }
        else {
            vms1 = vms0;
            vmr.c(vms1, hll.h, false, false, 12);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bylx(vms1, v);
        }
    }
}

