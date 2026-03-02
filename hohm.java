public final class hohm extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hohm a;
    public hfuo b;
    private static volatile Parser c;

    static {
        hohm hohm0 = new hohm();
        hohm.a = hohm0;
        ProtoLiteMessage.L(hohm.class, ((ProtoLiteMessage)hohm0));
    }

    private hohm() {
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
                    return new hfvw(((MessageLite)hohm.a), "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001B", new Object[]{"b", hogz.class});
                }
                case 3: {
                    return new hohm();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hohm.a));
                }
                case 5: {
                    return hohm.a;
                }
                case 6: {
                    Object object1 = hohm.c;
                    if(object1 == null) {
                        Class class0 = hohm.class;
                        synchronized(class0) {
                            hfvs0 = hohm.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hohm.a));
                                hohm.c = hfvs0;
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

