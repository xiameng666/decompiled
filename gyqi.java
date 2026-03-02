public final class gyqi extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gyqi a;
    public hfuo b;
    public hfuo c;
    public hfuo d;
    public hfuo e;
    public hfuo f;
    private static volatile Parser g;

    static {
        gyqi gyqi0 = new gyqi();
        gyqi.a = gyqi0;
        ProtoLiteMessage.L(gyqi.class, ((ProtoLiteMessage)gyqi0));
    }

    private gyqi() {
        this.b = hfvv.a;
        this.c = hfvv.a;
        this.d = hfvv.a;
        this.e = hfvv.a;
        this.f = hfvv.a;
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
                    return new hfvw(((MessageLite)gyqi.a), "\u0004\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0005\u0000\u0001\u001B\u0002\u001B\u0004\u001B\u0005\u001B\u0006\u001B", new Object[]{"b", gysm.class, "c", gyqz.class, "d", gyso.class, "e", gyqh.class, "f", gysg.class});
                }
                case 3: {
                    return new gyqi();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gyqi.a));
                }
                case 5: {
                    return gyqi.a;
                }
                case 6: {
                    Object object1 = gyqi.g;
                    if(object1 == null) {
                        Class class0 = gyqi.class;
                        synchronized(class0) {
                            hfvs0 = gyqi.g;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gyqi.a));
                                gyqi.g = hfvs0;
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

