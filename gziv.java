public final class gziv extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gziv a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gziv gziv0 = new gziv();
        gziv.a = gziv0;
        ProtoLiteMessage.L(gziv.class, ((ProtoLiteMessage)gziv0));
    }

    private gziv() {
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
                    return new hfvw(((MessageLite)gziv.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gziu.class});
                }
                case 3: {
                    return new gziv();
                }
                case 4: {
                    return new gzit();
                }
                case 5: {
                    return gziv.a;
                }
                case 6: {
                    Object object1 = gziv.c;
                    if(object1 == null) {
                        Class class0 = gziv.class;
                        synchronized(class0) {
                            hfvs0 = gziv.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gziv.a));
                                gziv.c = hfvs0;
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

