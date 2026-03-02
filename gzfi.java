public final class gzfi extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzfi a;
    public boolean b;
    public boolean c;
    public boolean d;
    private static volatile Parser e;

    static {
        gzfi gzfi0 = new gzfi();
        gzfi.a = gzfi0;
        ProtoLiteMessage.L(gzfi.class, ((ProtoLiteMessage)gzfi0));
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
                    return new hfvw(((MessageLite)gzfi.a), "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"b", "c", "d"});
                }
                case 3: {
                    return new gzfi();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gzfi.a));
                }
                case 5: {
                    return gzfi.a;
                }
                case 6: {
                    Object object1 = gzfi.e;
                    if(object1 == null) {
                        Class class0 = gzfi.class;
                        synchronized(class0) {
                            hfvs0 = gzfi.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzfi.a));
                                gzfi.e = hfvs0;
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

