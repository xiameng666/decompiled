import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.GoogleMultiAssertionExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;
import com.google.android.gms.smartdevice.d2d.AuthenticatingUser;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.setup.auth.ContinueSessionRequest;
import com.google.android.gms.smartdevice.setup.auth.ContinueSessionResponse;
import com.google.android.gms.smartdevice.setup.auth.GetChallengeRequest;
import com.google.android.gms.smartdevice.setup.auth.GetChallengeResponse;
import com.google.android.gms.smartdevice.setup.auth.StartSessionResponse;
import j..util.Collection.-EL;
import j..util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

public final class eqft {
    public static final erqc a;
    public final eqmd b;
    public final eqrf c;
    public final boolean d;
    public boolean e;
    public final boolean f;
    public final Context g;
    public final int h;
    final eqfu i;
    public erhn j;
    public erhr k;
    public Long l;
    public AuthenticatingUser m;
    private final bnbv n;
    private ParcelFileDescriptor[] o;
    private ParcelFileDescriptor[] p;
    private epyx q;
    private final boolean r;

    static {
        eqft.a = new erqc(new String[]{"D2D", "TargetFidoController"});
    }

    public eqft(Context context0, eqmd eqmd0, eqfu eqfu0, boolean z, int v) {
        this(context0, eqmd0, eqfu0, z, v, false, null, false);
    }

    public eqft(Context context0, eqmd eqmd0, eqfu eqfu0, boolean z, int v, boolean z1, AuthenticatingUser authenticatingUser0, boolean z2) {
        this.g = context0;
        this.b = eqmd0;
        this.i = eqfu0;
        this.d = z;
        this.e = false;
        eqrh eqrh0 = hyhp.j() ? new eqrh() : new bnce(context0);
        this.n = eqrh0;
        if(hyhp.m()) {
            this.k = new erhr(context0, eqmd0);
        }
        else {
            this.j = new erih(context0);
        }
        this.h = v;
        this.f = z1;
        this.c = hyhp.k() ? new eqrf(context0) : null;
        this.m = authenticatingUser0;
        this.r = z2;
    }

    public final void a() {
        erhr erhr0 = this.k;
        if(erhr0 != null) {
            erhr0.d();
        }
    }

    final void b() {
        epyx epyx0 = this.q;
        if(epyx0 != null) {
            epyx0.a();
        }
        epyx.b(this.o);
        epyx.b(this.p);
    }

