public final class gqyc extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqyc a;
    private static volatile Parser b;

    static {
        gqyc gqyc0 = new gqyc();
        gqyc.a = gqyc0;
        ProtoLiteMessage.L(gqyc.class, ((ProtoLiteMessage)gqyc0));
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
                    return new hfvw(((MessageLite)gqyc.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gqyc();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqyc.a));
                }
                case 5: {
                    return gqyc.a;
                }
                case 6: {
                    Object object1 = gqyc.b;
                    if(object1 == null) {
                        Class class0 = gqyc.class;
                        synchronized(class0) {
                            hfvs0 = gqyc.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqyc.a));
                                gqyc.b = hfvs0;
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

