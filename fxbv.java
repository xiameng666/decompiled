public final class fxbv extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final fxbv a;
    public double b;
    public double c;
    public double d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public long k;
    public long l;
    public double m;
    private static volatile Parser n;

    static {
        fxbv fxbv0 = new fxbv();
        fxbv.a = fxbv0;
        ProtoLiteMessage.L(fxbv.class, ((ProtoLiteMessage)fxbv0));
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
                    return new hfvw(((MessageLite)fxbv.a), "\u0004\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0000\u0004\u0001\u0005\u0001\u0006\u0001\u0007\u0001\b\u0001\t\u0001\n\u0002\u000B\u0002\f\u0000", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
                }
                case 3: {
                    return new fxbv();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)fxbv.a));
                }
                case 5: {
                    return fxbv.a;
                }
                case 6: {
                    Object object1 = fxbv.n;
                    if(object1 == null) {
                        Class class0 = fxbv.class;
                        synchronized(class0) {
                            hfvs0 = fxbv.n;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)fxbv.a));
                                fxbv.n = hfvs0;
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

