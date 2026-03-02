public final class dxet extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final dxet a;
    public boolean b;
    public boolean c;
    private static volatile Parser d;

    static {
        dxet dxet0 = new dxet();
        dxet.a = dxet0;
        ProtoLiteMessage.L(dxet.class, ((ProtoLiteMessage)dxet0));
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
                    return new hfvw(((MessageLite)dxet.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"b", "c"});
                }
                case 3: {
                    return new dxet();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)dxet.a));
                }
                case 5: {
                    return dxet.a;
                }
                case 6: {
                    Object object1 = dxet.d;
                    if(object1 == null) {
                        Class class0 = dxet.class;
                        synchronized(class0) {
                            hfvs0 = dxet.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)dxet.a));
                                dxet.d = hfvs0;
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

