public final class hchw extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hchw a;
    public int b;
    public getj c;
    public gete d;
    public hfvh e;
    public gfbr f;
    public static final hfuj g;
    private static volatile Parser h;

    static {
        hchw.g = new hfuj(geoj.H, geoj.a);
        hchw hchw0 = new hchw();
        hchw.a = hchw0;
        ProtoLiteMessage.L(hchw.class, ((ProtoLiteMessage)hchw0));
    }

    private hchw() {
        this.e = hfvh.a;
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
                    return new hfvw(((MessageLite)hchw.a), "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u0832\u0004\u1009\u0002", new Object[]{"b", "c", "d", "e", hchv.a, geoi.a, "f"});
                }
                case 3: {
                    return new hchw();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hchw.a));
                }
                case 5: {
                    return hchw.a;
                }
                case 6: {
                    Object object1 = hchw.h;
                    if(object1 == null) {
                        Class class0 = hchw.class;
                        synchronized(class0) {
                            hfvs0 = hchw.h;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hchw.a));
                                hchw.h = hfvs0;
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

