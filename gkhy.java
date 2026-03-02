public final class gkhy extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkhy a;
    private static volatile Parser b;

    static {
        gkhy gkhy0 = new gkhy();
        gkhy.a = gkhy0;
        ProtoLiteMessage.L(gkhy.class, ((ProtoLiteMessage)gkhy0));
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
                    return new hfvw(((MessageLite)gkhy.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkhy();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkhy.a));
                }
                case 5: {
                    return gkhy.a;
                }
                case 6: {
                    Object object1 = gkhy.b;
                    if(object1 == null) {
                        Class class0 = gkhy.class;
                        synchronized(class0) {
                            hfvs0 = gkhy.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkhy.a));
                                gkhy.b = hfvs0;
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

