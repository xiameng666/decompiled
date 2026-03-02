final class gbcq extends gbcg {
    public gbcq() {
        super(((MessageLite)hdtc.a));
    }

    @Override  // gbcg
    public final boolean b(MessageLite hfvm0, int v) {
        if(v != 13) {
            switch(v) {
                case 1: {
                    return (((hdtc)hfvm0).b & 1);
                }
                case 2: {
                    return (((hdtc)hfvm0).b & 2) == 0 ? false : true;
                }
                case 3: {
                    return (((hdtc)hfvm0).b & 4) == 0 ? false : true;
                }
                case 4: {
                    return (((hdtc)hfvm0).b & 0x20) == 0 ? false : true;
                }
                case 5: {
                    return (((hdtc)hfvm0).b & 8) == 0 ? false : true;
                }
                case 6: {
                    return (((hdtc)hfvm0).b & 0x40) == 0 ? false : true;
                }
                case 7: {
                    return (((hdtc)hfvm0).b & 16) == 0 ? false : true;
                }
                case 8: {
                    return (((hdtc)hfvm0).b & 0x80) == 0 ? false : true;
                }
                case 9: {
                    return (((hdtc)hfvm0).b & 0x200) == 0 ? false : true;
                }
                case 10: {
                    return (((hdtc)hfvm0).b & 0x400) == 0 ? false : true;
                }
                default: {
                    return super.b(((MessageLite)(((hdtc)hfvm0))), v);
                }
            }
        }
        return (((hdtc)hfvm0).b & 0x100) == 0 ? false : true;
    }

    @Override  // gbcg
    public final int e(MessageLite hfvm0, int v) {
        return v == 3 ? ((hdtc)hfvm0).e : super.e(((MessageLite)(((hdtc)hfvm0))), v);
    }

    @Override  // gbcg
    public final MessageLite f(MessageLite hfvm0, int v) {
        switch(v) {
            case 2: {
                MessageLite hfvm1 = ((hdtc)hfvm0).d;
                return hfvm1 == null ? hdsn.a : hfvm1;
            }
            case 5: {
                MessageLite hfvm2 = ((hdtc)hfvm0).f;
                return hfvm2 == null ? hdsn.a : hfvm2;
            }
            case 7: {
                MessageLite hfvm3 = ((hdtc)hfvm0).g;
                return hfvm3 == null ? hdsn.a : hfvm3;
            }
            case 10: {
                MessageLite hfvm4 = ((hdtc)hfvm0).m;
                return hfvm4 == null ? hdta.a : hfvm4;
            }
            case 13: {
                MessageLite hfvm5 = ((hdtc)hfvm0).k;
                return hfvm5 == null ? hdtb.a : hfvm5;
            }
            default: {
                return super.f(((MessageLite)(((hdtc)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final Object g(MessageLite hfvm0, int v) {
        switch(v) {
            case 4: {
                Object object0 = hdst.b(((hdtc)hfvm0).h);
                return object0 == null ? hdst.a : object0;
            }
            case 6: {
                Object object1 = hdsx.b(((hdtc)hfvm0).i);
                return object1 == null ? hdsx.c : object1;
            }
            case 8: {
                Object object2 = hdsv.b(((hdtc)hfvm0).j);
                return object2 == null ? hdsv.a : object2;
            }
            case 9: {
                Object object3 = hdsz.b(((hdtc)hfvm0).l);
                return object3 == null ? hdsz.a : object3;
            }
            default: {
                return super.g(((MessageLite)(((hdtc)hfvm0))), v);
            }
        }
    }

    @Override  // gbcg
    public final int[] i() {
        return new int[]{1, 2, 3, 4, 6, 7, 5, 8, 10, 9, 13};
    }

    @Override  // gbcg
    public final String l(MessageLite hfvm0) {
        return ((hdtc)hfvm0).c;
    }
}

