public final class gxyr extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gxyr a;
    public boolean b;
    public boolean c;
    public boolean d;
    private static volatile Parser e;

    static {
        gxyr gxyr0 = new gxyr();
        gxyr.a = gxyr0;
        ProtoLiteMessage.L(gxyr.class, ((ProtoLiteMessage)gxyr0));
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
                    return new hfvw(((MessageLite)gxyr.a), "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new Object[]{"b", "c", "d"});
                }
                case 3: {
                    return new gxyr();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gxyr.a));
                }
                case 5: {
                    return gxyr.a;
                }
                case 6: {
                    Object object1 = gxyr.e;
                    if(object1 == null) {
                        Class class0 = gxyr.class;
                        synchronized(class0) {
                            hfvs0 = gxyr.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gxyr.a));
                                gxyr.e = hfvs0;
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

