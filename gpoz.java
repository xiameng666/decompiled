public final class gpoz extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gpoz a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gpoz gpoz0 = new gpoz();
        gpoz.a = gpoz0;
        ProtoLiteMessage.L(gpoz.class, ((ProtoLiteMessage)gpoz0));
    }

    private gpoz() {
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
                    return new hfvw(((MessageLite)gpoz.a), "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gpoh.class});
                }
                case 3: {
                    return new gpoz();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gpoz.a));
                }
                case 5: {
                    return gpoz.a;
                }
                case 6: {
                    Object object1 = gpoz.c;
                    if(object1 == null) {
                        Class class0 = gpoz.class;
                        synchronized(class0) {
                            hfvs0 = gpoz.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gpoz.a));
                                gpoz.c = hfvs0;
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

