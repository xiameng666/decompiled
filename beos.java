public final class beos {
    public static lqd a(lqd lqd0) {
        return lsa.b(lqd0, new beog());
    }

    public static lqd b(lqd lqd0, beor beor0) {
        return lsa.c(lqd0, new beoh(beor0));
    }

    public static bedv c(bedv bedv0) {
        return new bedv(bedv0.a, null, bedv0.c);
    }

    public static Integer d(bedu bedu0) {
        switch(bedu0.ordinal()) {
            case 0: {
                return (int)0;
            }
            case 1: {
                return (int)1;
            }
            case 2: {
                return (int)2;
            }
            default: {
                throw new RuntimeException(null, null);
            }
        }
    }

    public static Object e(lqd lqd0) {
        Object object0 = lqd0.ij();
        gftb.check(object0);
        return object0;
    }
}

