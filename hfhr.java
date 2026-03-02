public final class hfhr extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hfhr a;
    private static volatile Parser b;

    static {
        hfhr hfhr0 = new hfhr();
        hfhr.a = hfhr0;
        ProtoLiteMessage.L(hfhr.class, ((ProtoLiteMessage)hfhr0));
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
                    return new hfvw(((MessageLite)hfhr.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hfhr();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hfhr.a));
                }
                case 5: {
                    return hfhr.a;
                }
                case 6: {
                    Object object1 = hfhr.b;
                    if(object1 == null) {
                        Class class0 = hfhr.class;
                        synchronized(class0) {
                            hfvs0 = hfhr.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hfhr.a));
                                hfhr.b = hfvs0;
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

