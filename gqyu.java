public final class gqyu extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqyu a;
    private static volatile Parser b;

    static {
        gqyu gqyu0 = new gqyu();
        gqyu.a = gqyu0;
        ProtoLiteMessage.L(gqyu.class, ((ProtoLiteMessage)gqyu0));
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
                    return new hfvw(((MessageLite)gqyu.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gqyu();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqyu.a));
                }
                case 5: {
                    return gqyu.a;
                }
                case 6: {
                    Object object1 = gqyu.b;
                    if(object1 == null) {
                        Class class0 = gqyu.class;
                        synchronized(class0) {
                            hfvs0 = gqyu.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqyu.a));
                                gqyu.b = hfvs0;
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

