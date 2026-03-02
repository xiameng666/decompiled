public final class fdde {
    public Integer a;
    public fdcn b;
    public gqub c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private byte h;

    public final fddf a() {
        if(this.h != 15) {
            StringBuilder stringBuilder0 = new StringBuilder();
            if((this.h & 1) == 0) {
                stringBuilder0.append(" description");
            }
            if((this.h & 2) == 0) {
                stringBuilder0.append(" termType");
            }
            if((this.h & 4) == 0) {
                stringBuilder0.append(" isExplicitConsent");
            }
            if((this.h & 8) == 0) {
                stringBuilder0.append(" canChangeOptIn");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
        }
        return new fddf(this.a, this.b, this.d, this.c, this.e, this.f, this.g);
    }

    public final void b(boolean z) {
        this.g = z;
        this.h = (byte)(this.h | 8);
    }

    public final void c(int v) {
        this.d = v;
        this.h = (byte)(this.h | 1);
    }

    public final void d(boolean z) {
        this.f = z;
        this.h = (byte)(this.h | 4);
    }

    public final void e(int v) {
        this.e = v;
        this.h = (byte)(this.h | 2);
    }
}

