public final class gkgn extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkgn a;
    private static volatile Parser b;

    static {
        gkgn gkgn0 = new gkgn();
        gkgn.a = gkgn0;
        ProtoLiteMessage.L(gkgn.class, ((ProtoLiteMessage)gkgn0));
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
                    return new hfvw(((MessageLite)gkgn.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkgn();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkgn.a));
                }
                case 5: {
                    return gkgn.a;
                }
                case 6: {
                    Object object1 = gkgn.b;
                    if(object1 == null) {
                        Class class0 = gkgn.class;
                        synchronized(class0) {
                            hfvs0 = gkgn.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkgn.a));
                                gkgn.b = hfvs0;
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

