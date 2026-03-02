public final class gqlc extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqlc a;
    public boolean b;
    private static volatile Parser c;

    static {
        gqlc gqlc0 = new gqlc();
        gqlc.a = gqlc0;
        ProtoLiteMessage.L(gqlc.class, ((ProtoLiteMessage)gqlc0));
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
                    return new hfvw(((MessageLite)gqlc.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"b"});
                }
                case 3: {
                    return new gqlc();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqlc.a));
                }
                case 5: {
                    return gqlc.a;
                }
                case 6: {
                    Object object1 = gqlc.c;
                    if(object1 == null) {
                        Class class0 = gqlc.class;
                        synchronized(class0) {
                            hfvs0 = gqlc.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqlc.a));
                                gqlc.c = hfvs0;
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

