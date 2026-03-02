public final class grhq extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final grhq a;
    private static volatile Parser b;
    private hfvh c;

    static {
        grhq grhq0 = new grhq();
        grhq.a = grhq0;
        ProtoLiteMessage.L(grhq.class, ((ProtoLiteMessage)grhq0));
    }

    private grhq() {
        this.c = hfvh.a;
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
                    return new hfvw(((MessageLite)grhq.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", grhp.a});
                }
                case 3: {
                    return new grhq();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)grhq.a));
                }
                case 5: {
                    return grhq.a;
                }
                case 6: {
                    Object object1 = grhq.b;
                    if(object1 == null) {
                        Class class0 = grhq.class;
                        synchronized(class0) {
                            hfvs0 = grhq.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)grhq.a));
                                grhq.b = hfvs0;
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

