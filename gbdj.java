final class gbdj extends gbcg {
    public gbdj() {
        super(((MessageLite)hdsj.a));
    }

    @Override  // gbcg
    public final boolean b(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                return 1 == (((hdsj)hfvm0).b & 1);
            }
            case 2: {
                return (((hdsj)hfvm0).b & 2) == 0 ? false : true;
            }
            case 3: {
                return (((hdsj)hfvm0).b & 4) == 0 ? false : true;
            }
            case 4: {
                return (((hdsj)hfvm0).b & 8) == 0 ? false : true;
            }
            default: {
                return 1 == super.b(((MessageLite)(((hdsj)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final MessageLite f(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                MessageLite hfvm1 = ((hdsj)hfvm0).c;
                return hfvm1 == null ? hdsn.a : hfvm1;
            }
            case 2: {
                MessageLite hfvm2 = ((hdsj)hfvm0).d;
                return hfvm2 == null ? hdsn.a : hfvm2;
            }
            case 3: {
                MessageLite hfvm3 = ((hdsj)hfvm0).e;
                return hfvm3 == null ? hdsn.a : hfvm3;
            }
            case 4: {
                MessageLite hfvm4 = ((hdsj)hfvm0).f;
                return hfvm4 == null ? hdsn.a : hfvm4;
            }
            default: {
                return super.f(((MessageLite)(((hdsj)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final int[] i() {
        return new int[]{1, 2, 3, 4};
    }
}

