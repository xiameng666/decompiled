public final class arbh extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final arbh a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        arbh arbh0 = new arbh();
        arbh.a = arbh0;
        ProtoLiteMessage.L(arbh.class, ((ProtoLiteMessage)arbh0));
    }

    private arbh() {
        this.b = 0;
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
                    return new hfvw(((MessageLite)arbh.a), "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", arbk.class, fpxp.class});
                }
                case 3: {
                    return new arbh();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)arbh.a));
                }
                case 5: {
                    return arbh.a;
                }
                case 6: {
                    Object object1 = arbh.d;
                    if(object1 == null) {
                        Class class0 = arbh.class;
                        synchronized(class0) {
                            hfvs0 = arbh.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)arbh.a));
                                arbh.d = hfvs0;
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

