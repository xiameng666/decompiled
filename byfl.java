public final class byfl extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final byfl a;
    public hfvh b;
    public hfvh c;
    private static volatile Parser d;

    static {
        byfl byfl0 = new byfl();
        byfl.a = byfl0;
        ProtoLiteMessage.L(byfl.class, ((ProtoLiteMessage)byfl0));
    }

    private byfl() {
        this.b = hfvh.a;
        this.c = hfvh.a;
    }

    public final hfvh b() {
        hfvh hfvh0 = this.b;
        if(!hfvh0.b) {
            this.b = hfvh0.a();
        }
        return this.b;
    }

    public final hfvh c() {
        hfvh hfvh0 = this.c;
        if(!hfvh0.b) {
            this.c = hfvh0.a();
        }
        return this.c;
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
                    return new hfvw(((MessageLite)byfl.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"b", byfj.a, "c", byfk.a});
                }
                case 3: {
                    return new byfl();
                }
                case 4: {
                    return new ProtoLiteBuilder(null, null);
                }
                case 5: {
                    return byfl.a;
                }
                case 6: {
                    Object object1 = byfl.d;
                    if(object1 == null) {
                        Class class0 = byfl.class;
                        synchronized(class0) {
                            hfvs0 = byfl.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)byfl.a));
                                byfl.d = hfvs0;
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

