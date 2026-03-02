public final class gqgb extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqgb a;
    public int b;
    private static volatile Parser c;

    static {
        gqgb gqgb0 = new gqgb();
        gqgb.a = gqgb0;
        ProtoLiteMessage.L(gqgb.class, ((ProtoLiteMessage)gqgb0));
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
                    return new hfvw(((MessageLite)gqgb.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"b"});
                }
                case 3: {
                    return new gqgb();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqgb.a));
                }
                case 5: {
                    return gqgb.a;
                }
                case 6: {
                    Object object1 = gqgb.c;
                    if(object1 == null) {
                        Class class0 = gqgb.class;
                        synchronized(class0) {
                            hfvs0 = gqgb.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqgb.a));
                                gqgb.c = hfvs0;
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

