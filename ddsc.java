import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.Feature;
import com.google.android.gms.nearby.sharing.DeviceVisibility;
import com.google.android.gms.nearby.sharing.ShareTarget;

public final class ddsc extends azts implements dcmf {
    public static final int a;
    private static final azta_api b;

    static {
        ddsc.b = new azta_api("Nearby.SHARING_API", new ddrr(), new azss());
    }

    public ddsc(Context context0, dcnc dcnc0) {
        super(context0, ddsc.b, dcnc0, aztr_settings.a);
    }

    @Override  // dcmf
    public final evql A(DeviceVisibility deviceVisibility0) {
        azzc azzc0 = new azzc();
        azzc0.a = new ddpy(deviceVisibility0);
        azzc0.c = new Feature[]{cumh.G};
        azzc0.d = 0x50D;
        return this.jn(azzc0.a());
    }

    @Override  // dcmf
    public final evql B(boolean z) {
        azzc azzc0 = new azzc();
        azzc0.a = new ddre(z);
        azzc0.c = new Feature[]{cumh.a};
        azzc0.d = 1240;
        return this.jn(azzc0.a());
    }

    @Override  // dcmf
    public final evql C(boolean z) {
        azzc azzc0 = new azzc();
        azzc0.a = new ddqm(z);
        azzc0.c = new Feature[]{cumh.b};
        azzc0.d = 0x527;
        return this.jn(azzc0.a());
    }

    @Override  // dcmf
    public final evql D(int v) {
        azzc azzc0 = new azzc();
        azzc0.a = new ddqj(v);
        azzc0.c = new Feature[]{cumh.a};
        azzc0.d = 0x4DC;
        return this.jn(azzc0.a());
    }

    @Override  // dcmf
    public final evql E(dckg dckg0) {
        azzc azzc0 = new azzc();
        azzc0.a = new ddqz(this, dckg0);
        azzc0.c = new Feature[]{cumh.X};
        azzc0.d = 0x553;
        return this.iG(azzc0.a());
    }

    @Override  // dcmf
    public final evql F() {
        azzc azzc0 = new azzc();
        azzc0.a = new ddrn();
        azzc0.c = new Feature[]{cumh.X};
        azzc0.d = 0x554;
        return this.iG(azzc0.a());
    }

    @Override  // dcmf
    public final evql G() {
        azzc azzc0 = new azzc();
        azzc0.a = new ddqn(this);
        azzc0.c = new Feature[]{cumh.S};
        azzc0.d = 1310;
        return this.iG(azzc0.a());
    }

    @Override  // dcmf
    public final void H(Account account0, int v) {
        azzc azzc0 = new azzc();
        azzc0.a = new ddqo(account0, v);
        azzc0.c = new Feature[]{cumh.d};
        azzc0.d = 1260;
        this.jn(azzc0.a());
    }

    @Override  // dcmf
    public final evql I(dbzg dbzg0) {
        azyf azyf0 = this.iD(dbzg0, "ReceiveSurface" + dbzg.class.getName());
        ddoj ddoj0 = new ddoj(azyf0);
        ddro ddro0 = new ddro(ddoj0);
        ddrp ddrp0 = new ddrp(ddoj0);
        azyq azyq0 = new azyq();
        azyq0.a = ddro0;
        azyq0.b = ddrp0;
        azyq0.c = azyf0;
        azyq0.d = new Feature[]{cumh.a};
        azyq0.e = 0x574;
        return this.iH(azyq0.a());
    }

    @Override  // dcmf
    public final void J(dcnp dcnp0) {
        dbvz dbvz0 = new dbvz();
        dbvz0.b(0);
        dbvz0.a = null;
        this.r(dcnp0, dbvz0.a());
    }

    @Override  // dcmf
    public final void K(dcnp dcnp0, dclv dclv0, int v) {
        dclo dclo0 = new dclo();
        dclo0.c = v;
        dclo0.a = 0;
        this.s(dcnp0, dclv0, dclo0.a());
    }

    @Override  // dcmf
    public final void L(dbzg dbzg0) {
        this.jm(azyg.a(dbzg0, "ReceiveSurface" + dbzg.class.getName()), 0x575);
    }

    @Override  // dcmf
    public final void M(dcnp dcnp0) {
        this.jm(azyg.a(dcnp0, "ReceiveSurface" + dcnp.class.getName()), 0x505);
    }

