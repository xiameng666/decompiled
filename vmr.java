public final class vmr {
    public static void a(vms vms0, long v, boolean z, boolean z1, int v1) {
        boolean z2;
        int v2 = 0;
        if((v1 & 2) == 0) {
            z2 = z;
        }
        else if((hln.a(v) > 0.5f)) {
            z2 = true;
        }
        else {
            z2 = false;
        }
        if((v1 & 4) == 0) {
            v2 = 1;
        }
        vms0.a(v, z2, ((boolean)(v2 ^ 1 | ((int)z1))), vmu.b);
    }

    public static void b(vms vms0, long v, boolean z) {
        vms0.b(v, z, vmu.b);
    }

    public static void c(vms vms0, long v, boolean z, boolean z1, int v1) {
        boolean z2;
        int v2 = 0;
        if((v1 & 2) == 0) {
            z2 = z;
        }
        else if((hln.a(v) > 0.5f)) {
            z2 = true;
        }
        else {
            z2 = false;
        }
        if((v1 & 4) == 0) {
            v2 = 1;
        }
        vms0.c(v, z2, ((boolean)(v2 ^ 1 | ((int)z1))), vmu.b);
    }
}

