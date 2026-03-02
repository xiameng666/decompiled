public enum dcjd implements hfub {
    UNKNOWN(0),
    IMAGE(1),
    VIDEO(2),
    ANDROID_APP(3),
    AUDIO(4),
    DOCUMENT(5),
    CONTACT_CARD(6);

    public final int h;

    private dcjd(int v1) {
        this.h = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.h;
    }

    public static dcjd b(int v) {
        switch(v) {
            case 0: {
                return dcjd.a;
            }
            case 1: {
                return dcjd.b;
            }
            case 2: {
                return dcjd.c;
            }
            case 3: {
                return dcjd.d;
            }
            case 4: {
                return dcjd.e;
            }
            case 5: {
                return dcjd.f;
            }
            case 6: {
                return dcjd.g;
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

