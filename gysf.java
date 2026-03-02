public final class gysf extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gysf a;
    private static volatile Parser b;

    static {
        gysf gysf0 = new gysf();
        gysf.a = gysf0;
        ProtoLiteMessage.L(gysf.class, ((ProtoLiteMessage)gysf0));
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
                    return new hfvw(((MessageLite)gysf.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gysf();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gysf.a));
                }
                case 5: {
                    return gysf.a;
                }
                case 6: {
                    Object object1 = gysf.b;
                    if(object1 == null) {
                        Class class0 = gysf.class;
                        synchronized(class0) {
                            hfvs0 = gysf.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gysf.a));
                                gysf.b = hfvs0;
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

