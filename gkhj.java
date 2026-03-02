public final class gkhj extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkhj a;
    private static volatile Parser b;

    static {
        gkhj gkhj0 = new gkhj();
        gkhj.a = gkhj0;
        ProtoLiteMessage.L(gkhj.class, ((ProtoLiteMessage)gkhj0));
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
                    return new hfvw(((MessageLite)gkhj.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkhj();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkhj.a));
                }
                case 5: {
                    return gkhj.a;
                }
                case 6: {
                    Object object1 = gkhj.b;
                    if(object1 == null) {
                        Class class0 = gkhj.class;
                        synchronized(class0) {
                            hfvs0 = gkhj.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkhj.a));
                                gkhj.b = hfvs0;
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

