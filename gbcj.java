public final class gbcj extends gbcg {
    public gbcj() {
        super(((MessageLite)hcuu.a));
    }

    @Override  // gbcg
    public final MessageLite a(MessageLite hfvm0, int v) {
        if(v != 1) {
            return super.a(((MessageLite)(((hcuu)hfvm0))), v);
        }
        MessageLite hfvm1 = ((hcuu)hfvm0).c;
        return hfvm1 == null ? hcuj.a : hfvm1;
    }

    @Override  // gbcg
    public final boolean b(MessageLite hfvm0, int v) {
        return v == 1 ? (((hcuu)hfvm0).b & 1) : super.b(((MessageLite)(((hcuu)hfvm0))), v);
    }

    @Override  // gbcg
    protected final int[] c() {
        return new int[]{1};
    }
}

