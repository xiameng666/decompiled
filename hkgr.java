public final class hkgr extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkgr a;
    public hfuo b;
    private static volatile Parser c;

    static {
        hkgr hkgr0 = new hkgr();
        hkgr.a = hkgr0;
        ProtoLiteMessage.L(hkgr.class, ((ProtoLiteMessage)hkgr0));
    }

    private hkgr() {
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
                    return new hfvw(((MessageLite)hkgr.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hkgq.class});
                }
                case 3: {
                    return new hkgr();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkgr.a));
                }
                case 5: {
                    return hkgr.a;
                }
                case 6: {
                    Object object1 = hkgr.c;
                    if(object1 == null) {
                        Class class0 = hkgr.class;
                        synchronized(class0) {
                            hfvs0 = hkgr.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkgr.a));
                                hkgr.c = hfvs0;
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

