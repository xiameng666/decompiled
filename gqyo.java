public final class gqyo extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqyo a;
    private static volatile Parser b;

    static {
        gqyo gqyo0 = new gqyo();
        gqyo.a = gqyo0;
        ProtoLiteMessage.L(gqyo.class, ((ProtoLiteMessage)gqyo0));
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
                    return new hfvw(((MessageLite)gqyo.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gqyo();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqyo.a));
                }
                case 5: {
                    return gqyo.a;
                }
                case 6: {
                    Object object1 = gqyo.b;
                    if(object1 == null) {
                        Class class0 = gqyo.class;
                        synchronized(class0) {
                            hfvs0 = gqyo.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqyo.a));
                                gqyo.b = hfvs0;
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

