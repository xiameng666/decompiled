public final class hkvt extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkvt a;
    private static volatile Parser b;

    static {
        hkvt hkvt0 = new hkvt();
        hkvt.a = hkvt0;
        ProtoLiteMessage.L(hkvt.class, ((ProtoLiteMessage)hkvt0));
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
                    return new hfvw(((MessageLite)hkvt.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hkvt();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkvt.a));
                }
                case 5: {
                    return hkvt.a;
                }
                case 6: {
                    Object object1 = hkvt.b;
                    if(object1 == null) {
                        Class class0 = hkvt.class;
                        synchronized(class0) {
                            hfvs0 = hkvt.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkvt.a));
                                hkvt.b = hfvs0;
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

