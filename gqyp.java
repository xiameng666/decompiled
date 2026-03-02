public final class gqyp extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqyp a;
    private static volatile Parser b;

    static {
        gqyp gqyp0 = new gqyp();
        gqyp.a = gqyp0;
        ProtoLiteMessage.L(gqyp.class, ((ProtoLiteMessage)gqyp0));
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
                    return new hfvw(((MessageLite)gqyp.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gqyp();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqyp.a));
                }
                case 5: {
                    return gqyp.a;
                }
                case 6: {
                    Object object1 = gqyp.b;
                    if(object1 == null) {
                        Class class0 = gqyp.class;
                        synchronized(class0) {
                            hfvs0 = gqyp.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqyp.a));
                                gqyp.b = hfvs0;
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

