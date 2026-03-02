public final class hdtl extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hdtl a;
    public hfuo b;
    private static volatile Parser c;

    static {
        hdtl hdtl0 = new hdtl();
        hdtl.a = hdtl0;
        ProtoLiteMessage.L(hdtl.class, ((ProtoLiteMessage)hdtl0));
    }

    private hdtl() {
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
                    return new hfvw(((MessageLite)hdtl.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hdtk.class});
                }
                case 3: {
                    return new hdtl();
                }
                case 4: {
                    return new hdtg();
                }
                case 5: {
                    return hdtl.a;
                }
                case 6: {
                    Object object1 = hdtl.c;
                    if(object1 == null) {
                        Class class0 = hdtl.class;
                        synchronized(class0) {
                            hfvs0 = hdtl.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hdtl.a));
                                hdtl.c = hfvs0;
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

