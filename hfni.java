public final class hfni extends hfts implements hftt {
    public static final hfni a;
    public hfuo b;
    private static volatile Parser c;
    private byte d;

    static {
        hfni hfni0 = new hfni();
        hfni.a = hfni0;
        ProtoLiteMessage.L(hfni.class, ((ProtoLiteMessage)hfni0));
    }

    private hfni() {
        this.d = 2;
        this.b = hfvv.a;
    }

    @Override  // ProtoLiteMessage
    public final Object jf(int v, Object object0) {
        Parser hfvs0;
        if(v != 0) {
            switch(v - 1) {
                case 0: {
                    return (byte)this.d;
                }
                case 2: {
                    return new hfvw(((MessageLite)hfni.a), "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001B", new Object[]{"b", hfoa.class});
                }
                case 3: {
                    return new hfni();
                }
                case 4: {
                    return new hftr(hfni.a);
                }
                case 5: {
                    return hfni.a;
                }
                case 6: {
                    Object object1 = hfni.c;
                    if(object1 == null) {
                        Class class0 = hfni.class;
                        synchronized(class0) {
                            hfvs0 = hfni.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hfni.a));
                                hfni.c = hfvs0;
                            }
                        }
                        return hfvs0;
                    }
                    return object1;
                }
                default: {
                    this.d = object0 == null ? 0 : 1;
                    return null;
                }
            }
        }
        throw null;
    }
}

