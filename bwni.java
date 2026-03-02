public final class bwni extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final bwni a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        bwni bwni0 = new bwni();
        bwni.a = bwni0;
        ProtoLiteMessage.L(bwni.class, ((ProtoLiteMessage)bwni0));
    }

    private bwni() {
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
                    return new hfvw(((MessageLite)bwni.a), "\u0004\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"c", "b", hfsz.class, hfsz.class, bwnm.class, hfsz.class});
                }
                case 3: {
                    return new bwni();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)bwni.a));
                }
                case 5: {
                    return bwni.a;
                }
                case 6: {
                    Object object1 = bwni.d;
                    if(object1 == null) {
                        Class class0 = bwni.class;
                        synchronized(class0) {
                            hfvs0 = bwni.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)bwni.a));
                                bwni.d = hfvs0;
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

