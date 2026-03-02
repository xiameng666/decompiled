public final class hkhi extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkhi a;
    public long b;
    private static volatile Parser c;

    static {
        hkhi hkhi0 = new hkhi();
        hkhi.a = hkhi0;
        ProtoLiteMessage.L(hkhi.class, ((ProtoLiteMessage)hkhi0));
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
                    return new hfvw(((MessageLite)hkhi.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"b"});
                }
                case 3: {
                    return new hkhi();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkhi.a));
                }
                case 5: {
                    return hkhi.a;
                }
                case 6: {
                    Object object1 = hkhi.c;
                    if(object1 == null) {
                        Class class0 = hkhi.class;
                        synchronized(class0) {
                            hfvs0 = hkhi.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkhi.a));
                                hkhi.c = hfvs0;
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

