public final class cbny {
    static final cbny a;
    private static cbob b;

    static {
        cbny.a = new cbny();
    }

    public final cbob a() {
        cbob cbob1;
        cbob cbob0 = cbny.b;
        if(cbob0 == null) {
            synchronized(this) {
                cbob1 = cbny.b;
                if(cbob1 == null) {
                    cbob1 = new cbnz();
                    cbny.b = cbob1;
                }
            }
            return cbob1;
        }
        return cbob0;
    }
}

