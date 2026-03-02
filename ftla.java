public final class ftla extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ftla a;
    public boolean b;
    private static volatile Parser c;

    static {
        ftla ftla0 = new ftla();
        ftla.a = ftla0;
        ProtoLiteMessage.L(ftla.class, ((ProtoLiteMessage)ftla0));
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
                    return new hfvw(((MessageLite)ftla.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"b"});
                }
                case 3: {
                    return new ftla();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ftla.a));
                }
                case 5: {
                    return ftla.a;
                }
                case 6: {
                    Object object1 = ftla.c;
                    if(object1 == null) {
                        Class class0 = ftla.class;
                        synchronized(class0) {
                            hfvs0 = ftla.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ftla.a));
                                ftla.c = hfvs0;
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

