public final class gkgz extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkgz a;
    private static volatile Parser b;

    static {
        gkgz gkgz0 = new gkgz();
        gkgz.a = gkgz0;
        ProtoLiteMessage.L(gkgz.class, ((ProtoLiteMessage)gkgz0));
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
                    return new hfvw(((MessageLite)gkgz.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkgz();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkgz.a));
                }
                case 5: {
                    return gkgz.a;
                }
                case 6: {
                    Object object1 = gkgz.b;
                    if(object1 == null) {
                        Class class0 = gkgz.class;
                        synchronized(class0) {
                            hfvs0 = gkgz.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkgz.a));
                                gkgz.b = hfvs0;
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

