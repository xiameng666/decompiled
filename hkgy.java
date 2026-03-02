public final class hkgy extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkgy a;
    public int b;
    private static volatile Parser c;

    static {
        hkgy hkgy0 = new hkgy();
        hkgy.a = hkgy0;
        ProtoLiteMessage.L(hkgy.class, ((ProtoLiteMessage)hkgy0));
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
                    return new hfvw(((MessageLite)hkgy.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"b"});
                }
                case 3: {
                    return new hkgy();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkgy.a));
                }
                case 5: {
                    return hkgy.a;
                }
                case 6: {
                    Object object1 = hkgy.c;
                    if(object1 == null) {
                        Class class0 = hkgy.class;
                        synchronized(class0) {
                            hfvs0 = hkgy.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkgy.a));
                                hkgy.c = hfvs0;
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

