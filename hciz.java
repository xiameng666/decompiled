final class hciz implements hfud {
    static final hfud a;

    static {
        hciz.a = new hciz();
    }

    @Override  // hfud
    public final boolean a(int v) {
        switch(v) {
            case 0: {
                return hcja.a != null;
            }
            case 1: {
                return hcja.b != null;
            }
            default: {
                return v == 2 ? hcja.c != null : false;
            }
        }
    }
}

