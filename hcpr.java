public final class hcpr extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hcpr a;
    public static final hfta b;
    private static volatile Parser c;

    static {
        hcpr hcpr0 = new hcpr();
        hcpr.a = hcpr0;
        ProtoLiteMessage.L(hcpr.class, ((ProtoLiteMessage)hcpr0));
        hcpr.b = ProtoLiteMessage.Q(((MessageLite)hcnu.a), hcpr0, ((MessageLite)hcpr0), 0x1A460BC4, hfxe.k);
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
                    return new hfvw(((MessageLite)hcpr.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hcpr();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hcpr.a));
                }
                case 5: {
                    return hcpr.a;
                }
                case 6: {
                    Object object1 = hcpr.c;
                    if(object1 == null) {
                        Class class0 = hcpr.class;
                        synchronized(class0) {
                            hfvs0 = hcpr.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hcpr.a));
                                hcpr.c = hfvs0;
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

