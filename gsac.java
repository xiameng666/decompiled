public enum gsac implements hfub {
    THEME_CHOICE_UNSPECIFIED(0),
    LIGHT_THEME(1),
    DARK_THEME(2);

    public final int d;

    private gsac(int v1) {
        this.d = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.d;
    }

    public static gsac b(int v) {
        switch(v) {
            case 0: {
                return gsac.a;
            }
            case 1: {
                return gsac.b;
            }
            case 2: {
                return gsac.c;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}

