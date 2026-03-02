public final class hcps extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hcps a;
    public hfui b;
    public static final hfta c;
    private static volatile Parser d;

    static {
        hcps hcps0 = new hcps();
        hcps.a = hcps0;
        ProtoLiteMessage.L(hcps.class, ((ProtoLiteMessage)hcps0));
        hcps.c = ProtoLiteMessage.Q(((MessageLite)hcos.a), hcps0, ((MessageLite)hcps0), 0x1A460BC4, hfxe.k);
    }

    private hcps() {
        this.b = hfvb.a;
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
                    return new hfvw(((MessageLite)hcps.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"b"});
                }
                case 3: {
                    return new hcps();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hcps.a));
                }
                case 5: {
                    return hcps.a;
                }
                case 6: {
                    Object object1 = hcps.d;
                    if(object1 == null) {
                        Class class0 = hcps.class;
                        synchronized(class0) {
                            hfvs0 = hcps.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hcps.a));
                                hcps.d = hfvs0;
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

