public final class gzif extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gzif a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gzif gzif0 = new gzif();
        gzif.a = gzif0;
        ProtoLiteMessage.L(gzif.class, ((ProtoLiteMessage)gzif0));
    }

    private gzif() {
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
                    return new hfvw(((MessageLite)gzif.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gzie.class});
                }
                case 3: {
                    return new gzif();
                }
                case 4: {
                    return new gzid();
                }
                case 5: {
                    return gzif.a;
                }
                case 6: {
                    Object object1 = gzif.c;
                    if(object1 == null) {
                        Class class0 = gzif.class;
                        synchronized(class0) {
                            hfvs0 = gzif.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gzif.a));
                                gzif.c = hfvs0;
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

