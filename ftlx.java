public final class ftlx extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ftlx a;
    public int b;
    public boolean c;
    private static volatile Parser d;

    static {
        ftlx ftlx0 = new ftlx();
        ftlx.a = ftlx0;
        ProtoLiteMessage.L(ftlx.class, ((ProtoLiteMessage)ftlx0));
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
                    return new hfvw(((MessageLite)ftlx.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0007", new Object[]{"b", "c"});
                }
                case 3: {
                    return new ftlx();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ftlx.a));
                }
                case 5: {
                    return ftlx.a;
                }
                case 6: {
                    Object object1 = ftlx.d;
                    if(object1 == null) {
                        Class class0 = ftlx.class;
                        synchronized(class0) {
                            hfvs0 = ftlx.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ftlx.a));
                                ftlx.d = hfvs0;
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

