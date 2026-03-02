public final class hkkk extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkkk a;
    public long b;
    private static volatile Parser c;

    static {
        hkkk hkkk0 = new hkkk();
        hkkk.a = hkkk0;
        ProtoLiteMessage.L(hkkk.class, ((ProtoLiteMessage)hkkk0));
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
                    return new hfvw(((MessageLite)hkkk.a), "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0002", new Object[]{"b"});
                }
                case 3: {
                    return new hkkk();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkkk.a));
                }
                case 5: {
                    return hkkk.a;
                }
                case 6: {
                    Object object1 = hkkk.c;
                    if(object1 == null) {
                        Class class0 = hkkk.class;
                        synchronized(class0) {
                            hfvs0 = hkkk.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkkk.a));
                                hkkk.c = hfvs0;
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

