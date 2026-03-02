import android.accounts.Account;
import android.net.Uri;
import android.os.Binder;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.people.contactssync.model.AccountWithDataSet;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInOptions;
import com.google.android.gms.people.contactssync.model.BackupSyncUserAction;
import com.google.android.gms.people.contactssync.model.ExtendedSyncStatus;
import com.google.android.gms.people.contactssync.model.GetBackupSyncSuggestionRequest;
import com.google.android.gms.people.contactssync.model.GetImportSimContactsSuggestionsRequest;
import com.google.android.gms.people.contactssync.model.ImportSimContactsRequest;
import com.google.android.gms.people.cpg.callingcard.CreateCallingCardRequest;
import com.google.android.gms.people.cpg.callingcard.UpdateCallingCardRequest;
import j..util.Objects;
import java.util.List;

public final class egjz extends efyy implements cjug {
    public static final bboh a;
    public final String b;
    private final cjts c;
    private final cjtg d;
    private final eggp e;
    private final String f;
    private final int g;
    private final boolean h;

    static {
        egjz.a = bboh.e(bbcu.f);
    }

    public egjz(cjtg cjtg0, cjts cjts0, eggp eggp0, boolean z, String s, String s1) {
        this.d = cjtg0;
        this.c = cjts0;
        this.e = eggp0;
        this.g = Binder.getCallingUid();
        this.h = z;
        this.b = s;
        this.f = s1;
    }

    @Override  // efyz
    public final void A(efzc efzc0, boolean z, Account account0, String s, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        egnx egnx0 = new egnx(this.b, this.g, z, account0, s, "", efzc0, azug0);
        egnx0.j = this.h;
        this.c.b(egnx0);
    }

    @Override  // efyz
    public final void B(efzc efzc0, boolean z, Account account0, String s, String s1, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        egnx egnx0 = new egnx(this.b, this.g, z, account0, s, s1, efzc0, azug0);
        egnx0.j = this.h;
        this.c.b(egnx0);
    }

    @Override  // efyz
    public final void C(efzc efzc0, int[] arr_v, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        eglo eglo0 = new eglo(efzc0, this.d, arr_v, azug0);
        this.c.b(eglo0);
    }

    @Override  // efyz
    public final void D(efzc efzc0, Uri uri0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        egnw egnw0 = new egnw(efzc0, this.d, this.b, uri0, azug0);
        this.c.b(egnw0);
    }

    @Override  // efyz
    public final void E(efzc efzc0, UpdateCallingCardRequest updateCallingCardRequest0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        baqr baqr0 = new baqr();
        baqr0.d = this.b;
        baqr0.a = Binder.getCallingUid();
        baqr0.h = Binder.getCallingPid();
        egdb egdb0 = new egdb(baqr0, updateCallingCardRequest0, efzc0, azug0);
        this.c.b(egdb0);
    }

    @Override  // efyz
    public final void F(efzc efzc0, List list0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        baqr baqr0 = new baqr();
        baqr0.d = this.b;
        baqr0.a = Binder.getCallingUid();
        baqr0.h = Binder.getCallingPid();
        egcd egcd0 = new egcd(this.d, baqr0, list0, efzc0, azug0);
        this.c.b(egcd0);
    }

    @Override  // efyz
    public final void G(ApiMetadata apiMetadata0) {
        if(!hxba.n()) {
            return;
        }
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        egoc egoc0 = new egoc(this, this.b, azug0);
        this.c.b(egoc0);
    }

    @Override  // efyz
    public final int a(ImportSimContactsRequest importSimContactsRequest0, int v, ApiMetadata apiMetadata0) {
        for(Object object0: this.e.a().g) {
            egni egni0 = (egni)object0;
            if(Objects.equals(egni0.a, importSimContactsRequest0)) {
                int v1 = egni0.c.get();
                if(v1 == 0) {
                    return -1;
                }
                int v2 = egni0.b.get();
                int v3 = v2 * v;
                if(v2 != 0 && v != 0 && (v3 / v2 != v || v3 / v != v2)) {
                    throw new ArithmeticException("integer overflow");
                }
                return v3 / v1;
            }
        }
        return -2;
    }

