public final class grfp extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final grfp a;
    public int b;
    private static volatile Parser c;

    static {
        grfp grfp0 = new grfp();
        grfp.a = grfp0;
        ProtoLiteMessage.L(grfp.class, ((ProtoLiteMessage)grfp0));
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
                    return new hfvw(((MessageLite)grfp.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"b"});
                }
                case 3: {
                    return new grfp();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)grfp.a));
                }
                case 5: {
                    return grfp.a;
                }
                case 6: {
                    Object object1 = grfp.c;
                    if(object1 == null) {
                        Class class0 = grfp.class;
                        synchronized(class0) {
                            hfvs0 = grfp.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)grfp.a));
                                grfp.c = hfvs0;
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

