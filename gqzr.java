public final class gqzr extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqzr a;
    private static volatile Parser b;

    static {
        gqzr gqzr0 = new gqzr();
        gqzr.a = gqzr0;
        ProtoLiteMessage.L(gqzr.class, ((ProtoLiteMessage)gqzr0));
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
                    return new hfvw(((MessageLite)gqzr.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gqzr();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqzr.a));
                }
                case 5: {
                    return gqzr.a;
                }
                case 6: {
                    Object object1 = gqzr.b;
                    if(object1 == null) {
                        Class class0 = gqzr.class;
                        synchronized(class0) {
                            hfvs0 = gqzr.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqzr.a));
                                gqzr.b = hfvs0;
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

