public final class gkhi extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkhi a;
    private static volatile Parser b;

    static {
        gkhi gkhi0 = new gkhi();
        gkhi.a = gkhi0;
        ProtoLiteMessage.L(gkhi.class, ((ProtoLiteMessage)gkhi0));
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
                    return new hfvw(((MessageLite)gkhi.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkhi();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkhi.a));
                }
                case 5: {
                    return gkhi.a;
                }
                case 6: {
                    Object object1 = gkhi.b;
                    if(object1 == null) {
                        Class class0 = gkhi.class;
                        synchronized(class0) {
                            hfvs0 = gkhi.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkhi.a));
                                gkhi.b = hfvs0;
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

