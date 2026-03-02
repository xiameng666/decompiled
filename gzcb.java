public final class gzcb extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzcb a;
    private static volatile Parser b;

    static {
        gzcb gzcb0 = new gzcb();
        gzcb.a = gzcb0;
        ProtoLiteMessage.L(gzcb.class, ((ProtoLiteMessage)gzcb0));
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
                    return new hfvw(((MessageLite)gzcb.a), "\u0000\u0000", null);
                }
                case 3: {
                    return new gzcb();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gzcb.a));
                }
                case 5: {
                    return gzcb.a;
                }
                case 6: {
                    Object object1 = gzcb.b;
                    if(object1 == null) {
                        Class class0 = gzcb.class;
                        synchronized(class0) {
                            hfvs0 = gzcb.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzcb.a));
                                gzcb.b = hfvs0;
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

