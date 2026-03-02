public final class gkhe extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkhe a;
    private static volatile Parser b;

    static {
        gkhe gkhe0 = new gkhe();
        gkhe.a = gkhe0;
        ProtoLiteMessage.L(gkhe.class, ((ProtoLiteMessage)gkhe0));
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
                    return new hfvw(((MessageLite)gkhe.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkhe();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkhe.a));
                }
                case 5: {
                    return gkhe.a;
                }
                case 6: {
                    Object object1 = gkhe.b;
                    if(object1 == null) {
                        Class class0 = gkhe.class;
                        synchronized(class0) {
                            hfvs0 = gkhe.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkhe.a));
                                gkhe.b = hfvs0;
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

