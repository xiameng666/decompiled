public enum hevl implements hfub {
    UNKNOWN_TIME_FENCE_TRIGGER_TYPE(0),
    ABSOLUTE_INTERVAL(1),
    DAILY_INTERVAL(2),
    WEEKEND_INTERVAL(3),
    WEEKDAY_INTERVAL(4),
    SUNDAY_INTERVAL(5),
    MONDAY_INTERVAL(6),
    TUESDAY_INTERVAL(7),
    WEDNESDAY_INTERVAL(8),
    THURSDAY_INTERVAL(9),
    FRIDAY_INTERVAL(10),
    SATURDAY_INTERVAL(11),
    AFTER_LOCAL_TIME(12);

    public final int n;

    private hevl(int v1) {
        this.n = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.n;
    }

    public static hevl b(int v) {
        switch(v) {
            case 0: {
                return hevl.a;
            }
            case 1: {
                return hevl.b;
            }
            case 2: {
                return hevl.c;
            }
            case 3: {
                return hevl.d;
            }
            case 4: {
                return hevl.e;
            }
            case 5: {
                return hevl.f;
            }
            case 6: {
                return hevl.g;
            }
            case 7: {
                return hevl.h;
            }
            case 8: {
                return hevl.i;
            }
            case 9: {
                return hevl.j;
            }
            case 10: {
                return hevl.k;
            }
            case 11: {
                return hevl.l;
            }
            case 12: {
                return hevl.m;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.n);
    }
}

