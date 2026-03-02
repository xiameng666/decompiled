public final class gtat extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gtat a;
    public int b;
    public int c;
    public int d;
    public float e;
    private static volatile Parser f;

    static {
        gtat gtat0 = new gtat();
        gtat.a = gtat0;
        ProtoLiteMessage.L(gtat.class, ((ProtoLiteMessage)gtat0));
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
                    return new hfvw(((MessageLite)gtat.a), "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\r\u0002\r\u0003\u0004\u0004\u0001", new Object[]{"b", "c", "d", "e"});
                }
                case 3: {
                    return new gtat();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gtat.a));
                }
                case 5: {
                    return gtat.a;
                }
                case 6: {
                    Object object1 = gtat.f;
                    if(object1 == null) {
                        Class class0 = gtat.class;
                        synchronized(class0) {
                            hfvs0 = gtat.f;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gtat.a));
                                gtat.f = hfvs0;
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

