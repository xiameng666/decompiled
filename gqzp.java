public final class gqzp extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqzp a;
    private static volatile Parser b;

    static {
        gqzp gqzp0 = new gqzp();
        gqzp.a = gqzp0;
        ProtoLiteMessage.L(gqzp.class, ((ProtoLiteMessage)gqzp0));
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
                    return new hfvw(((MessageLite)gqzp.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gqzp();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqzp.a));
                }
                case 5: {
                    return gqzp.a;
                }
                case 6: {
                    Object object1 = gqzp.b;
                    if(object1 == null) {
                        Class class0 = gqzp.class;
                        synchronized(class0) {
                            hfvs0 = gqzp.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqzp.a));
                                gqzp.b = hfvs0;
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

