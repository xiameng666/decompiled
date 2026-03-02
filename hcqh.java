public final class hcqh extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hcqh a;
    public hfui b;
    public hfuo c;
    public hfuo d;
    public static final hfta e;
    private static volatile Parser f;

    static {
        hcqh hcqh0 = new hcqh();
        hcqh.a = hcqh0;
        ProtoLiteMessage.L(hcqh.class, ((ProtoLiteMessage)hcqh0));
        hcqh.e = ProtoLiteMessage.Q(((MessageLite)hcos.a), hcqh0, ((MessageLite)hcqh0), 1000, hfxe.k);
    }

    private hcqh() {
        this.b = hfvb.a;
        this.c = hfvv.a;
        this.d = hfvv.a;
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
                    return new hfvw(((MessageLite)hcqh.a), "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001%\u0002\u001B\u0003\u001B", new Object[]{"b", "c", hcjm.class, "d", hcjm.class});
                }
                case 3: {
                    return new hcqh();
                }
                case 4: {
                    return new hcqg();
                }
                case 5: {
                    return hcqh.a;
                }
                case 6: {
                    Object object1 = hcqh.f;
                    if(object1 == null) {
                        Class class0 = hcqh.class;
                        synchronized(class0) {
                            hfvs0 = hcqh.f;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hcqh.a));
                                hcqh.f = hfvs0;
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

