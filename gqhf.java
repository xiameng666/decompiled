public final class gqhf extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqhf a;
    public boolean b;
    public long c;
    private static volatile Parser d;

    static {
        gqhf gqhf0 = new gqhf();
        gqhf.a = gqhf0;
        ProtoLiteMessage.L(gqhf.class, ((ProtoLiteMessage)gqhf0));
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
                    return new hfvw(((MessageLite)gqhf.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0002", new Object[]{"b", "c"});
                }
                case 3: {
                    return new gqhf();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqhf.a));
                }
                case 5: {
                    return gqhf.a;
                }
                case 6: {
                    Object object1 = gqhf.d;
                    if(object1 == null) {
                        Class class0 = gqhf.class;
                        synchronized(class0) {
                            hfvs0 = gqhf.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqhf.a));
                                gqhf.d = hfvs0;
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

