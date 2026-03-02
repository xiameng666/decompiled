final class jnk extends ibur implements ibtw {
    public static final jnk a;

    static {
        jnk.a = new jnk();
    }

    public jnk() {
        super(2);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        int v = 1;
        jmw jmw0 = jnl.a(((ify)object0));
        switch(((jlm)object1).ordinal()) {
            case 0: {
                v = 0;
                break;
            }
            case 1: {
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        jmw0.setLayoutDirection(v);
        return ibom.a;
    }
}

