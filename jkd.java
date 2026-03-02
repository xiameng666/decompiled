public final class jkd {
    public static jkg a(jkg jkg0, jkg jkg1) {
        if((jkg1 instanceof jjl) && (jkg0 instanceof jjl)) {
            hms hms0 = ((jjl)jkg1).a;
            float f = ((jjl)jkg1).b;
            jkb jkb0 = new jkb(jkg0);
            if(Float.isNaN(f)) {
                f = ((Number)jkb0.a()).floatValue();
            }
            return new jjl(hms0, f);
        }
        if((jkg1 instanceof jjl) && !(jkg0 instanceof jjl)) {
            return jkg1;
        }
        return (jkg1 instanceof jjl) || !(jkg0 instanceof jjl) ? jkg1.e(new jkc(jkg0)) : jkg0;
    }

    public static jkg b(jkg jkg0, ibth ibth0) {
        return ibuq.m(jkg0, jkf.a) ? ((jkg)ibth0.a()) : jkg0;
    }
}

