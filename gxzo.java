public final class gxzo extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gxzo a;
    private static volatile Parser b;

    static {
        gxzo gxzo0 = new gxzo();
        gxzo.a = gxzo0;
        ProtoLiteMessage.L(gxzo.class, ((ProtoLiteMessage)gxzo0));
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
                    return new hfvw(((MessageLite)gxzo.a), "\u0000\u0000", null);
                }
                case 3: {
                    return new gxzo();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gxzo.a));
                }
                case 5: {
                    return gxzo.a;
                }
                case 6: {
                    Object object1 = gxzo.b;
                    if(object1 == null) {
                        Class class0 = gxzo.class;
                        synchronized(class0) {
                            hfvs0 = gxzo.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gxzo.a));
                                gxzo.b = hfvs0;
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

