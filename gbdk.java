final class gbdk extends gbcg {
    public gbdk() {
        super(((MessageLite)hdsk.a));
    }

    @Override  // gbcg
    public final boolean b(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                return 1 == (((hdsk)hfvm0).b & 1);
            }
            case 2: {
                return (((hdsk)hfvm0).b & 2) == 0 ? false : true;
            }
            case 3: {
                return (((hdsk)hfvm0).b & 4) == 0 ? false : true;
            }
            case 4: {
                return (((hdsk)hfvm0).b & 8) == 0 ? false : true;
            }
            default: {
                return 1 == super.b(((MessageLite)(((hdsk)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final MessageLite f(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                MessageLite hfvm1 = ((hdsk)hfvm0).c;
                return hfvm1 == null ? hdsn.a : hfvm1;
            }
            case 2: {
                MessageLite hfvm2 = ((hdsk)hfvm0).d;
                return hfvm2 == null ? hdsn.a : hfvm2;
            }
            case 3: {
                MessageLite hfvm3 = ((hdsk)hfvm0).e;
                return hfvm3 == null ? hdsn.a : hfvm3;
            }
            case 4: {
                MessageLite hfvm4 = ((hdsk)hfvm0).f;
                return hfvm4 == null ? hdsn.a : hfvm4;
            }
            default: {
                return super.f(((MessageLite)(((hdsk)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final int[] i() {
        return new int[]{2, 1, 3, 4};
    }
}

