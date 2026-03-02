public final class hcwm extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hcwm a;
    public static final hfta b;
    private static volatile Parser c;

    static {
        hcwm hcwm0 = new hcwm();
        hcwm.a = hcwm0;
        ProtoLiteMessage.L(hcwm.class, ((ProtoLiteMessage)hcwm0));
        hcwm.b = ProtoLiteMessage.Q(((MessageLite)hcnu.a), hcwm0, ((MessageLite)hcwm0), 0x19E8A115, hfxe.k);
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
                    return new hfvw(((MessageLite)hcwm.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hcwm();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hcwm.a));
                }
                case 5: {
                    return hcwm.a;
                }
                case 6: {
                    Object object1 = hcwm.c;
                    if(object1 == null) {
                        Class class0 = hcwm.class;
                        synchronized(class0) {
                            hfvs0 = hcwm.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hcwm.a));
                                hcwm.c = hfvs0;
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

