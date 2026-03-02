public final class gsps extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gsps a;
    public long b;
    public float c;
    public float d;
    private static volatile Parser e;

    static {
        gsps gsps0 = new gsps();
        gsps.a = gsps0;
        ProtoLiteMessage.L(gsps.class, ((ProtoLiteMessage)gsps0));
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
                    return new hfvw(((MessageLite)gsps.a), "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0001\u0003\u0001", new Object[]{"b", "c", "d"});
                }
                case 3: {
                    return new gsps();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gsps.a));
                }
                case 5: {
                    return gsps.a;
                }
                case 6: {
                    Object object1 = gsps.e;
                    if(object1 == null) {
                        Class class0 = gsps.class;
                        synchronized(class0) {
                            hfvs0 = gsps.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gsps.a));
                                gsps.e = hfvs0;
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

