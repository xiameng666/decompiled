public final class foyy implements fort {
    public final int a;
    public final boolean b;
    public final gfsx c;
    private final int d;

    public foyy() {
        throw null;
    }

    public foyy(int v, int v1, boolean z, gfsx gfsx0) {
        this.d = v;
        this.a = v1;
        this.b = z;
        this.c = gfsx0;
    }

    @Override  // fort
    public final int a() {
        return 0x7FFFFFFF;
    }

    @Override  // fort
    public final boolean b() {
        return this.d == 3;
    }

    @Override  // fort
    public final void c() {
    }

    public static final foyx d() {
        foyx foyx0 = new foyx(null);
        foyx0.b(false);
        foyx0.a = 50;
        foyx0.c = (byte)(foyx0.c | 1);
        foyx0.b = gfqx.a;
        foyx0.d = 1;
        return foyx0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof foyy)) {
            int v = this.d;
            int v1 = ((foyy)object0).d;
            if(v != 0) {
                return v == v1 && this.a == ((foyy)object0).a && this.b == ((foyy)object0).b && this.c.equals(((foyy)object0).c);
            }
            throw null;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        foru.b(this.d);
        return this.b ? ((this.a ^ (this.d ^ 1000003) * 1000003) * 0xD5009D89 ^ 0x4CF) * 1000003 ^ 2040732332 : ((this.a ^ (this.d ^ 1000003) * 1000003) * 0xD5009D89 ^ 0x4D5) * 1000003 ^ 2040732332;
    }

    @Override
    public final String toString() {
        return "NetworkConfigurations{enablement=" + foru.a(this.d) + ", batchSize=" + this.a + ", urlSanitizer=null, enableUrlAutoSanitization=" + this.b + ", metricExtensionProvider=" + this.c + "}";
    }
}

