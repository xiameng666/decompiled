public final class gypn extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gypn a;
    private static volatile Parser b;

    static {
        gypn gypn0 = new gypn();
        gypn.a = gypn0;
        ProtoLiteMessage.L(gypn.class, ((ProtoLiteMessage)gypn0));
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
                    return new hfvw(((MessageLite)gypn.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gypn();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gypn.a));
                }
                case 5: {
                    return gypn.a;
                }
                case 6: {
                    Object object1 = gypn.b;
                    if(object1 == null) {
                        Class class0 = gypn.class;
                        synchronized(class0) {
                            hfvs0 = gypn.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gypn.a));
                                gypn.b = hfvs0;
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

