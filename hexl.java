public final class hexl extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hexl a;
    public hfuo b;
    private static volatile Parser c;

    static {
        hexl hexl0 = new hexl();
        hexl.a = hexl0;
        ProtoLiteMessage.L(hexl.class, ((ProtoLiteMessage)hexl0));
    }

    private hexl() {
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
                    return new hfvw(((MessageLite)hexl.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hexk.class});
                }
                case 3: {
                    return new hexl();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hexl.a));
                }
                case 5: {
                    return hexl.a;
                }
                case 6: {
                    Object object1 = hexl.c;
                    if(object1 == null) {
                        Class class0 = hexl.class;
                        synchronized(class0) {
                            hfvs0 = hexl.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hexl.a));
                                hexl.c = hfvs0;
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

