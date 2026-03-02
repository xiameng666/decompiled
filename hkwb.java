public final class hkwb extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkwb a;
    private static volatile Parser b;

    static {
        hkwb hkwb0 = new hkwb();
        hkwb.a = hkwb0;
        ProtoLiteMessage.L(hkwb.class, ((ProtoLiteMessage)hkwb0));
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
                    return new hfvw(((MessageLite)hkwb.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hkwb();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkwb.a));
                }
                case 5: {
                    return hkwb.a;
                }
                case 6: {
                    Object object1 = hkwb.b;
                    if(object1 == null) {
                        Class class0 = hkwb.class;
                        synchronized(class0) {
                            hfvs0 = hkwb.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkwb.a));
                                hkwb.b = hfvs0;
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

