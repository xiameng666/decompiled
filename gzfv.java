public final class gzfv extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzfv a;
    public boolean b;
    public boolean c;
    private static volatile Parser d;

    static {
        gzfv gzfv0 = new gzfv();
        gzfv.a = gzfv0;
        ProtoLiteMessage.L(gzfv.class, ((ProtoLiteMessage)gzfv0));
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
                    return new hfvw(((MessageLite)gzfv.a), "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"b", "c"});
                }
                case 3: {
                    return new gzfv();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gzfv.a));
                }
                case 5: {
                    return gzfv.a;
                }
                case 6: {
                    Object object1 = gzfv.d;
                    if(object1 == null) {
                        Class class0 = gzfv.class;
                        synchronized(class0) {
                            hfvs0 = gzfv.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzfv.a));
                                gzfv.d = hfvs0;
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

