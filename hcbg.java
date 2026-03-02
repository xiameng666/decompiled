public final class hcbg extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hcbg a;
    private static volatile Parser b;

    static {
        hcbg hcbg0 = new hcbg();
        hcbg.a = hcbg0;
        ProtoLiteMessage.L(hcbg.class, ((ProtoLiteMessage)hcbg0));
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
                    return new hfvw(((MessageLite)hcbg.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hcbg();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hcbg.a));
                }
                case 5: {
                    return hcbg.a;
                }
                case 6: {
                    Object object1 = hcbg.b;
                    if(object1 == null) {
                        Class class0 = hcbg.class;
                        synchronized(class0) {
                            hfvs0 = hcbg.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hcbg.a));
                                hcbg.b = hfvs0;
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

