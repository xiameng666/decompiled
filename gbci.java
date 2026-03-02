import java.util.List;

public final class gbci extends gbcg {
    public gbci() {
        super(((MessageLite)hcuj.a));
    }

    @Override  // gbcg
    public final boolean b(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                return (((hcuj)hfvm0).b & 1);
            }
            case 2: {
                return (((hcuj)hfvm0).b & 2) == 0 ? false : true;
            }
            case 3: {
                return ((hcuj)hfvm0).e.size() > 0;
            }
            case 4: {
                return (((hcuj)hfvm0).b & 4) == 0 ? false : true;
            }
            case 5: {
                return (((hcuj)hfvm0).b & 8) == 0 ? false : true;
            }
            case 6: {
                return ((hcuj)hfvm0).h.size() > 0;
            }
            case 7: {
                return (((hcuj)hfvm0).b & 16) == 0 ? false : true;
            }
            default: {
                return super.b(((MessageLite)(((hcuj)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final int e(MessageLite hfvm0, int v) {
        return v == 2 ? ((hcuj)hfvm0).d : super.e(((MessageLite)(((hcuj)hfvm0))), v);
    }

    @Override  // gbcg
    public final MessageLite f(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                MessageLite hfvm1 = ((hcuj)hfvm0).c;
                return hfvm1 == null ? hdsn.a : hfvm1;
            }
            case 4: {
                MessageLite hfvm2 = ((hcuj)hfvm0).f;
                return hfvm2 == null ? hdsn.a : hfvm2;
            }
            case 5: {
                MessageLite hfvm3 = ((hcuj)hfvm0).g;
                return hfvm3 == null ? hdsn.a : hfvm3;
            }
            case 7: {
                MessageLite hfvm4 = ((hcuj)hfvm0).i;
                return hfvm4 == null ? hdsn.a : hfvm4;
            }
            default: {
                return super.f(((MessageLite)(((hcuj)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final List h(MessageLite hfvm0, int v) {
        switch(v) {
            case 3: {
                return ((hcuj)hfvm0).e;
            }
            case 6: {
                return ((hcuj)hfvm0).h;
            }
            default: {
                return super.h(((MessageLite)(((hcuj)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final int[] i() {
        return new int[]{1, 2, 3, 4, 5, 6, 7};
    }
}

