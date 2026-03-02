public final class gtbo extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gtbo a;
    public int b;
    public int c;
    private static volatile Parser d;

    static {
        gtbo gtbo0 = new gtbo();
        gtbo.a = gtbo0;
        ProtoLiteMessage.L(gtbo.class, ((ProtoLiteMessage)gtbo0));
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
                    return new hfvw(((MessageLite)gtbo.a), "\u0000\u0002\u0000\u0000\u0001\u0004\u0002\u0000\u0000\u0000\u0001\f\u0004\f", new Object[]{"c", "b"});
                }
                case 3: {
                    return new gtbo();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gtbo.a));
                }
                case 5: {
                    return gtbo.a;
                }
                case 6: {
                    Object object1 = gtbo.d;
                    if(object1 == null) {
                        Class class0 = gtbo.class;
                        synchronized(class0) {
                            hfvs0 = gtbo.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gtbo.a));
                                gtbo.d = hfvs0;
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

