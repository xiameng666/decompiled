public final class gkgr extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkgr a;
    private static volatile Parser b;

    static {
        gkgr gkgr0 = new gkgr();
        gkgr.a = gkgr0;
        ProtoLiteMessage.L(gkgr.class, ((ProtoLiteMessage)gkgr0));
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
                    return new hfvw(((MessageLite)gkgr.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkgr();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkgr.a));
                }
                case 5: {
                    return gkgr.a;
                }
                case 6: {
                    Object object1 = gkgr.b;
                    if(object1 == null) {
                        Class class0 = gkgr.class;
                        synchronized(class0) {
                            hfvs0 = gkgr.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkgr.a));
                                gkgr.b = hfvs0;
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

