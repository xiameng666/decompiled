public final class gkif extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkif a;
    private static volatile Parser b;

    static {
        gkif gkif0 = new gkif();
        gkif.a = gkif0;
        ProtoLiteMessage.L(gkif.class, ((ProtoLiteMessage)gkif0));
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
                    return new hfvw(((MessageLite)gkif.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkif();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkif.a));
                }
                case 5: {
                    return gkif.a;
                }
                case 6: {
                    Object object1 = gkif.b;
                    if(object1 == null) {
                        Class class0 = gkif.class;
                        synchronized(class0) {
                            hfvs0 = gkif.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkif.a));
                                gkif.b = hfvs0;
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

