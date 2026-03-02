public final class gkgu extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gkgu a;
    private static volatile Parser b;

    static {
        gkgu gkgu0 = new gkgu();
        gkgu.a = gkgu0;
        ProtoLiteMessage.L(gkgu.class, ((ProtoLiteMessage)gkgu0));
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
                    return new hfvw(((MessageLite)gkgu.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gkgu();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gkgu.a));
                }
                case 5: {
                    return gkgu.a;
                }
                case 6: {
                    Object object1 = gkgu.b;
                    if(object1 == null) {
                        Class class0 = gkgu.class;
                        synchronized(class0) {
                            hfvs0 = gkgu.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gkgu.a));
                                gkgu.b = hfvs0;
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

