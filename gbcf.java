public final class gbcf extends gbcg {
    public gbcf() {
        super(((MessageLite)hdju.a));
    }

    @Override  // gbcg
    public final MessageLite a(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                return ((hdju)hfvm0).b == 1 ? ((hdjx)((hdju)hfvm0).c) : hdjx.a;
            }
            case 2: {
                return ((hdju)hfvm0).b == 2 ? ((hdjv)((hdju)hfvm0).c) : hdjv.a;
            }
            default: {
                return super.a(((MessageLite)(((hdju)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final boolean b(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                return ((hdju)hfvm0).b == 1;
            }
            case 2: {
                return ((hdju)hfvm0).b == 2;
            }
            default: {
                return super.b(((MessageLite)(((hdju)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    protected final int[] c() {
        return new int[]{1, 2};
    }
}

