public final class gxtj extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gxtj a;
    public long b;
    private static volatile Parser c;

    static {
        gxtj gxtj0 = new gxtj();
        gxtj.a = gxtj0;
        ProtoLiteMessage.L(gxtj.class, ((ProtoLiteMessage)gxtj0));
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
                    return new hfvw(((MessageLite)gxtj.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"b"});
                }
                case 3: {
                    return new gxtj();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gxtj.a));
                }
                case 5: {
                    return gxtj.a;
                }
                case 6: {
                    Object object1 = gxtj.c;
                    if(object1 == null) {
                        Class class0 = gxtj.class;
                        synchronized(class0) {
                            hfvs0 = gxtj.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gxtj.a));
                                gxtj.c = hfvs0;
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

