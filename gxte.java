public final class gxte extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gxte a;
    private static volatile Parser b;

    static {
        gxte gxte0 = new gxte();
        gxte.a = gxte0;
        ProtoLiteMessage.L(gxte.class, ((ProtoLiteMessage)gxte0));
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
                    return new hfvw(((MessageLite)gxte.a), "\u0000\u0000", null);
                }
                case 3: {
                    return new gxte();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gxte.a));
                }
                case 5: {
                    return gxte.a;
                }
                case 6: {
                    Object object1 = gxte.b;
                    if(object1 == null) {
                        Class class0 = gxte.class;
                        synchronized(class0) {
                            hfvs0 = gxte.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gxte.a));
                                gxte.b = hfvs0;
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

