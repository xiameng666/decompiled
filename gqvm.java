public enum gqvm implements hfub {
    API_SURFACE_UNSPECIFIED(0),
    GOOGLE_AUTH_UTIL(1),
    ACCOUNT_MANAGER(2),
    GOOGLE_SIGN_IN(3),
    @Deprecated
    GIS_SIGN_IN(4),
    GIS_ONE_TAP(5),
    GIS_GOOGLE_SIGN_IN(6),
    GIS_AUTHORIZATION(7),
    GIS_SAVE_ACCOUNT_LINKING_TOKEN(8),
    GOOGLE_AUTH_CLIENT(9),
    GIS_VERIFIED_WITH_GOOGLE(10);

    public final int l;

    private gqvm(int v1) {
        this.l = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.l;
    }

    public static gqvm b(int v) {
        switch(v) {
            case 0: {
                return gqvm.a;
            }
            case 1: {
                return gqvm.b;
            }
            case 2: {
                return gqvm.c;
            }
            case 3: {
                return gqvm.d;
            }
            case 4: {
                return gqvm.e;
            }
            case 5: {
                return gqvm.f;
            }
            case 6: {
                return gqvm.g;
            }
            case 7: {
                return gqvm.h;
            }
            case 8: {
                return gqvm.i;
            }
            case 9: {
                return gqvm.j;
            }
            case 10: {
                return gqvm.k;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.l);
    }
}

