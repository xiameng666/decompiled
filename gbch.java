public final class gbch extends gbcg {
    public gbch() {
        super(((MessageLite)hcll.a));
    }

    @Override  // gbcg
    public final MessageLite a(MessageLite hfvm0, int v) {
        switch(v) {
            case 2: {
                return ((hcll)hfvm0).c == 2 ? ((hclo)((hcll)hfvm0).d) : hclo.a;
            }
            case 3: {
                return ((hcll)hfvm0).c == 3 ? ((hclp)((hcll)hfvm0).d) : hclp.a;
            }
            case 5: {
                MessageLite hfvm1 = ((hcll)hfvm0).g;
                return hfvm1 == null ? hcpl.a : hfvm1;
            }
            default: {
                return super.a(((MessageLite)(((hcll)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final boolean b(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                return 1 == (((hcll)hfvm0).b & 1);
            }
            case 2: {
                return ((hcll)hfvm0).c == 2 ? true : false;
            }
            case 3: {
                return ((hcll)hfvm0).c == 3 ? true : false;
            }
            case 4: {
                return (((hcll)hfvm0).b & 2) == 0 ? false : true;
            }
            case 5: {
                return (((hcll)hfvm0).b & 4) == 0 ? false : true;
            }
            default: {
                return 1 == super.b(((MessageLite)(((hcll)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    protected final int[] c() {
        return new int[]{2, 5, 3};
    }

    @Override  // gbcg
    public final Object g(MessageLite hfvm0, int v) {
        if(v != 1) {
            return super.g(((MessageLite)(((hcll)hfvm0))), v);
        }
        Object object0 = hclk.b(((hcll)hfvm0).e);
        return object0 == null ? hclk.a : object0;
    }

    @Override  // gbcg
    public final int[] i() {
        return new int[]{1, 4};
    }

    @Override  // gbcg
    public final boolean k(MessageLite hfvm0) {
        return ((hcll)hfvm0).f;
    }
}

