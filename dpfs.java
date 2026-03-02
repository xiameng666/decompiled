public final class dpfs extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final dpfs a;
    public hfvh b;
    private static volatile Parser c;

    static {
        dpfs dpfs0 = new dpfs();
        dpfs.a = dpfs0;
        ProtoLiteMessage.L(dpfs.class, ((ProtoLiteMessage)dpfs0));
    }

    private dpfs() {
        this.b = hfvh.a;
    }

    public final hfvh b() {
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
                    return new hfvw(((MessageLite)dpfs.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", dpfr.a});
                }
                case 3: {
                    return new dpfs();
                }
                case 4: {
                    return new ProtoLiteBuilder(null, null);
                }
                case 5: {
                    return dpfs.a;
                }
                case 6: {
                    Object object1 = dpfs.c;
                    if(object1 == null) {
                        Class class0 = dpfs.class;
                        synchronized(class0) {
                            hfvs0 = dpfs.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)dpfs.a));
                                dpfs.c = hfvs0;
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

