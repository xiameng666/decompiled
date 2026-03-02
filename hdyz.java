public final class hdyz extends hfts implements hftt {
    public static final hdyz a;
    public int b;
    public Object c;
    public static final hfta d;
    private static volatile Parser e;
    private byte f;

    static {
        hdyz hdyz0 = new hdyz();
        hdyz.a = hdyz0;
        ProtoLiteMessage.L(hdyz.class, ((ProtoLiteMessage)hdyz0));
        hdyz.d = ProtoLiteMessage.Q(((MessageLite)hcnu.a), hdyz0, ((MessageLite)hdyz0), 0xD4FF7A8, hfxe.k);
    }

    private hdyz() {
        this.b = 0;
        this.f = 2;
    }

    @Override  // ProtoLiteMessage
    public final Object jf(int v, Object object0) {
        Parser hfvs0;
        if(v != 0) {
            switch(v - 1) {
                case 0: {
                    return (byte)this.f;
                }
                case 2: {
                    return new hfvw(((MessageLite)hdyz.a), "\u0004\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001<\u0000\u0003;\u0000", new Object[]{"c", "b", ghim.class});
                }
                case 3: {
                    return new hdyz();
                }
                case 4: {
                    return new hftr(hdyz.a);
                }
                case 5: {
                    return hdyz.a;
                }
                case 6: {
                    Object object1 = hdyz.e;
                    if(object1 == null) {
                        Class class0 = hdyz.class;
                        synchronized(class0) {
                            hfvs0 = hdyz.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hdyz.a));
                                hdyz.e = hfvs0;
                            }
                        }
                        return hfvs0;
                    }
                    return object1;
                }
                default: {
                    this.f = object0 == null ? 0 : 1;
                    return null;
                }
            }
        }
        throw null;
    }
}

