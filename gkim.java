public final class gkim extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkim a;
    private static volatile Parser b;

    static {
        gkim gkim0 = new gkim();
        gkim.a = gkim0;
        ProtoLiteMessage.L(gkim.class, ((ProtoLiteMessage)gkim0));
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
                    return new hfvw(((MessageLite)gkim.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkim();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkim.a));
                }
                case 5: {
                    return gkim.a;
                }
                case 6: {
                    Object object1 = gkim.b;
                    if(object1 == null) {
                        Class class0 = gkim.class;
                        synchronized(class0) {
                            hfvs0 = gkim.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkim.a));
                                gkim.b = hfvs0;
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

