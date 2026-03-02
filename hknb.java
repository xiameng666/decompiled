public final class hknb extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hknb a;
    public int b;
    private static volatile Parser c;

    static {
        hknb hknb0 = new hknb();
        hknb.a = hknb0;
        ProtoLiteMessage.L(hknb.class, ((ProtoLiteMessage)hknb0));
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
                    return new hfvw(((MessageLite)hknb.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"b"});
                }
                case 3: {
                    return new hknb();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hknb.a));
                }
                case 5: {
                    return hknb.a;
                }
                case 6: {
                    Object object1 = hknb.c;
                    if(object1 == null) {
                        Class class0 = hknb.class;
                        synchronized(class0) {
                            hfvs0 = hknb.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hknb.a));
                                hknb.c = hfvs0;
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

