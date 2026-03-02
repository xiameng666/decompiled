public final class aqhp extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final aqhp a;
    public hfvh b;
    private static volatile Parser c;

    static {
        aqhp aqhp0 = new aqhp();
        aqhp.a = aqhp0;
        ProtoLiteMessage.L(aqhp.class, ((ProtoLiteMessage)aqhp0));
    }

    private aqhp() {
        this.b = hfvh.a;
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
                    return new hfvw(((MessageLite)aqhp.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", aqho.a});
                }
                case 3: {
                    return new aqhp();
                }
                case 4: {
                    return new ProtoLiteBuilder(null, null);
                }
                case 5: {
                    return aqhp.a;
                }
                case 6: {
                    Object object1 = aqhp.c;
                    if(object1 == null) {
                        Class class0 = aqhp.class;
                        synchronized(class0) {
                            hfvs0 = aqhp.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)aqhp.a));
                                aqhp.c = hfvs0;
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

