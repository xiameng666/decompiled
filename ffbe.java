public final class ffbe extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ffbe a;
    public hfuo b;
    private static volatile Parser c;

    static {
        ffbe ffbe0 = new ffbe();
        ffbe.a = ffbe0;
        ProtoLiteMessage.L(ffbe.class, ((ProtoLiteMessage)ffbe0));
    }

    private ffbe() {
        this.b = hfvv.a;
    }

    public final void b() {
        hfuo hfuo0 = this.b;
        if(!hfuo0.c()) {
            this.b = ProtoLiteMessage.E(hfuo0);
        }
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
                    return new hfvw(((MessageLite)ffbe.a), "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001B", new Object[]{"b", ffbc.class});
                }
                case 3: {
                    return new ffbe();
                }
                case 4: {
                    return new ffbd();
                }
                case 5: {
                    return ffbe.a;
                }
                case 6: {
                    Object object1 = ffbe.c;
                    if(object1 == null) {
                        Class class0 = ffbe.class;
                        synchronized(class0) {
                            hfvs0 = ffbe.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ffbe.a));
                                ffbe.c = hfvs0;
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

