public final class gkhp extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkhp a;
    private static volatile Parser b;

    static {
        gkhp gkhp0 = new gkhp();
        gkhp.a = gkhp0;
        ProtoLiteMessage.L(gkhp.class, ((ProtoLiteMessage)gkhp0));
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
                    return new hfvw(((MessageLite)gkhp.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkhp();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkhp.a));
                }
                case 5: {
                    return gkhp.a;
                }
                case 6: {
                    Object object1 = gkhp.b;
                    if(object1 == null) {
                        Class class0 = gkhp.class;
                        synchronized(class0) {
                            hfvs0 = gkhp.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkhp.a));
                                gkhp.b = hfvs0;
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

