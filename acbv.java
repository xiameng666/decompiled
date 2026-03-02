import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class acbv extends cjtm {
    private static final bboh a;
    private final baqr b;
    private final acbk c;
    private final acbb d;
    private final String e;
    private final acbn f;

    static {
        acbv.a = bboh.b("AppInvite", bbcu.aK);
    }

    public acbv(baqr baqr0, acbk acbk0, acbb acbb0, String s, acbn acbn0) {
        super(77, "AppInviteConvertInvitation");
        this.b = baqr0;
        this.c = acbk0;
        this.d = acbb0;
        this.e = s;
        this.f = acbn0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        Status status0;
        if(hour.f()) {
            ((ggtj)acbv.a.i()).x("AppInviteConvertInvitationOperationDisabled");
            acbn acbn0 = this.f;
            if(acbn0 != null) {
                acbn0.b(Status.f);
            }
        }
        else {
            try {
                baqr baqr0 = this.b;
                acbj acbj0 = this.c.a;
                String s = baqr0.d;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hijj.a).v_newBuilder();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hikg.a).v_newBuilder();
                String s1 = bbqr.c(this.e);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hikg hikg0 = (hikg)hftp1.b_message;
                hikg0.b |= 1;
                hikg0.c = s1;
                hikg hikg1 = (hikg)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hijj hijj0 = (hijj)hftp0.b_message;
                hikg1.getClass();
                hijj0.d = hikg1;
                hijj0.b |= 2;
                hijg hijg0 = acbj0.a(s);
                hijk hijk0 = null;
                if(hijg0 == null) {
                    ((ggtj)acbj.a.i()).x("Error creating ClientIdInfo");
                }
                else {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((hijj)hftp0.b_message).c = hijg0;
                    ((hijj)hftp0.b_message).b |= 1;
                    hikv hikv0 = acbj0.b();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hijj hijj1 = (hijj)hftp0.b_message;
                    hikv0.getClass();
                    hijj1.e = hikv0;
                    hijj1.b |= 4;
                    hijj hijj2 = (hijj)hftp0.N_build();
                    acbi acbi0 = new acbi(acbj0.b, baqr0, hijj.f, ((MessageLite)hijj2));
                    try {
                        try {
                            acbi0.d();
                        }
                        catch(acbd acbd1) {
                            acbd1.a();
                            throw acbd1;
                        }
                    }
                    catch(Throwable throwable0) {
                        hijk hijk1 = (hijk)acbi0.b(hijk.c);
                        throw throwable0;
                    }
                    hijk hijk2 = (hijk)acbi0.b(hijk.c);
                    if(acbi0.e()) {
                        ((ggtj)acbj.a.i()).z("Convert invitation failed due to error code: %d", acbi0.a());
                    }
                    else {
                        hijk0 = hijk2;
                    }
                }
                if(hijk0 == null) {
                    status0 = Status.d;
                }
                else {
                    aboh aboh0 = this.d.a();
                    this.d.b(aboh0, (hijk0.b == null ? hikc.a : hijk0.b));
                    status0 = Status.b;
                }
            }
            catch(acbd acbd0) {
                status0 = acbd0.b() ? new Status(4) : new Status(8);
            }
            acbn acbn1 = this.f;
            if(acbn1 != null) {
                acbn1.b(status0);
            }
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        acbn acbn0 = this.f;
        if(acbn0 != null) {
            acbn0.b(status0);
        }
    }
}

