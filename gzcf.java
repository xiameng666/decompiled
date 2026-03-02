public final class gzcf extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzcf a;
    private static volatile Parser b;

    static {
        gzcf gzcf0 = new gzcf();
        gzcf.a = gzcf0;
        ProtoLiteMessage.L(gzcf.class, ((ProtoLiteMessage)gzcf0));
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
                    return new hfvw(((MessageLite)gzcf.a), "\u0000\u0000", null);
                }
                case 3: {
                    return new gzcf();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gzcf.a));
                }
                case 5: {
                    return gzcf.a;
                }
                case 6: {
                    Object object1 = gzcf.b;
                    if(object1 == null) {
                        Class class0 = gzcf.class;
                        synchronized(class0) {
                            hfvs0 = gzcf.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzcf.a));
                                gzcf.b = hfvs0;
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

