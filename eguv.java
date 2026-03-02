import android.accounts.Account;
import android.provider.ContactsContract.RawContacts;
import com.google.android.gms.common.Feature;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInOptions;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.contactssync.model.BackupAndSyncSuggestion;
import com.google.android.gms.romanesco.model.RestoreSuggestionEntity;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class eguv extends lsb {
    private final egvt B;
    private final eghw C;
    public static final bboh a;
    public final lqh b;
    public final lqd c;
    public final lqd d;
    public final lqd e;
    public final egrz f;
    public final gmcg g;
    public final egra h;
    public final bxox i;
    public final egwa j;
    public final lqd k;
    public final lqh l;
    public final lqh m;
    public final eguu n;
    public final lqi o;
    public final lqi p;
    public final lqi q;
    public boolean r;
    public boolean s;
    public egxc t;
    public egyc u;
    public egyq v;
    final lqh w;
    public final egsw x;
    public final eguw y;
    public egrw z;

    static {
        eguv.a = bboh.b("ContactsSyncViewModel", bbcu.f);
    }

    public eguv(egrz egrz0, gmcg gmcg0, egra egra0, egvt egvt0, eghw eghw0, egsw egsw0, eguw eguw0, egwa egwa0) {
        lqh lqh0 = new lqh();
        this.b = lqh0;
        lqh lqh1 = new lqh();
        this.l = lqh1;
        new lqh();
        this.m = new lqh();
        this.o = new lqi();
        this.p = new lqi();
        this.q = new lqi();
        this.r = false;
        this.s = false;
        this.w = new lqh();
        this.f = egrz0;
        this.g = gmcg0;
        this.h = egra0;
        this.B = egvt0;
        this.C = eghw0;
        this.i = new bxox();
        this.x = egsw0;
        this.y = eguw0;
        this.j = egwa0;
        lqd lqd0 = lsa.c(egra0, new egty(this, egrz0, gmcg0));
        this.k = lqd0;
        Objects.requireNonNull(eghw0);
        lqd lqd1 = lsa.c(egra0, new egtz(eghw0));
        this.c = lqd1;
        egsw0.a();
        this.d = egsw0.b;
        egsw0.b();
        this.e = egsw0.c;
        egua egua0 = new egua(this);
        lqh0.o(egsw0.b, egua0);
        egua egua1 = new egua(this);
        lqh0.o(egsw0.c, egua1);
        lqh0.o(lqd1, new egub(this));
        lqh0.o(lqd0, new eguc(this));
        lqh1.o(egra0, new egud(this));
        eguu eguu0 = new eguu(this);
        this.n = eguu0;
        eguu0.o(egra0, new egue(this));
        if(hwyp.i()) {
            this.v = new egyq(egrz0.a);
        }
    }

    final lqd a(String s) {
        Account account0 = egxj.a(s);
        return this.C.a(account0);
    }

    final lqd b(String s) {
        lqd lqd0 = new bxox();
        egbk egbk0 = new egbk();
        egbk0.b = true;
        egbk0.b();
        BackupAndSyncOptInOptions backupAndSyncOptInOptions0 = egbk0.a();
        this.x.a.e(s, backupAndSyncOptInOptions0).z(new egst(this.x, ((bxox)lqd0)));
        return lqd0;
    }

    final lqd c() {
        lqd lqd0 = new bxox();
        this.x.a.f().z(new egsv(this.x, ((bxox)lqd0)));
        return lqd0;
    }

    final gmcd e(boolean z) {
        return this.u.f(z);
    }

    public final void f() {
        this.i.l(Integer.valueOf(1));
    }

    final void g() {
        this.i.l(Integer.valueOf(2));
    }

    final void h() {
        this.i.l(Integer.valueOf(5));
    }

    final void i() {
        this.i.l(Integer.valueOf(6));
    }

    public final void j() {
        this.i.l(Integer.valueOf(0));
    }

    final void k() {
        this.f.a.getContentResolver().notifyChange(ContactsContract.RawContacts.CONTENT_URI, null);
    }

    public final void l() {
        this.x.a();
        this.x.b();
    }

    final void m(String s) {
        egvt egvt0 = this.B;
        if(egvt0.b().equals(s)) {
            return;
        }
        egvt0.a.edit().putString("core_ui_selected_account", s).apply();
    }

    public final void n() {
        egxc egxc0 = this.t;
        if(egxc0 != null) {
            egxc0.p();
        }
    }

    final void o(efyq efyq0, Account account0) {
        if(efyq0 != null && account0 != null) {
            if(hxdo.c()) {
                this.q.ii(Boolean.valueOf(true));
            }
            String s = account0.name;
            azzc azzc0 = new azzc();
            azzc0.a = new egai(((egal)efyq0), s);
            azzc0.c = new Feature[]{efnu.s};
            azzc0.d = 0xAAC;
            evql evql0 = ((azts)efyq0).jn(azzc0.a());
            evql0.b(new egun(this, account0));
            evql0.A(new eguo(this, account0));
        }
    }

    public final void p() {
        egxc egxc0 = this.t;
        if(egxc0 != null) {
            efyu efyu0 = egxc0.a;
            if(efyu0 != null) {
                efyu0.c(new egww(egxc0), true, egxc0.h);
            }
        }
    }

    final void q(boolean z) {
        if(this.u != null) {
            gmbu.t(this.e(z), new eguq(this, z), gmap.a);
        }
    }

    final void r(String s) {
        this.m(s);
        this.h.o();
    }

    final void v(boolean z) {
        if(hwzg.g()) {
            lqh lqh0 = new lqh();
            egug egug0 = new egug(this, lqh0);
            lqh0.o(this.b, egug0);
            lqh lqh1 = new lqh();
            lqh1.o(lqh0, new egtx(this, lqh1, lqh0, z));
            egui egui0 = new egui(this, lqh1);
            this.w.o(lqh1, egui0);
        }
    }

    public final void w() {
        fntm fntm0 = (fntm)this.c.ij();
        if(fntm0 != null) {
            evql evql0 = (evql)this.d.ij();
            if(evql0 != null && evql0.n()) {
                BackupAndSyncOptInState backupAndSyncOptInState0 = (BackupAndSyncOptInState)evql0.j();
                if(egxj.o(backupAndSyncOptInState0)) {
                    egvx egvx0 = new egvx(7, null, 0, 0);
                    this.b.ii(egvx0);
                    return;
                }
                evql evql1 = (evql)this.e.ij();
                if(evql1 != null && evql1.n()) {
                    BackupAndSyncSuggestion backupAndSyncSuggestion0 = (BackupAndSyncSuggestion)evql1.j();
                    boolean z = hwzg.f() && backupAndSyncOptInState0.c == 5;
                    if(backupAndSyncOptInState0.c != 3 && !z) {
                        if(hwzg.f()) {
                            int v = backupAndSyncSuggestion0.a;
                            int v1 = backupAndSyncSuggestion0.b + v;
                            if(v1 > 0) {
                                egvx egvx1 = new egvx(6, null, v, v1);
                                this.b.ii(egvx1);
                                return;
                            }
                        }
                        int v2 = backupAndSyncSuggestion0.a;
                        if(v2 > 0) {
                            egvx egvx2 = new egvx(6, null, v2, 0);
                            this.b.ii(egvx2);
                            return;
                        }
                        egvx egvx3 = new egvx(4, null, 0, 0);
                        this.b.ii(egvx3);
                        return;
                    }
                    String s = backupAndSyncOptInState0.a;
                    Account account0 = egxj.a(s);
                    if(egxj.l(account0) && (!hwyp.i() || egxj.q(account0))) {
                        if(fntm0.c.equals(s)) {
                            if(z) {
                                egvx egvx4 = new egvx(3, s, 0, 0);
                                this.b.ii(egvx4);
                                return;
                            }
                            if(hwzg.g()) {
                                int v3 = backupAndSyncSuggestion0.a;
                                int v4 = backupAndSyncSuggestion0.b + v3;
                                if(v4 > 0) {
                                    egvx egvx5 = new egvx(1, s, v3, v4);
                                    this.b.ii(egvx5);
                                    return;
                                }
                            }
                            egvx egvx6 = new egvx(1, s, 0, 0);
                            this.b.ii(egvx6);
                            return;
                        }
                        if(z) {
                            egvx egvx7 = new egvx(8, s, 0, 0);
                            this.b.ii(egvx7);
                            return;
                        }
                        if(hwzg.g()) {
                            int v5 = backupAndSyncSuggestion0.a;
                            int v6 = backupAndSyncSuggestion0.b + v5;
                            if(v6 > 0) {
                                egvx egvx8 = new egvx(2, s, v5, v6);
                                this.b.ii(egvx8);
                                return;
                            }
                        }
                        egvx egvx9 = new egvx(2, s, 0, 0);
                        this.b.ii(egvx9);
                        return;
                    }
                    egvx egvx10 = new egvx(5, s, 0, 0);
                    this.b.ii(egvx10);
                }
            }
        }
    }

    public static final List x(List list0) {
        List list1 = new ArrayList();
        for(Object object0: list0) {
            list1.add(new egux(((RestoreSuggestionEntity)object0).b, ((RestoreSuggestionEntity)object0).c, ((RestoreSuggestionEntity)object0).a, ((RestoreSuggestionEntity)object0).e));
        }
        return list1;
    }
}

