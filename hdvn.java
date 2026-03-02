public final class hdvn extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hdvn a;
    public static final hfta b;
    private static volatile Parser c;

    static {
        hdvn hdvn0 = new hdvn();
        hdvn.a = hdvn0;
        ProtoLiteMessage.L(hdvn.class, ((ProtoLiteMessage)hdvn0));
        hdvn.b = ProtoLiteMessage.Q(((MessageLite)hcnu.a), hdvn0, ((MessageLite)hdvn0), 0xDAFA0A5, hfxe.k);
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
                    return new hfvw(((MessageLite)hdvn.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hdvn();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hdvn.a));
                }
                case 5: {
                    return hdvn.a;
                }
                case 6: {
                    Object object1 = hdvn.c;
                    if(object1 == null) {
                        Class class0 = hdvn.class;
                        synchronized(class0) {
                            hfvs0 = hdvn.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hdvn.a));
                                hdvn.c = hfvs0;
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

