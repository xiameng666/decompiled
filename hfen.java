final class hfen implements hfud {
    static final hfud a;

    static {
        hfen.a = new hfen();
    }

    @Override  // hfud
    public final boolean a(int v) {
        switch(v) {
            case 0: {
                return hfeo.a != null;
            }
            case 1: {
                return hfeo.b != null;
            }
            case 2: {
                return hfeo.c != null;
            }
            case 3: {
                return hfeo.d != null;
            }
            default: {
                return false;
            }
        }
    }
}

