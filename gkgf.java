public final class gkgf extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkgf a;
    private static volatile Parser b;

    static {
        gkgf gkgf0 = new gkgf();
        gkgf.a = gkgf0;
        ProtoLiteMessage.L(gkgf.class, ((ProtoLiteMessage)gkgf0));
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
                    return new hfvw(((MessageLite)gkgf.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkgf();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkgf.a));
                }
                case 5: {
                    return gkgf.a;
                }
                case 6: {
                    Object object1 = gkgf.b;
                    if(object1 == null) {
                        Class class0 = gkgf.class;
                        synchronized(class0) {
                            hfvs0 = gkgf.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkgf.a));
                                gkgf.b = hfvs0;
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

