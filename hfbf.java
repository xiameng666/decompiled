public final class hfbf extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hfbf a;
    public hfuo b;
    public static final hfta c;
    private static volatile Parser d;

    static {
        hfbf hfbf0 = new hfbf();
        hfbf.a = hfbf0;
        ProtoLiteMessage.L(hfbf.class, ((ProtoLiteMessage)hfbf0));
        hfbf.c = ProtoLiteMessage.Q(((MessageLite)hesv.a), hfbf0, ((MessageLite)hfbf0), 0x77DF781, hfxe.k);
    }

    private hfbf() {
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
                    return new hfvw(((MessageLite)hfbf.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hfbg.class});
                }
                case 3: {
                    return new hfbf();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hfbf.a));
                }
                case 5: {
                    return hfbf.a;
                }
                case 6: {
                    Object object1 = hfbf.d;
                    if(object1 == null) {
                        Class class0 = hfbf.class;
                        synchronized(class0) {
                            hfvs0 = hfbf.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hfbf.a));
                                hfbf.d = hfvs0;
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

