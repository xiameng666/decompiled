public final class bwuw {
    public static final bwuw a;
    private Object b;
    private int c;
    private long d;

    static {
        bwuw.a = new bwuw(null, 0, 0L);
    }

    public bwuw(Object object0, int v, long v1) {
        this.b = object0;
        this.c = v;
        this.d = v1;
    }

    public final int a() {
        synchronized(this) {
        }
        return this.c;
    }

    public final long b() {
        synchronized(this) {
        }
        return this.d;
    }

    public static bwuw c(int v, Object object0, long v1) {
        boolean z = true;
        if(v != 0 && v != 1) {
            if(v == 2) {
                v = 2;
            }
            else {
                z = false;
            }
        }
        batl.b(z);
        return new bwuw(object0, v, v1);
    }

    public final bwuw d(Object object0) {
        return new bwuw(object0, this.a(), this.d);
    }

    public final Object e() {
        synchronized(this) {
        }
        return this.b;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bwuw) && ((bwuw)object0).c == this.c && bata.b(this.b, ((bwuw)object0).b);
    }

    // String Decryptor: 1 succeeded, 0 failed
    public static String f(int v) {
        switch(v) {
            case 0: {
                return "unset";
            }
            case 1: {
                return "set from runtime API";
            }
            case 2: {
                return "set from resources";
            }
            default: {
                return a.f(v, "unknown (", ")");
            }
        }
    }

    public final String g() {
        return bwuw.f(this.a());
    }

    public final void h(Object object0, int v, long v1) {
        synchronized(this) {
            batl.l(this.k(v));
            this.c = v;
            this.b = object0;
            this.d = v1;
        }
    }

    @Override
    public final int hashCode() {
        return this.b == null ? 0x7AFF + this.c : (this.b.hashCode() + 851) * 37 + this.c;
    }

    public final void i(long v) {
        synchronized(this) {
            this.d = v;
        }
    }

    public final boolean j(bwuw bwuw0) {
        return this.k(bwuw0.a());
    }

    public final boolean k(int v) {
        synchronized(this) {
            int v2 = this.c;
            if(v2 != 0 && v2 != 1) {
                if(v2 == 2) {
                    return v != 1;
                }
                batl.c(false, "Invalid source value " + v);
                return false;
            }
        }
        return true;
    }
}

