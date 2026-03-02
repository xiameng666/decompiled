import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;

final class eqcz {
    public final erek a;
    private static final baun b;
    private final Context c;
    private final eqme d;
    private final eqcy e;
    private final boolean f;
    private final boolean g;

    static {
        eqcz.b = new erqc(new String[]{"D2D", "TargetAccountTransferController"});
    }

    public eqcz(Context context0, eqme eqme0, eqcy eqcy0, boolean z, boolean z1, erek erek0) {
        batl.s(context0);
        this.c = context0;
        batl.s(eqme0);
        this.d = eqme0;
        batl.s(eqcy0);
        this.e = eqcy0;
        this.f = z;
        this.g = z1;
        this.a = erek0;
    }

    public final void a(AccountBootstrapPayload accountBootstrapPayload0) {
        UserCredential[] arr_userCredential1;
        int v5;
        ProtoLiteBuilder hftp1;
        erfc erfc0;
        Challenge[] arr_challenge;
        eqme eqme0 = this.d;
        eqme0.D(2);
        ArrayList arrayList0 = accountBootstrapPayload0.b;
        if(arrayList0 != null) {
            baun baun0 = eqcz.b;
            baun0.h("Processing UserBootstrapInfos", new Object[0]);
            eqme0.L(3);
            if(arrayList0.isEmpty()) {
                this.b(10573, "UserBootstrapInfos are empty.");
            }
            else {
                try {
                    arr_challenge = (Challenge[])evrg.n(this.a.bX(((UserBootstrapInfo[])arrayList0.toArray(new UserBootstrapInfo[arrayList0.size()]))));
                }
                catch(ExecutionException | InterruptedException exception0) {
                    this.b(erqf.c(exception0).i, "Failure processing user bootstrap info.");
                    goto label_26;
                }
                if(arr_challenge != null && arr_challenge.length > 0) {
                    baun0.h("Sending challenges to Source.", new Object[0]);
                    this.d.L(4);
                    MessagePayload messagePayload0 = new MessagePayload();
                    AccountBootstrapPayload accountBootstrapPayload1 = new AccountBootstrapPayload();
                    messagePayload0.r(accountBootstrapPayload1);
                    accountBootstrapPayload1.c = new ArrayList(Arrays.asList(arr_challenge));
                    accountBootstrapPayload1.a.add(Integer.valueOf(3));
                    this.e.h(messagePayload0);
                }
                else {
                    this.b(10573, "No challenges were returned in the UserBootstrapInfos.");
                }
            }
        }
    label_26:
        ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest0 = accountBootstrapPayload0.d;
        if(exchangeAssertionsForUserCredentialsRequest0 != null) {
            baun baun1 = eqcz.b;
            baun1.h("Processing ExchangeAssertionsForUserCredentialsRequest", new Object[0]);
            this.d.L(5);
            try {
                ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest1 = (ExchangeAssertionsForUserCredentialsRequest)evrg.n(this.a.ca(exchangeAssertionsForUserCredentialsRequest0));
                exchangeAssertionsForUserCredentialsRequest1.i = this.f;
                exchangeAssertionsForUserCredentialsRequest1.a.add(Integer.valueOf(9));
                erfc0 = (erfc)evrg.n(this.a.bV(exchangeAssertionsForUserCredentialsRequest1));
            }
            catch(ExecutionException | InterruptedException exception1) {
                int v = erqf.c(exception1).i;
                this.b(v, "API Failure with error code: " + v);
                goto label_126;
            }
            baun1.h("Processing user credentials.", new Object[0]);
            UserCredential[] arr_userCredential = erfc0.a;
            if(arr_userCredential == null) {
                this.b(10573, "Request returned no user credentials.");
            }
            else {
                eqme eqme1 = this.d;
                ProtoLiteBuilder hftp0 = eqme1.h;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gjpf)hftp0.b_message).g = hfvv.a;
                int v1 = arr_userCredential.length;
                ArrayList arrayList1 = new ArrayList(v1);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int v2 = 0;
                int v3 = 0;
                while(v2 < v1) {
                    UserCredential userCredential0 = arr_userCredential[v2];
                    int v4 = userCredential0.c;
                    if(v4 == 0) {
                        arrayList1.add(userCredential0);
                        if(TextUtils.isEmpty(userCredential0.e)) {
                            arrayList2.add(userCredential0);
                        }
                        else {
                            arrayList3.add(userCredential0);
                        }
                        hftp1 = hftp0;
                        v5 = v1;
                    }
                    else {
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gjpa.a).v_newBuilder();
                        v5 = v1;
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gjpa gjpa0 = (gjpa)hftp2.b_message;
                        gjpa0.b |= 1;
                        gjpa0.c = v4;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gjpf gjpf0 = (gjpf)hftp0.b_message;
                        gjpa gjpa1 = (gjpa)hftp2.N_build();
                        gjpa1.getClass();
                        hfuo hfuo0 = gjpf0.g;
                        if(!hfuo0.c()) {
                            gjpf0.g = ProtoLiteMessage.E(hfuo0);
                        }
                        gjpf0.g.add(gjpa1);
                        hftp1 = hftp0;
                        baun1.d("Account (" + userCredential0.b + ") not OK (Status: " + userCredential0.c + ")", new Object[0]);
                        BootstrapAccount bootstrapAccount0 = new BootstrapAccount(userCredential0.b, "com.google");
                        this.e.a(bootstrapAccount0);
                        ++v3;
                    }
                    ++v2;
                    v1 = v5;
                    hftp0 = hftp1;
                }
                if(v3 > 0) {
                    baun1.h(v3 + " account(s) were not added.", new Object[0]);
                }
                eqme1.r(arr_userCredential.length);
                eqme1.p(arrayList2.size());
                eqme1.s(arrayList3.size());
                if(arrayList1.isEmpty()) {
                    this.b(10573, "No credentials successfully fetched.");
                }
                else {
                    eqcy eqcy0 = this.e;
                    eqcy0.e(erfc0.b, erfc0.c);
                    baun1.j("restoreAccountId: " + erfc0.b, new Object[0]);
                    baun1.j("restoreToken: " + erfc0.c, new Object[0]);
                    if(arrayList3.isEmpty()) {
                        eqqw.b(this.c, arrayList2);
                        eqcy0.b(eqsh.q(arr_userCredential));
                        eqcy0.c();
                    }
                    else if(this.f) {
                        if(!arrayList2.isEmpty()) {
                            eqqw.b(this.c, arrayList2);
                            eqcy0.b(eqsh.p(arrayList2));
                        }
                        ArrayList arrayList4 = new ArrayList(arrayList1);
                        eqme1.L(6);
                        MessagePayload messagePayload1 = new MessagePayload();
                        AccountBootstrapPayload accountBootstrapPayload2 = new AccountBootstrapPayload();
                        messagePayload1.r(accountBootstrapPayload2);
                        accountBootstrapPayload2.e = arrayList4;
                        accountBootstrapPayload2.a.add(Integer.valueOf(5));
                        eqcy0.h(messagePayload1);
                    }
                    else {
                        eqcy0.g(eqsh.p(arrayList1));
                        if(this.g) {
                            eqcy0.c();
                        }
                    }
                }
            }
        }
    label_126:
        ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest0 = accountBootstrapPayload0.f;
        if(exchangeSessionCheckpointsForUserCredentialsRequest0 != null) {
            eqcz.b.j("Processing ExchangeSessionCheckpointsForUserCredentialsRequest", new Object[0]);
            this.d.L(7);
            if(!exchangeSessionCheckpointsForUserCredentialsRequest0.b.isEmpty()) {
                try {
                    ergu ergu0 = new ergu(exchangeSessionCheckpointsForUserCredentialsRequest0);
                    azzc azzc0 = new azzc();
                    azzc0.a = ergu0;
                    azzc0.d = 0x510B;
                    azzd azzd0 = azzc0.a();
                    arr_userCredential1 = (UserCredential[])evrg.n(((azts)this.a).iG(azzd0));
                }
                catch(ExecutionException | InterruptedException exception2) {
                    this.b(erqf.c(exception2).i, "Failure trying to exchange checkpoints for user credentials.");
                    return;
                }
                if(arr_userCredential1 != null && arr_userCredential1.length != 0) {
                    this.d.q(arr_userCredential1.length);
                    eqqw.c(this.c, arr_userCredential1);
                    ArrayList arrayList5 = eqsh.q(arr_userCredential1);
                    this.e.b(arrayList5);
                    goto label_149;
                }
                this.b(10573, "Exchanging session checkpoints did not return any credentials.");
                return;
            }
        label_149:
            this.e.c();
        }
    }

    private final void b(int v, String s) {
        eqcz.b.f(s, new Object[0]);
        this.e.d(v, s);
    }
}

