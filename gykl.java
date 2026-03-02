final class gykl {
    gyhw a;
    private final String b;
    private final Runnable c;

    public gykl(String s, Runnable runnable0) {
        this.a = gyhw.g;
        this.b = s;
        this.c = runnable0;
    }

    final void a() {
        this.j(gyhw.b, new gyhw[]{gyhw.h});
    }

    final void b() {
        this.j(gyhw.c, new gyhw[]{gyhw.g, gyhw.h, gyhw.b});
    }

    final void c() {
        gyhw gyhw0 = gyhw.e;
        if(this.a != gyhw0 && this.a != gyhw.d) {
            this.j(gyhw0, new gyhw[]{gyhw.g, gyhw.h, gyhw.b, gyhw.f, gyhw.c});
            return;
        }
        ((ggtj)((ggtj)gyke.a.j()).ar(0x4F59)).R("%s cannot fail, in status: %s", this.b, this.a);
    }

    final void d() {
        this.j(gyhw.d, new gyhw[]{gyhw.c, gyhw.b});
    }

    final void e() {
        this.j(gyhw.h, new gyhw[]{gyhw.g});
    }

    final boolean f() {
        return this.a == gyhw.g || this.a == gyhw.h || this.a == gyhw.b;
    }

    final boolean g() {
        return this.a == gyhw.g || this.a == gyhw.b || this.a == gyhw.c;
    }

    final boolean h() {
        return this.a == gyhw.g;
    }

    final boolean i() {
        return this.a == gyhw.g;
    }

    private final void j(gyhw gyhw0, gyhw[] arr_gyhw) {
        gyhw gyhw1 = this.a;
        for(int v = 0; v < arr_gyhw.length; ++v) {
            if(arr_gyhw[v] == gyhw1) {
                this.a = gyhw0;
                this.c.run();
                return;
            }
        }
        ((ggtj)((ggtj)((ggtj)gyke.a.i()).s(new IllegalStateException())).ar(0x4F5C)).R("Invalid state transition from %s to %s", this.a, gyhw0);
    }

    @Override
    public final String toString() {
        switch(this.a.ordinal()) {
            case 1: {
                return "OPERATION_STATUS_ACTIVE";
            }
            case 2: {
                return "OPERATION_STATUS_CANCELLED";
            }
            case 3: {
                return "OPERATION_STATUS_FINISHED";
            }
            case 4: {
                return "OPERATION_STATUS_FAILED";
            }
            case 5: {
                return "OPERATION_STATUS_MISSING";
            }
            case 6: {
                return "OPERATION_STATUS_PENDING";
            }
            case 7: {
                return "OPERATION_STATUS_STARTING";
            }
            case 8: {
                return "OPERATION_STATUS_UPDATE_FAILED";
            }
            default: {
                return "OPERATION_STATUS_UNKNOWN";
            }
        }
    }
}

