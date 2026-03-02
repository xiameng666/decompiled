public final class gbcy extends gbcg {
    public gbcy() {
        super(((MessageLite)hcpl.a));
    }

    @Override  // gbcg
    public final boolean b(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                return 1 == (((hcpl)hfvm0).b & 1);
            }
            case 2: {
                return (((hcpl)hfvm0).b & 2) == 0 ? false : true;
            }
            case 3: {
                return (((hcpl)hfvm0).b & 4) == 0 ? false : true;
            }
            case 4: {
                return (((hcpl)hfvm0).b & 8) == 0 ? false : true;
            }
            default: {
                return 1 == super.b(((MessageLite)(((hcpl)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final int e(MessageLite hfvm0, int v) {
        return v == 3 ? ((hcpl)hfvm0).e : super.e(((MessageLite)(((hcpl)hfvm0))), v);
    }

    @Override  // gbcg
    public final Object g(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                Object object0 = hcpi.b(((hcpl)hfvm0).c);
                return object0 == null ? hcpi.a : object0;
            }
            case 2: {
                Object object1 = hcpk.b(((hcpl)hfvm0).d);
                return object1 == null ? hcpk.a : object1;
            }
            default: {
                return super.g(((MessageLite)(((hcpl)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final int[] i() {
        return new int[]{1, 2, 3, 4};
    }

    @Override  // gbcg
    public final boolean k(MessageLite hfvm0) {
        return ((hcpl)hfvm0).f;
    }
}

