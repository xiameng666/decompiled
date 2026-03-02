public final class gkhh extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkhh a;
    private static volatile Parser b;

    static {
        gkhh gkhh0 = new gkhh();
        gkhh.a = gkhh0;
        ProtoLiteMessage.L(gkhh.class, ((ProtoLiteMessage)gkhh0));
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
                    return new hfvw(((MessageLite)gkhh.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkhh();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkhh.a));
                }
                case 5: {
                    return gkhh.a;
                }
                case 6: {
                    Object object1 = gkhh.b;
                    if(object1 == null) {
                        Class class0 = gkhh.class;
                        synchronized(class0) {
                            hfvs0 = gkhh.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkhh.a));
                                gkhh.b = hfvs0;
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

