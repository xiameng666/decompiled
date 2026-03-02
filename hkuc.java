public final class hkuc extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkuc a;
    public int b;
    public long c;
    private static volatile Parser d;

    static {
        hkuc hkuc0 = new hkuc();
        hkuc.a = hkuc0;
        ProtoLiteMessage.L(hkuc.class, ((ProtoLiteMessage)hkuc0));
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
                    return new hfvw(((MessageLite)hkuc.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"b", "c"});
                }
                case 3: {
                    return new hkuc();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkuc.a));
                }
                case 5: {
                    return hkuc.a;
                }
                case 6: {
                    Object object1 = hkuc.d;
                    if(object1 == null) {
                        Class class0 = hkuc.class;
                        synchronized(class0) {
                            hfvs0 = hkuc.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkuc.a));
                                hkuc.d = hfvs0;
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

