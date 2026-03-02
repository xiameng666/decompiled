public final class hkgz extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkgz a;
    private static volatile Parser b;

    static {
        hkgz hkgz0 = new hkgz();
        hkgz.a = hkgz0;
        ProtoLiteMessage.L(hkgz.class, ((ProtoLiteMessage)hkgz0));
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
                    return new hfvw(((MessageLite)hkgz.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hkgz();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkgz.a));
                }
                case 5: {
                    return hkgz.a;
                }
                case 6: {
                    Object object1 = hkgz.b;
                    if(object1 == null) {
                        Class class0 = hkgz.class;
                        synchronized(class0) {
                            hfvs0 = hkgz.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkgz.a));
                                hkgz.b = hfvs0;
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

