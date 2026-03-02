import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.backup.common.util.session.ParcelableSession;
import com.google.android.gms.backup.settings.component.PhotosEnablementSnackbarInfo;
import com.google.android.libraries.photos.backup.api.StatusResult.PermissionAskingState;
import java.util.concurrent.atomic.AtomicBoolean;

public final class asit implements lom {
    public final baun a;
    public final aqvd b;
    public final aspm c;
    public final Account d;
    public final aqnk e;
    public final aqth f;
    public final acp g;
    public final gful_cronetEngineProvider h;
    public Intent i;
    public fpth j;
    public boolean k;
    public final aqzi l;
    private final AtomicBoolean m;
    private final gmcg n;
    private final asid o;
    private final aqsm p;
    private final aqrd q;
    private final ParcelableSession r;

    public asit(Account account0, asid asid0, acw acw0, aqnk aqnk0, aqth aqth0, aqsm aqsm0, Intent intent0, boolean z, aqzi aqzi0, gmcg gmcg0, aspm aspm0, aqrd aqrd0, ParcelableSession parcelableSession0) {
        this.a = aqql.a("PhotosEnablementController");
        this.m = new AtomicBoolean(false);
        this.h = gfus.a(((gful_cronetEngineProvider)new asig()));
        gftb.check(account0);
        this.d = account0;
        this.o = asid0;
        this.e = aqnk0;
        this.f = aqth0;
        this.p = aqsm0;
        this.i = intent0;
        this.k = z;
        this.l = aqzi0;
        this.n = gmcg0;
        this.c = aspm0;
        this.q = aqrd0;
        this.r = parcelableSession0;
        this.g = acw0.b("photos-enablement-controller", new adt(), new asih(this));
        this.b = asit.h(parcelableSession0);
    }

    public final PendingIntent a() {
        aqvd aqvd0 = asit.h(this.r);
        return this.p.a(aqvd0);
    }

    public final void b(gqtz gqtz0) {
        int v;
        if(aqnk.g(this.i)) {
            this.c();
            return;
        }
        this.c.h(2);
        aqrd aqrd0 = this.q;
        String s = this.d.name;
        Intent intent0 = this.i;
        if(aqnk.f(intent0)) {
            v = 3;
        }
        else {
            v = aqnk.h(intent0) ? 2 : 1;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grku.a).v_newBuilder();
        gqub gqub0 = gqub.t;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((grku)hftp0.b_message).c = gqub0.mk;
        ((grku)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grkv.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grjl.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((grjl)hftp2.b_message).j = v - 1;
        ((grjl)hftp2.b_message).b |= 0x200;
        grjl grjl0 = (grjl)hftp2.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grkv grkv0 = (grkv)hftp1.b_message;
        grjl0.getClass();
        grkv0.h = grjl0;
        grkv0.b |= 8;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grku grku0 = (grku)hftp0.b_message;
        grkv grkv1 = (grkv)hftp1.N_build();
        grkv1.getClass();
        grku0.d = grkv1;
        grku0.b |= 2;
        grku grku1 = (grku)hftp0.N_build();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grns.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        grns grns0 = (grns)hftp3.b_message;
        grns0.c = gqtz0.a();
        grns0.b |= 1;
        aqrd0.a(s, grku1, ((grns)hftp3.N_build()), this.r.c()).z(new asif(this));
    }

    public final void c() {
        asir asir0 = new asir(this);
        this.l.b(asir0);
    }

    public final void d() {
        this.a.m("Failed to register a callback to get status updates.", new Object[0]);
        bbqv.a(new asio(this, this.a()));
    }

    final void e(PhotosEnablementSnackbarInfo photosEnablementSnackbarInfo0) {
        if(this.m.getAndSet(true)) {
            this.a.j("Prevented double callback.", new Object[0]);
            return;
        }
        this.o.g(this.d, photosEnablementSnackbarInfo0);
    }

    public final void f(boolean z, String s) {
        baun baun0 = this.a;
        baun0.j("Received status update: areRequiredPermissionsGranted=%s permissionAskingState=%s", new Object[]{Boolean.valueOf(z), s});
        if(!z && s.equals(StatusResult.PermissionAskingState.ASKING.name())) {
            baun0.j("Permissions are missing. Should see the permissions dialog.", new Object[0]);
            return;
        }
        baun0.j("Permissions were granted, finishing.", new Object[0]);
        PendingIntent pendingIntent0 = this.a();
        if(z) {
            bbqv.a(new asii(this, pendingIntent0));
            return;
        }
        bbqv.a(new asij(this, pendingIntent0));
    }

    public static asit g(xnb xnb0, aqnk aqnk0, Account account0, Intent intent0, boolean z, ParcelableSession parcelableSession0) {
        aqrd aqrd0 = new aqrd(xnb0, new bblp(3, 9));
        asit asit0 = new asit(account0, ((asid)xnb0), xnb0.getActivityResultRegistry(), aqnk0, aqth.a(xnb0), aqsm.b(xnb0), intent0, z, new aqzi(new bblp(3, 9)), new bblp(1, 9), new aspm(xnb0), aqrd0, parcelableSession0);
        xnb0.getLifecycle().c(asit0);
        return asit0;
    }

    private static aqvd h(ParcelableSession parcelableSession0) {
        aqvc aqvc0 = aqvd.a();
        aqvc0.c(17);
        aqvc0.b(parcelableSession0.c());
        return aqvc0.a();
    }

    @Override  // lom
    public final void onCreate(lps lps0) {
        lol.a(lps0);
    }

    @Override  // lom
    public final void onDestroy(lps lps0) {
        this.g.a();
    }

    @Override  // lom
    public final void onPause(lps lps0) {
        asik asik0 = new asik(this);
        this.n.d(asik0);
    }

    @Override  // lom
    public final void onResume(lps lps0) {
        if(this.k) {
            this.a.j("Photos enablement previously attempted, registering for updates.", new Object[0]);
            asil asil0 = new asil(this);
            this.n.d(asil0);
        }
    }

    @Override  // lom
    public final void onStart(lps lps0) {
        lol.e(lps0);
    }

    @Override  // lom
    public final void onStop(lps lps0) {
        lol.f(lps0);
    }
}

