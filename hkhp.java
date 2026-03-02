public final class hkhp extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkhp a;
    private static volatile Parser b;

    static {
        hkhp hkhp0 = new hkhp();
        hkhp.a = hkhp0;
        ProtoLiteMessage.L(hkhp.class, ((ProtoLiteMessage)hkhp0));
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
                    return new hfvw(((MessageLite)hkhp.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hkhp();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkhp.a));
                }
                case 5: {
                    return hkhp.a;
                }
                case 6: {
                    Object object1 = hkhp.b;
                    if(object1 == null) {
                        Class class0 = hkhp.class;
                        synchronized(class0) {
                            hfvs0 = hkhp.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkhp.a));
                                hkhp.b = hfvs0;
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

