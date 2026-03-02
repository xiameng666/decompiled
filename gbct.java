final class gbct extends gbcg {
    public gbct() {
        super(((MessageLite)hdrb.a));
    }

    @Override  // gbcg
    public final boolean b(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                return 1 == (((hdrb)hfvm0).b & 1);
            }
            case 2: {
                return (((hdrb)hfvm0).b & 2) == 0 ? false : true;
            }
            case 3: {
                return (((hdrb)hfvm0).b & 4) == 0 ? false : true;
            }
            case 4: {
                return (((hdrb)hfvm0).b & 8) == 0 ? false : true;
            }
            default: {
                if(v != 5) {
                    return 1 == super.b(((MessageLite)(((hdrb)hfvm0))), v);
                }
                return (((hdrb)hfvm0).b & 16) == 0 ? false : true;
            }
        }
    }

    @Override  // gbcg
    public final MessageLite f(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                MessageLite hfvm1 = ((hdrb)hfvm0).c;
                return hfvm1 == null ? hdra.a : hfvm1;
            }
            case 2: {
                MessageLite hfvm2 = ((hdrb)hfvm0).d;
                return hfvm2 == null ? hdra.a : hfvm2;
            }
            case 3: {
                MessageLite hfvm3 = ((hdrb)hfvm0).e;
                return hfvm3 == null ? hdqc.a : hfvm3;
            }
            default: {
                return super.f(((MessageLite)(((hdrb)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final Object g(MessageLite hfvm0, int v) {
        switch(v) {
            case 4: {
                Object object0 = hdqw.b(((hdrb)hfvm0).f);
                return object0 == null ? hdqw.a : object0;
            }
            case 5: {
                Object object1 = hdqz.b(((hdrb)hfvm0).g);
                return object1 == null ? hdqz.a : object1;
            }
            default: {
                return super.g(((MessageLite)(((hdrb)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final int[] i() {
        return new int[]{1, 2, 3, 4, 5};
    }
}

