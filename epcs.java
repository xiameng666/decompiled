import android.accounts.Account;
import com.google.android.gms.setupservices.GoogleServicesChimeraActivity;
import com.google.android.gms.setupservices.item.GoogleServicesExpandableItem;
import com.google.android.setupdesign.items.SwitchItem;
import j..util.Objects;

public final class epcs extends epfe {
    public epdr a;
    public epdr b;
    public epdr c;
    final GoogleServicesChimeraActivity d;

    public epcs(GoogleServicesChimeraActivity googleServicesChimeraActivity0, boolean z) {
        Objects.requireNonNull(googleServicesChimeraActivity0);
        this.d = googleServicesChimeraActivity0;
        super(0x7F0B0B71, 16, 11, z);  // id:agree_play_bio_auth
    }

    @Override  // epfe
    public final epdd a() {
        epdd epdd0 = this.g(this.d, 0x7F0B1F74, 0x7F080712);  // id:section_google_play
        this.b = this.b == null ? epdr.c(this.d.G.d, 0x7F152ACD) : this.b;  // string:setupservices_google_play_bio_auth_summary "To prevent unauthorized purchases, 
                                                                            // use fingerprint or face to secure digital purchases made through Google Play. Any 
                                                                            // fingerprint or face stored on this device can verify purchases made with any payment 
                                                                            // method."
        this.c = this.c == null ? epdr.c(this.d.G.d, 0x7F152ACC) : this.c;  // string:setupservices_google_play_bio_auth_details "Your setting will apply to this 
                                                                            // Google Account on this device only. You can change it anytime in Google Play."
        this.a = this.a == null ? epdr.c(this.d.G.d, 0x7F152ACE) : this.a;  // string:setupservices_google_play_bio_auth_title "Use biometrics to verify purchases"
        ((GoogleServicesExpandableItem)epdd0).l(this.b);
        ((GoogleServicesExpandableItem)epdd0).m(this.c);
        epdd0.a = this.a;
        this.d.G.i(new epcy(((SwitchItem)epdd0)));
        return epdd0;
    }

    @Override  // epfe
    public final evql b() {
        Account account0 = this.d.o();
        this.d.G = new epee(this.d, account0, this.d.s, this.d.t);
        evql[] arr_evql = new evql[3];
        evql evql0 = epdq.a(hydh.a.c().D());
        evql0.b(new epco(this));
        arr_evql[0] = evql0;
        evql evql1 = epdq.a(hydh.a.c().C());
        evql1.b(new epcp(this));
        arr_evql[1] = evql1;
        evql evql2 = epdq.a(hydh.a.c().B());
        evql2.b(new epcq(this));
        arr_evql[2] = evql2;
        return evrg.f(arr_evql);
    }

    @Override  // epfe
    public final gahn c() {
        return new epcr(this);
    }

    @Override  // epfe
    public final void d(boolean z) {
        this.d.G.g();
    }

    @Override  // epfe
    public final boolean f() {
        return this.d.u ? false : this.d.G.c();
    }
}

