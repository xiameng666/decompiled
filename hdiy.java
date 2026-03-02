public enum hdiy implements hfub {
    TYPE_UNKNOWN(0),
    TYPE_PROGRESS_INDICATOR(1),
    TYPE_MEDIA_URL(2),
    TYPE_LOTTIE(3),
    TYPE_EMBEDDED(4);

    public final int f;

    private hdiy(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static hdiy b(int v) {
        switch(v) {
            case 0: {
                return hdiy.a;
            }
            case 1: {
                return hdiy.b;
            }
            case 2: {
                return hdiy.c;
            }
            case 3: {
                return hdiy.d;
            }
            case 4: {
                return hdiy.e;
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