    @Override  // efyz
    public final void b(efzc efzc0, int[] arr_v, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        egli egli0 = new egli(efzc0, this.d, arr_v, azug0);
        this.c.b(egli0);
    }

    @Override  // efyz
    public final void c(efzc efzc0, ApiMetadata apiMetadata0) {
        if(!hxba.n()) {
            return;
        }
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        egob egob0 = new egob(this, this.b, efzc0, azug0);
        this.c.b(egob0);
    }

    @Override  // efyz
    public final void d(efzc efzc0, List list0, String s, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        baqr baqr0 = new baqr();
        baqr0.d = this.b;
        baqr0.h = Binder.getCallingPid();
        baqr0.a = Binder.getCallingUid();
        efpb efpb0 = efpb.c(this.d);
        efpr efpr0 = efpr.a();
        efpf efpf0 = new efpf(this.d, baqr0, list0, efzc0, efpb0, efpr0, s, azug0);
        this.c.b(efpf0);
    }

    @Override  // efyz
    public final void e(efzc efzc0, String s, ApiMetadata apiMetadata0) {
        if(!hxax.a.b().a()) {
            return;
        }
        egig.e("ContactsSyncApiService", "cleanupSyncedGoogleContacts invoked");
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        egmq egmq0 = new egmq(efzc0, s, this.b, azug0);
        this.c.b(egmq0);
    }

    @Override  // efyz
    public final void f(efzc efzc0, CreateCallingCardRequest createCallingCardRequest0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        baqr baqr0 = new baqr();
        baqr0.d = this.b;
        baqr0.a = Binder.getCallingUid();
        baqr0.h = Binder.getCallingPid();
        egcw egcw0 = new egcw(baqr0, createCallingCardRequest0, efzc0, azug0);
        this.c.b(egcw0);
    }

    @Override  // efyz
    public final void g(efzc efzc0, List list0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        baqr baqr0 = new baqr();
        baqr0.d = this.b;
        baqr0.a = Binder.getCallingUid();
        baqr0.h = Binder.getCallingPid();
        egcx egcx0 = new egcx(this.d, baqr0, list0, efzc0, azug0);
        this.c.b(egcx0);
    }

    @Override  // efyz
    public final void h(efzc efzc0, ExtendedSyncStatus extendedSyncStatus0, Account account0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        egoa egoa0 = new egoa(this.b, this.g, account0, efzc0, extendedSyncStatus0, azug0);
        egoa0.j = this.h;
        this.c.b(egoa0);
    }

    @Override  // efyz
    public final void i(efzc efzc0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        eglk eglk0 = new eglk(efzc0, this.d, this.b, azug0);
        this.c.b(eglk0);
    }

    @Override  // efyz
    public final void j(efzc efzc0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        egll egll0 = new egll(efzc0, this.d, this.b, azug0);
        this.c.b(egll0);
    }

    @Override  // efyz
    public final void k(efzc efzc0, GetBackupSyncSuggestionRequest getBackupSyncSuggestionRequest0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        eglq eglq0 = new eglq(efzc0, this.b, getBackupSyncSuggestionRequest0, azug0);
        this.c.b(eglq0);
    }

    @Override  // efyz
    public final void l(efzc efzc0, List list0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        baqr baqr0 = new baqr();
        baqr0.d = this.b;
        baqr0.a = Binder.getCallingUid();
        baqr0.h = Binder.getCallingPid();
        egcy egcy0 = new egcy(this.d, baqr0, list0, efzc0, azug0);
        this.c.b(egcy0);
    }

    @Override  // efyz
    public final void m(efzc efzc0, ApiMetadata apiMetadata0) {
        if(!hxba.l()) {
            return;
        }
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        egjy egjy0 = new egjy(this, azuf0.a(), efzc0);
        this.c.b(egjy0);
    }

