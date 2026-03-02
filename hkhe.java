public final class hkhe extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkhe a;
    private static volatile Parser b;

    static {
        hkhe hkhe0 = new hkhe();
        hkhe.a = hkhe0;
        ProtoLiteMessage.L(hkhe.class, ((ProtoLiteMessage)hkhe0));
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
                    return new hfvw(((MessageLite)hkhe.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hkhe();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkhe.a));
                }
                case 5: {
                    return hkhe.a;
                }
                case 6: {
                    Object object1 = hkhe.b;
                    if(object1 == null) {
                        Class class0 = hkhe.class;
                        synchronized(class0) {
                            hfvs0 = hkhe.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkhe.a));
                                hkhe.b = hfvs0;
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

