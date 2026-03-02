import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class acbu extends cjtm {
    private static final bboh a;
    private final baqr b;
    private final acbk c;
    private final acbb d;
    private final String e;
    private final acbn f;

    static {
        acbu.a = bboh.b("AppInvite", bbcu.aK);
    }

    public acbu(baqr baqr0, acbk acbk0, acbb acbb0, String s, acbn acbn0) {
        super(77, "AppInviteCompleteInvitation");
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
            ((ggtj)acbu.a.i()).x("AppInviteCompleteInvitationOperationDisabled");
            acbn acbn0 = this.f;
            if(acbn0 != null) {
                acbn0.b(Status.f);
            }
        }
        else {
            try {
                baqr baqr0 = this.b;
                String s = this.e;
                acbj acbj0 = this.c.a;
                String s1 = baqr0.d;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hijh.a).v_newBuilder();
                hijg hijg0 = acbj0.a(s1);
                hiji hiji0 = null;
                if(hijg0 == null) {
                    ((ggtj)acbj.a.i()).x("Error creating ClientIdInfo");
                }
                else {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((hijh)hftp0.b_message).c = hijg0;
                    ((hijh)hftp0.b_message).b |= 1;
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hikg.a).v_newBuilder();
                    String s2 = bbqr.c(s);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hikg hikg0 = (hikg)hftp1.b_message;
                    hikg0.b |= 1;
                    hikg0.c = s2;
                    hikg hikg1 = (hikg)hftp1.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hijh hijh0 = (hijh)hftp0.b_message;
                    hikg1.getClass();
                    hijh0.d = hikg1;
                    hijh0.b |= 2;
                    hikv hikv0 = acbj0.b();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hijh hijh1 = (hijh)hftp0.b_message;
                    hikv0.getClass();
                    hijh1.e = hikv0;
                    hijh1.b |= 4;
                    hijh hijh2 = (hijh)hftp0.N_build();
                    acbi acbi0 = new acbi(acbj0.b, baqr0, hijh.f, ((MessageLite)hijh2));
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
                        hiji hiji1 = (hiji)acbi0.b(hiji.d);
                        throw throwable0;
                    }
                    hiji hiji2 = (hiji)acbi0.b(hiji.d);
                    if(acbi0.e()) {
                        ((ggtj)acbj.a.i()).z("Complete invitation failed due to error code: %d", acbi0.a());
                    }
                    else {
                        hiji0 = hiji2;
                    }
                }
                if(hiji0 != null && (hiji0.b & 1) != 0) {
                    aboh aboh0 = this.d.a();
                    this.d.b(aboh0, (hiji0.c == null ? hikc.a : hiji0.c));
                    status0 = Status.b;
                }
                else {
                    status0 = Status.d;
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

