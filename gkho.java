public final class gkho extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkho a;
    private static volatile Parser b;

    static {
        gkho gkho0 = new gkho();
        gkho.a = gkho0;
        ProtoLiteMessage.L(gkho.class, ((ProtoLiteMessage)gkho0));
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
                    return new hfvw(((MessageLite)gkho.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkho();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkho.a));
                }
                case 5: {
                    return gkho.a;
                }
                case 6: {
                    Object object1 = gkho.b;
                    if(object1 == null) {
                        Class class0 = gkho.class;
                        synchronized(class0) {
                            hfvs0 = gkho.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkho.a));
                                gkho.b = hfvs0;
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

