public final class ftpr extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ftpr a;
    private static volatile Parser b;

    static {
        ftpr ftpr0 = new ftpr();
        ftpr.a = ftpr0;
        ProtoLiteMessage.L(ftpr.class, ((ProtoLiteMessage)ftpr0));
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
                    return new hfvw(((MessageLite)ftpr.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new ftpr();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ftpr.a));
                }
                case 5: {
                    return ftpr.a;
                }
                case 6: {
                    Object object1 = ftpr.b;
                    if(object1 == null) {
                        Class class0 = ftpr.class;
                        synchronized(class0) {
                            hfvs0 = ftpr.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ftpr.a));
                                ftpr.b = hfvs0;
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

