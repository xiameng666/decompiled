public enum hdsz implements hfub {
    TEXT_ALIGNMENT_UNKNOWN(0),
    TEXT_ALIGNMENT_START(1),
    TEXT_ALIGNMENT_END(2),
    TEXT_ALIGNMENT_CENTER(3),
    TEXT_ALIGNMENT_JUSTIFY(4);

    public final int f;

    private hdsz(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static hdsz b(int v) {
        switch(v) {
            case 0: {
                return hdsz.a;
            }
            case 1: {
                return hdsz.b;
            }
            case 2: {
                return hdsz.c;
            }
            case 3: {
                return hdsz.d;
            }
            case 4: {
                return hdsz.e;
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

