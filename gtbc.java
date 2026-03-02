public final class gtbc extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hfug a;
    public static final gtbc b;
    public hfuo c;
    public hfuo d;
    public hfuo e;
    public hfuf f;
    public hfuo g;
    public hfuf h;
    private static volatile Parser i;

    static {
        gtbc.a = new gtay();
        gtbc gtbc0 = new gtbc();
        gtbc.b = gtbc0;
        ProtoLiteMessage.L(gtbc.class, ((ProtoLiteMessage)gtbc0));
    }

    private gtbc() {
        this.c = hfvv.a;
        this.d = hfvv.a;
        this.e = hfvv.a;
        this.f = hfty.a;
        this.g = hfvv.a;
        this.h = hfty.a;
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
                    return new hfvw(((MessageLite)gtbc.b), "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0006\u0000\u0001\u001B\u0002\u001B\u0003\'\u0004\u001B\u0005,\u0006\u001B", new Object[]{"c", gtaz.class, "d", gtbb.class, "f", "g", gtan.class, "h", "e", gtba.class});
                }
                case 3: {
                    return new gtbc();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gtbc.b));
                }
                case 5: {
                    return gtbc.b;
                }
                case 6: {
                    Object object1 = gtbc.i;
                    if(object1 == null) {
                        Class class0 = gtbc.class;
                        synchronized(class0) {
                            hfvs0 = gtbc.i;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gtbc.b));
                                gtbc.i = hfvs0;
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

