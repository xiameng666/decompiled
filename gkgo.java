public final class gkgo extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkgo a;
    private static volatile Parser b;

    static {
        gkgo gkgo0 = new gkgo();
        gkgo.a = gkgo0;
        ProtoLiteMessage.L(gkgo.class, ((ProtoLiteMessage)gkgo0));
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
                    return new hfvw(((MessageLite)gkgo.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkgo();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkgo.a));
                }
                case 5: {
                    return gkgo.a;
                }
                case 6: {
                    Object object1 = gkgo.b;
                    if(object1 == null) {
                        Class class0 = gkgo.class;
                        synchronized(class0) {
                            hfvs0 = gkgo.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkgo.a));
                                gkgo.b = hfvs0;
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

