public final class hcjp extends hfts implements hftt {
    public static final hcjp a;
    public int b;
    public Object c;
    private static volatile Parser d;
    private byte e;

    static {
        hcjp hcjp0 = new hcjp();
        hcjp.a = hcjp0;
        ProtoLiteMessage.L(hcjp.class, ((ProtoLiteMessage)hcjp0));
    }

    private hcjp() {
        this.b = 0;
        this.e = 2;
    }

    @Override  // ProtoLiteMessage
    public final Object jf(int v, Object object0) {
        Parser hfvs0;
        if(v != 0) {
            switch(v - 1) {
                case 0: {
                    return (byte)this.e;
                }
                case 2: {
                    return new hfvw(((MessageLite)hcjp.a), "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001=\u0000\u0002=\u0000", new Object[]{"c", "b"});
                }
                case 3: {
                    return new hcjp();
                }
                case 4: {
                    return new hftr(hcjp.a);
                }
                case 5: {
                    return hcjp.a;
                }
                case 6: {
                    Object object1 = hcjp.d;
                    if(object1 == null) {
                        Class class0 = hcjp.class;
                        synchronized(class0) {
                            hfvs0 = hcjp.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hcjp.a));
                                hcjp.d = hfvs0;
                            }
                        }
                        return hfvs0;
                    }
                    return object1;
                }
                default: {
                    this.e = object0 == null ? 0 : 1;
                    return null;
                }
            }
        }
        throw null;
    }
}

