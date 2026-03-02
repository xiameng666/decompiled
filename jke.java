public final class jke {
    static final jke a;

    static {
        jke.a = new jke();
    }

    public static final jkg a(long v) {
        return v != 16L ? new jjm(v) : jkf.a;
    }

    public static final jkg b(hlf hlf0, float f) {
        if(hlf0 == null) {
            return jkf.a;
        }
        if((hlf0 instanceof hmy)) {
            long v = ((hmy)hlf0).a;
            if(!Float.isNaN(f) && f < 1.0f) {
                v = hll.h(v, hll.a(v) * f);
            }
            return jke.a(v);
        }
        if((hlf0 instanceof hms)) {
            return new jjl(((hms)hlf0), f);
        }
        throw new ibnq();
    }
}

