public final class gzsv extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzsv a;
    private static volatile Parser b;

    static {
        gzsv gzsv0 = new gzsv();
        gzsv.a = gzsv0;
        ProtoLiteMessage.L(gzsv.class, ((ProtoLiteMessage)gzsv0));
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
                    return new hfvw(((MessageLite)gzsv.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gzsv();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gzsv.a));
                }
                case 5: {
                    return gzsv.a;
                }
                case 6: {
                    Object object1 = gzsv.b;
                    if(object1 == null) {
                        Class class0 = gzsv.class;
                        synchronized(class0) {
                            hfvs0 = gzsv.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzsv.a));
                                gzsv.b = hfvs0;
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

