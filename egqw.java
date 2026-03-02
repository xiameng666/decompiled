public final class egqw extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final egqw a;
    public hfvh b;
    private static volatile Parser c;

    static {
        egqw egqw0 = new egqw();
        egqw.a = egqw0;
        ProtoLiteMessage.L(egqw.class, ((ProtoLiteMessage)egqw0));
    }

    private egqw() {
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
                    return new hfvw(((MessageLite)egqw.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", egqv.a});
                }
                case 3: {
                    return new egqw();
                }
                case 4: {
                    return new egqu();
                }
                case 5: {
                    return egqw.a;
                }
                case 6: {
                    Object object1 = egqw.c;
                    if(object1 == null) {
                        Class class0 = egqw.class;
                        synchronized(class0) {
                            hfvs0 = egqw.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)egqw.a));
                                egqw.c = hfvs0;
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

