public final class gqzs extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqzs a;
    private static volatile Parser b;

    static {
        gqzs gqzs0 = new gqzs();
        gqzs.a = gqzs0;
        ProtoLiteMessage.L(gqzs.class, ((ProtoLiteMessage)gqzs0));
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
                    return new hfvw(((MessageLite)gqzs.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gqzs();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqzs.a));
                }
                case 5: {
                    return gqzs.a;
                }
                case 6: {
                    Object object1 = gqzs.b;
                    if(object1 == null) {
                        Class class0 = gqzs.class;
                        synchronized(class0) {
                            hfvs0 = gqzs.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqzs.a));
                                gqzs.b = hfvs0;
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

