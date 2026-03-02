public final class hkvm extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkvm a;
    private static volatile Parser b;

    static {
        hkvm hkvm0 = new hkvm();
        hkvm.a = hkvm0;
        ProtoLiteMessage.L(hkvm.class, ((ProtoLiteMessage)hkvm0));
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
                    return new hfvw(((MessageLite)hkvm.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hkvm();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkvm.a));
                }
                case 5: {
                    return hkvm.a;
                }
                case 6: {
                    Object object1 = hkvm.b;
                    if(object1 == null) {
                        Class class0 = hkvm.class;
                        synchronized(class0) {
                            hfvs0 = hkvm.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkvm.a));
                                hkvm.b = hfvs0;
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

