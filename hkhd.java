public final class hkhd extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkhd a;
    public int b;
    public int c;
    private static volatile Parser d;

    static {
        hkhd hkhd0 = new hkhd();
        hkhd.a = hkhd0;
        ProtoLiteMessage.L(hkhd.class, ((ProtoLiteMessage)hkhd0));
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
                    return new hfvw(((MessageLite)hkhd.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"b", "c"});
                }
                case 3: {
                    return new hkhd();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkhd.a));
                }
                case 5: {
                    return hkhd.a;
                }
                case 6: {
                    Object object1 = hkhd.d;
                    if(object1 == null) {
                        Class class0 = hkhd.class;
                        synchronized(class0) {
                            hfvs0 = hkhd.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkhd.a));
                                hkhd.d = hfvs0;
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

