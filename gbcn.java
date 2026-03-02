final class gbcn extends gbcg {
    public gbcn() {
        super(((MessageLite)hdqk.a));
    }

    @Override  // gbcg
    public final boolean b(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                return 1 == (((hdqk)hfvm0).b & 1);
            }
            case 2: {
                return (((hdqk)hfvm0).b & 2) == 0 ? false : true;
            }
            case 3: {
                return (((hdqk)hfvm0).b & 4) == 0 ? false : true;
            }
            case 4: {
                return (((hdqk)hfvm0).b & 8) == 0 ? false : true;
            }
            default: {
                if(v != 5) {
                    return 1 == super.b(((MessageLite)(((hdqk)hfvm0))), v);
                }
                return (((hdqk)hfvm0).b & 16) == 0 ? false : true;
            }
        }
    }

    @Override  // gbcg
    public final MessageLite f(MessageLite hfvm0, int v) {
        if(v != 4) {
            return super.f(((MessageLite)(((hdqk)hfvm0))), v);
        }
        MessageLite hfvm1 = ((hdqk)hfvm0).f;
        return hfvm1 == null ? hdsn.a : hfvm1;
    }

    @Override  // gbcg
    public final Object g(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                Object object0 = hdqm.b(((hdqk)hfvm0).c);
                return object0 == null ? hdqm.a : object0;
            }
            case 2: {
                Object object1 = hdqj.b(((hdqk)hfvm0).d);
                return object1 == null ? hdqj.a : object1;
            }
            case 3: {
                Object object2 = hdqo.b(((hdqk)hfvm0).e);
                return object2 == null ? hdqo.a : object2;
            }
            case 5: {
                Object object3 = hdqr.b(((hdqk)hfvm0).g);
                return object3 == null ? hdqr.a : object3;
            }
            default: {
                return super.g(((MessageLite)(((hdqk)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final int[] i() {
        return new int[]{1, 2, 3, 4, 5};
    }
}

