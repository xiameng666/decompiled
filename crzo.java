import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.consent.SetConsentStatusRequest;
import j..util.Objects;

final class crzo implements Runnable {
    final Context a;
    final Long b;
    final hhcr c;
    final Long d;
    final crzq e;

    public crzo(crzq crzq0, Context context0, Long long0, hhcr hhcr0, Long long1) {
        this.a = context0;
        this.b = long0;
        this.c = hhcr0;
        this.d = long1;
        Objects.requireNonNull(crzq0);
        this.e = crzq0;
        super();
    }

    @Override
    public final void run() {
        long v = 0L;
        crzq crzq0 = this.e;
        String s = hvko.u();
        String s1 = crzq0.d.a;
        int v1 = (int)hvko.f();
        cryd cryd0 = new cryd(this.a, s, s1, v1);
        try {
            if(hvlb.f()) {
                String s2 = crzq0.d.d;
                int v2 = 0;
                Long long0 = this.b;
                int v3 = crzq0.d.e;
                hhcr hhcr0 = this.c;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhcu.a).v_newBuilder();
                SetConsentStatusRequest setConsentStatusRequest0 = crzq0.b;
                long v4 = setConsentStatusRequest0.b.getUuid().getMostSignificantBits();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hhcu)hftp0.b_message).b = v4;
                long v5 = setConsentStatusRequest0.b.getUuid().getLeastSignificantBits();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hhcu)hftp0.b_message).c = v5;
                hhcu hhcu0 = (hhcu)hftp0.N_build();
                Integer integer0 = (int)setConsentStatusRequest0.e;
                hfwn hfwn0 = hfyn.h(this.d.longValue());
                if(setConsentStatusRequest0 != null) {
                    Integer integer1 = setConsentStatusRequest0.f;
                    if(integer1 != null) {
                        v2 = (int)integer1;
                    }
                }
                Integer integer2 = v2;
                if(setConsentStatusRequest0 != null) {
                    Long long1 = setConsentStatusRequest0.g;
                    if(long1 != null) {
                        v = (long)long1;
                    }
                }
                cryd0.n(s2, long0, v3, hhcr0, hhcu0, integer0, hfwn0, integer2, Long.valueOf(v), ckjp.b);
            }
            else {
                int v6 = 0;
                String s3 = crzq0.d.d;
                Long long2 = this.b;
                int v7 = crzq0.d.e;
                hhcr hhcr1 = this.c;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hhcu.a).v_newBuilder();
                SetConsentStatusRequest setConsentStatusRequest1 = crzq0.b;
                long v8 = setConsentStatusRequest1.b.getUuid().getMostSignificantBits();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hhcu)hftp1.b_message).b = v8;
                long v9 = setConsentStatusRequest1.b.getUuid().getLeastSignificantBits();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hhcu)hftp1.b_message).c = v9;
                hhcu hhcu1 = (hhcu)hftp1.N_build();
                Integer integer3 = (int)setConsentStatusRequest1.e;
                hfwn hfwn1 = hfyn.h(this.d.longValue());
                if(setConsentStatusRequest1 != null) {
                    Integer integer4 = setConsentStatusRequest1.f;
                    if(integer4 != null) {
                        v6 = (int)integer4;
                    }
                }
                Integer integer5 = v6;
                if(setConsentStatusRequest1 != null) {
                    Long long3 = setConsentStatusRequest1.g;
                    if(long3 != null) {
                        v = (long)long3;
                    }
                }
                cryd0.m(s3, long2, v7, hhcr1, hhcu1, integer3, hfwn1, integer5, Long.valueOf(v));
            }
        }
        catch(acse acse0) {
            a.e(crzq.a.j(), "MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure: %s", new gpnd(gpnc.a, acse0.getMessage()), acse0);
            gfsx gfsx0 = gfsx.m(new Status(27009, "MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure."));
            this.e.b(gfsx0, this.c);
            return;
        }
        catch(iapl iapl0) {
            ggsu ggsu0 = crzq.a.j();
            Status status0 = crxw.a(iapl0);
            a.e(ggsu0, "StatusException while setting consent status: %s", new gpnd(gpnc.a, status0), iapl0);
            gfsx gfsx1 = gfsx.m(crxw.a(iapl0));
            this.e.b(gfsx1, this.c);
            return;
        }
        gfsx gfsx2 = gfsx.m(Status.b);
        this.e.b(gfsx2, this.c);
    }
}

