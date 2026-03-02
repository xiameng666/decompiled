public final class hfkr extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hfkr a;
    private static volatile Parser b;

    static {
        hfkr hfkr0 = new hfkr();
        hfkr.a = hfkr0;
        ProtoLiteMessage.L(hfkr.class, ((ProtoLiteMessage)hfkr0));
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
                    return new hfvw(((MessageLite)hfkr.a), "\u0000\u0000", null);
                }
                case 3: {
                    return new hfkr();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hfkr.a));
                }
                case 5: {
                    return hfkr.a;
                }
                case 6: {
                    Object object1 = hfkr.b;
                    if(object1 == null) {
                        Class class0 = hfkr.class;
                        synchronized(class0) {
                            hfvs0 = hfkr.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hfkr.a));
                                hfkr.b = hfvs0;
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

