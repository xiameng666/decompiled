public enum hdal implements hfub {
    DOCUMENT_TYPE_UNKNOWN(0),
    DOCUMENT_TYPE_PASSPORT(1),
    DOCUMENT_TYPE_MY_NUMBER_CARD(2);

    private final int e;

    private hdal(int v1) {
        this.e = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.e;
    }

    public static hdal b(int v) {
        switch(v) {
            case 0: {
                return hdal.a;
            }
            case 1: {
                return hdal.b;
            }
            case 2: {
                return hdal.c;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}

