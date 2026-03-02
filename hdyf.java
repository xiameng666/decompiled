public final class hdyf extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hdyf a;
    public static final hfta b;
    private static volatile Parser c;

    static {
        hdyf hdyf0 = new hdyf();
        hdyf.a = hdyf0;
        ProtoLiteMessage.L(hdyf.class, ((ProtoLiteMessage)hdyf0));
        hdyf.b = ProtoLiteMessage.Q(((MessageLite)hcnu.a), hdyf0, ((MessageLite)hdyf0), 0xD290F5F, hfxe.k);
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
                    return new hfvw(((MessageLite)hdyf.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hdyf();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hdyf.a));
                }
                case 5: {
                    return hdyf.a;
                }
                case 6: {
                    Object object1 = hdyf.c;
                    if(object1 == null) {
                        Class class0 = hdyf.class;
                        synchronized(class0) {
                            hfvs0 = hdyf.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hdyf.a));
                                hdyf.c = hfvs0;
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

