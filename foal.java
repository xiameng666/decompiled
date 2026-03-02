public final class foal {
    public gfsx a;
    public gfsx b;
    public foau c;
    public boolean d;
    public foam e;
    public byte f;
    private gfsx g;
    private gfsx h;
    private gfsx i;
    private gfsx j;

    public foal() {
        throw null;
    }

    public foal(foan foan0) {
        this.g = gfqx.a;
        this.h = gfqx.a;
        this.i = gfqx.a;
        this.a = gfqx.a;
        this.b = gfqx.a;
        this.j = gfqx.a;
        this.g = foan0.a;
        this.h = foan0.b;
        this.i = foan0.c;
        this.a = foan0.d;
        this.b = foan0.e;
        this.j = foan0.f;
        this.c = foan0.g;
        this.d = foan0.h;
        this.e = foan0.i;
        this.f = 1;
    }

    public foal(byte[] arr_b) {
        this.g = gfqx.a;
        this.h = gfqx.a;
        this.i = gfqx.a;
        this.a = gfqx.a;
        this.b = gfqx.a;
        this.j = gfqx.a;
    }

    public final foan a() {
        Boolean boolean0 = Boolean.valueOf(false);
        gfqx.a.f(boolean0);
        boolean0.getClass();
        if(this.f == 1) {
            foau foau0 = this.c;
            if(foau0 != null) {
                foam foam0 = this.e;
                if(foam0 != null) {
                    return new foan(this.g, this.h, this.i, this.a, this.b, this.j, foau0, this.d, foam0);
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.c == null) {
            stringBuilder0.append(" secondaryButtonStyleFeature");
        }
        if(this.f == 0) {
            stringBuilder0.append(" supportAccountSwitching");
        }
        if(this.e == null) {
            stringBuilder0.append(" customContinueButtonTextsFactory");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(foai foai0) {
        this.i = gfsx.m(foai0);
    }
}

