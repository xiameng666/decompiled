public final class dxfe extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final dxfe a;
    public boolean b;
    private static volatile Parser c;

    static {
        dxfe dxfe0 = new dxfe();
        dxfe.a = dxfe0;
        ProtoLiteMessage.L(dxfe.class, ((ProtoLiteMessage)dxfe0));
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
                    return new hfvw(((MessageLite)dxfe.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"b"});
                }
                case 3: {
                    return new dxfe();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)dxfe.a));
                }
                case 5: {
                    return dxfe.a;
                }
                case 6: {
                    Object object1 = dxfe.c;
                    if(object1 == null) {
                        Class class0 = dxfe.class;
                        synchronized(class0) {
                            hfvs0 = dxfe.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)dxfe.a));
                                dxfe.c = hfvs0;
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

