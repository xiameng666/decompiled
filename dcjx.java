public enum dcjx implements hfub {
    UNKNOWN_FRAME_TYPE(0),
    INTRODUCTION(1),
    RESPONSE(2),
    PAIRED_KEY_ENCRYPTION(3),
    PAIRED_KEY_RESULT(4),
    CERTIFICATE_INFO(5),
    CANCEL(6),
    PROGRESS_UPDATE(7);

    public final int i;

    private dcjx(int v1) {
        this.i = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.i;
    }

    public static dcjx b(int v) {
        switch(v) {
            case 0: {
                return dcjx.a;
            }
            case 1: {
                return dcjx.b;
            }
            case 2: {
                return dcjx.c;
            }
            case 3: {
                return dcjx.d;
            }
            case 4: {
                return dcjx.e;
            }
            case 5: {
                return dcjx.f;
            }
            case 6: {
                return dcjx.g;
            }
            case 7: {
                return dcjx.h;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.i);
    }
}

