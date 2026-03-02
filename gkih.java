public final class gkih extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkih a;
    private static volatile Parser b;

    static {
        gkih gkih0 = new gkih();
        gkih.a = gkih0;
        ProtoLiteMessage.L(gkih.class, ((ProtoLiteMessage)gkih0));
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
                    return new hfvw(((MessageLite)gkih.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkih();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkih.a));
                }
                case 5: {
                    return gkih.a;
                }
                case 6: {
                    Object object1 = gkih.b;
                    if(object1 == null) {
                        Class class0 = gkih.class;
                        synchronized(class0) {
                            hfvs0 = gkih.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkih.a));
                                gkih.b = hfvs0;
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

