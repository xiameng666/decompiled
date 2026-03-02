public final class gszd extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gszd a;
    public int b;
    public Object c;
    public int d;
    public ByteString e;
    public boolean f;
    private static volatile Parser g;

    static {
        gszd gszd0 = new gszd();
        gszd.a = gszd0;
        ProtoLiteMessage.L(gszd.class, ((ProtoLiteMessage)gszd0));
    }

    private gszd() {
        this.b = 0;
        this.e = ByteString.b;
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
                    return new hfvw(((MessageLite)gszd.a), "\u0000\u0005\u0001\u0000\u0001\b\u0005\u0000\u0000\u0000\u0001\f\u0002\n\u0003<\u0000\u0005\u0007\b<\u0000", new Object[]{"c", "b", "d", "e", gtby.class, "f", gsyx.class});
                }
                case 3: {
                    return new gszd();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gszd.a));
                }
                case 5: {
                    return gszd.a;
                }
                case 6: {
                    Object object1 = gszd.g;
                    if(object1 == null) {
                        Class class0 = gszd.class;
                        synchronized(class0) {
                            hfvs0 = gszd.g;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gszd.a));
                                gszd.g = hfvs0;
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

