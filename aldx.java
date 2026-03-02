public final class aldx extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final aldx a;
    public int b;
    private static volatile Parser c;

    static {
        aldx aldx0 = new aldx();
        aldx.a = aldx0;
        ProtoLiteMessage.L(aldx.class, ((ProtoLiteMessage)aldx0));
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
                    return new hfvw(((MessageLite)aldx.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"b"});
                }
                case 3: {
                    return new aldx();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)aldx.a));
                }
                case 5: {
                    return aldx.a;
                }
                case 6: {
                    Object object1 = aldx.c;
                    if(object1 == null) {
                        Class class0 = aldx.class;
                        synchronized(class0) {
                            hfvs0 = aldx.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)aldx.a));
                                aldx.c = hfvs0;
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

