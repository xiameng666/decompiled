public final class hctt extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hctt a;
    public hfuo b;
    public static final hfta c;
    private static volatile Parser d;

    static {
        hctt hctt0 = new hctt();
        hctt.a = hctt0;
        ProtoLiteMessage.L(hctt.class, ((ProtoLiteMessage)hctt0));
        hctt.c = ProtoLiteMessage.Q(((MessageLite)hcnu.a), hctt0, ((MessageLite)hctt0), 0x12E074FC, hfxe.k);
    }

    private hctt() {
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
                    return new hfvw(((MessageLite)hctt.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hcts.class});
                }
                case 3: {
                    return new hctt();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hctt.a));
                }
                case 5: {
                    return hctt.a;
                }
                case 6: {
                    Object object1 = hctt.d;
                    if(object1 == null) {
                        Class class0 = hctt.class;
                        synchronized(class0) {
                            hfvs0 = hctt.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hctt.a));
                                hctt.d = hfvs0;
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

