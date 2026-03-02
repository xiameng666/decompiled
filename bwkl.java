public final class bwkl extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final bwkl a;
    public hfvh b;
    private static volatile Parser c;

    static {
        bwkl bwkl0 = new bwkl();
        bwkl.a = bwkl0;
        ProtoLiteMessage.L(bwkl.class, ((ProtoLiteMessage)bwkl0));
    }

    private bwkl() {
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
                    return new hfvw(((MessageLite)bwkl.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", bwkj.a});
                }
                case 3: {
                    return new bwkl();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)bwkl.a));
                }
                case 5: {
                    return bwkl.a;
                }
                case 6: {
                    Object object1 = bwkl.c;
                    if(object1 == null) {
                        Class class0 = bwkl.class;
                        synchronized(class0) {
                            hfvs0 = bwkl.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)bwkl.a));
                                bwkl.c = hfvs0;
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

