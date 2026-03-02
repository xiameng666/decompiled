public final class hkda extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkda a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    private static volatile Parser f;

    static {
        hkda hkda0 = new hkda();
        hkda.a = hkda0;
        ProtoLiteMessage.L(hkda.class, ((ProtoLiteMessage)hkda0));
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
                    return new hfvw(((MessageLite)hkda.a), "\u0004\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001\f\u0004\u0007\u0005\u0007\u0006\u0007", new Object[]{"b", "c", "d", "e"});
                }
                case 3: {
                    return new hkda();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkda.a));
                }
                case 5: {
                    return hkda.a;
                }
                case 6: {
                    Object object1 = hkda.f;
                    if(object1 == null) {
                        Class class0 = hkda.class;
                        synchronized(class0) {
                            hfvs0 = hkda.f;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkda.a));
                                hkda.f = hfvs0;
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

