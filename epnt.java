public final class epnt extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final epnt a;
    public hfuo b;
    private static volatile Parser c;

    static {
        epnt epnt0 = new epnt();
        epnt.a = epnt0;
        ProtoLiteMessage.L(epnt.class, ((ProtoLiteMessage)epnt0));
    }

    private epnt() {
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
                    return new hfvw(((MessageLite)epnt.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", epng.class});
                }
                case 3: {
                    return new epnt();
                }
                case 4: {
                    return new epns();
                }
                case 5: {
                    return epnt.a;
                }
                case 6: {
                    Object object1 = epnt.c;
                    if(object1 == null) {
                        Class class0 = epnt.class;
                        synchronized(class0) {
                            hfvs0 = epnt.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)epnt.a));
                                epnt.c = hfvs0;
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

