public enum cpzv implements hfub {
    UNKNOWN(0),
    PROFILE_FORCE_SYNC(1),
    PROFILE_UPDATE_PERSON_ME(2),
    PROFILE_UPDATE_PHOTO_ME(3),
    @Deprecated
    GIS_SYNC(4);

    public final int f;

    private cpzv(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static cpzv b(int v) {
        switch(v) {
            case 0: {
                return cpzv.a;
            }
            case 1: {
                return cpzv.b;
            }
            case 2: {
                return cpzv.c;
            }
            case 3: {
                return cpzv.d;
            }
            case 4: {
                return cpzv.e;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

