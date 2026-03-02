public final class gbcz extends gbcg {
    public gbcz() {
        super(((MessageLite)hcvp.a));
    }

    @Override  // gbcg
    public final MessageLite a(MessageLite hfvm0, int v) {
        if(v != 1) {
            return super.a(((MessageLite)(((hcvp)hfvm0))), v);
        }
        MessageLite hfvm1 = ((hcvp)hfvm0).c;
        return hfvm1 == null ? hcuj.a : hfvm1;
    }

    @Override  // gbcg
    public final boolean b(MessageLite hfvm0, int v) {
        return v == 1 ? (((hcvp)hfvm0).b & 1) : super.b(((MessageLite)(((hcvp)hfvm0))), v);
    }

    @Override  // gbcg
    protected final int[] c() {
        return new int[]{1};
    }
}

