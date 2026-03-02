public final class gzzq extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzzq a;
    public int b;
    private static volatile Parser c;

    static {
        gzzq gzzq0 = new gzzq();
        gzzq.a = gzzq0;
        ProtoLiteMessage.L(gzzq.class, ((ProtoLiteMessage)gzzq0));
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
                    return new hfvw(((MessageLite)gzzq.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"b"});
                }
                case 3: {
                    return new gzzq();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gzzq.a));
                }
                case 5: {
                    return gzzq.a;
                }
                case 6: {
                    Object object1 = gzzq.c;
                    if(object1 == null) {
                        Class class0 = gzzq.class;
                        synchronized(class0) {
                            hfvs0 = gzzq.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzzq.a));
                                gzzq.c = hfvs0;
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

