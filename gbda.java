import java.util.List;

public final class gbda extends gbcg {
    public gbda() {
        super(((MessageLite)hdjx.a));
    }

    @Override  // gbcg
    public final boolean b(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                return !((hdjx)hfvm0).c.isEmpty();
            }
            case 2: {
                return (((hdjx)hfvm0).b & 1);
            }
            default: {
                return super.b(((MessageLite)(((hdjx)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final MessageLite f(MessageLite hfvm0, int v) {
        if(v == 2) {
            MessageLite hfvm1 = ((hdjx)hfvm0).d;
            return hfvm1 == null ? hdsn.a : hfvm1;
        }
        return super.f(((MessageLite)(((hdjx)hfvm0))), v);
    }

    @Override  // gbcg
    public final List h(MessageLite hfvm0, int v) {
        return v == 1 ? ((hdjx)hfvm0).c : super.h(((MessageLite)(((hdjx)hfvm0))), v);
    }

    @Override  // gbcg
    public final int[] i() {
        return new int[]{1, 2};
    }
}

