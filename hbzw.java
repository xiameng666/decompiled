public final class hbzw extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hbzw a;
    public hfuo b;
    private static volatile Parser c;

    static {
        hbzw hbzw0 = new hbzw();
        hbzw.a = hbzw0;
        ProtoLiteMessage.L(hbzw.class, ((ProtoLiteMessage)hbzw0));
    }

    private hbzw() {
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
                    return new hfvw(((MessageLite)hbzw.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hbzv.class});
                }
                case 3: {
                    return new hbzw();
                }
                case 4: {
                    return new ProtoLiteBuilder(null, null);
                }
                case 5: {
                    return hbzw.a;
                }
                case 6: {
                    Object object1 = hbzw.c;
                    if(object1 == null) {
                        Class class0 = hbzw.class;
                        synchronized(class0) {
                            hfvs0 = hbzw.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hbzw.a));
                                hbzw.c = hfvs0;
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

