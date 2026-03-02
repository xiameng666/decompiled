public final class hdfm extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hdfm a;
    public int b;
    public Object c;
    public hfuo d;
    public static final hfta e;
    private static volatile Parser f;

    static {
        hdfm hdfm0 = new hdfm();
        hdfm.a = hdfm0;
        ProtoLiteMessage.L(hdfm.class, ((ProtoLiteMessage)hdfm0));
        hdfm.e = ProtoLiteMessage.Q(((MessageLite)hcnu.a), hdfm0, ((MessageLite)hdfm0), 0x118D7644, hfxe.k);
    }

    private hdfm() {
        this.b = 0;
        this.d = hfvv.a;
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
                    return new hfvw(((MessageLite)hdfm.a), "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003\u001A", new Object[]{"c", "b", hdfh.class, hdfp.class, "d"});
                }
                case 3: {
                    return new hdfm();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hdfm.a));
                }
                case 5: {
                    return hdfm.a;
                }
                case 6: {
                    Object object1 = hdfm.f;
                    if(object1 == null) {
                        Class class0 = hdfm.class;
                        synchronized(class0) {
                            hfvs0 = hdfm.f;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hdfm.a));
                                hdfm.f = hfvs0;
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

