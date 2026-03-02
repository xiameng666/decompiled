public enum dcjg implements hfub {
    UNKNOWN_VERSION(0),
    V1(1);

    public final int c;

    private dcjg(int v1) {
        this.c = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.c;
    }

    public static dcjg b(int v) {
        switch(v) {
            case 0: {
                return dcjg.a;
            }
            case 1: {
                return dcjg.b;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.c);
    }
}

