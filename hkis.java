public final class hkis extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkis a;
    private static volatile Parser b;

    static {
        hkis hkis0 = new hkis();
        hkis.a = hkis0;
        ProtoLiteMessage.L(hkis.class, ((ProtoLiteMessage)hkis0));
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
                    return new hfvw(((MessageLite)hkis.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hkis();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkis.a));
                }
                case 5: {
                    return hkis.a;
                }
                case 6: {
                    Object object1 = hkis.b;
                    if(object1 == null) {
                        Class class0 = hkis.class;
                        synchronized(class0) {
                            hfvs0 = hkis.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkis.a));
                                hkis.b = hfvs0;
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

