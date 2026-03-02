public final class caaj {
    public caao a;
    public String b;
    public String c;
    private String d;
    private int e;
    private int f;
    private boolean g;
    private boolean h;
    private byte i;

    public final caak a() {
        if(this.i == 15) {
            String s = this.d;
            if(s != null) {
                caao caao0 = this.a;
                if(caao0 != null) {
                    return new caak(s, this.e, this.f, caao0, this.g, this.b, this.c, this.h);
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.d == null) {
            stringBuilder0.append(" packageName");
        }
        if((this.i & 1) == 0) {
            stringBuilder0.append(" versionCode");
        }
        if((this.i & 2) == 0) {
            stringBuilder0.append(" derivedId");
        }
        if(this.a == null) {
            stringBuilder0.append(" eventLog");
        }
        if((this.i & 4) == 0) {
            stringBuilder0.append(" populateRoutes");
        }
        if((this.i & 8) == 0) {
            stringBuilder0.append(" addSyntheticRoutes");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(boolean z) {
        this.h = z;
        this.i = (byte)(this.i | 8);
    }

    public final void c(int v) {
        this.f = v;
        this.i = (byte)(this.i | 2);
    }

    public final void d(String s) {
        if(s == null) {
            throw new NullPointerException("Null packageName");
        }
        this.d = s;
    }

    public final void e(boolean z) {
        this.g = z;
        this.i = (byte)(this.i | 4);
    }

    public final void f(int v) {
        this.e = v;
        this.i = (byte)(this.i | 1);
    }
}

