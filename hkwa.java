public final class hkwa extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkwa a;
    private static volatile Parser b;

    static {
        hkwa hkwa0 = new hkwa();
        hkwa.a = hkwa0;
        ProtoLiteMessage.L(hkwa.class, ((ProtoLiteMessage)hkwa0));
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
                    return new hfvw(((MessageLite)hkwa.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hkwa();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkwa.a));
                }
                case 5: {
                    return hkwa.a;
                }
                case 6: {
                    Object object1 = hkwa.b;
                    if(object1 == null) {
                        Class class0 = hkwa.class;
                        synchronized(class0) {
                            hfvs0 = hkwa.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkwa.a));
                                hkwa.b = hfvs0;
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

