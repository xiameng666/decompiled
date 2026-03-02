public final class hkkn extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkkn a;
    public int b;
    private static volatile Parser c;

    static {
        hkkn hkkn0 = new hkkn();
        hkkn.a = hkkn0;
        ProtoLiteMessage.L(hkkn.class, ((ProtoLiteMessage)hkkn0));
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
                    return new hfvw(((MessageLite)hkkn.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"b"});
                }
                case 3: {
                    return new hkkn();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkkn.a));
                }
                case 5: {
                    return hkkn.a;
                }
                case 6: {
                    Object object1 = hkkn.c;
                    if(object1 == null) {
                        Class class0 = hkkn.class;
                        synchronized(class0) {
                            hfvs0 = hkkn.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkkn.a));
                                hkkn.c = hfvs0;
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

