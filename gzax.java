public enum gzax implements hfub {
    UNKNOWN_VISIBILITY(0),
    CONTACTS_ONLY(1),
    EVERYONE(2),
    @Deprecated
    SELECTED_CONTACTS_ONLY(3),
    HIDDEN(4),
    SELF_SHARE(5);

    public final int g;

    private gzax(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.g;
    }

    public static gzax b(int v) {
        switch(v) {
            case 0: {
                return gzax.a;
            }
            case 1: {
                return gzax.b;
            }
            case 2: {
                return gzax.c;
            }
            case 3: {
                return gzax.d;
            }
            case 4: {
                return gzax.e;
            }
            case 5: {
                return gzax.f;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}

