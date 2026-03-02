public final class grai extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final grai a;
    private static volatile Parser b;

    static {
        grai grai0 = new grai();
        grai.a = grai0;
        ProtoLiteMessage.L(grai.class, ((ProtoLiteMessage)grai0));
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
                    return new hfvw(((MessageLite)grai.a), "\u0000\u0000", null);
                }
                case 3: {
                    return new grai();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)grai.a));
                }
                case 5: {
                    return grai.a;
                }
                case 6: {
                    Object object1 = grai.b;
                    if(object1 == null) {
                        Class class0 = grai.class;
                        synchronized(class0) {
                            hfvs0 = grai.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)grai.a));
                                grai.b = hfvs0;
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

