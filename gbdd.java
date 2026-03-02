final class gbdd extends gbcg {
    public gbdd() {
        super(((MessageLite)hdri.a));
    }

    @Override  // gbcg
    public final boolean b(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                return (((hdri)hfvm0).b & 2) == 0 ? false : true;
            }
            case 2: {
                return (((hdri)hfvm0).b & 8) == 0 ? false : true;
            }
            case 4: {
                return 1 == (((hdri)hfvm0).b & 1);
            }
            case 5: {
                return (((hdri)hfvm0).b & 4) == 0 ? false : true;
            }
            default: {
                return 1 == super.b(((MessageLite)(((hdri)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final MessageLite f(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                MessageLite hfvm1 = ((hdri)hfvm0).d;
                return hfvm1 == null ? hdsn.a : hfvm1;
            }
            case 2: {
                MessageLite hfvm2 = ((hdri)hfvm0).f;
                return hfvm2 == null ? hdsn.a : hfvm2;
            }
            default: {
                return super.f(((MessageLite)(((hdri)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final Object g(MessageLite hfvm0, int v) {
        switch(v) {
            case 4: {
                Object object0 = hdrh.b(((hdri)hfvm0).c);
                return object0 == null ? hdrh.a : object0;
            }
            case 5: {
                Object object1 = hdrh.b(((hdri)hfvm0).e);
                return object1 == null ? hdrh.a : object1;
            }
            default: {
                return super.f(((MessageLite)(((hdri)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final int[] i() {
        return new int[]{1, 2, 4, 5};
    }
}

