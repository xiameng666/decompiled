public final class gxyn extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gxyn a;
    private static volatile Parser b;

    static {
        gxyn gxyn0 = new gxyn();
        gxyn.a = gxyn0;
        ProtoLiteMessage.L(gxyn.class, ((ProtoLiteMessage)gxyn0));
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
                    return new hfvw(((MessageLite)gxyn.a), "\u0000\u0000", null);
                }
                case 3: {
                    return new gxyn();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gxyn.a));
                }
                case 5: {
                    return gxyn.a;
                }
                case 6: {
                    Object object1 = gxyn.b;
                    if(object1 == null) {
                        Class class0 = gxyn.class;
                        synchronized(class0) {
                            hfvs0 = gxyn.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gxyn.a));
                                gxyn.b = hfvs0;
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

