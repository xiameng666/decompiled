final class gbcs extends gbcg {
    public gbcs() {
        super(((MessageLite)hdqx.a));
    }

    @Override  // gbcg
    public final boolean b(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                return 1 == (((hdqx)hfvm0).b & 1);
            }
            case 2: {
                return (((hdqx)hfvm0).b & 2) == 0 ? false : true;
            }
            case 5: {
                return (((hdqx)hfvm0).b & 4) == 0 ? false : true;
            }
            case 6: {
                return (((hdqx)hfvm0).b & 8) == 0 ? false : true;
            }
            default: {
                return 1 == super.b(((MessageLite)(((hdqx)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final int e(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                return ((hdqx)hfvm0).c;
            }
            case 2: {
                return ((hdqx)hfvm0).d;
            }
            default: {
                return super.e(((MessageLite)(((hdqx)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final Object g(MessageLite hfvm0, int v) {
        switch(v) {
            case 5: {
                Object object0 = hdqw.b(((hdqx)hfvm0).e);
                return object0 == null ? hdqw.a : object0;
            }
            case 6: {
                Object object1 = hdqz.b(((hdqx)hfvm0).f);
                return object1 == null ? hdqz.a : object1;
            }
            default: {
                return super.g(((MessageLite)(((hdqx)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final int[] i() {
        return new int[]{1, 2, 5, 6};
    }
}

