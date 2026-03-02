public final class cbgs {
    public static final cbgs a;
    public static final bboh b;
    public final int c;
    public final int d;
    private final String e;

    static {
        cbgs.a = new cbgs("", -1, -1);
        cbgs.b = bboh.b("SupervisionAppInfo", bbcu.ac);
    }

    public cbgs(String s, int v, int v1) {
        ibuq.f(s, "apkPackageName");
        super();
        this.e = s;
        this.c = v;
        this.d = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof cbgs)) {
            return false;
        }
        if(!ibuq.m(this.e, ((cbgs)object0).e)) {
            return false;
        }
        return this.c == ((cbgs)object0).c ? this.d == ((cbgs)object0).d : false;
    }

    @Override
    public final int hashCode() {
        return (this.e.hashCode() * 0x1F + this.c) * 0x1F + this.d;
    }

    @Override
    public final String toString() {
        return "SupervisionAppInfo(apkPackageName=" + this.e + ", apkVersion=" + this.c + ", moduleVersion=" + this.d + ")";
    }
}

