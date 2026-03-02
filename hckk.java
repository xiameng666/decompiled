public final class hckk extends hfts implements hftt {
    public static final hckk a;
    private static volatile Parser b;
    private byte c;

    static {
        hckk hckk0 = new hckk();
        hckk.a = hckk0;
        ProtoLiteMessage.L(hckk.class, ((ProtoLiteMessage)hckk0));
    }

    private hckk() {
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
                    return new hfvw(((MessageLite)hckk.a), "\u0004\u0000", null);
                }
                case 3: {
                    return new hckk();
                }
                case 4: {
                    return new hftr(hckk.a);
                }
                case 5: {
                    return hckk.a;
                }
                case 6: {
                    Object object1 = hckk.b;
                    if(object1 == null) {
                        Class class0 = hckk.class;
                        synchronized(class0) {
                            hfvs0 = hckk.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hckk.a));
                                hckk.b = hfvs0;
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

