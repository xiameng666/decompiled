public final class hdcg extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hdcg a;
    public hfuo b;
    public static final hfta c;
    private static volatile Parser d;

    static {
        hdcg hdcg0 = new hdcg();
        hdcg.a = hdcg0;
        ProtoLiteMessage.L(hdcg.class, ((ProtoLiteMessage)hdcg0));
        hdcg.c = ProtoLiteMessage.Q(((MessageLite)hcos.a), hdcg0, ((MessageLite)hdcg0), 280087160, hfxe.k);
    }

    private hdcg() {
        this.b = hfvv.a;
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
                    return new hfvw(((MessageLite)hdcg.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001A", new Object[]{"b"});
                }
                case 3: {
                    return new hdcg();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hdcg.a));
                }
                case 5: {
                    return hdcg.a;
                }
                case 6: {
                    Object object1 = hdcg.d;
                    if(object1 == null) {
                        Class class0 = hdcg.class;
                        synchronized(class0) {
                            hfvs0 = hdcg.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hdcg.a));
                                hdcg.d = hfvs0;
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

