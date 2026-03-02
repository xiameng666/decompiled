public final class hcsl extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hcsl a;
    public hfuo b;
    public static final hfta c;
    private static volatile Parser d;

    static {
        hcsl hcsl0 = new hcsl();
        hcsl.a = hcsl0;
        ProtoLiteMessage.L(hcsl.class, ((ProtoLiteMessage)hcsl0));
        hcsl.c = ProtoLiteMessage.Q(((MessageLite)hcnu.a), hcsl0, ((MessageLite)hcsl0), 440798150, hfxe.k);
    }

    private hcsl() {
        this.b = hfvv.a;
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
                    return new hfvw(((MessageLite)hcsl.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hcsk.class});
                }
                case 3: {
                    return new hcsl();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hcsl.a));
                }
                case 5: {
                    return hcsl.a;
                }
                case 6: {
                    Object object1 = hcsl.d;
                    if(object1 == null) {
                        Class class0 = hcsl.class;
                        synchronized(class0) {
                            hfvs0 = hcsl.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hcsl.a));
                                hcsl.d = hfvs0;
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

