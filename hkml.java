public final class hkml extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkml a;
    public int b;
    private static volatile Parser c;

    static {
        hkml hkml0 = new hkml();
        hkml.a = hkml0;
        ProtoLiteMessage.L(hkml.class, ((ProtoLiteMessage)hkml0));
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
                    return new hfvw(((MessageLite)hkml.a), "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\f", new Object[]{"b"});
                }
                case 3: {
                    return new hkml();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkml.a));
                }
                case 5: {
                    return hkml.a;
                }
                case 6: {
                    Object object1 = hkml.c;
                    if(object1 == null) {
                        Class class0 = hkml.class;
                        synchronized(class0) {
                            hfvs0 = hkml.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkml.a));
                                hkml.c = hfvs0;
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

