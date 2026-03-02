import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;

public final class azuf {
    private final aztl a;
    private final aztc b;
    private final azti c;
    private aztj d;
    private aztm e;
    private aztd f;
    private bbdp g;

    public azuf() {
        aztl aztl0 = new aztl();
        aztl0.a = true;
        aztl0.i = (byte)(aztl0.i | 3);
        aztl0.e(bbdq.b);
        aztl0.a(1);
        aztl0.b(1);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfkb.b).v_newBuilder();
        hfka hfka0 = hfka.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfkb hfkb0 = (hfkb)hftp0.b_message;
        hfkb0.d = hfka0.a();
        aztl0.f(((hfkb)hftp0.N_build()));
        aztl0.c(true);
        aztl0.d(false);
        this.a = aztl0;
        aztc aztc0 = new aztc();
        aztc0.b(false);
        aztc0.a(false);
        this.b = aztc0;
        this.c = new azti();
    }

    public final azug a() {
        this.d = new aztj(this.c.a, this.c.b);
        aztl aztl0 = this.a;
        if(aztl0.i == 0x3F) {
            bbdq bbdq0 = aztl0.b;
            if(bbdq0 != null) {
                hfkb hfkb0 = aztl0.f;
                if(hfkb0 != null) {
                    this.e = new aztm(aztl0.a, bbdq0, aztl0.c, aztl0.d, aztl0.e, hfkb0, aztl0.g, aztl0.h);
                    aztc aztc0 = this.b;
                    if(aztc0.c != 3) {
                        StringBuilder stringBuilder0 = new StringBuilder();
                        if((aztc0.c & 1) == 0) {
                            stringBuilder0.append(" publiclyAccessibleApi");
                        }
                        if((aztc0.c & 2) == 0) {
                            stringBuilder0.append(" binderCallbackPropagationExpected");
                        }
                        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
                    }
                    this.f = new aztd(aztc0.a, aztc0.b);
                    if(this.d != null && this.e != null && this.g != null) {
                        return new azug(this.d, this.e, this.f, this.g);
                    }
                    StringBuilder stringBuilder1 = new StringBuilder();
                    if(this.d == null) {
                        stringBuilder1.append(" callerInfo");
                    }
                    if(this.e == null) {
                        stringBuilder1.append(" complianceMetadata");
                    }
                    if(this.f == null) {
                        stringBuilder1.append(" apiInfo");
                    }
                    if(this.g == null) {
                        stringBuilder1.append(" moduleId");
                    }
                    throw new IllegalStateException("Missing required properties:" + stringBuilder1.toString());
                }
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        if((aztl0.i & 1) == 0) {
            stringBuilder2.append(" dataWasForwardedFromClient");
        }
        if((aztl0.i & 2) == 0) {
            stringBuilder2.append(" dataForwardingDenialExpected");
        }
        if(aztl0.b == null) {
            stringBuilder2.append(" processingProductId");
        }
        if((aztl0.i & 4) == 0) {
            stringBuilder2.append(" callerProductId");
        }
        if((aztl0.i & 8) == 0) {
            stringBuilder2.append(" dataOwnerProductId");
        }
        if(aztl0.f == null) {
            stringBuilder2.append(" processingPurpose");
        }
        if((aztl0.i & 16) == 0) {
            stringBuilder2.append(" isUserData");
        }
        if((aztl0.i & 0x20) == 0) {
            stringBuilder2.append(" metadataIsPropagatedFromClient");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder2.toString());
    }

    public final void b(ApiMetadata apiMetadata0) {
        if(apiMetadata0 == null) {
            this.a.d(false);
            return;
        }
        aztl aztl0 = this.a;
        aztl0.d(true);
        ComplianceOptions complianceOptions0 = apiMetadata0.complianceOptions_;
        if(complianceOptions0 != null) {
            hfka hfka0 = hfka.b(complianceOptions0.d) == null ? hfka.a : hfka.b(complianceOptions0.d);
            aztl0.a(complianceOptions0.b);
            aztl0.b(complianceOptions0.c);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfkb.b).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hfkb hfkb0 = (hfkb)hftp0.b_message;
            hfkb0.d = hfka0.a();
            aztl0.f(((hfkb)hftp0.N_build()));
            aztl0.c(complianceOptions0.e);
        }
        this.b.a(apiMetadata0.d);
    }

    public final void c(String s) {
        this.c.b = s;
    }

    public final void d(String s) {
        this.c.a = s;
    }

    public final void e(bbdp bbdp0) {
        if(bbdp0 == null) {
            throw new NullPointerException("Null moduleId");
        }
        this.g = bbdp0;
    }

    public final void f(azud azud0) {
        this.a.c = azud0;
    }

    public final void g(bbdq bbdq0) {
        this.a.e(bbdq0);
    }

    public final void h(boolean z) {
        this.b.b(z);
    }
}

