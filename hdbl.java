public final class hdbl extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hdbl a;
    public hfuo b;
    public hfuo c;
    public static final hfta d;
    private static volatile Parser e;

    static {
        hdbl hdbl0 = new hdbl();
        hdbl.a = hdbl0;
        ProtoLiteMessage.L(hdbl.class, ((ProtoLiteMessage)hdbl0));
        hdbl.d = ProtoLiteMessage.Q(((MessageLite)hcos.a), hdbl0, ((MessageLite)hdbl0), 0xFFE1D8E, hfxe.k);
    }

    private hdbl() {
        this.b = hfvv.a;
        this.c = hfvv.a;
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
                    return new hfvw(((MessageLite)hdbl.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001B\u0002\u001B", new Object[]{"b", hdbn.class, "c", hdbn.class});
                }
                case 3: {
                    return new hdbl();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hdbl.a));
                }
                case 5: {
                    return hdbl.a;
                }
                case 6: {
                    Object object1 = hdbl.e;
                    if(object1 == null) {
                        Class class0 = hdbl.class;
                        synchronized(class0) {
                            hfvs0 = hdbl.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hdbl.a));
                                hdbl.e = hfvs0;
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

