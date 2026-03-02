public final class gsoi extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gsoi a;
    public hfvh b;
    private static volatile Parser c;

    static {
        gsoi gsoi0 = new gsoi();
        gsoi.a = gsoi0;
        ProtoLiteMessage.L(gsoi.class, ((ProtoLiteMessage)gsoi0));
    }

    private gsoi() {
        this.b = hfvh.a;
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
                    return new hfvw(((MessageLite)gsoi.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", gsoh.a});
                }
                case 3: {
                    return new gsoi();
                }
                case 4: {
                    return new gsog();
                }
                case 5: {
                    return gsoi.a;
                }
                case 6: {
                    Object object1 = gsoi.c;
                    if(object1 == null) {
                        Class class0 = gsoi.class;
                        synchronized(class0) {
                            hfvs0 = gsoi.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gsoi.a));
                                gsoi.c = hfvs0;
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

