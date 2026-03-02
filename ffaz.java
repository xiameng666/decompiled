public final class ffaz extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ffaz a;
    public hfuo b;
    private static volatile Parser c;

    static {
        ffaz ffaz0 = new ffaz();
        ffaz.a = ffaz0;
        ProtoLiteMessage.L(ffaz.class, ((ProtoLiteMessage)ffaz0));
    }

    private ffaz() {
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
                    return new hfvw(((MessageLite)ffaz.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", ffbk.class});
                }
                case 3: {
                    return new ffaz();
                }
                case 4: {
                    return new ffay();
                }
                case 5: {
                    return ffaz.a;
                }
                case 6: {
                    Object object1 = ffaz.c;
                    if(object1 == null) {
                        Class class0 = ffaz.class;
                        synchronized(class0) {
                            hfvs0 = ffaz.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ffaz.a));
                                ffaz.c = hfvs0;
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

