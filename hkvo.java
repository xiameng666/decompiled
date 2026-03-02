public final class hkvo extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkvo a;
    private static volatile Parser b;

    static {
        hkvo hkvo0 = new hkvo();
        hkvo.a = hkvo0;
        ProtoLiteMessage.L(hkvo.class, ((ProtoLiteMessage)hkvo0));
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
                    return new hfvw(((MessageLite)hkvo.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hkvo();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkvo.a));
                }
                case 5: {
                    return hkvo.a;
                }
                case 6: {
                    Object object1 = hkvo.b;
                    if(object1 == null) {
                        Class class0 = hkvo.class;
                        synchronized(class0) {
                            hfvs0 = hkvo.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkvo.a));
                                hkvo.b = hfvs0;
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

