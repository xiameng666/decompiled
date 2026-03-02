public final class gqoi extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqoi a;
    private static volatile Parser b;

    static {
        gqoi gqoi0 = new gqoi();
        gqoi.a = gqoi0;
        ProtoLiteMessage.L(gqoi.class, ((ProtoLiteMessage)gqoi0));
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
                    return new hfvw(((MessageLite)gqoi.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gqoi();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqoi.a));
                }
                case 5: {
                    return gqoi.a;
                }
                case 6: {
                    Object object1 = gqoi.b;
                    if(object1 == null) {
                        Class class0 = gqoi.class;
                        synchronized(class0) {
                            hfvs0 = gqoi.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqoi.a));
                                gqoi.b = hfvs0;
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

