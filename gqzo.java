public final class gqzo extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqzo a;
    private static volatile Parser b;

    static {
        gqzo gqzo0 = new gqzo();
        gqzo.a = gqzo0;
        ProtoLiteMessage.L(gqzo.class, ((ProtoLiteMessage)gqzo0));
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
                    return new hfvw(((MessageLite)gqzo.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gqzo();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqzo.a));
                }
                case 5: {
                    return gqzo.a;
                }
                case 6: {
                    Object object1 = gqzo.b;
                    if(object1 == null) {
                        Class class0 = gqzo.class;
                        synchronized(class0) {
                            hfvs0 = gqzo.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqzo.a));
                                gqzo.b = hfvs0;
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

