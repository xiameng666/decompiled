public final class hevd extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hevd a;
    private static volatile Parser b;

    static {
        hevd hevd0 = new hevd();
        hevd.a = hevd0;
        ProtoLiteMessage.L(hevd.class, ((ProtoLiteMessage)hevd0));
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
                    return new hfvw(((MessageLite)hevd.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new hevd();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hevd.a));
                }
                case 5: {
                    return hevd.a;
                }
                case 6: {
                    Object object1 = hevd.b;
                    if(object1 == null) {
                        Class class0 = hevd.class;
                        synchronized(class0) {
                            hfvs0 = hevd.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hevd.a));
                                hevd.b = hfvs0;
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

