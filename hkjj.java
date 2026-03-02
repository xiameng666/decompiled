public final class hkjj extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkjj a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    private static volatile Parser f;

    static {
        hkjj hkjj0 = new hkjj();
        hkjj.a = hkjj0;
        ProtoLiteMessage.L(hkjj.class, ((ProtoLiteMessage)hkjj0));
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
                    return new hfvw(((MessageLite)hkjj.a), "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"b", "c", "d", "e"});
                }
                case 3: {
                    return new hkjj();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkjj.a));
                }
                case 5: {
                    return hkjj.a;
                }
                case 6: {
                    Object object1 = hkjj.f;
                    if(object1 == null) {
                        Class class0 = hkjj.class;
                        synchronized(class0) {
                            hfvs0 = hkjj.f;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkjj.a));
                                hkjj.f = hfvs0;
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

