final class gbco extends gbcg {
    public gbco() {
        super(((MessageLite)hdqp.a));
    }

    @Override  // gbcg
    public final boolean b(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                return (((hdqp)hfvm0).b & 1);
            }
            case 2: {
                return (((hdqp)hfvm0).b & 2) == 0 ? false : true;
            }
            case 3: {
                return (((hdqp)hfvm0).b & 4) == 0 ? false : true;
            }
            case 4: {
                return (((hdqp)hfvm0).b & 8) == 0 ? false : true;
            }
            case 5: {
                return (((hdqp)hfvm0).b & 16) == 0 ? false : true;
            }
            case 6: {
                return (((hdqp)hfvm0).b & 0x20) == 0 ? false : true;
            }
            case 7: {
                return (((hdqp)hfvm0).b & 0x40) == 0 ? false : true;
            }
            default: {
                return super.b(((MessageLite)(((hdqp)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final float d(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                return ((hdqp)hfvm0).c;
            }
            case 2: {
                return ((hdqp)hfvm0).d;
            }
            case 3: {
                return ((hdqp)hfvm0).e;
            }
            default: {
                return super.d(((MessageLite)(((hdqp)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final int e(MessageLite hfvm0, int v) {
        switch(v) {
            case 6: {
                return ((hdqp)hfvm0).h;
            }
            case 7: {
                return ((hdqp)hfvm0).i;
            }
            default: {
                return super.e(((MessageLite)(((hdqp)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final Object g(MessageLite hfvm0, int v) {
        switch(v) {
            case 4: {
                Object object0 = hdqb.b(((hdqp)hfvm0).f);
                return object0 == null ? hdqb.a : object0;
            }
            case 5: {
                Object object1 = hdqj.b(((hdqp)hfvm0).g);
                return object1 == null ? hdqj.a : object1;
            }
            default: {
                return super.g(((MessageLite)(((hdqp)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final int[] i() {
        return new int[]{1, 2, 3, 4, 5, 6, 7};
    }
}

