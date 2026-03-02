public final class ctef extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ctef a;
    public int b;
    public hfvh c;
    public hfvh d;
    public hfvh e;
    public int f;
    public static final hfuj g;
    public static final hfuj h;
    private static volatile Parser i;

    static {
        ctef.g = new hfuj(ctee.e, ctee.d);
        ctef.h = new hfuj(cteb.e, cteb.d);
        ctef ctef0 = new ctef();
        ctef.a = ctef0;
        ProtoLiteMessage.L(ctef.class, ((ProtoLiteMessage)ctef0));
    }

    private ctef() {
        this.c = hfvh.a;
        this.d = hfvh.a;
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
        hfvh hfvh0 = this.c;
        if(!hfvh0.b) {
            this.c = hfvh0.a();
        }
        return this.c;
    }

    public final hfvh d() {
        hfvh hfvh0 = this.d;
        if(!hfvh0.b) {
            this.d = hfvh0.a();
        }
        return this.d;
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
                    return new hfvw(((MessageLite)ctef.a), "\u0004\u0005\u0000\u0000\u0001\u0006\u0005\u0003\u0000\u0000\u0001\f\u00022\u00032\u00052\u0006\f", new Object[]{"b", "c", ctdx.a, "d", ctdy.a, "e", ctdw.a, "f"});
                }
                case 3: {
                    return new ctef();
                }
                case 4: {
                    return new ProtoLiteBuilder(null, null);
                }
                case 5: {
                    return ctef.a;
                }
                case 6: {
                    Object object1 = ctef.i;
                    if(object1 == null) {
                        Class class0 = ctef.class;
                        synchronized(class0) {
                            hfvs0 = ctef.i;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ctef.a));
                                ctef.i = hfvs0;
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

