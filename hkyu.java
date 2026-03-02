public final class hkyu extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkyu a;
    private static volatile Parser b;

    static {
        hkyu hkyu0 = new hkyu();
        hkyu.a = hkyu0;
        ProtoLiteMessage.L(hkyu.class, ((ProtoLiteMessage)hkyu0));
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
                    return new hfvw(((MessageLite)hkyu.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new hkyu();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkyu.a));
                }
                case 5: {
                    return hkyu.a;
                }
                case 6: {
                    Object object1 = hkyu.b;
                    if(object1 == null) {
                        Class class0 = hkyu.class;
                        synchronized(class0) {
                            hfvs0 = hkyu.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkyu.a));
                                hkyu.b = hfvs0;
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

