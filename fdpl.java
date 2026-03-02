public final class fdpl implements Comparable {
    static final byk a;
    public final String b;
    public final String c;
    public final String d;

    static {
        fdpl.a = new byk(100);
    }

    private fdpl(String s, String s1) {
        if(gfta.c(s)) {
            throw new IllegalArgumentException("packageName is null or empty");
        }
        if(gfta.c(s1)) {
            throw new IllegalArgumentException("signatureDigest is null or empty");
        }
        if(ffgp.k() && (s.equals("com.google.android.wearable.app.cn") || s.equals("com.google.android.wearable.app"))) {
            this.c = "com.google.android.wearable.app.cn";
            this.b = "com.google.android.wearable.app";
        }
        else {
            this.c = s;
            this.b = s;
        }
        this.d = s1;
    }

    public static fdpl a(String s, String s1) {
        fdpl fdpl1;
        fdpl fdpl0 = new fdpl(s, s1);
        byk byk0 = fdpl.a;
        synchronized(byk0) {
            fdpl1 = (fdpl)byk0.d(fdpl0);
            if(fdpl1 == null) {
                byk0.e(fdpl0, fdpl0);
                return fdpl0;
            }
        }
        return fdpl1;
    }

    public static fdpl b(String s, byte[] arr_b) {
        return fdpl.a(s, bboy.c(arr_b));
    }

    public final byte[] c() {
        return bboy.d(this.d);
    }

    @Override
    public final int compareTo(Object object0) {
        if(((fdpl)object0) == this) {
            return 0;
        }
        int v = this.b.compareTo(((fdpl)object0).b);
        return v == 0 ? this.d.compareTo(((fdpl)object0).d) : v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof fdpl) ? this.b.equals(((fdpl)object0).b) && this.d.equals(((fdpl)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return (this.b.hashCode() + 629) * 37 + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return String.format("AppKey[%s,%s]", ffmr.a(this.b), this.d);
    }
}

