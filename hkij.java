public final class hkij extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkij a;
    public int b;
    private static volatile Parser c;

    static {
        hkij hkij0 = new hkij();
        hkij.a = hkij0;
        ProtoLiteMessage.L(hkij.class, ((ProtoLiteMessage)hkij0));
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
                    return new hfvw(((MessageLite)hkij.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"b"});
                }
                case 3: {
                    return new hkij();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkij.a));
                }
                case 5: {
                    return hkij.a;
                }
                case 6: {
                    Object object1 = hkij.c;
                    if(object1 == null) {
                        Class class0 = hkij.class;
                        synchronized(class0) {
                            hfvs0 = hkij.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkij.a));
                                hkij.c = hfvs0;
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

