public final class gskl extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gskl a;
    public int b;
    public int c;
    private static volatile Parser d;

    static {
        gskl gskl0 = new gskl();
        gskl.a = gskl0;
        ProtoLiteMessage.L(gskl.class, ((ProtoLiteMessage)gskl0));
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
                    return new hfvw(((MessageLite)gskl.a), "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", new Object[]{"b", "c"});
                }
                case 3: {
                    return new gskl();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gskl.a));
                }
                case 5: {
                    return gskl.a;
                }
                case 6: {
                    Object object1 = gskl.d;
                    if(object1 == null) {
                        Class class0 = gskl.class;
                        synchronized(class0) {
                            hfvs0 = gskl.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gskl.a));
                                gskl.d = hfvs0;
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

