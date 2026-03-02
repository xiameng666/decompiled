public enum bxnm implements hfub {
    INVOCATION_TYPE_UNSPECIFIED(0),
    INVOCATION_TYPE_GIS_BEGIN_SIGNIN(1),
    INVOCATION_TYPE_GIS_CREDMAN_PROVIDER(2),
    INVOCATION_TYPE_GIS_FIDO_CLIENT(3),
    INVOCATION_TYPE_REDIRECTED_FIDO_PRIVILEGED_API_CLIENT(4),
    INVOCATION_TYPE_REDIRECTED_FIDO_API_CLIENT(5),
    INVOCATION_TYPE_FIDO_SECURITY_KEY_FLOW(6),
    INVOCATION_TYPE_FIDO_HYBRID_FLOW(7),
    INVOCATION_TYPE_FIDO_TEST_PURPOSE(8),
    INVOCATION_TYPE_MODULE_CREDMAN_PROVIDER(9),
    INVOCATION_TYPE_CONDITIONAL_CREATE_CHROME_SYNC_KEY(10),
    INVOCATION_TYPE_AUTHMOSIS_PASSKEY(11),
    INVOCATION_TYPE_SPA_NETWORK(12),
    INVOCATION_TYPE_PIX_KEY_CREATION_AND_SIGN(13);

    public final int o;

    private bxnm(int v1) {
        this.o = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.o;
    }

    public static bxnm b(int v) {
        switch(v) {
            case 0: {
                return bxnm.a;
            }
            case 1: {
                return bxnm.b;
            }
            case 2: {
                return bxnm.c;
            }
            case 3: {
                return bxnm.d;
            }
            case 4: {
                return bxnm.e;
            }
            case 5: {
                return bxnm.f;
            }
            case 6: {
                return bxnm.g;
            }
            case 7: {
                return bxnm.h;
            }
            case 8: {
                return bxnm.i;
            }
            case 9: {
                return bxnm.j;
            }
            case 10: {
                return bxnm.k;
            }
            case 11: {
                return bxnm.l;
            }
            case 12: {
                return bxnm.m;
            }
            case 13: {
                return bxnm.n;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.o);
    }
}

