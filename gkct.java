public final class gkct extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkct a;
    public hfvh b;
    public hfvh c;
    public hfvh d;
    private static volatile Parser e;

    static {
        gkct gkct0 = new gkct();
        gkct.a = gkct0;
        ProtoLiteMessage.L(gkct.class, ((ProtoLiteMessage)gkct0));
    }

    private gkct() {
        this.b = hfvh.a;
        this.c = hfvh.a;
        this.d = hfvh.a;
    }

    @Override  // ProtoLiteMessage
    public final Object jf(int v, Object object0) {
        Parser hfvs0;
        if(v != 0) {
            switch(v - 1) {
                case 0: {
                    return (byte)1;
                }
                case 2: {
                    return new hfvw(((MessageLite)gkct.a), "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0003\u0000\u0000\u00012\u00022\u00032", new Object[]{"b", gkcs.a, "c", gkcp.a, "d", gkcr.a});
                }
                case 3: {
                    return new gkct();
                }
                case 4: {
                    return new gkcq();
                }
                case 5: {
                    return gkct.a;
                }
                case 6: {
                    Object object1 = gkct.e;
                    if(object1 == null) {
                        Class class0 = gkct.class;
                        synchronized(class0) {
                            hfvs0 = gkct.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkct.a));
                                gkct.e = hfvs0;
                            }
                        }
                        return hfvs0;
                    }
                    return object1;
                }
                default: {
                    throw null;
                }
            }
        }
        throw null;
    }
}

