final class gbcv extends gbcg {
    public gbcv() {
        super(((MessageLite)hdlq.a));
    }

    @Override  // gbcg
    public final MessageLite a(MessageLite hfvm0, int v) {
        if(v != 1) {
            return super.a(((MessageLite)(((hdlq)hfvm0))), v);
        }
        MessageLite hfvm1 = ((hdlq)hfvm0).c;
        return hfvm1 == null ? hdsk.a : hfvm1;
    }

    @Override  // gbcg
    public final boolean b(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                return 1 == (((hdlq)hfvm0).b & 1);
            }
            case 2: {
                return (((hdlq)hfvm0).b & 2) == 0 ? false : true;
            }
            case 3: {
                return (((hdlq)hfvm0).b & 4) == 0 ? false : true;
            }
            case 4: {
                return (((hdlq)hfvm0).b & 8) == 0 ? false : true;
            }
            default: {
                return 1 == super.b(((MessageLite)(((hdlq)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    protected final int[] c() {
        return new int[]{1};
    }

    @Override  // gbcg
    public final int e(MessageLite hfvm0, int v) {
        switch(v) {
            case 2: {
                return ((hdlq)hfvm0).d;
            }
            case 4: {
                return ((hdlq)hfvm0).f;
            }
            default: {
                return super.e(((MessageLite)(((hdlq)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final MessageLite f(MessageLite hfvm0, int v) {
        if(v != 3) {
            return super.f(((MessageLite)(((hdlq)hfvm0))), v);
        }
        MessageLite hfvm1 = ((hdlq)hfvm0).e;
        return hfvm1 == null ? hdsn.a : hfvm1;
    }

    @Override  // gbcg
    public final int[] i() {
        return new int[]{2, 3, 4};
    }
}

