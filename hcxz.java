public final class hcxz extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hcxz a;
    public hfuo b;
    public static final hfta c;
    private static volatile Parser d;

    static {
        hcxz hcxz0 = new hcxz();
        hcxz.a = hcxz0;
        ProtoLiteMessage.L(hcxz.class, ((ProtoLiteMessage)hcxz0));
        hcxz.c = ProtoLiteMessage.Q(((MessageLite)hcnu.a), hcxz0, ((MessageLite)hcxz0), 525000000, hfxe.k);
    }

    private hcxz() {
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
                    return new hfvw(((MessageLite)hcxz.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hcya.class});
                }
                case 3: {
                    return new hcxz();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hcxz.a));
                }
                case 5: {
                    return hcxz.a;
                }
                case 6: {
                    Object object1 = hcxz.d;
                    if(object1 == null) {
                        Class class0 = hcxz.class;
                        synchronized(class0) {
                            hfvs0 = hcxz.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hcxz.a));
                                hcxz.d = hfvs0;
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

