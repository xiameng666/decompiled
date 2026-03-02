import java.util.List;

final class gbcw extends gbcg {
    public gbcw() {
        super(((MessageLite)hdrf.b));
    }

    @Override  // gbcg
    public final MessageLite a(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                MessageLite hfvm1 = ((hdrf)hfvm0).h;
                return hfvm1 == null ? hdqh.a : hfvm1;
            }
            case 2: {
                MessageLite hfvm2 = ((hdrf)hfvm0).i;
                return hfvm2 == null ? hdqh.a : hfvm2;
            }
            case 12: {
                return ((hdrf)hfvm0).d == 12 ? ((hdqp)((hdrf)hfvm0).e) : hdqp.a;
            }
            case 13: {
                return ((hdrf)hfvm0).d == 13 ? ((hdrb)((hdrf)hfvm0).e) : hdrb.a;
            }
            case 14: {
                return ((hdrf)hfvm0).d == 14 ? ((hdri)((hdrf)hfvm0).e) : hdri.a;
            }
            case 15: {
                return ((hdrf)hfvm0).f == 15 ? ((hdqx)((hdrf)hfvm0).g) : hdqx.a;
            }
            case 17: {
                return ((hdrf)hfvm0).d == 17 ? ((hdqu)((hdrf)hfvm0).e) : hdqu.a;
            }
            case 18: {
                return ((hdrf)hfvm0).f == 18 ? ((hdqk)((hdrf)hfvm0).g) : hdqk.a;
            }
            default: {
                return super.a(((MessageLite)(((hdrf)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final boolean b(MessageLite hfvm0, int v) {
        switch(v) {
            case 1: {
                return (((hdrf)hfvm0).c & 1);
            }
            case 2: {
                return (((hdrf)hfvm0).c & 2) == 0 ? false : true;
            }
            case 3: {
                return (((hdrf)hfvm0).c & 4) == 0 ? false : true;
            }
            case 4: {
                return (((hdrf)hfvm0).c & 8) == 0 ? false : true;
            }
            case 5: {
                return (((hdrf)hfvm0).c & 16) == 0 ? false : true;
            }
            case 6: {
                return (((hdrf)hfvm0).c & 0x20) == 0 ? false : true;
            }
            case 7: {
                return (((hdrf)hfvm0).c & 0x40) == 0 ? false : true;
            }
            case 8: {
                return (((hdrf)hfvm0).c & 0x80) == 0 ? false : true;
            }
            case 9: {
                return (((hdrf)hfvm0).c & 0x100) == 0 ? false : true;
            }
            case 10: {
                return (((hdrf)hfvm0).c & 0x200) == 0 ? false : true;
            }
            case 11: {
                return (((hdrf)hfvm0).c & 0x400) == 0 ? false : true;
            }
            case 12: {
                return ((hdrf)hfvm0).d == 12 ? true : false;
            }
            case 13: {
                return ((hdrf)hfvm0).d == 13 ? true : false;
            }
            case 14: {
                return ((hdrf)hfvm0).d == 14 ? true : false;
            }
            case 15: {
                return ((hdrf)hfvm0).f == 15 ? true : false;
            }
            case 16: {
                return !new hfuh(((hdrf)hfvm0).s, hdrf.a).isEmpty();
            }
            case 17: {
                return ((hdrf)hfvm0).d == 17 ? true : false;
            }
            case 18: {
                return ((hdrf)hfvm0).f == 18 ? true : false;
            }
            default: {
                return super.b(((MessageLite)(((hdrf)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    protected final int[] c() {
        return new int[]{1, 2, 12, 13, 14, 15, 17, 18};
    }

    @Override  // gbcg
    public final MessageLite f(MessageLite hfvm0, int v) {
        switch(v) {
            case 3: {
                MessageLite hfvm1 = ((hdrf)hfvm0).j;
                return hfvm1 == null ? hdsi.a : hfvm1;
            }
            case 4: {
                MessageLite hfvm2 = ((hdrf)hfvm0).k;
                return hfvm2 == null ? hdsn.a : hfvm2;
            }
            case 5: {
                MessageLite hfvm3 = ((hdrf)hfvm0).l;
                return hfvm3 == null ? hdsn.a : hfvm3;
            }
            case 6: {
                MessageLite hfvm4 = ((hdrf)hfvm0).m;
                return hfvm4 == null ? hdsi.a : hfvm4;
            }
            case 7: {
                MessageLite hfvm5 = ((hdrf)hfvm0).n;
                return hfvm5 == null ? hdsn.a : hfvm5;
            }
            case 8: {
                MessageLite hfvm6 = ((hdrf)hfvm0).o;
                return hfvm6 == null ? hdsn.a : hfvm6;
            }
            case 10: {
                MessageLite hfvm7 = ((hdrf)hfvm0).q;
                return hfvm7 == null ? hdqc.a : hfvm7;
            }
            default: {
                return super.f(((MessageLite)(((hdrf)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final Object g(MessageLite hfvm0, int v) {
        switch(v) {
            case 9: {
                Object object0 = hdqg.b(((hdrf)hfvm0).p);
                return object0 == null ? hdqg.a : object0;
            }
            case 11: {
                Object object1 = hdrd.b(((hdrf)hfvm0).r);
                return object1 == null ? hdrd.a : object1;
            }
            default: {
                return super.g(((MessageLite)(((hdrf)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final List h(MessageLite hfvm0, int v) {
        return v != 16 ? super.h(((MessageLite)(((hdrf)hfvm0))), v) : new hfuh(((hdrf)hfvm0).s, hdrf.a);
    }

    @Override  // gbcg
    public final int[] i() {
        return new int[]{3, 5, 4, 6, 8, 7, 9, 10, 11, 16};
    }
}

