public final class hnns extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hnns a;
    public hnnt b;
    private static volatile Parser c;
    private int d;

    static {
        hnns hnns0 = new hnns();
        hnns.a = hnns0;
        ProtoLiteMessage.L(hnns.class, ((ProtoLiteMessage)hnns0));
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
                    return new hfvw(((MessageLite)hnns.a), "\u0004\u0001\u0000\u0001\uFCCF\uEBAB\u0007\uFCCF\uEBAB\u0007\u0001\u0000\u0000\u0000\uFCCF\uEBAB\u0007\u1009\u0000", new Object[]{"d", "b"});
                }
                case 3: {
                    return new hnns();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hnns.a));
                }
                case 5: {
                    return hnns.a;
                }
                case 6: {
                    Object object1 = hnns.c;
                    if(object1 == null) {
                        Class class0 = hnns.class;
                        synchronized(class0) {
                            hfvs0 = hnns.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hnns.a));
                                hnns.c = hfvs0;
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

