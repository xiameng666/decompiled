public final class gskm extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gskm a;
    public boolean b;
    private static volatile Parser c;

    static {
        gskm gskm0 = new gskm();
        gskm.a = gskm0;
        ProtoLiteMessage.L(gskm.class, ((ProtoLiteMessage)gskm0));
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
                    return new hfvw(((MessageLite)gskm.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"b"});
                }
                case 3: {
                    return new gskm();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gskm.a));
                }
                case 5: {
                    return gskm.a;
                }
                case 6: {
                    Object object1 = gskm.c;
                    if(object1 == null) {
                        Class class0 = gskm.class;
                        synchronized(class0) {
                            hfvs0 = gskm.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gskm.a));
                                gskm.c = hfvs0;
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

