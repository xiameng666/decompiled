public final class hdnu extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hdnu a;
    public static final hfta b;
    private static volatile Parser c;

    static {
        hdnu hdnu0 = new hdnu();
        hdnu.a = hdnu0;
        ProtoLiteMessage.L(hdnu.class, ((ProtoLiteMessage)hdnu0));
        hdnu.b = ProtoLiteMessage.Q(((MessageLite)hcsi.a), hdnu0, ((MessageLite)hdnu0), 209228584, hfxe.k);
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
                    return new hfvw(((MessageLite)hdnu.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hdnu();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hdnu.a));
                }
                case 5: {
                    return hdnu.a;
                }
                case 6: {
                    Object object1 = hdnu.c;
                    if(object1 == null) {
                        Class class0 = hdnu.class;
                        synchronized(class0) {
                            hfvs0 = hdnu.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hdnu.a));
                                hdnu.c = hfvs0;
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

