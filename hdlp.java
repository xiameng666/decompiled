public enum hdlp implements hfub {
    INPUT_NODE_MATERIAL_TYPE_UNKNOWN(0),
    INPUT_NODE_MATERIAL_TYPE_FILLED(1),
    INPUT_NODE_MATERIAL_TYPE_OUTLINE(2),
    INPUT_NODE_MATERIAL_TYPE_BORDERLESS(3),
    INPUT_NODE_MATERIAL_TYPE_SEARCH_STYLE(4);

    public final int f;

    private hdlp(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static hdlp b(int v) {
        switch(v) {
            case 0: {
                return hdlp.a;
            }
            case 1: {
                return hdlp.b;
            }
            case 2: {
                return hdlp.c;
            }
            case 3: {
                return hdlp.d;
            }
            case 4: {
                return hdlp.e;
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

