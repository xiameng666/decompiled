public final class hkdn extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkdn a;
    public hfuo b;
    public ByteString c;
    private static volatile Parser d;

    static {
        hkdn hkdn0 = new hkdn();
        hkdn.a = hkdn0;
        ProtoLiteMessage.L(hkdn.class, ((ProtoLiteMessage)hkdn0));
    }

    private hkdn() {
        this.b = hfvv.a;
        this.c = ByteString.b;
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
                    return new hfvw(((MessageLite)hkdn.a), "\u0004\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001C\u0003\n", new Object[]{"b", "c"});
                }
                case 3: {
                    return new hkdn();
                }
                case 4: {
                    return new hkdm();
                }
                case 5: {
                    return hkdn.a;
                }
                case 6: {
                    Object object1 = hkdn.d;
                    if(object1 == null) {
                        Class class0 = hkdn.class;
                        synchronized(class0) {
                            hfvs0 = hkdn.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkdn.a));
                                hkdn.d = hfvs0;
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

