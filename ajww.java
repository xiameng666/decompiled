public final class ajww extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ajww a;
    public hfvh b;
    public hfuo c;
    public int d;
    public boolean e;
    public long f;
    public boolean g;
    public hfvh h;
    private static volatile Parser i;

    static {
        ajww ajww0 = new ajww();
        ajww.a = ajww0;
        ProtoLiteMessage.L(ajww.class, ((ProtoLiteMessage)ajww0));
    }

    private ajww() {
        this.b = hfvh.a;
        this.h = hfvh.a;
        this.c = hfvv.a;
    }

    public final hfvh b() {
        hfvh hfvh0 = this.h;
        if(!hfvh0.b) {
            this.h = hfvh0.a();
        }
        return this.h;
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
                    return new hfvw(((MessageLite)ajww.a), "\u0004\u0007\u0000\u0000\u0001\u0007\u0007\u0002\u0001\u0000\u00012\u0002\u001B\u0003\u0004\u0004\u0007\u0005\u0002\u0006\u0007\u00072", new Object[]{"b", ajwv.a, "c", ajxc.class, "d", "e", "f", "g", "h", ajwu.a});
                }
                case 3: {
                    return new ajww();
                }
                case 4: {
                    return new ProtoLiteBuilder(null, null);
                }
                case 5: {
                    return ajww.a;
                }
                case 6: {
                    Object object1 = ajww.i;
                    if(object1 == null) {
                        Class class0 = ajww.class;
                        synchronized(class0) {
                            hfvs0 = ajww.i;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ajww.a));
                                ajww.i = hfvs0;
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

