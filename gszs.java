public final class gszs extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gszs a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    private static volatile Parser f;

    static {
        gszs gszs0 = new gszs();
        gszs.a = gszs0;
        ProtoLiteMessage.L(gszs.class, ((ProtoLiteMessage)gszs0));
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
                    return new hfvw(((MessageLite)gszs.a), "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001\u0007\u0004\u0007\u0005\f\u0006\f", new Object[]{"b", "c", "d", "e"});
                }
                case 3: {
                    return new gszs();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gszs.a));
                }
                case 5: {
                    return gszs.a;
                }
                case 6: {
                    Object object1 = gszs.f;
                    if(object1 == null) {
                        Class class0 = gszs.class;
                        synchronized(class0) {
                            hfvs0 = gszs.f;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gszs.a));
                                gszs.f = hfvs0;
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

