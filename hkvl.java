public final class hkvl extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkvl a;
    private static volatile Parser b;

    static {
        hkvl hkvl0 = new hkvl();
        hkvl.a = hkvl0;
        ProtoLiteMessage.L(hkvl.class, ((ProtoLiteMessage)hkvl0));
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
                    return new hfvw(((MessageLite)hkvl.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hkvl();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkvl.a));
                }
                case 5: {
                    return hkvl.a;
                }
                case 6: {
                    Object object1 = hkvl.b;
                    if(object1 == null) {
                        Class class0 = hkvl.class;
                        synchronized(class0) {
                            hfvs0 = hkvl.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkvl.a));
                                hkvl.b = hfvs0;
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

