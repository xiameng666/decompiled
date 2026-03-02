public final class gkgt extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkgt a;
    private static volatile Parser b;

    static {
        gkgt gkgt0 = new gkgt();
        gkgt.a = gkgt0;
        ProtoLiteMessage.L(gkgt.class, ((ProtoLiteMessage)gkgt0));
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
                    return new hfvw(((MessageLite)gkgt.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkgt();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkgt.a));
                }
                case 5: {
                    return gkgt.a;
                }
                case 6: {
                    Object object1 = gkgt.b;
                    if(object1 == null) {
                        Class class0 = gkgt.class;
                        synchronized(class0) {
                            hfvs0 = gkgt.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkgt.a));
                                gkgt.b = hfvs0;
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

