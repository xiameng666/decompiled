public final class hklj extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hklj a;
    public int b;
    private static volatile Parser c;

    static {
        hklj hklj0 = new hklj();
        hklj.a = hklj0;
        ProtoLiteMessage.L(hklj.class, ((ProtoLiteMessage)hklj0));
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
                    return new hfvw(((MessageLite)hklj.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"b"});
                }
                case 3: {
                    return new hklj();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hklj.a));
                }
                case 5: {
                    return hklj.a;
                }
                case 6: {
                    Object object1 = hklj.c;
                    if(object1 == null) {
                        Class class0 = hklj.class;
                        synchronized(class0) {
                            hfvs0 = hklj.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hklj.a));
                                hklj.c = hfvs0;
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

