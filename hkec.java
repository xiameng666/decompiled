public final class hkec extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkec a;
    private static volatile Parser b;

    static {
        hkec hkec0 = new hkec();
        hkec.a = hkec0;
        ProtoLiteMessage.L(hkec.class, ((ProtoLiteMessage)hkec0));
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
                    return new hfvw(((MessageLite)hkec.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hkec();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkec.a));
                }
                case 5: {
                    return hkec.a;
                }
                case 6: {
                    Object object1 = hkec.b;
                    if(object1 == null) {
                        Class class0 = hkec.class;
                        synchronized(class0) {
                            hfvs0 = hkec.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkec.a));
                                hkec.b = hfvs0;
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

