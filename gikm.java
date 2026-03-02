public final class gikm extends hfts implements hftt {
    public static final gikm a;
    private static volatile Parser b;
    private byte c;

    static {
        gikm gikm0 = new gikm();
        gikm.a = gikm0;
        ProtoLiteMessage.L(gikm.class, ((ProtoLiteMessage)gikm0));
    }

    private gikm() {
        this.c = 2;
    }

    @Override  // ProtoLiteMessage
    public final Object jf(int v, Object object0) {
        Parser hfvs0;
        if(v != 0) {
            switch(v - 1) {
                case 0: {
                    return (byte)this.c;
                }
                case 2: {
                    return new hfvw(((MessageLite)gikm.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new gikm();
                }
                case 4: {
                    return new hftr(gikm.a);
                }
                case 5: {
                    return gikm.a;
                }
                case 6: {
                    Object object1 = gikm.b;
                    if(object1 == null) {
                        Class class0 = gikm.class;
                        synchronized(class0) {
                            hfvs0 = gikm.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gikm.a));
                                gikm.b = hfvs0;
                            }
                        }
                        return hfvs0;
                    }
                    return object1;
                }
                default: {
                    this.c = object0 == null ? 0 : 1;
                    return null;
                }
            }
        }
        throw null;
    }
}

