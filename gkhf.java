public final class gkhf extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkhf a;
    private static volatile Parser b;

    static {
        gkhf gkhf0 = new gkhf();
        gkhf.a = gkhf0;
        ProtoLiteMessage.L(gkhf.class, ((ProtoLiteMessage)gkhf0));
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
                    return new hfvw(((MessageLite)gkhf.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkhf();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkhf.a));
                }
                case 5: {
                    return gkhf.a;
                }
                case 6: {
                    Object object1 = gkhf.b;
                    if(object1 == null) {
                        Class class0 = gkhf.class;
                        synchronized(class0) {
                            hfvs0 = gkhf.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkhf.a));
                                gkhf.b = hfvs0;
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

