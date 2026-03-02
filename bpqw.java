import com.google.android.gms.findmydevice.spot.sync.DismissNotificationIntentOperation;

public final class bpqw implements glzn {
    public final DismissNotificationIntentOperation a;

    public bpqw(DismissNotificationIntentOperation dismissNotificationIntentOperation0) {
        this.a = dismissNotificationIntentOperation0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gfqx gfqx0 = gfqx.a;
        fqza fqza0 = ((fqzl)object0).c == 22 ? ((fqza)((fqzl)object0).d) : fqza.a;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)fqza0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)fqza0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fqza fqza1 = (fqza)hftp0.b_message;
        fqza1.b &= -3;
        fqza1.f = 0;
        gfsx gfsx0 = gfsx.m(((fqza)hftp0.N_build()));
        return this.a.b.q(gfqx0, gfsx0, gfqx0);
    }
}

