public final class gsob extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gsob a;
    public hfvh b;
    private static volatile Parser c;

    static {
        gsob gsob0 = new gsob();
        gsob.a = gsob0;
        ProtoLiteMessage.L(gsob.class, ((ProtoLiteMessage)gsob0));
    }

    private gsob() {
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
                    return new hfvw(((MessageLite)gsob.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", gsoa.a});
                }
                case 3: {
                    return new gsob();
                }
                case 4: {
                    return new gsnz();
                }
                case 5: {
                    return gsob.a;
                }
                case 6: {
                    Object object1 = gsob.c;
                    if(object1 == null) {
                        Class class0 = gsob.class;
                        synchronized(class0) {
                            hfvs0 = gsob.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gsob.a));
                                gsob.c = hfvs0;
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

