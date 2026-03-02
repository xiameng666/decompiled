public final class hcut extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hcut a;
    public static final hfta b;
    private static volatile Parser c;

    static {
        hcut hcut0 = new hcut();
        hcut.a = hcut0;
        ProtoLiteMessage.L(hcut.class, ((ProtoLiteMessage)hcut0));
        hcut.b = ProtoLiteMessage.Q(((MessageLite)hdrl.a), hcut0, ((MessageLite)hcut0), 0x196FD575, hfxe.k);
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
                    return new hfvw(((MessageLite)hcut.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hcut();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hcut.a));
                }
                case 5: {
                    return hcut.a;
                }
                case 6: {
                    Object object1 = hcut.c;
                    if(object1 == null) {
                        Class class0 = hcut.class;
                        synchronized(class0) {
                            hfvs0 = hcut.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hcut.a));
                                hcut.c = hfvs0;
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

