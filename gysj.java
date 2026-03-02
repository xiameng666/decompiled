public final class gysj extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gysj a;
    private static volatile Parser b;

    static {
        gysj gysj0 = new gysj();
        gysj.a = gysj0;
        ProtoLiteMessage.L(gysj.class, ((ProtoLiteMessage)gysj0));
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
                    return new hfvw(((MessageLite)gysj.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gysj();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gysj.a));
                }
                case 5: {
                    return gysj.a;
                }
                case 6: {
                    Object object1 = gysj.b;
                    if(object1 == null) {
                        Class class0 = gysj.class;
                        synchronized(class0) {
                            hfvs0 = gysj.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gysj.a));
                                gysj.b = hfvs0;
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

