final class gbck extends gbcg {
    public gbck() {
        super(((MessageLite)hdhm.a));
    }

    @Override  // gbcg
    public final boolean b(MessageLite hfvm0, int v) {
        return v == 1 ? (((hdhm)hfvm0).b & 1) : super.b(((MessageLite)(((hdhm)hfvm0))), v);
    }

    @Override  // gbcg
    public final MessageLite f(MessageLite hfvm0, int v) {
        if(v != 1) {
            return super.f(((MessageLite)(((hdhm)hfvm0))), v);
        }
        MessageLite hfvm1 = ((hdhm)hfvm0).c;
        return hfvm1 == null ? hdsn.a : hfvm1;
    }

    @Override  // gbcg
    public final int[] i() {
        return new int[]{1};
    }
}

