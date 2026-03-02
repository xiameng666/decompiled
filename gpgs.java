public final class gpgs extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gpgs a;
    public hfuo b;
    public static final hfta c;
    private static volatile Parser d;

    static {
        gpgs gpgs0 = new gpgs();
        gpgs.a = gpgs0;
        ProtoLiteMessage.L(gpgs.class, ((ProtoLiteMessage)gpgs0));
        gpgs.c = ProtoLiteMessage.Q(((MessageLite)hheu.a), gpgs0, ((MessageLite)gpgs0), 0xBDACEFB, hfxe.k);
    }

    private gpgs() {
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
                    return new hfvw(((MessageLite)gpgs.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001C", new Object[]{"b"});
                }
                case 3: {
                    return new gpgs();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gpgs.a));
                }
                case 5: {
                    return gpgs.a;
                }
                case 6: {
                    Object object1 = gpgs.d;
                    if(object1 == null) {
                        Class class0 = gpgs.class;
                        synchronized(class0) {
                            hfvs0 = gpgs.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gpgs.a));
                                gpgs.d = hfvs0;
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