    public final void c(List list0) {
        gged_interceptors gged0;
        List list1;
        int v = 0;
        eqft.a.h("Continue session.", new Object[0]);
        this.b.f(13);
        if(list0.isEmpty()) {
            this.i.e();
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            arrayList0.add(new ContinueSessionRequest(((StartSessionResponse)object0).f, ((StartSessionResponse)object0).h));
        }
        if(hyhp.m()) {
            try {
                list1 = this.k.b(arrayList0);
            }
            catch(erhq erhq0) {
                this.i.a(erhq0.a, "ContinueSession returned error.", null);
                return;
            }
        }
        else {
            try {
                erhn erhn0 = this.j;
                azzc azzc0 = new azzc();
                azzc0.a = new erib(((erih)erhn0), arrayList0);
                azzc0.c = new Feature[]{epvj.j};
                azzc0.d = 20754;
                list1 = (List)evrg.n(((azts)erhn0).jn(azzc0.a()));
                eqrf eqrf0 = this.c;
                if(eqrf0 != null) {
                    gmcd gmcd0 = glzd.f(eqrf0.b.a.a(), new eroy(), gmap.a);
                    Objects.requireNonNull(this.b);
                    eqrf0.a(gmcd0, new eqra(this.b));
                }
            }
            catch(ExecutionException | InterruptedException exception0) {
                int v1 = erqf.a(exception0);
                this.i.a(v1, "SecondDeviceAuth api returned exception " + exception0.toString(), null);
                return;
            }
        }
        ArrayList arrayList1 = new ArrayList();
        String s = "";
        for(Object object1: list1) {
            ContinueSessionResponse continueSessionResponse0 = (ContinueSessionResponse)object1;
            int v2 = continueSessionResponse0.a;
            if(v2 != 2) {
                if(v2 != 1) {
                    continue;
                }
                Integer integer0 = (int)continueSessionResponse0.b;
                eqft.a.m("Account is rejected with reason: %d", new Object[]{integer0});
                s = s + String.format(Locale.US, "%s: %d; ", continueSessionResponse0.d, integer0);
                BootstrapAccount bootstrapAccount0 = new BootstrapAccount(continueSessionResponse0.d, "com.google");
                this.i.c(bootstrapAccount0);
                v = continueSessionResponse0.b;
            }
            else if(!TextUtils.isEmpty(continueSessionResponse0.c)) {
                arrayList1.add(continueSessionResponse0);
            }
        }
        if(arrayList1.isEmpty()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)eqoc.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((eqoc)hftv0).c = 3;
            ((eqoc)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            eqoc eqoc0 = (eqoc)hftp0.b_message;
            eqoc0.b |= 2;
            eqoc0.d = v;
            eqoc eqoc1 = (eqoc)hftp0.N_build();
            this.i.a(0x2A02, s, eqoc1);
            return;
        }
        Context context0 = this.g;
        int v3 = (int)hyhp.f();
        batl.s(context0);
        for(Object object2: arrayList1) {
            String s1 = ((ContinueSessionResponse)object2).c;
            String s2 = ((ContinueSessionResponse)object2).d;
            if(!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2) && !eqqw.e(context0, s1, s2, v3)) {
                this.i.a(10502, "received invalid tokenResponse when upserting accounts (exchange authCode for LST)", null);
                return;
            }
        }
        eqfu eqfu0 = this.i;
        if(hygx.d()) {
            ggeo ggeo0 = eqsh.m(context0);
            gged0 = (gged_interceptors)Collection.-EL.stream(arrayList1).map(new eqrz(ggeo0)).collect(ggaf.a);
        }
        else {
            gged0 = (gged_interceptors)Collection.-EL.stream(arrayList1).map(new eqsa()).collect(ggaf.a);
        }
        eqfu0.d(gged0);
        this.b.a(arrayList1.size());
        eqfu0.e();
    }

    public final void d() {
        GetChallengeResponse getChallengeResponse0;
        try {
            this.o = ParcelFileDescriptor.createPipe();
            this.p = ParcelFileDescriptor.createPipe();
            epyx epyx0 = new epyx(this.i, this.p[0], this.o[1]);
            this.q = epyx0;
            epyx0.c();
            GetChallengeRequest getChallengeRequest0 = new GetChallengeRequest();
            erqc erqc0 = eqft.a;
            erqc0.d("Getting challenges.", new Object[0]);
            this.b.f(8);
            if(hyhp.m()) {
                try {
                    getChallengeResponse0 = this.k.a(getChallengeRequest0);
                }
                catch(erhq erhq0) {
                    this.i.a(erhq0.a, a.ab(erhq0, "Get challenge returned exception "), null);
                    return;
                }
            }
            else {
                try {
                    erhn erhn0 = this.j;
                    azzc azzc0 = new azzc();
                    azzc0.a = new eria(((erih)erhn0), getChallengeRequest0);
                    azzc0.c = new Feature[]{epvj.j};
                    azzc0.d = 20750;
                    getChallengeResponse0 = (GetChallengeResponse)evrg.n(((azts)erhn0).jn(azzc0.a()));
                    eqrf eqrf0 = this.c;
                    if(eqrf0 != null) {
                        gmcd gmcd0 = glzd.f(eqrf0.b.a.a(), new erow(), gmap.a);
                        Objects.requireNonNull(this.b);
                        eqrf0.a(gmcd0, new eqrc(this.b));
                    }
                }
                catch(ExecutionException | InterruptedException exception0) {
                    int v = erqf.a(exception0);
                    this.i.a(v, a.ab(exception0, "SecondDeviceAuth api returned exception "), null);
                    return;
                }
            }
            if(getChallengeResponse0 == null) {
                this.i.a(0x29FF, "SecondDeviceAuth api returned null challengeResponse.", null);
                return;
            }
            this.b.f(9);
            AuthenticationExtensions authenticationExtensions0 = new AuthenticationExtensions(null, null, null, new GoogleMultiAssertionExtension(true), null, null, null, null, null, null, null, null, null);
            bmio bmio0 = new bmio();
            bmio0.b(getChallengeResponse0.a);
            bmio0.f = authenticationExtensions0;
            bmio0.c("google.com");
            bmio0.e = this.r ? UserVerificationRequirement.c : UserVerificationRequirement.b;
            bmio0.g = this.l;
            PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0 = bmio0.a();
            erqc0.d("Start Fido DirectTransfer.", new Object[0]);
            this.n.b(publicKeyCredentialRequestOptions0, this.o[0], this.p[1]).s(new bblp(1, 10), new eqfs(this));
        }
        catch(IOException iOException0) {
            eqft.a.l(iOException0);
            this.i.a(10701, "Creating pipe failed", null);
        }
    }

    public final void e(byte[] arr_b) {
        epyx epyx0 = this.q;
        if(epyx0 != null) {
            epyx0.d(arr_b);
        }
    }
}

