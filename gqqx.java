public enum gqqx implements hfub {
    ACCOUNT_DISPLAY_UNSPECIFIED(0),
    HIDE(1),
    SHOW_ONLY(2),
    SHOW_AND_ALLOW_SWITCHING(3);

    public final int e;

    private gqqx(int v1) {
        this.e = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.e;
    }

    public static gqqx b(int v) {
        switch(v) {
            case 0: {
                return gqqx.a;
            }
            case 1: {
                return gqqx.b;
            }
            case 2: {
                return gqqx.c;
            }
            case 3: {
                return gqqx.d;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}

