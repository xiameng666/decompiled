import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

public final class acbx extends cjtm {
    private static final bboh a;
    private final baqr b;
    private final acbn c;

    static {
        bboh.b("GetInvitationOp", bbcu.aK);
        acbx.a = bboh.b("AppInvite", bbcu.aK);
    }

    public acbx(baqr baqr0, acbn acbn0) {
        super(77, "AppInviteGetInvitation");
        this.b = baqr0;
        this.c = acbn0;
    }

    private static final void b(String s, String s1, Bundle bundle0) {
        if(s1 != null) {
            bundle0.putString(s, s1);
        }
    }

    @Override  // cjtm
    public final void f(Context context0) {
        Status status0;
        Intent intent0;
        if(hour.f()) {
            ((ggtj)acbx.a.i()).x("AppInviteGetInvitationOperationDisabled");
            acbn acbn0 = this.c;
            if(acbn0 != null) {
                acbn0.a(Status.f, null);
            }
        }
        else {
            String s = this.b.d;
            if(acfi.l(context0, s)) {
                bakc bakc0 = acfi.b(context0, s);
                String s1 = bakc0.getString("deepLink", null);
                boolean z = bakc0.getBoolean("isNewInstall", false);
                String s2 = bakc0.getString("invitationId", null);
                intent0 = new Intent("android.intent.action.VIEW").putExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE", acaz.a(s2, s1, z)).setPackage(s);
                if(s1 != null) {
                    try {
                        intent0.setData(Uri.parse(s1));
                    }
                    catch(Exception unused_ex) {
                    }
                }
            }
            else {
                intent0 = null;
            }
            if(intent0 == null) {
                status0 = Status.f;
            }
            else if(!acfi.k("hasReturnedInvitation", true, context0, s)) {
                status0 = Status.b;
            }
            else {
                status0 = Status.f;
            }
            acbn acbn1 = this.c;
            if(acbn1 != null) {
                acbn1.a(status0, intent0);
            }
            acfi.o("hasReturnedInvitation", context0, s);
            if(!Status.f.equals(status0)) {
                if(s != null && acfi.l(context0, s) && !acfi.k("scionInstallEvent", true, context0, s) && acfi.g(context0, s) != null) {
                    acfi.o("scionInstallEvent", context0, s);
                    Bundle bundle0 = new Bundle();
                    acbx.b("source", acfi.i("scionSource", context0, s), bundle0);
                    acbx.b("medium", acfi.i("scionMedium", context0, s), bundle0);
                    acbx.b("campaign", acfi.g(context0, s), bundle0);
                    crqy.a(context0).b("fdl", "_cmp", bundle0, s);
                    acbx.b("dynamic_link_link_id", acfi.i("scionLinkId", context0, s), bundle0);
                    acbx.b("dynamic_link_link_name", acfi.i("scionLinkName", context0, s), bundle0);
                    bundle0.putLong("dynamic_link_accept_time", acfi.c(context0, s).longValue());
                    if(acfi.m(context0, s)) {
                        crqy.a(context0).b("fdl", "dynamic_link_first_open", bundle0, s);
                    }
                    else {
                        crqy.a(context0).b("fdl", "dynamic_link_app_open", bundle0, s);
                        if(acfi.n(context0, s)) {
                            crqy.a(context0).b("fdl", "dynamic_link_app_update", bundle0, s);
                        }
                    }
                }
                acbc acbc0 = new acbc(null);
                int v = acfi.p(context0, s);
                boolean z1 = acfi.m(context0, s);
                boolean z2 = acfi.n(context0, s);
                String s3 = acfi.f(context0, s);
                int v1 = hikz.a(acfi.a(context0, s));
                String s4 = acfi.d(context0, s);
                String s5 = acfi.e(context0, s);
                String s6 = acfi.h(context0, s);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giin.a).v_newBuilder();
                if(!TextUtils.isEmpty(s)) {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giix.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    giix giix0 = (giix)hftp1.b_message;
                    s.getClass();
                    giix0.b |= 2;
                    giix0.c = s;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    giin giin0 = (giin)hftp0.b_message;
                    giix giix1 = (giix)hftp1.N_build();
                    giix1.getClass();
                    giin0.c = giix1;
                    giin0.b |= 1;
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((giin)hftp0.b_message).d = v - 1;
                ((giin)hftp0.b_message).b |= 2;
                if(!TextUtils.isEmpty(s4) || !TextUtils.isEmpty(s5)) {
                    giis giis0 = acbc.c(s4, s5, s3, v1, "");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    giin giin1 = (giin)hftp0.b_message;
                    giis0.getClass();
                    giin1.e = giis0;
                    giin1.b |= 4;
                }
                int v2 = acbc.d(z1, z2);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((giin)hftp0.b_message).f = v2 - 1;
                ((giin)hftp0.b_message).b |= 8;
                acbc0.f(((giin)hftp0.N_build()), 12, s6);
                acfi.j(context0, this.b.d);
            }
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        acbn acbn0 = this.c;
        if(acbn0 != null) {
            acbn0.a(status0, new Intent());
        }
    }
}

