public final class gqzq extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqzq a;
    private static volatile Parser b;

    static {
        gqzq gqzq0 = new gqzq();
        gqzq.a = gqzq0;
        ProtoLiteMessage.L(gqzq.class, ((ProtoLiteMessage)gqzq0));
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
                    return new hfvw(((MessageLite)gqzq.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gqzq();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqzq.a));
                }
                case 5: {
                    return gqzq.a;
                }
                case 6: {
                    Object object1 = gqzq.b;
                    if(object1 == null) {
                        Class class0 = gqzq.class;
                        synchronized(class0) {
                            hfvs0 = gqzq.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqzq.a));
                                gqzq.b = hfvs0;
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

