public final class gkhg extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkhg a;
    private static volatile Parser b;

    static {
        gkhg gkhg0 = new gkhg();
        gkhg.a = gkhg0;
        ProtoLiteMessage.L(gkhg.class, ((ProtoLiteMessage)gkhg0));
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
                    return new hfvw(((MessageLite)gkhg.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkhg();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkhg.a));
                }
                case 5: {
                    return gkhg.a;
                }
                case 6: {
                    Object object1 = gkhg.b;
                    if(object1 == null) {
                        Class class0 = gkhg.class;
                        synchronized(class0) {
                            hfvs0 = gkhg.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkhg.a));
                                gkhg.b = hfvs0;
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

