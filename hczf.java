public final class hczf extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hczf a;
    public hfuo b;
    public static final hfta c;
    private static volatile Parser d;

    static {
        hczf hczf0 = new hczf();
        hczf.a = hczf0;
        ProtoLiteMessage.L(hczf.class, ((ProtoLiteMessage)hczf0));
        hczf.c = ProtoLiteMessage.Q(((MessageLite)hcnu.a), hczf0, ((MessageLite)hczf0), 0x1065DBFD, hfxe.k);
    }

    private hczf() {
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
                    return new hfvw(((MessageLite)hczf.a), "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001B", new Object[]{"b", hczc.class});
                }
                case 3: {
                    return new hczf();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hczf.a));
                }
                case 5: {
                    return hczf.a;
                }
                case 6: {
                    Object object1 = hczf.d;
                    if(object1 == null) {
                        Class class0 = hczf.class;
                        synchronized(class0) {
                            hfvs0 = hczf.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hczf.a));
                                hczf.d = hfvs0;
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

