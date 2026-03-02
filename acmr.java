public final class acmr extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final acmr a;
    public hfvh b;
    public hfvh c;
    private static volatile Parser d;

    static {
        acmr acmr0 = new acmr();
        acmr.a = acmr0;
        ProtoLiteMessage.L(acmr.class, ((ProtoLiteMessage)acmr0));
    }

    private acmr() {
        this.b = hfvh.a;
        this.c = hfvh.a;
    }

    public final hfvh b() {
        hfvh hfvh0 = this.c;
        if(!hfvh0.b) {
            this.c = hfvh0.a();
        }
        return this.c;
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
                    return new hfvw(((MessageLite)acmr.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"b", acmq.a, "c", acmp.a});
                }
                case 3: {
                    return new acmr();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)acmr.a));
                }
                case 5: {
                    return acmr.a;
                }
                case 6: {
                    Object object1 = acmr.d;
                    if(object1 == null) {
                        Class class0 = acmr.class;
                        synchronized(class0) {
                            hfvs0 = acmr.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)acmr.a));
                                acmr.d = hfvs0;
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

