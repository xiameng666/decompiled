public final class hkug extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkug a;
    public int b;
    public int c;
    public long d;
    public long e;
    private static volatile Parser f;

    static {
        hkug hkug0 = new hkug();
        hkug.a = hkug0;
        ProtoLiteMessage.L(hkug.class, ((ProtoLiteMessage)hkug0));
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
                    return new hfvw(((MessageLite)hkug.a), "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0002\u0004\u0002", new Object[]{"b", "c", "d", "e"});
                }
                case 3: {
                    return new hkug();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkug.a));
                }
                case 5: {
                    return hkug.a;
                }
                case 6: {
                    Object object1 = hkug.f;
                    if(object1 == null) {
                        Class class0 = hkug.class;
                        synchronized(class0) {
                            hfvs0 = hkug.f;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkug.a));
                                hkug.f = hfvs0;
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

