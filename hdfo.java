public enum hdfo implements hfub {
    APP_REDIRECT_ERROR_TYPE_UNKNOWN(0),
    APP_REDIRECT_ERROR_TYPE_APP_NOT_INSTALLED(1),
    APP_REDIRECT_ERROR_TYPE_VERSION_TOO_OLD(2),
    APP_REDIRECT_ERROR_TYPE_APP_FINGERPRINT_MISMATCH(3),
    APP_REDIRECT_ERROR_TYPE_RESULT_APP_NOT_TRANSLUCENT_ACTIVITY(4),
    APP_REDIRECT_ERROR_TYPE_APP_RETURNED_ERROR(5),
    APP_REDIRECT_ERROR_TYPE_ACTIVITY_RESOLUTION_FAILED(6);

    public final int h;

    private hdfo(int v1) {
        this.h = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.h;
    }

    public static hdfo b(int v) {
        switch(v) {
            case 0: {
                return hdfo.a;
            }
            case 1: {
                return hdfo.b;
            }
            case 2: {
                return hdfo.c;
            }
            case 3: {
                return hdfo.d;
            }
            case 4: {
                return hdfo.e;
            }
            case 5: {
                return hdfo.f;
            }
            case 6: {
                return hdfo.g;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}

