public final class gkgq extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkgq a;
    private static volatile Parser b;

    static {
        gkgq gkgq0 = new gkgq();
        gkgq.a = gkgq0;
        ProtoLiteMessage.L(gkgq.class, ((ProtoLiteMessage)gkgq0));
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
                    return new hfvw(((MessageLite)gkgq.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkgq();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkgq.a));
                }
                case 5: {
                    return gkgq.a;
                }
                case 6: {
                    Object object1 = gkgq.b;
                    if(object1 == null) {
                        Class class0 = gkgq.class;
                        synchronized(class0) {
                            hfvs0 = gkgq.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkgq.a));
                                gkgq.b = hfvs0;
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

