public final class gzhe extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzhe a;
    private static volatile Parser b;

    static {
        gzhe gzhe0 = new gzhe();
        gzhe.a = gzhe0;
        ProtoLiteMessage.L(gzhe.class, ((ProtoLiteMessage)gzhe0));
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
                    return new hfvw(((MessageLite)gzhe.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new gzhe();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gzhe.a));
                }
                case 5: {
                    return gzhe.a;
                }
                case 6: {
                    Object object1 = gzhe.b;
                    if(object1 == null) {
                        Class class0 = gzhe.class;
                        synchronized(class0) {
                            hfvs0 = gzhe.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzhe.a));
                                gzhe.b = hfvs0;
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

