public final class hfct extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hfct a;
    public hfuo b;
    private static volatile Parser c;

    static {
        hfct hfct0 = new hfct();
        hfct.a = hfct0;
        ProtoLiteMessage.L(hfct.class, ((ProtoLiteMessage)hfct0));
    }

    private hfct() {
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
                    return new hfvw(((MessageLite)hfct.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hfcs.class});
                }
                case 3: {
                    return new hfct();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hfct.a));
                }
                case 5: {
                    return hfct.a;
                }
                case 6: {
                    Object object1 = hfct.c;
                    if(object1 == null) {
                        Class class0 = hfct.class;
                        synchronized(class0) {
                            hfvs0 = hfct.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hfct.a));
                                hfct.c = hfvs0;
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

