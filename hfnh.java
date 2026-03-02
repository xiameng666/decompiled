public final class hfnh extends hfts implements hftt {
    public static final hfnh a;
    private static volatile Parser b;
    private byte c;

    static {
        hfnh hfnh0 = new hfnh();
        hfnh.a = hfnh0;
        ProtoLiteMessage.L(hfnh.class, ((ProtoLiteMessage)hfnh0));
    }

    private hfnh() {
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
                    return new hfvw(((MessageLite)hfnh.a), "\u0001\u0000", null);
                }
                case 3: {
                    return new hfnh();
                }
                case 4: {
                    return new hftr(hfnh.a);
                }
                case 5: {
                    return hfnh.a;
                }
                case 6: {
                    Object object1 = hfnh.b;
                    if(object1 == null) {
                        Class class0 = hfnh.class;
                        synchronized(class0) {
                            hfvs0 = hfnh.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hfnh.a));
                                hfnh.b = hfvs0;
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

