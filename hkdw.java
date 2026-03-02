@Deprecated
public final class hkdw extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkdw a;
    public boolean b;
    private static volatile Parser c;

    static {
        hkdw hkdw0 = new hkdw();
        hkdw.a = hkdw0;
        ProtoLiteMessage.L(hkdw.class, ((ProtoLiteMessage)hkdw0));
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
                    return new hfvw(((MessageLite)hkdw.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"b"});
                }
                case 3: {
                    return new hkdw();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkdw.a));
                }
                case 5: {
                    return hkdw.a;
                }
                case 6: {
                    Object object1 = hkdw.c;
                    if(object1 == null) {
                        Class class0 = hkdw.class;
                        synchronized(class0) {
                            hfvs0 = hkdw.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkdw.a));
                                hkdw.c = hfvs0;
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

