public final class gkig extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkig a;
    private static volatile Parser b;

    static {
        gkig gkig0 = new gkig();
        gkig.a = gkig0;
        ProtoLiteMessage.L(gkig.class, ((ProtoLiteMessage)gkig0));
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
                    return new hfvw(((MessageLite)gkig.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkig();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkig.a));
                }
                case 5: {
                    return gkig.a;
                }
                case 6: {
                    Object object1 = gkig.b;
                    if(object1 == null) {
                        Class class0 = gkig.class;
                        synchronized(class0) {
                            hfvs0 = gkig.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkig.a));
                                gkig.b = hfvs0;
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

