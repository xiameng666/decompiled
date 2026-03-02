public final class gpnm extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gpnm a;
    public hfuf b;
    public hfuo c;
    private static volatile Parser d;

    static {
        gpnm gpnm0 = new gpnm();
        gpnm.a = gpnm0;
        ProtoLiteMessage.L(gpnm.class, ((ProtoLiteMessage)gpnm0));
    }

    private gpnm() {
        this.b = hfty.a;
        this.c = hfvv.a;
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
                    return new hfvw(((MessageLite)gpnm.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\'\u0002\u001A", new Object[]{"b", "c"});
                }
                case 3: {
                    return new gpnm();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gpnm.a));
                }
                case 5: {
                    return gpnm.a;
                }
                case 6: {
                    Object object1 = gpnm.d;
                    if(object1 == null) {
                        Class class0 = gpnm.class;
                        synchronized(class0) {
                            hfvs0 = gpnm.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gpnm.a));
                                gpnm.d = hfvs0;
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

