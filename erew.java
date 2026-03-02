import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.auth.cryptauth.Payload;
import com.google.android.gms.auth.firstparty.dataservice.GetAndAdvanceOtpCounterResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.DeviceSignals;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONStringer;

public final class erew extends erhd implements cjug {
    public static final baun a;
    public final Context b;
    public final gmce c;
    public final epxw d;
    public final epwe e;
    public int f;
    private static volatile boolean g;
    private final Handler h;
    private final ajnv i;
    private final ajes j;
    private final eqgn k;

    static {
        erew.a = new erqc(new String[]{"Setup", "Accounts", "AccountsServiceImpl"});
        TimeUnit.MINUTES.toMillis(5L);
        erew.g = false;
    }

    public erew(Context context0, Handler handler0) {
        if(epxw.a == null) {
            Class class0 = epxw.class;
            synchronized(class0) {
                if(epxw.a == null) {
                    epxw.a = new epyf();
                }
            }
        }
        epxw epxw0 = epxw.a;
        erer erer0 = new erer(context0);
        ajnv ajnv0 = new ajnv(context0);
        ajes ajes0 = new ajes(context0);
        eqgn eqgn0 = eqgn.b(context0);
        super();
        this.b = context0;
        this.h = handler0;
        this.d = epxw0;
        this.j = ajes0;
        this.e = epzg.a(context0);
        this.i = ajnv0;
        this.c = new gmce(erer0);
        this.k = eqgn0;
        this.f = 1;
        handler0.post(new eres(this));
    }

    public final bhnd a() {
        try {
            return (bhnd)this.c.get();
        }
        catch(ExecutionException | InterruptedException exception0) {
            erew.a.n("Could not get DroidGuard snapshot.", exception0, new Object[0]);
            return null;
        }
    }

    @Override  // erhe
    public final void c(erhb erhb0, Challenge[] arr_challenge, boolean z, boolean z1) {
        this.s(erhb0, arr_challenge, z, z1);
    }

    @Override  // erhe
    public final void d(erhb erhb0, Challenge[] arr_challenge, boolean z) {
        this.s(erhb0, arr_challenge, z, false);
    }

    @Override  // erhe
    public final void e() {
        gmce gmce0 = this.c;
        if(gmce0.isDone()) {
            bhnd bhnd0 = this.a();
            if(bhnd0 != null) {
                bhnd0.close();
            }
            return;
        }
        gmce0.cancel(true);
    }

    @Override  // erhe
    public final void f(erhb erhb0, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest0) {
        ereu ereu0 = new ereu(this, exchangeAssertionsForUserCredentialsRequest0, erhb0);
        this.h.post(ereu0);
    }

    @Override  // erhe
    public final void g(erhb erhb0, ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest0) {
        erev erev0 = new erev(this, exchangeSessionCheckpointsForUserCredentialsRequest0, erhb0);
        this.h.post(erev0);
    }

    @Override  // erhe
    public final void h(erhb erhb0, Assertion[] arr_assertion) {
        Status status1;
        ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest0;
        Status status0 = new Status(0);
        try {
            String s = hoxm.d();
            int v = (int)hpaj.b();
            int v1 = !bafi.b(v, this.b) || !bafi.c() ? 0 : bafi.a(v, this.b);
            exchangeAssertionsForUserCredentialsRequest0 = null;
            exchangeAssertionsForUserCredentialsRequest0 = new ExchangeAssertionsForUserCredentialsRequest(new ArrayList(Arrays.asList(arr_assertion)), s, v1);
            status1 = new Status(0);
        }
        catch(Throwable throwable0) {
            erhb0.e(status0, exchangeAssertionsForUserCredentialsRequest0);
            throw throwable0;
        }
        erhb0.e(status1, exchangeAssertionsForUserCredentialsRequest0);
    }

    @Override  // erhe
    public final void i(erhb erhb0) {
        Account[] arr_account = cchj.b(this.b).p("com.google");
        BootstrapAccount[] arr_bootstrapAccount = new BootstrapAccount[arr_account.length];
        for(int v = 0; v < arr_account.length; ++v) {
            Account account0 = arr_account[v];
            arr_bootstrapAccount[v] = new BootstrapAccount(account0.name, account0.type);
        }
        try {
            erhb0.f(Status.b, arr_bootstrapAccount);
        }
        catch(RemoteException remoteException0) {
            erew.a.l(remoteException0);
        }
    }

