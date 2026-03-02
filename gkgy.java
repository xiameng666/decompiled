public final class gkgy extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkgy a;
    private static volatile Parser b;

    static {
        gkgy gkgy0 = new gkgy();
        gkgy.a = gkgy0;
        ProtoLiteMessage.L(gkgy.class, ((ProtoLiteMessage)gkgy0));
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
                    return new hfvw(((MessageLite)gkgy.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkgy();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkgy.a));
                }
                case 5: {
                    return gkgy.a;
                }
                case 6: {
                    Object object1 = gkgy.b;
                    if(object1 == null) {
                        Class class0 = gkgy.class;
                        synchronized(class0) {
                            hfvs0 = gkgy.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkgy.a));
                                gkgy.b = hfvs0;
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

