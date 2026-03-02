public enum hldz implements hfub {
    UNKNOWN(0),
    PHONE(1),
    TABLET(2),
    WATCH(3),
    CHEST_STRAP(4),
    SCALE(5),
    HEAD_MOUNTED(6),
    SMART_DISPLAY(7);

    public final int i;

    private hldz(int v1) {
        this.i = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.i;
    }

    public static hldz b(int v) {
        switch(v) {
            case 0: {
                return hldz.a;
            }
            case 1: {
                return hldz.b;
            }
            case 2: {
                return hldz.c;
            }
            case 3: {
                return hldz.d;
            }
            case 4: {
                return hldz.e;
            }
            case 5: {
                return hldz.f;
            }
            case 6: {
                return hldz.g;
            }
            case 7: {
                return hldz.h;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.i);
    }
}

