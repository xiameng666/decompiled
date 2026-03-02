public final class hkpi extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkpi a;
    public hfuo b;
    private static volatile Parser c;

    static {
        hkpi hkpi0 = new hkpi();
        hkpi.a = hkpi0;
        ProtoLiteMessage.L(hkpi.class, ((ProtoLiteMessage)hkpi0));
    }

    private hkpi() {
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
                    return new hfvw(((MessageLite)hkpi.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hkpj.class});
                }
                case 3: {
                    return new hkpi();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkpi.a));
                }
                case 5: {
                    return hkpi.a;
                }
                case 6: {
                    Object object1 = hkpi.c;
                    if(object1 == null) {
                        Class class0 = hkpi.class;
                        synchronized(class0) {
                            hfvs0 = hkpi.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkpi.a));
                                hkpi.c = hfvs0;
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

