public final class hfkp extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hfkp a;
    private static volatile Parser b;

    static {
        hfkp hfkp0 = new hfkp();
        hfkp.a = hfkp0;
        ProtoLiteMessage.L(hfkp.class, ((ProtoLiteMessage)hfkp0));
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
                    return new hfvw(((MessageLite)hfkp.a), "\u0000\u0000", null);
                }
                case 3: {
                    return new hfkp();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hfkp.a));
                }
                case 5: {
                    return hfkp.a;
                }
                case 6: {
                    Object object1 = hfkp.b;
                    if(object1 == null) {
                        Class class0 = hfkp.class;
                        synchronized(class0) {
                            hfvs0 = hfkp.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hfkp.a));
                                hfkp.b = hfvs0;
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

