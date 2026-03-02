public final class hfec extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hfec a;
    public hfuo b;
    public static final hfta c;
    private static volatile Parser d;

    static {
        hfec hfec0 = new hfec();
        hfec.a = hfec0;
        ProtoLiteMessage.L(hfec.class, ((ProtoLiteMessage)hfec0));
        hfec.c = ProtoLiteMessage.Q(((MessageLite)hesv.a), hfec0, ((MessageLite)hfec0), 85660099, hfxe.k);
    }

    private hfec() {
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
                    return new hfvw(((MessageLite)hfec.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hfed.class});
                }
                case 3: {
                    return new hfec();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hfec.a));
                }
                case 5: {
                    return hfec.a;
                }
                case 6: {
                    Object object1 = hfec.d;
                    if(object1 == null) {
                        Class class0 = hfec.class;
                        synchronized(class0) {
                            hfvs0 = hfec.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hfec.a));
                                hfec.d = hfvs0;
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