    @Override  // dcmf
    public final void N(dcnp dcnp0) {
        this.jm(azyg.a(dcnp0, "SendSurface" + dcnp.class.getName()), 0x504);
    }

    @Override  // dcmf
    public final void O(dcng dcng0) {
        this.jm(azyg.a(dcng0, "dcng"), 0x56D);
    }

    @Override  // dcmf
    public final evql b(ShareTarget shareTarget0) {
        azzc azzc0 = new azzc();
        azzc0.a = new ddqg(shareTarget0);
        azzc0.c = new Feature[]{cumh.a};
        azzc0.d = 0x4E1;
        return this.jn(azzc0.a());
    }

    @Override  // dcmf
    public final evql c(ShareTarget shareTarget0) {
        azzc azzc0 = new azzc();
        azzc0.a = new ddrg(shareTarget0);
        azzc0.c = new Feature[]{cumh.a};
        azzc0.d = 0x4E3;
        return this.jn(azzc0.a());
    }

    @Override  // dcmf
    public final evql d() {
        azzc azzc0 = new azzc();
        azzc0.a = new ddrc();
        azzc0.c = new Feature[]{cumh.ad};
        azzc0.d = 0x571;
        return this.jn(azzc0.a());
    }

    @Override  // dcmf
    public final evql e() {
        azzc azzc0 = new azzc();
        azzc0.a = new ddqb(this);
        azzc0.c = new Feature[]{cumh.a};
        azzc0.d = 0x4EA;
        return this.iG(azzc0.a());
    }

    @Override  // dcmf
    public final evql f(ShareTarget shareTarget0) {
        azzc azzc0 = new azzc();
        azzc0.a = new ddrl(this, shareTarget0);
        azzc0.c = new Feature[]{cumh.U};
        azzc0.d = 0x526;
        return this.iG(azzc0.a());
    }

    @Override  // dcmf
    public final evql g() {
        azzc azzc0 = new azzc();
        azzc0.a = new ddqw(this);
        azzc0.c = new Feature[]{cumh.a};
        azzc0.d = 0x4E5;
        return this.iG(azzc0.a());
    }

    @Override  // dcmf
    public final evql h() {
        azzc azzc0 = new azzc();
        azzc0.a = new ddqs(this);
        azzc0.c = new Feature[]{cumh.a};
        azzc0.d = 0x4DB;
        return this.iG(azzc0.a());
    }

    @Override  // dcmf
    public final evql i() {
        azzc azzc0 = new azzc();
        azzc0.a = new ddqc(this);
        azzc0.c = new Feature[]{cumh.a};
        azzc0.d = 0x4DF;
        return this.iG(azzc0.a());
    }

    @Override  // dcmf
    public final evql j() {
        azzc azzc0 = new azzc();
        azzc0.a = new ddql(this);
        azzc0.c = new Feature[]{cumh.G};
        azzc0.d = 0x50C;
        return this.iG(azzc0.a());
    }

    @Override  // dcmf
    public final evql k() {
        azzc azzc0 = new azzc();
        azzc0.a = new ddqd(this);
        azzc0.c = new Feature[]{cumh.b};
        azzc0.d = 1320;
        return this.iG(azzc0.a());
    }

    @Override  // dcmf
    public final evql l() {
        azzc azzc0 = new azzc();
        azzc0.a = new ddrj(this);
        azzc0.c = new Feature[]{cumh.ad};
        azzc0.d = 0x572;
        return this.iG(azzc0.a());
    }

    @Override  // dcmf
    public final evql m() {
        azzc azzc0 = new azzc();
        azzc0.a = new ddqk(this);
        azzc0.c = new Feature[]{cumh.a};
        azzc0.d = 0x4D9;
        return this.iG(azzc0.a());
    }

    @Override  // dcmf
    public final evql n() {
        azzc azzc0 = new azzc();
        azzc0.a = new ddpw(this);
        azzc0.c = new Feature[]{cumh.H};
        azzc0.d = 1308;
        return this.iG(azzc0.a());
    }

    @Override  // dcmf
    public final evql o() {
        azzc azzc0 = new azzc();
        azzc0.a = new ddri(this);
        azzc0.c = new Feature[]{cumh.a};
        azzc0.d = 0x4D7;
        return this.iG(azzc0.a());
    }

