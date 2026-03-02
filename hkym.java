public final class hkym extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkym a;
    private static volatile Parser b;

    static {
        hkym hkym0 = new hkym();
        hkym.a = hkym0;
        ProtoLiteMessage.L(hkym.class, ((ProtoLiteMessage)hkym0));
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
                    return new hfvw(((MessageLite)hkym.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new hkym();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkym.a));
                }
                case 5: {
                    return hkym.a;
                }
                case 6: {
                    Object object1 = hkym.b;
                    if(object1 == null) {
                        Class class0 = hkym.class;
                        synchronized(class0) {
                            hfvs0 = hkym.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkym.a));
                                hkym.b = hfvs0;
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

