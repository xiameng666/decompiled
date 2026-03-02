public final class hlbm extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hlbm a;
    public hfuo b;
    private static volatile Parser c;

    static {
        hlbm hlbm0 = new hlbm();
        hlbm.a = hlbm0;
        ProtoLiteMessage.L(hlbm.class, ((ProtoLiteMessage)hlbm0));
    }

    private hlbm() {
        this.b = hfvv.a;
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
                    return new hfvw(((MessageLite)hlbm.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hlbk.class});
                }
                case 3: {
                    return new hlbm();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hlbm.a));
                }
                case 5: {
                    return hlbm.a;
                }
                case 6: {
                    Object object1 = hlbm.c;
                    if(object1 == null) {
                        Class class0 = hlbm.class;
                        synchronized(class0) {
                            hfvs0 = hlbm.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hlbm.a));
                                hlbm.c = hfvs0;
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

