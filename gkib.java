public final class gkib extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkib a;
    private static volatile Parser b;

    static {
        gkib gkib0 = new gkib();
        gkib.a = gkib0;
        ProtoLiteMessage.L(gkib.class, ((ProtoLiteMessage)gkib0));
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
                    return new hfvw(((MessageLite)gkib.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkib();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkib.a));
                }
                case 5: {
                    return gkib.a;
                }
                case 6: {
                    Object object1 = gkib.b;
                    if(object1 == null) {
                        Class class0 = gkib.class;
                        synchronized(class0) {
                            hfvs0 = gkib.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkib.a));
                                gkib.b = hfvs0;
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

