public final class hknj extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hknj a;
    public int b;
    private static volatile Parser c;

    static {
        hknj hknj0 = new hknj();
        hknj.a = hknj0;
        ProtoLiteMessage.L(hknj.class, ((ProtoLiteMessage)hknj0));
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
                    return new hfvw(((MessageLite)hknj.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"b"});
                }
                case 3: {
                    return new hknj();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hknj.a));
                }
                case 5: {
                    return hknj.a;
                }
                case 6: {
                    Object object1 = hknj.c;
                    if(object1 == null) {
                        Class class0 = hknj.class;
                        synchronized(class0) {
                            hfvs0 = hknj.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hknj.a));
                                hknj.c = hfvs0;
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

