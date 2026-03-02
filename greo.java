public final class greo extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final greo a;
    private static volatile Parser b;
    private boolean c;

    static {
        greo greo0 = new greo();
        greo.a = greo0;
        ProtoLiteMessage.L(greo.class, ((ProtoLiteMessage)greo0));
    }

    public static void b(greo greo0) {
        greo0.c = true;
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
                    return new hfvw(((MessageLite)greo.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"c"});
                }
                case 3: {
                    return new greo();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)greo.a));
                }
                case 5: {
                    return greo.a;
                }
                case 6: {
                    Object object1 = greo.b;
                    if(object1 == null) {
                        Class class0 = greo.class;
                        synchronized(class0) {
                            hfvs0 = greo.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)greo.a));
                                greo.b = hfvs0;
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

