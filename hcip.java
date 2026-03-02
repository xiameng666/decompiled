final class hcip implements hfud {
    static final hfud a;

    static {
        hcip.a = new hcip();
    }

    @Override  // hfud
    public final boolean a(int v) {
        switch(v) {
            case 0: {
                return hciq.a != null;
            }
            case 1: {
                return hciq.b != null;
            }
            case 2: {
                return hciq.c != null;
            }
            case 3: {
                return hciq.d != null;
            }
            case 4: {
                return hciq.e != null;
            }
            default: {
                return false;
            }
        }
    }
}

