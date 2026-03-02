public final class aigx extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final aigx a;
    public hfvh b;
    private static volatile Parser c;

    static {
        aigx aigx0 = new aigx();
        aigx.a = aigx0;
        ProtoLiteMessage.L(aigx.class, ((ProtoLiteMessage)aigx0));
    }

    private aigx() {
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
                    return new hfvw(((MessageLite)aigx.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", aigw.a});
                }
                case 3: {
                    return new aigx();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)aigx.a));
                }
                case 5: {
                    return aigx.a;
                }
                case 6: {
                    Object object1 = aigx.c;
                    if(object1 == null) {
                        Class class0 = aigx.class;
                        synchronized(class0) {
                            hfvs0 = aigx.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)aigx.a));
                                aigx.c = hfvs0;
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