    @Override  // efyz
    public final void n(efzc efzc0, GetImportSimContactsSuggestionsRequest getImportSimContactsSuggestionsRequest0, ApiMetadata apiMetadata0) {
        egnk egnk0 = this.e.a();
        baqr baqr0 = new baqr();
        baqr0.d = this.b;
        baqr0.a = Binder.getCallingUid();
        baqr0.h = Binder.getCallingPid();
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        egnv egnv0 = egnk0.b(getImportSimContactsSuggestionsRequest0.a);
        egna egna0 = egnk0.a(getImportSimContactsSuggestionsRequest0.a);
        egmz egmz0 = new egmz(egnk0.b, baqr0, efzc0, getImportSimContactsSuggestionsRequest0, egnk0.d, egnv0, egna0, azug0);
        this.c.b(egmz0);
    }

    @Override  // efyz
    public final void o(efzc efzc0, ImportSimContactsRequest importSimContactsRequest0, ApiMetadata apiMetadata0) {
        egnk egnk0 = this.e.a();
        baqr baqr0 = new baqr();
        baqr0.d = this.b;
        baqr0.a = Binder.getCallingUid();
        baqr0.h = Binder.getCallingPid();
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        egnv egnv0 = egnk0.b(importSimContactsRequest0.b);
        egna egna0 = egnk0.a(importSimContactsRequest0.b);
        egni egni0 = new egni(egnk0.b, baqr0, egnk0.c, importSimContactsRequest0, egnk0.d, egnv0, egna0, egnk0.e, egnk0, efzc0, azug0);
        egnk0.g.add(egni0);
        this.c.b(egni0);
    }

    @Override  // efyz
    public final void p(efzc efzc0, AccountWithDataSet accountWithDataSet0, AccountWithDataSet accountWithDataSet1, List list0, int v, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        egmr egmr0 = new egmr(efzc0, this.b, accountWithDataSet0, accountWithDataSet1, list0, v, azug0);
        this.c.b(egmr0);
    }

    @Override  // efyz
    public final void q(efzc efzc0, String s, BackupAndSyncOptInOptions backupAndSyncOptInOptions0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        eglm eglm0 = new eglm(efzc0, this.d, s, backupAndSyncOptInOptions0, this.b, azug0);
        this.c.b(eglm0);
    }

    @Override  // efyz
    public final void v(efzc efzc0, String s, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        egbk egbk0 = new egbk();
        egbk0.b = hxba.a.e().q();
        BackupAndSyncOptInOptions backupAndSyncOptInOptions0 = egbk0.a();
        eglm eglm0 = new eglm(efzc0, this.d, s, backupAndSyncOptInOptions0, this.b, azug0);
        this.c.b(eglm0);
    }

    @Override  // efyz
    public final void w(efzc efzc0, String s, ApiMetadata apiMetadata0) {
        if(!hwxo.a.b().g()) {
            return;
        }
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        egbk egbk0 = new egbk();
        egbk0.a = true;
        BackupAndSyncOptInOptions backupAndSyncOptInOptions0 = egbk0.a();
        eglm eglm0 = new eglm(efzc0, this.d, s, backupAndSyncOptInOptions0, this.b, azug0);
        this.c.b(eglm0);
    }

    @Override  // efyz
    public final void x(efzc efzc0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        egln egln0 = new egln(efzc0, this.d, this.b, azug0);
        this.c.b(egln0);
    }

    @Override  // efyz
    public final void y(efzc efzc0, List list0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        baqr baqr0 = new baqr();
        baqr0.d = this.b;
        baqr0.a = Binder.getCallingUid();
        baqr0.h = Binder.getCallingPid();
        egcc egcc0 = new egcc(this.d, baqr0, list0, efzc0, azug0);
        this.c.b(egcc0);
    }

    @Override  // efyz
    public final void z(efzc efzc0, BackupSyncUserAction backupSyncUserAction0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.dW);
        azuf0.g(bbdq.ac);
        azuf0.d(this.b);
        azuf0.c(this.f);
        azug azug0 = azuf0.a();
        eglr eglr0 = new eglr(efzc0, this.b, backupSyncUserAction0, azug0);
        this.c.b(eglr0);
    }
}

