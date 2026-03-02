public final class hdeu extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hdeu a;
    public int b;
    public Object c;
    public static final hfta d;
    private static volatile Parser e;

    static {
        hdeu hdeu0 = new hdeu();
        hdeu.a = hdeu0;
        ProtoLiteMessage.L(hdeu.class, ((ProtoLiteMessage)hdeu0));
        hdeu.d = ProtoLiteMessage.Q(((MessageLite)hcos.a), hdeu0, ((MessageLite)hdeu0), 0xFF27351, hfxe.k);
    }

    private hdeu() {
        this.b = 0;
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
                    return new hfvw(((MessageLite)hdeu.a), "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001=\u0000\u0002=\u0000", new Object[]{"c", "b"});
                }
                case 3: {
                    return new hdeu();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hdeu.a));
                }
                case 5: {
                    return hdeu.a;
                }
                case 6: {
                    Object object1 = hdeu.e;
                    if(object1 == null) {
                        Class class0 = hdeu.class;
                        synchronized(class0) {
                            hfvs0 = hdeu.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hdeu.a));
                                hdeu.e = hfvs0;
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

