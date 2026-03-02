public final class ctzb extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ctzb a;
    private static volatile Parser b;

    static {
        ctzb ctzb0 = new ctzb();
        ctzb.a = ctzb0;
        ProtoLiteMessage.L(ctzb.class, ((ProtoLiteMessage)ctzb0));
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
                    return new hfvw(((MessageLite)ctzb.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new ctzb();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ctzb.a));
                }
                case 5: {
                    return ctzb.a;
                }
                case 6: {
                    Object object1 = ctzb.b;
                    if(object1 == null) {
                        Class class0 = ctzb.class;
                        synchronized(class0) {
                            hfvs0 = ctzb.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ctzb.a));
                                ctzb.b = hfvs0;
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