    @Override  // dcmf
    public final evql p(ShareTarget shareTarget0) {
        azzc azzc0 = new azzc();
        azzc0.a = new ddqr(shareTarget0);
        azzc0.c = new Feature[]{cumh.a};
        azzc0.d = 0x4E4;
        return this.jn(azzc0.a());
    }

    @Override  // dcmf
    public final evql q() {
        azzc azzc0 = new azzc();
        azzc0.a = new ddqa();
        azzc0.c = new Feature[]{cumh.a};
        azzc0.d = 0x4D6;
        return this.jn(azzc0.a());
    }

    @Override  // dcmf
    public final evql r(dcnp dcnp0, dcky dcky0) {
        azyf azyf0 = this.iD(dcnp0, "ReceiveSurface" + dcnp.class.getName());
        ddul ddul0 = new ddul(azyf0);
        ddqt ddqt0 = new ddqt(ddul0, dcky0);
        ddqu ddqu0 = new ddqu(ddul0);
        azyq azyq0 = new azyq();
        azyq0.a = ddqt0;
        azyq0.b = ddqu0;
        azyq0.c = azyf0;
        azyq0.d = new Feature[]{cumh.a};
        azyq0.e = 0x501;
        return this.iH(azyq0.a());
    }

    @Override  // dcmf
    public final evql s(dcnp dcnp0, dclv dclv0, dclp dclp0) {
        ddmy ddmy0 = new ddmy(this.iD(dclv0, dclv.class.getName()));
        azyf azyf0 = this.iD(dcnp0, "SendSurface" + dcnp.class.getName());
        ddul ddul0 = new ddul(azyf0);
        ddqv ddqv0 = new ddqv(ddul0, ddmy0, dclp0);
        ddrd ddrd0 = new ddrd(ddul0, ddmy0);
        azyq azyq0 = new azyq();
        azyq0.a = ddqv0;
        azyq0.b = ddrd0;
        azyq0.c = azyf0;
        azyq0.d = new Feature[]{cumh.a};
        azyq0.e = 0x500;
        return this.iH(azyq0.a());
    }

    @Override  // dcmf
    public final evql t(dcng dcng0) {
        azyf azyf0 = this.iD(dcng0, "dcng");
        ddph ddph0 = new ddph(azyf0);
        ddqf ddqf0 = new ddqf(ddph0);
        ddqh ddqh0 = new ddqh(ddph0);
        azyq azyq0 = new azyq();
        azyq0.a = ddqf0;
        azyq0.b = ddqh0;
        azyq0.c = azyf0;
        azyq0.d = new Feature[]{cumh.ac};
        azyq0.e = 0x56C;
        return this.iH(azyq0.a());
    }

    @Override  // dcmf
    public final evql u(ShareTarget shareTarget0) {
        azzc azzc0 = new azzc();
        azzc0.a = new ddpv(shareTarget0);
        azzc0.c = new Feature[]{cumh.a};
        azzc0.d = 1250;
        return this.jn(azzc0.a());
    }

    @Override  // dcmf
    public final evql v() {
        azzc azzc0 = new azzc();
        azzc0.a = new ddrb();
        azzc0.c = new Feature[]{cumh.Z};
        azzc0.d = 0x562;
        return this.jn(azzc0.a());
    }

    @Override  // dcmf
    public final evql w(ShareTarget shareTarget0, Intent intent0, boolean z) {
        azzc azzc0 = new azzc();
        azzc0.a = new ddrm(this, intent0, shareTarget0, z);
        azzc0.c = new Feature[]{cumh.a};
        azzc0.d = 0x4E0;
        return this.jn(azzc0.a());
    }

    @Override  // dcmf
    public final evql x(Account account0) {
        azzc azzc0 = new azzc();
        azzc0.a = new ddrk(account0);
        azzc0.c = new Feature[]{cumh.a};
        azzc0.d = 0x4E9;
        return this.jn(azzc0.a());
    }

    @Override  // dcmf
    public final evql y(int v) {
        azzc azzc0 = new azzc();
        azzc0.a = new ddrf(v);
        azzc0.c = new Feature[]{cumh.a};
        azzc0.d = 0x4DA;
        return this.jn(azzc0.a());
    }

    @Override  // dcmf
    public final evql z(CharSequence charSequence0) {
        azzc azzc0 = new azzc();
        azzc0.a = new ddpx(charSequence0);
        azzc0.c = new Feature[]{cumh.a};
        azzc0.d = 0x4DE;
        return this.jn(azzc0.a());
    }
}

