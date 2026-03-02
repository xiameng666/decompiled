public final class hcyd extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hcyd a;
    public int b;
    public Object c;
    public static final hfta d;
    private static volatile Parser e;

    static {
        hcyd hcyd0 = new hcyd();
        hcyd.a = hcyd0;
        ProtoLiteMessage.L(hcyd.class, ((ProtoLiteMessage)hcyd0));
        hcyd.d = ProtoLiteMessage.Q(((MessageLite)hcos.a), hcyd0, ((MessageLite)hcyd0), 525000000, hfxe.k);
    }

    private hcyd() {
        this.b = 0;
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
                    return new hfvw(((MessageLite)hcyd.a), "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", hcyg.class, hcye.class});
                }
                case 3: {
                    return new hcyd();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hcyd.a));
                }
                case 5: {
                    return hcyd.a;
                }
                case 6: {
                    Object object1 = hcyd.e;
                    if(object1 == null) {
                        Class class0 = hcyd.class;
                        synchronized(class0) {
                            hfvs0 = hcyd.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hcyd.a));
                                hcyd.e = hfvs0;
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

