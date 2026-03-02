import j..util.Objects;

final class arll implements arlj {
    final arlm a;
    private boolean b;

    public arll(arlm arlm0) {
        Objects.requireNonNull(arlm0);
        this.a = arlm0;
        super();
        this.b = false;
    }

    @Override  // arlj
    public final arkq a(hkyj hkyj0) {
        return this.a.c.a(hkyj0);
    }

    @Override  // arlj
    public final void c(hkyj hkyj0) {
        arlm.a.h("MultiTransport.onDisconnected %s", new Object[]{hkyj0.name()});
        switch(hkyj0.ordinal()) {
            case 0: {
                throw new IllegalArgumentException("Connection type is unspecified for onDisconnected.");
            }
            case 1: {
                arlm.a(this.a);
                break;
            }
            case 2: {
                arlm.b(this.a);
            }
        }
        this.a.c.c(hkyj0);
    }

    @Override  // arlj
    public final void q(int v, hkyj hkyj0) {
        switch(hkyj0.ordinal()) {
            case 0: {
                throw new IllegalArgumentException("Connection type is unspecified for onConnectionResult.");
            }
            case 1: {
                if(v == 0) {
                    v = 0;
                }
                else {
                    arlm.a(this.a);
                }
                break;
            }
            case 2: {
                if(v == 0) {
                    v = 0;
                }
                else {
                    arlm.b(this.a);
                }
            }
        }
        if(!this.b) {
            this.b = true;
            this.a.c.q(v, hkyj0);
        }
    }

    @Override  // arlj
    public final void r(asci asci0, hkyj hkyj0) {
        switch((asch.b(asci0.c) == null ? asch.a : asch.b(asci0.c)).ordinal()) {
            case 1: {
                if(((asci0.e == null ? asbt.a : asci0.e).b & 0x2000000) != 0) {
                    arlm.a.h("Cache target device Android ID from handshake.", new Object[0]);
                    this.a.h = (long)(asci0.e == null ? asbt.a : asci0.e).D;
                }
                this.a.c.r(asci0, hkyj0);
                return;
            }
            case 8: {
                hkyj hkyj1 = hkyj.b;
                if(hkyj0.equals(hkyj1)) {
                    arlm arlm0 = this.a;
                    if(!arlm0.e.equals(hkyj1) && !arlm0.i) {
                        arlm.a.f("Cannot process REQUEST_ITEM packet from USB because the USB channel is not authenticated yet, shuts down UsbTransport.", new Object[0]);
                        armp armp0 = arlm0.g;
                        gftb.z(armp0, "UsbTransport is null when calling shutdown.");
                        armp0.f();
                        return;
                    }
                }
                this.a.c.r(asci0, hkyj0);
                return;
            }
            case 21: {
                if(((asci0.j == null ? asbr.a : asci0.j).b & 1) != 0) {
                    arlm arlm1 = this.a;
                    if(arlm1.h != null && (asci0.j == null ? asbr.a : asci0.j).c == ((long)arlm1.h)) {
                        arlm.a.h("Duplexing USB authentication succeeds.", new Object[0]);
                        arlm1.i = true;
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)asci.a).v_newBuilder();
                        asch asch0 = asch.v;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((asci)hftp0.b_message).c = asch0.y;
                        ((asci)hftp0.b_message).b |= 1;
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)asbr.a).v_newBuilder();
                        long v = bbmq.f(arlm1.d);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        asbr asbr0 = (asbr)hftp1.b_message;
                        asbr0.b |= 1;
                        asbr0.c = v;
                        asbr asbr1 = (asbr)hftp1.N_build();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        asci asci1 = (asci)hftp0.b_message;
                        asbr1.getClass();
                        asci1.j = asbr1;
                        asci1.b |= 0x200;
                        asci asci2 = (asci)hftp0.N_build();
                        armp armp1 = arlm1.g;
                        gftb.z(armp1, "UsbTransport is null when calling sendPacket.");
                        armp1.n(asci2.toBytesArray());
                        return;
                    }
                }
                arlm.a.h("Duplexing USB authentication fails, shuts down UsbTransport.", new Object[0]);
                armp armp2 = this.a.g;
                gftb.z(armp2, "UsbTransport is null when calling shutdown.");
                armp2.f();
                return;
            }
            default: {
                this.a.c.r(asci0, hkyj0);
            }
        }
    }

    @Override  // arlj
    public final void t() {
        this.a.c.t();
    }
}

