public final class gkhb extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkhb a;
    private static volatile Parser b;

    static {
        gkhb gkhb0 = new gkhb();
        gkhb.a = gkhb0;
        ProtoLiteMessage.L(gkhb.class, ((ProtoLiteMessage)gkhb0));
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
                    return new hfvw(((MessageLite)gkhb.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkhb();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkhb.a));
                }
                case 5: {
                    return gkhb.a;
                }
                case 6: {
                    Object object1 = gkhb.b;
                    if(object1 == null) {
                        Class class0 = gkhb.class;
                        synchronized(class0) {
                            hfvs0 = gkhb.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkhb.a));
                                gkhb.b = hfvs0;
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

