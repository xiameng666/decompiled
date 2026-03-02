public enum hdsh implements hfub {
    TYPE_UNKNOWN(0),
    TYPE_UNIT_BASED(1),
    TYPE_MATCH_PARENT(2),
    TYPE_WRAP_CONTENT(3),
    TYPE_CONTEXTUAL_AUTO(4);

    public final int f;

    private hdsh(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static hdsh b(int v) {
        switch(v) {
            case 0: {
                return hdsh.a;
            }
            case 1: {
                return hdsh.b;
            }
            case 2: {
                return hdsh.c;
            }
            case 3: {
                return hdsh.d;
            }
            case 4: {
                return hdsh.e;
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

