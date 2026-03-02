public final class gqzb extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqzb a;
    private static volatile Parser b;

    static {
        gqzb gqzb0 = new gqzb();
        gqzb.a = gqzb0;
        ProtoLiteMessage.L(gqzb.class, ((ProtoLiteMessage)gqzb0));
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
                    return new hfvw(((MessageLite)gqzb.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gqzb();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqzb.a));
                }
                case 5: {
                    return gqzb.a;
                }
                case 6: {
                    Object object1 = gqzb.b;
                    if(object1 == null) {
                        Class class0 = gqzb.class;
                        synchronized(class0) {
                            hfvs0 = gqzb.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqzb.a));
                                gqzb.b = hfvs0;
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

