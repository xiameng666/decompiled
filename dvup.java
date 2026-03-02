import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dvup implements kar {
    public final dvuz a;
    public final gged_interceptors b;
    public final gfsx c;
    public final gged_interceptors d;
    public final gfsx e;
    public final Valuable f;

    public dvup(dvuz dvuz0, gged_interceptors gged0, gfsx gfsx0, gged_interceptors gged1, gfsx gfsx1, Valuable valuable0) {
        this.a = dvuz0;
        this.b = gged0;
        this.c = gfsx0;
        this.d = gged1;
        this.e = gfsx1;
        this.f = valuable0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        gfsx gfsx3;
        gged_interceptors gged5;
        gfsx gfsx2;
        gged_interceptors gged2;
        if(((gfsx)object0).i()) {
            gged_interceptors gged0 = this.b;
            gged_interceptors gged1 = ((dybm)((gfsx)object0).d()).a;
            ggdy ggdy0 = new ggdy();
            for(int v = 0; v < ((ggna)gged0).c; ++v) {
                Long long0 = (Long)gged0.get(v);
                if(!gged1.contains(long0)) {
                    ggdy0.i(long0);
                }
            }
            gged2 = ggdy0.h();
        }
        else {
            gged2 = ggna.a;
        }
        gfsx gfsx0 = this.c;
        dvuz dvuz0 = this.a;
        dvuz0.v = gged2;
        if(gfsx0.i()) {
            gfsx gfsx1 = ((dybm)((gfsx)object0).d()).b;
            Object object1 = gfsx0.d();
            if(gfsx1.i()) {
                guvs guvs0 = guvs.b(((guvt)object1).c);
                if(guvs0 == null) {
                    guvs0 = guvs.c;
                }
                gfsx2 = guvs0.equals(gfsx1.d()) ? gfqx.a : gfsx.m(object1);
            }
            else {
                gfsx2 = gfsx.m(object1);
            }
        }
        else {
            gfsx2 = gfqx.a;
        }
        if(((gfsx)object0).i()) {
            gged_interceptors gged3 = this.d;
            gged_interceptors gged4 = ((dybm)((gfsx)object0).d()).c;
            ggdy ggdy1 = new ggdy();
            for(int v1 = 0; v1 < ((ggna)gged3).c; ++v1) {
                String s = (String)gged3.get(v1);
                if(!gged4.contains(s) && (!hwei.c() || dvuz0.u.contains(s))) {
                    ggdy1.i(s);
                }
            }
            gged5 = ggdy1.h();
        }
        else {
            gged5 = ggna.a;
        }
        if(((gfsx)object0).i()) {
            gfsx3 = this.e;
            if(((dybm)((gfsx)object0).d()).d) {
                gfsx3 = gfqx.a;
            }
        }
        else {
            gfsx3 = gfqx.a;
        }
        if(dvuz0.x.b && !dvuz0.v.isEmpty()) {
            dvuz0.f = true;
            if(hwfk.i() && dvuz0.R.a.a != fuor.b) {
                dvuz0.c();
                return;
            }
            dvuz0.d.q(0x7F152337);  // string:pay_valuable_issuer_message_callout_content "You have a new message"
            dvul dvul0 = new dvul(dvuz0);
            dvuz0.d.p(0x7F152338, dvul0);  // string:pay_valuable_issuer_message_callout_cta "View message"
            dvuz0.d.m(0x7F0805E0);  // drawable:gs_notifications_vd_theme_24
            dvuz0.d.setVisibility(0);
            dvuz0.B.l(((Valuable)dvuz0.r.d()), 7, 3);
            return;
        }
        Valuable valuable0 = this.f;
        if(gfsx2.i() && hwvv.c()) {
            Object object2 = gfsx2.d();
            dvuz0.d.n(((guvt)object2).b);
            dvuk dvuk0 = new dvuk(dvuz0, valuable0.b, ((guvt)object2));
            dvuz0.d.p(0x7F151FF1, dvuk0);  // string:pay_onboarding_button_got_it "Got it"
            dvuz0.d.m(0x7F0805E0);  // drawable:gs_notifications_vd_theme_24
            dvuz0.d.setVisibility(0);
            return;
        }
        if(!gged5.isEmpty()) {
            dvuz0.d.q(0x7F152434);  // string:pay_wallet_passes_new_alps_title "Linked pass added"
            dvuq dvuq0 = new dvuq(dvuz0, valuable0.b, gged5);
            dvuz0.d.p(0x7F152433, dvuq0);  // string:pay_wallet_passes_new_alps_action "View pass"
            dvuz0.d.m(0x7F0805E0);  // drawable:gs_notifications_vd_theme_24
            dvuz0.d.setVisibility(0);
            dvuz0.B.l(((Valuable)dvuz0.r.d()), 8, 3);
            return;
        }
        if(gfsx3.i()) {
            Object object3 = gfsx3.d();
            dvuz0.d.n(((guvq)object3).b);
            dvue dvue0 = new dvue(dvuz0, valuable0.b);
            dvuz0.d.p(0x7F151FF1, dvue0);  // string:pay_onboarding_button_got_it "Got it"
            dvuz0.d.m(0x7F0804CE);  // drawable:gs_archive_vd_theme_48
            dvuz0.d.setVisibility(0);
            return;
        }
        dvuz0.d.setVisibility(8);
    }
}

