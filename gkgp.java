public final class gkgp extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkgp a;
    private static volatile Parser b;

    static {
        gkgp gkgp0 = new gkgp();
        gkgp.a = gkgp0;
        ProtoLiteMessage.L(gkgp.class, ((ProtoLiteMessage)gkgp0));
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
                    return new hfvw(((MessageLite)gkgp.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkgp();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkgp.a));
                }
                case 5: {
                    return gkgp.a;
                }
                case 6: {
                    Object object1 = gkgp.b;
                    if(object1 == null) {
                        Class class0 = gkgp.class;
                        synchronized(class0) {
                            hfvs0 = gkgp.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkgp.a));
                                gkgp.b = hfvs0;
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

