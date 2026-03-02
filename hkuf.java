public final class hkuf extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkuf a;
    public int b;
    private static volatile Parser c;

    static {
        hkuf hkuf0 = new hkuf();
        hkuf.a = hkuf0;
        ProtoLiteMessage.L(hkuf.class, ((ProtoLiteMessage)hkuf0));
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
                    return new hfvw(((MessageLite)hkuf.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"b"});
                }
                case 3: {
                    return new hkuf();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkuf.a));
                }
                case 5: {
                    return hkuf.a;
                }
                case 6: {
                    Object object1 = hkuf.c;
                    if(object1 == null) {
                        Class class0 = hkuf.class;
                        synchronized(class0) {
                            hfvs0 = hkuf.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkuf.a));
                                hkuf.c = hfvs0;
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