    @Override  // erhe
    public final void j(erhb erhb0) {
        try {
            long v = bbmq.d(this.b);
            erhb0.g(Status.b, v);
        }
        catch(RemoteException remoteException0) {
            erew.a.l(remoteException0);
        }
    }

    @Override  // erhe
    public final void k(erhb erhb0, UserBootstrapInfo[] arr_userBootstrapInfo) {
        erew.a.h("Get challenges from cryptauth.", new Object[0]);
        gpox gpox0 = (gpox)((ProtoLiteMessage)gpoy.a).v_newBuilder();
        int v1 = this.f;
        if(!gpox0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gpox0).ensureMutable();
        }
        gpoy gpoy0 = (gpoy)gpox0.b_message;
        if(v1 == 0) {
            throw null;
        }
        gpoy0.d = v1;
        gpoy0.b |= 1;
        gppk[] arr_gppk = new gppk[arr_userBootstrapInfo.length];
        for(int v = 0; v < arr_userBootstrapInfo.length; ++v) {
            UserBootstrapInfo userBootstrapInfo0 = arr_userBootstrapInfo[v];
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gppk.a).v_newBuilder();
            String s = userBootstrapInfo0.b;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gppk gppk0 = (gppk)hftp0.b_message;
            s.getClass();
            gppk0.b |= 1;
            gppk0.c = s;
            ByteString hfsf0 = ByteString.copyFrom(userBootstrapInfo0.c);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gppk gppk1 = (gppk)hftp0.b_message;
            gppk1.b |= 2;
            gppk1.d = hfsf0;
            arr_gppk[v] = (gppk)hftp0.N_build();
        }
        gpox0.a(Arrays.asList(arr_gppk));
        gpoy gpoy1 = (gpoy)((ProtoLiteBuilder)gpox0).N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hkwk.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hkwk hkwk0 = (hkwk)hftp1.b_message;
        gpoy1.getClass();
        hkwk0.c = gpoy1;
        hkwk0.b |= 1;
        eret eret0 = new eret(this, ((hkwk)hftp1.N_build()), erhb0);
        this.h.post(eret0);
    }

    @Override  // erhe
    public final void l(erhb erhb0, Account[] arr_account) {
        if(arr_account != null && arr_account.length != 0) {
            List list0 = Arrays.asList(arr_account);
            this.k.e(list0);
            this.k.c();
            ArrayList arrayList0 = new ArrayList(arr_account.length);
            for(int v = 0; v < arr_account.length; ++v) {
                Account account0 = arr_account[v];
                arrayList0.add(this.j.k(account0).d(new bbre(this.h), new eren()).c(new erel(account0)));
            }
            evrg.g(arrayList0).z(new erem(this, erhb0));
            return;
        }
        erhb0.i(new Status(0x299F), null);
    }

    @Override  // erhe
    public final void m(erhb erhb0, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest0) {
        Status status1;
        Status status0 = new Status(8);
        try {
            erqh.a();
            Context context0 = this.b;
            String s = erqi.a(context0);
            if(s == null) {
                erew.a.h("Backup account not found.", new Object[0]);
            }
            else {
                erew.a.h("Backup account found.", new Object[0]);
                erew.a.d("Backup enabled with account: " + s, new Object[0]);
            }
            String s1 = Long.toHexString(bbmq.d(context0));
            if(TextUtils.isEmpty(s1)) {
                erew.a.h("Android ID is null or empty.", new Object[0]);
            }
            if(s == null) {
                s = "";
            }
            if(s1 == null) {
                s1 = "";
            }
            exchangeAssertionsForUserCredentialsRequest0.g = s;
            exchangeAssertionsForUserCredentialsRequest0.a.add(Integer.valueOf(7));
            exchangeAssertionsForUserCredentialsRequest0.h = s1;
            exchangeAssertionsForUserCredentialsRequest0.a.add(Integer.valueOf(8));
            status1 = new Status(0);
        }
        catch(Throwable throwable0) {
            erhb0.j(status0, exchangeAssertionsForUserCredentialsRequest0);
            throw throwable0;
        }
        erhb0.j(status1, exchangeAssertionsForUserCredentialsRequest0);
    }

    @Override  // erhe
    public final void n(erhb erhb0, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest0) {
        Status status2;
        String s5;
        byte[] arr_b;
        Throwable throwable2;
        Status status1;
        Status status0 = new Status(8);
        try {
            if(this.a() == null) {
                status1 = new Status(10651);
                goto label_3;
            }
            goto label_11;
        }
        catch(Throwable throwable0) {
            throwable2 = throwable0;
            erhb0.k(status0, exchangeAssertionsForUserCredentialsRequest0);
            throw throwable2;
        }
        try {
        label_3:
            this.e.a(status1.i);
        }
        catch(Throwable throwable1) {
            throwable2 = throwable1;
            status0 = status1;
            erhb0.k(status0, exchangeAssertionsForUserCredentialsRequest0);
            throw throwable2;
        }
        erhb0.k(status1, exchangeAssertionsForUserCredentialsRequest0);
        return;
        try {
        label_11:
            String s = null;
            String s1 = Long.toHexString(bbmq.d(this.b));
            String s2 = Build.DEVICE;
            String s3 = Build.MODEL;
            String s4 = String.valueOf(Build.VERSION.SDK_INT);
            ArrayList arrayList0 = exchangeAssertionsForUserCredentialsRequest0.b;
            if(arrayList0 != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                    for(Object object0: arrayList0) {
                        byteArrayOutputStream0.write(((Assertion)object0).d);
                    }
                    MessageDigest messageDigest0 = bbms.g("SHA-1");
                    if(messageDigest0 == null) {
                        erew.a.m("Could not get SHA-1 Message Digest.", new Object[0]);
                        arr_b = new byte[0];
                    }
                    else {
                        arr_b = messageDigest0.digest(byteArrayOutputStream0.toByteArray());
                    }
                    s5 = bbmu.c(arr_b);
                }
                catch(IOException iOException0) {
                    erew.a.n("Could not convert assertions to bytes.", iOException0, new Object[0]);
                    goto label_38;
                }
                bhnd bhnd0 = this.a();
                if(bhnd0 != null) {
                    s = bhnd0.a(bbnh.m(s1, "encryptedUserAssertionHash", s5));
                }
            }
        label_38:
            exchangeAssertionsForUserCredentialsRequest0.c = new DeviceSignals(s1, s2, s3, s4, s);
            Set set0 = exchangeAssertionsForUserCredentialsRequest0.a;
            set0.add(Integer.valueOf(3));
            exchangeAssertionsForUserCredentialsRequest0.f = Locale.getDefault().toString();
            set0.add(Integer.valueOf(6));
            int v = (int)hpaj.b();
            Context context0 = this.b;
            if(bafi.b(v, context0) && bafi.c()) {
                exchangeAssertionsForUserCredentialsRequest0.j = bafi.a(v, context0);
                set0.add(Integer.valueOf(10));
            }
            status2 = new Status(0);
        }
        catch(Throwable throwable0) {
            throwable2 = throwable0;
            erhb0.k(status0, exchangeAssertionsForUserCredentialsRequest0);
            throw throwable2;
        }
        erhb0.k(status2, exchangeAssertionsForUserCredentialsRequest0);
    }

    @Override  // erhe
    public final void o(erhb erhb0, int v) {
        if(gpog.a(v) != 0) {
            this.f = gpog.a(v);
            erhb0.l(new Status(0));
            return;
        }
        erew.a.f("Unknown bootstrapFlowType: " + v, new Object[0]);
        erhb0.l(new Status(10));
    }

    @Override  // erhe
    public final void p(erhb erhb0, boolean z) {
        erew.g = z;
        erhb0.b(new Status(0));
    }

    public final UserCredential[] q(List list0, hkwv[] arr_hkwv) {
        String s1;
        String s;
        HashMap hashMap0 = new HashMap();
        for(int v = 0; v < arr_hkwv.length; ++v) {
            hkwv hkwv0 = arr_hkwv[v];
            hashMap0.put(hkwv0.b, hkwv0);
        }
        UserCredential[] arr_userCredential = new UserCredential[list0.size()];
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            gppj gppj0 = (gppj)list0.get(v1);
            int v2 = gppj0.d;
            if(v2 != 0) {
                ((frpe)this.e.e.mr()).b(new Object[]{v2});
                erew.a.f(a.s(Integer.toString((gppi.a(gppj0.f) == 0 ? 1 : gppi.a(gppj0.f)) - 1), gppj0.d, "UserCredential response Status: ", " DisallowReason: "), new Object[0]);
            }
            hkwv hkwv1 = (hkwv)hashMap0.get(gppj0.b);
            if(hkwv1 == null) {
                s1 = null;
                s = null;
            }
            else {
                s = hkwv1.d;
                s1 = hkwv1.c;
            }
            arr_userCredential[v1] = new UserCredential(gppj0.b, gppj0.d, gppj0.e, gppj0.g, gppj0.h, s1, s, gppj0.c);
        }
        return arr_userCredential;
    }

    private final kau r(Challenge challenge0, boolean z, boolean z1) {
        byte[] arr_b4;
        byte[] arr_b3;
        String s6;
        byte[] arr_b1;
        ajpf ajpf0;
        String s;
        int v = challenge0.b;
        ((frpe)this.e.d.mr()).b(new Object[]{v});
        int v1 = challenge0.b;
        if(v1 == 0) {
            try {
                s = challenge0.c;
                byte[] arr_b = challenge0.e;
                Context context0 = this.b;
                String s1 = Long.toHexString(bbmq.d(context0));
                boolean z2 = erpk.a(context0);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gppl.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gppl)hftv0).e = z2 ? 2 : 1;
                ((gppl)hftv0).b |= 4;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((gppl)hftv1).b |= 1;
                ((gppl)hftv1).c = z2;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp0.b_message;
                ((gppl)hftv2).b |= 2;
                ((gppl)hftv2).d = z;
                if(z2) {
                    azox azox0 = new azox();
                    try {
                        bbic.a().d(context0, new Intent().setClassName(context0, "com.google.android.gms.auth.setup.devicesignals.DeviceSignalsService"), azox0, 1);
                        IBinder iBinder0 = azox0.a();
                        if(iBinder0 == null) {
                            ajpf0 = null;
                        }
                        else {
                            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService");
                            ajpf0 = (iInterface0 instanceof ajpf) ? ((ajpf)iInterface0) : new ajpd(iBinder0);
                        }
                        long v3 = ajpf0.a();
                        long v4 = ajpf0.b();
                        long v5 = Long.compare(v3, -1L) == 0 ? -1L : (SystemClock.elapsedRealtime() - v3) / 1000L;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv4 = hftp0.b_message;
                        ((gppl)hftv4).b |= 8;
                        ((gppl)hftv4).f = v5;
                        if(!hftv4.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gppl gppl1 = (gppl)hftp0.b_message;
                        gppl1.b |= 16;
                        gppl1.g = v4 == -1L ? -1L : v4 / 1000L;
                    }
                    catch(InterruptedException | RemoteException exception1) {
                        erew.a.n("Could not get device signals. Setting to insecure.", exception1, new Object[0]);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv5 = hftp0.b_message;
                        ((gppl)hftv5).b |= 8;
                        ((gppl)hftv5).f = -1L;
                        if(!hftv5.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gppl gppl2 = (gppl)hftp0.b_message;
                        gppl2.b |= 16;
                        gppl2.g = -1L;
                    }
                    finally {
                        bbic.a().b(this.b, azox0);
                    }
                }
                else {
                    if(!hftv2.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp0.b_message;
                    ((gppl)hftv3).b |= 8;
                    ((gppl)hftv3).f = -1L;
                    if(!hftv3.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gppl gppl0 = (gppl)hftp0.b_message;
                    gppl0.b |= 16;
                    gppl0.g = -1L;
                }
                baun baun0 = erew.a;
                baun0.d(a.u(((gppl)hftp0.b_message).f, "lastUnlockDurationInS: "), new Object[0]);
                baun0.d(a.u(((gppl)hftp0.b_message).g, "lockScreenSetupDurationInS: "), new Object[0]);
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gpor.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gpor gpor0 = (gpor)hftp1.b_message;
                s1.getClass();
                gpor0.b |= 1;
                gpor0.c = s1;
                String s2 = Build.MODEL;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gpor gpor1 = (gpor)hftp1.b_message;
                s2.getClass();
                gpor1.b |= 4;
                gpor1.e = s2;
                String s3 = Build.DEVICE;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv6 = hftp1.b_message;
                s3.getClass();
                ((gpor)hftv6).b |= 2;
                ((gpor)hftv6).d = s3;
                if(!hftv6.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gpor gpor2 = (gpor)hftp1.b_message;
                gpor2.b |= 16;
                gpor2.g = "253434029";
                String s4 = String.valueOf(Build.VERSION.SDK_INT);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv7 = hftp1.b_message;
                s4.getClass();
                ((gpor)hftv7).b |= 8;
                ((gpor)hftv7).f = s4;
                if(!hftv7.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gpor gpor3 = (gpor)hftp1.b_message;
                gppl gppl3 = (gppl)hftp0.N_build();
                gppl3.getClass();
                gpor3.i = gppl3;
                gpor3.b |= 0x40;
                if(z1) {
                    String s5 = ((gpor)hftp1.b_message).c;
                    if(arr_b == null) {
                        s6 = null;
                    }
                    else {
                        bhnd bhnd0 = this.a();
                        if(bhnd0 == null) {
                            s6 = null;
                        }
                        else {
                            MessageDigest messageDigest0 = bbms.g("SHA-1");
                            if(messageDigest0 == null) {
                                baun0.m("Could not get SHA-1 Message Digest.", new Object[0]);
                                arr_b1 = new byte[0];
                            }
                            else {
                                arr_b1 = messageDigest0.digest(arr_b);
                            }
                            s6 = bhnd0.a(bbnh.m(s5, "challengeHash", bbmu.c(arr_b1)));
                        }
                    }
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gpor gpor4 = (gpor)hftp1.b_message;
                    s6.getClass();
                    gpor4.b |= 0x20;
                    gpor4.h = s6;
                }
                byte[] arr_b2 = ((gpor)hftp1.N_build()).toBytesArray();
                arr_b3 = new JSONStringer().object().key("typ").value("navigator.id.getAssertion").key("challenge").value(bbmu.c(arr_b)).key("source_device_signals").value(bbmu.c(arr_b2)).key("account_identifier").value(s).endObject().toString().getBytes(StandardCharsets.UTF_8);
                arr_b4 = MessageDigest.getInstance("SHA-256").digest(arr_b3);
            }
            catch(JSONException | NoSuchAlgorithmException exception0) {
                erew.a.l(exception0);
                this.e.a(10660);
                return null;
            }
            ajnr ajnr0 = new ajnr(this.i, s);
            Long long0 = ((GetAndAdvanceOtpCounterResponse)this.i.f(ajnr0)).b;
            if(long0 == null) {
                this.e.a(10659);
                return null;
            }
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hhtl.a).v_newBuilder();
            ByteString hfsf0 = ByteString.copyFrom(arr_b4);
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            hhtl hhtl0 = (hhtl)hftp2.b_message;
            hhtl0.b |= 1;
            hhtl0.c = hfsf0;
            long v6 = (long)long0;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv8 = hftp2.b_message;
            ((hhtl)hftv8).b |= 2;
            ((hhtl)hftv8).d = v6;
            if(!hftv8.isImmutable()) {
                hftp2.ensureMutable();
            }
            hhtl.b(((hhtl)hftp2.b_message));
            return new kau(arr_b3, ((hhtl)hftp2.N_build()));
        }
        erew.a.f("challenge status was not STATUS_OK: " + v1, new Object[0]);
        this.e.a(10658);
        return null;
    }

    private final void s(erhb erhb0, Challenge[] arr_challenge, boolean z, boolean z1) {
        evql evql0;
        Assertion assertion0;
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_challenge.length; ++v) {
            Challenge challenge0 = arr_challenge[v];
            if(erew.g) {
                erew.a.d("Creating fake assertion for %s", new Object[]{challenge0.c});
                assertion0 = new Assertion(challenge0.c, new byte[0], new byte[0], challenge0.f, challenge0.e);
            }
            else {
                assertion0 = null;
            }
            if(assertion0 == null) {
                kau kau0 = this.r(challenge0, z, z1);
                if(kau0 == null) {
                    evql0 = evrg.c(new aztb(Status.d));
                }
                else {
                    byte[] arr_b = (byte[])kau0.a;
                    hhtl hhtl0 = (hhtl)kau0.b;
                    if(arr_b != null && hhtl0 != null) {
                        Account account0 = new Account(challenge0.c, "com.google");
                        byte[] arr_b1 = hhtl0.toBytesArray();
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhto.a).v_newBuilder();
                        int v1 = hhtt.l.q;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        if(v1 == 0) {
                            throw null;
                        }
                        ((hhto)hftv0).c = v1 - 1;
                        ((hhto)hftv0).b |= 1;
                        if(!hftv0.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hhto.b(((hhto)hftp0.b_message));
                        Payload payload0 = new Payload(null, ((hhto)hftp0.N_build()).toBytesArray(), arr_b1);
                        evql0 = this.j.m(account0, payload0).c(new ereo(challenge0, arr_b));
                    }
                    else {
                        evql0 = evrg.c(new aztb(Status.d));
                    }
                }
            }
            else {
                evql0 = evrg.d(assertion0);
            }
            evql0.A(new erep(challenge0));
            arrayList0.add(evql0);
        }
        evrg.g(arrayList0).z(new ereq(this, erhb0));
    }
}

