public final class gyor extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gyor a;
    private static volatile Parser b;

    static {
        gyor gyor0 = new gyor();
        gyor.a = gyor0;
        ProtoLiteMessage.L(gyor.class, ((ProtoLiteMessage)gyor0));
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
                    return new hfvw(((MessageLite)gyor.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new gyor();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gyor.a));
                }
                case 5: {
                    return gyor.a;
                }
                case 6: {
                    Object object1 = gyor.b;
                    if(object1 == null) {
                        Class class0 = gyor.class;
                        synchronized(class0) {
                            hfvs0 = gyor.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gyor.a));
                                gyor.b = hfvs0;
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

