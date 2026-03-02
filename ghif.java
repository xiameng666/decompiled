public final class ghif {
    public final String a;
    public String b;
    public String c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;

    public ghif(String s) {
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = false;
        this.a = s;
    }

    public final int a(int v, int v1) {
        while(v < v1 && ghih.a.c(this.a.charAt(v))) {
            ++v;
        }
        return v;
    }

    public final ghht b() {
        boolean z = true;
        gftb.checkTrue(this.d < this.e);
        int v = this.f;
        if(v != -1) {
            int v1 = this.g;
            if(v1 != -1) {
                if(v > v1) {
                    z = false;
                }
                gftb.checkTrue(z);
                int v2 = this.f;
                int v3 = this.g;
                boolean z1 = this.h;
                return new ghht(TimeRange.h(Integer.valueOf(this.d), Integer.valueOf(this.e)), gfsx.m(TimeRange.h(Integer.valueOf(v2), Integer.valueOf(v3))), z1);
            }
        }
        return new ghht(TimeRange.h(Integer.valueOf(this.d), Integer.valueOf(this.e)), gfqx.a, false);
    }

    public final String c() {
        if(this.b == null) {
            int v = this.d;
            if(v != -1) {
                int v1 = this.e;
                if(v1 != -1) {
                    this.b = this.a.substring(v, v1);
                }
            }
        }
        String s = this.b;
        gftb.check(s);
        return s;
    }
}

