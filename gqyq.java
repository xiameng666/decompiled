public final class gqyq extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqyq a;
    private static volatile Parser b;

    static {
        gqyq gqyq0 = new gqyq();
        gqyq.a = gqyq0;
        ProtoLiteMessage.L(gqyq.class, ((ProtoLiteMessage)gqyq0));
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
                    return new hfvw(((MessageLite)gqyq.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gqyq();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqyq.a));
                }
                case 5: {
                    return gqyq.a;
                }
                case 6: {
                    Object object1 = gqyq.b;
                    if(object1 == null) {
                        Class class0 = gqyq.class;
                        synchronized(class0) {
                            hfvs0 = gqyq.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqyq.a));
                                gqyq.b = hfvs0;
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

