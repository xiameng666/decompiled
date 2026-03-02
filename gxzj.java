public final class gxzj extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gxzj a;
    public ByteString b;
    public ByteString c;
    public boolean d;
    private static volatile Parser e;

    static {
        gxzj gxzj0 = new gxzj();
        gxzj.a = gxzj0;
        ProtoLiteMessage.L(gxzj.class, ((ProtoLiteMessage)gxzj0));
    }

    private gxzj() {
        this.b = ByteString.b;
        this.c = ByteString.b;
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
                    return new hfvw(((MessageLite)gxzj.a), "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003\u0007", new Object[]{"b", "c", "d"});
                }
                case 3: {
                    return new gxzj();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gxzj.a));
                }
                case 5: {
                    return gxzj.a;
                }
                case 6: {
                    Object object1 = gxzj.e;
                    if(object1 == null) {
                        Class class0 = gxzj.class;
                        synchronized(class0) {
                            hfvs0 = gxzj.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gxzj.a));
                                gxzj.e = hfvs0;
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

