public final class sfj extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final sfj a;
    public hfuo b;
    private static volatile Parser c;

    static {
        sfj sfj0 = new sfj();
        sfj.a = sfj0;
        ProtoLiteMessage.L(sfj.class, ((ProtoLiteMessage)sfj0));
    }

    private sfj() {
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
                    return new hfvw(((MessageLite)sfj.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", sfi.class});
                }
                case 3: {
                    return new sfj();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)sfj.a));
                }
                case 5: {
                    return sfj.a;
                }
                case 6: {
                    Object object1 = sfj.c;
                    if(object1 == null) {
                        Class class0 = sfj.class;
                        synchronized(class0) {
                            hfvs0 = sfj.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)sfj.a));
                                sfj.c = hfvs0;
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

