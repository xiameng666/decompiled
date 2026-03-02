import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.google.android.gms.chimera.modules.accountsettings.AppContextProvider;

public final class aaek extends aadr {
    private final gsai c;
    private final aatb d;
    private final boolean e;
    private final boolean f;
    private final du g;
    private final baun h;
    private final fhrt i;
    private final Integer j;
    private final Long k;
    private final zed l;

    public aaek(gsai gsai0, aatb aatb0, boolean z, boolean z1, du du0, baun baun0, fhrt fhrt0, zed zed0, Long long0, Integer integer0, aahq aahq0, aaej aaej0) {
        super(aahq0, aaej0);
        this.c = gsai0;
        this.d = aatb0;
        this.e = z;
        this.f = z1;
        this.g = du0;
        this.h = baun0;
        this.i = fhrt0;
        this.l = zed0;
        this.j = integer0;
        this.k = long0;
    }

    @Override  // aady
    public final void a() {
        String s4;
        boolean z;
        gsae gsae0;
        aatb aatb0 = this.d;
        if(!aaua.c(aatb0)) {
            this.a.a(new IllegalArgumentException("No account"));
            return;
        }
        gsai gsai0 = this.c;
        String s = gsai0.c;
        int v = 2;
        if((gsai0.b & 2) == 0) {
            gsae0 = null;
        }
        else {
            gsae0 = gsai0.d;
            if(gsae0 == null) {
                gsae0 = gsae.a;
            }
        }
        String s1 = ccht.b(s, gsae0);
        if(s1 == null) {
            this.a.a(new IllegalArgumentException("No URL"));
            return;
        }
        if(!bbpr.c(AppContextProvider.a())) {
            this.a.a(new iapl(iapk.f));
            return;
        }
        try {
            if(hoju.m()) {
                z = this.e;
            }
            else {
                this.g.requireContext();
                z = false;
            }
            if(z) {
                v = 1;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dkwv.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((dkwv)hftv0).b = s1;
            String s2 = aatb0.b;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            s2.getClass();
            ((dkwv)hftv1).c = s2;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((dkwv)hftv2).d = z ? 1 : 3;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((dkwv)hftp0.b_message).e = v;
            int v1 = cchl.a().d;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp0.b_message;
            ((dkwv)hftv3).f = v1;
            String s3 = this.i.a;
            if(!hftv3.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp0.b_message;
            ((dkwv)hftv4).g = s3;
            boolean z1 = this.f;
            if(!hftv4.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((dkwv)hftp0.b_message).i = z1;
            zed zed0 = this.l;
            if(zed0 != null) {
                synchronized(zed0.d) {
                    s4 = zed0.b;
                }
                if(s4 != null) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((dkwv)hftp0.b_message).h = s4;
                }
            }
            Intent intent0 = dknn.a(((dkwv)hftp0.N_build()));
            if(hoju.c()) {
                Integer integer0 = this.j;
                if(integer0 != null) {
                    intent0.putExtra("extra.asResourceId", integer0);
                }
                Long long0 = this.k;
                if(long0 != null) {
                    intent0.putExtra("extra.prewarmTimestamp", long0);
                }
                intent0.putExtra("extra.asIsDeepLink", this.e);
            }
            if(this.e) {
                intent0.setFlags(0x2000000);
                xob xob0 = (xob)this.g.requireContext();
                this.g.startActivity(intent0);
                xob0.overridePendingTransition(0, 0);
            }
            else {
                this.g.startActivityForResult(intent0, 6);
            }
            this.b.a(true);
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            this.h.e("Error starting webview", activityNotFoundException0, new Object[0]);
            this.a.a(activityNotFoundException0);
        }
    }
}

