public final class gqxx extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqxx a;
    private static volatile Parser b;

    static {
        gqxx gqxx0 = new gqxx();
        gqxx.a = gqxx0;
        ProtoLiteMessage.L(gqxx.class, ((ProtoLiteMessage)gqxx0));
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
                    return new hfvw(((MessageLite)gqxx.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gqxx();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqxx.a));
                }
                case 5: {
                    return gqxx.a;
                }
                case 6: {
                    Object object1 = gqxx.b;
                    if(object1 == null) {
                        Class class0 = gqxx.class;
                        synchronized(class0) {
                            hfvs0 = gqxx.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqxx.a));
                                gqxx.b = hfvs0;
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

