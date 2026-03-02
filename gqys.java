public final class gqys extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqys a;
    private static volatile Parser b;

    static {
        gqys gqys0 = new gqys();
        gqys.a = gqys0;
        ProtoLiteMessage.L(gqys.class, ((ProtoLiteMessage)gqys0));
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
                    return new hfvw(((MessageLite)gqys.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gqys();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqys.a));
                }
                case 5: {
                    return gqys.a;
                }
                case 6: {
                    Object object1 = gqys.b;
                    if(object1 == null) {
                        Class class0 = gqys.class;
                        synchronized(class0) {
                            hfvs0 = gqys.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqys.a));
                                gqys.b = hfvs0;
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

