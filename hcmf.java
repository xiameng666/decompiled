public enum hcmf implements hfub {
    BUTTON_NODE_MATERIAL_TYPE_UNKNOWN(0),
    BUTTON_NODE_MATERIAL_TYPE_PRIMARY(1),
    BUTTON_NODE_MATERIAL_TYPE_REGULAR(2),
    BUTTON_NODE_MATERIAL_TYPE_CONTENT_ONLY(3),
    BUTTON_NODE_MATERIAL_TYPE_EXTENDED_FAB(4),
    BUTTON_NODE_MATERIAL_TYPE_RAINBOW(5),
    BUTTON_NODE_MATERIAL_TYPE_PRIMARY_NO_ELEVATION(6);

    public final int h;

    private hcmf(int v1) {
        this.h = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.h;
    }

    public static hcmf b(int v) {
        switch(v) {
            case 0: {
                return hcmf.a;
            }
            case 1: {
                return hcmf.b;
            }
            case 2: {
                return hcmf.c;
            }
            case 3: {
                return hcmf.d;
            }
            case 4: {
                return hcmf.e;
            }
            case 5: {
                return hcmf.f;
            }
            case 6: {
                return hcmf.g;
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

