public enum hcpi implements hfub {
    DEVICE_ORIENTATION_UNKNOWN(0),
    DEVICE_ORIENTATION_SYSTEM(1),
    DEVICE_ORIENTATION_PORTRAIT(2),
    DEVICE_ORIENTATION_LANDSCAPE(3),
    DEVICE_ORIENTATION_BEHIND(4);

    public final int f;

    private hcpi(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static hcpi b(int v) {
        switch(v) {
            case 0: {
                return hcpi.a;
            }
            case 1: {
                return hcpi.b;
            }
            case 2: {
                return hcpi.c;
            }
            case 3: {
                return hcpi.d;
            }
            case 4: {
                return hcpi.e;
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

