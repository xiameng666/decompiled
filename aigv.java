public final class aigv extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final aigv a;
    public hfvh b;
    public long c;
    public long d;
    public hfvh e;
    private static volatile Parser f;

    static {
        aigv aigv0 = new aigv();
        aigv.a = aigv0;
        ProtoLiteMessage.L(aigv.class, ((ProtoLiteMessage)aigv0));
    }

    private aigv() {
        this.b = hfvh.a;
        this.e = hfvh.a;
    }

    public final hfvh b() {
        hfvh hfvh0 = this.e;
        if(!hfvh0.b) {
            this.e = hfvh0.a();
        }
        return this.e;
    }

    public final hfvh c() {
        hfvh hfvh0 = this.b;
        if(!hfvh0.b) {
            this.b = hfvh0.a();
        }
        return this.b;
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
                    return new hfvw(((MessageLite)aigv.a), "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0002\u0000\u0000\u00012\u0002\u0002\u0003\u0002\u00042", new Object[]{"b", aigu.a, "c", "d", "e", aigt.a});
                }
                case 3: {
                    return new aigv();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)aigv.a));
                }
                case 5: {
                    return aigv.a;
                }
                case 6: {
                    Object object1 = aigv.f;
                    if(object1 == null) {
                        Class class0 = aigv.class;
                        synchronized(class0) {
                            hfvs0 = aigv.f;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)aigv.a));
                                aigv.f = hfvs0;
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

