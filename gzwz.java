public final class gzwz extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzwz a;
    private static volatile Parser b;

    static {
        gzwz gzwz0 = new gzwz();
        gzwz.a = gzwz0;
        ProtoLiteMessage.L(gzwz.class, ((ProtoLiteMessage)gzwz0));
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
                    return new hfvw(((MessageLite)gzwz.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gzwz();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gzwz.a));
                }
                case 5: {
                    return gzwz.a;
                }
                case 6: {
                    Object object1 = gzwz.b;
                    if(object1 == null) {
                        Class class0 = gzwz.class;
                        synchronized(class0) {
                            hfvs0 = gzwz.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzwz.a));
                                gzwz.b = hfvs0;
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

