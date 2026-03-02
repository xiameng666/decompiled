public final class hkgv extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkgv a;
    public hfuo b;
    public hfuo c;
    private static volatile Parser d;

    static {
        hkgv hkgv0 = new hkgv();
        hkgv.a = hkgv0;
        ProtoLiteMessage.L(hkgv.class, ((ProtoLiteMessage)hkgv0));
    }

    private hkgv() {
        this.b = hfvv.a;
        this.c = hfvv.a;
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
                    return new hfvw(((MessageLite)hkgv.a), "\u0004\u0002\u0000\u0000\u0002\u0006\u0002\u0000\u0002\u0000\u0002\u001B\u0006\u001B", new Object[]{"c", hkhr.class, "b", hkgx.class});
                }
                case 3: {
                    return new hkgv();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkgv.a));
                }
                case 5: {
                    return hkgv.a;
                }
                case 6: {
                    Object object1 = hkgv.d;
                    if(object1 == null) {
                        Class class0 = hkgv.class;
                        synchronized(class0) {
                            hfvs0 = hkgv.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkgv.a));
                                hkgv.d = hfvs0;
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

