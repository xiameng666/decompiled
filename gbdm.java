final class gbdm extends gbcg {
    public gbdm() {
        super(((MessageLite)hdtf.a));
    }

    @Override  // gbcg
    public final MessageLite a(MessageLite hfvm0, int v) {
        switch(v) {
            case 8: {
                MessageLite hfvm1 = ((hdtf)hfvm0).k;
                return hfvm1 == null ? hdtc.a : hfvm1;
            }
            case 9: {
                MessageLite hfvm2 = ((hdtf)hfvm0).l;
                return hfvm2 == null ? hdtc.a : hfvm2;
            }
            case 10: {
                MessageLite hfvm3 = ((hdtf)hfvm0).m;
                return hfvm3 == null ? hdtc.a : hfvm3;
            }
            case 11: {
                MessageLite hfvm4 = ((hdtf)hfvm0).n;
                return hfvm4 == null ? hdtc.a : hfvm4;
            }
            case 15: {
                MessageLite hfvm5 = ((hdtf)hfvm0).o;
                return hfvm5 == null ? hdtc.a : hfvm5;
            }
            case 17: {
                return ((hdtf)hfvm0).c == 17 ? ((hdsj)((hdtf)hfvm0).d) : hdsj.a;
            }
            default: {
                return super.a(((MessageLite)(((hdtf)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final boolean b(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                return (((hdtf)hfvm0).b & 1);
            }
            case 2: {
                return ((hdtf)hfvm0).c == 2 ? true : false;
            }
            case 3: {
                return (((hdtf)hfvm0).b & 4) == 0 ? false : true;
            }
            case 4: {
                return (((hdtf)hfvm0).b & 8) == 0 ? false : true;
            }
            case 5: {
                return (((hdtf)hfvm0).b & 16) == 0 ? false : true;
            }
            case 6: {
                return (((hdtf)hfvm0).b & 0x20) == 0 ? false : true;
            }
            case 8: {
                return (((hdtf)hfvm0).b & 0x40) == 0 ? false : true;
            }
            case 9: {
                return (((hdtf)hfvm0).b & 0x80) == 0 ? false : true;
            }
            case 10: {
                return (((hdtf)hfvm0).b & 0x100) == 0 ? false : true;
            }
            case 11: {
                return (((hdtf)hfvm0).b & 0x200) == 0 ? false : true;
            }
            case 12: {
                return (((hdtf)hfvm0).b & 0x800) == 0 ? false : true;
            }
            case 13: {
                return (((hdtf)hfvm0).b & 0x1000) == 0 ? false : true;
            }
            case 14: {
                return (((hdtf)hfvm0).b & 2) == 0 ? false : true;
            }
            case 15: {
                return (((hdtf)hfvm0).b & 0x400) == 0 ? false : true;
            }
            case 16: {
                return (((hdtf)hfvm0).b & 0x2000) == 0 ? false : true;
            }
            case 17: {
                return ((hdtf)hfvm0).c == 17 ? true : false;
            }
            default: {
                return super.b(((MessageLite)(((hdtf)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    protected final int[] c() {
        return new int[]{8, 17, 9, 10, 11, 15};
    }

    @Override  // gbcg
    public final float d(MessageLite hfvm0, int v) {
        return v == 6 ? ((hdtf)hfvm0).j : super.d(((MessageLite)(((hdtf)hfvm0))), v);
    }

    @Override  // gbcg
    public final int e(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                return ((hdtf)hfvm0).e;
            }
            case 3: {
                return ((hdtf)hfvm0).g;
            }
            case 12: {
                return ((hdtf)hfvm0).p;
            }
            case 14: {
                return ((hdtf)hfvm0).f;
            }
            default: {
                return super.e(((MessageLite)(((hdtf)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final MessageLite f(MessageLite hfvm0, int v) {
        switch(v) {
            case 2: {
                return ((hdtf)hfvm0).c == 2 ? ((hdsn)((hdtf)hfvm0).d) : hdsn.a;
            }
            case 5: {
                MessageLite hfvm1 = ((hdtf)hfvm0).i;
                return hfvm1 == null ? hdsn.a : hfvm1;
            }
            case 16: {
                MessageLite hfvm2 = ((hdtf)hfvm0).r;
                return hfvm2 == null ? hdsn.a : hfvm2;
            }
            default: {
                return super.f(((MessageLite)(((hdtf)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final Object g(MessageLite hfvm0, int v) {
        switch(v) {
            case 4: {
                Object object0 = hdsr.b(((hdtf)hfvm0).h);
                return object0 == null ? hdsr.a : object0;
            }
            case 13: {
                Object object1 = hdte.b(((hdtf)hfvm0).q);
                return object1 == null ? hdte.a : object1;
            }
            default: {
                return super.g(((MessageLite)(((hdtf)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final int[] i() {
        return new int[]{1, 2, 3, 4, 5, 6, 12, 13, 16, 14};
    }
}

