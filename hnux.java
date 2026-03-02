public final class hnux extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hnux a;
    public int b;
    public Object c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    private static volatile Parser j;

    static {
        hnux hnux0 = new hnux();
        hnux.a = hnux0;
        ProtoLiteMessage.L(hnux.class, ((ProtoLiteMessage)hnux0));
    }

    private hnux() {
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
                    return new hfvw(((MessageLite)hnux.a), "\u0000\u000E\u0001\u0000\u0001m\u000E\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\b\u0007e<\u0000f<\u0000g<\u0000h<\u0000i<\u0000j<\u0000k<\u0000m<\u0000", new Object[]{"c", "b", "d", "e", "f", "g", "h", "i", hnve.class, hnun.class, hnuv.class, hnum.class, hnur.class, hnul.class, hnuk.class, hnup.class});
                }
                case 3: {
                    return new hnux();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hnux.a));
                }
                case 5: {
                    return hnux.a;
                }
                case 6: {
                    Object object1 = hnux.j;
                    if(object1 == null) {
                        Class class0 = hnux.class;
                        synchronized(class0) {
                            hfvs0 = hnux.j;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hnux.a));
                                hnux.j = hfvs0;
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

