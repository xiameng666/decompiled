public final class hkvp extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkvp a;
    private static volatile Parser b;

    static {
        hkvp hkvp0 = new hkvp();
        hkvp.a = hkvp0;
        ProtoLiteMessage.L(hkvp.class, ((ProtoLiteMessage)hkvp0));
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
                    return new hfvw(((MessageLite)hkvp.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hkvp();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkvp.a));
                }
                case 5: {
                    return hkvp.a;
                }
                case 6: {
                    Object object1 = hkvp.b;
                    if(object1 == null) {
                        Class class0 = hkvp.class;
                        synchronized(class0) {
                            hfvs0 = hkvp.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkvp.a));
                                hkvp.b = hfvs0;
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

