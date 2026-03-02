public enum gqse implements hfub {
    TITLE_TYPE_UNSPECIFIED(0),
    NORMAL(1),
    GOOGLE_LOGO(2),
    MY_GOOGLE(3);

    public final int e;

    private gqse(int v1) {
        this.e = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.e;
    }

    public static gqse b(int v) {
        switch(v) {
            case 0: {
                return gqse.a;
            }
            case 1: {
                return gqse.b;
            }
            case 2: {
                return gqse.c;
            }
            case 3: {
                return gqse.d;
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

