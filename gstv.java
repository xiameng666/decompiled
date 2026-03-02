public final class gstv extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gstv a;
    public int b;
    private static volatile Parser c;

    static {
        gstv gstv0 = new gstv();
        gstv.a = gstv0;
        ProtoLiteMessage.L(gstv.class, ((ProtoLiteMessage)gstv0));
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
                    return new hfvw(((MessageLite)gstv.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"b"});
                }
                case 3: {
                    return new gstv();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gstv.a));
                }
                case 5: {
                    return gstv.a;
                }
                case 6: {
                    Object object1 = gstv.c;
                    if(object1 == null) {
                        Class class0 = gstv.class;
                        synchronized(class0) {
                            hfvs0 = gstv.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gstv.a));
                                gstv.c = hfvs0;
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

