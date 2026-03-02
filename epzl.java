import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.SessionCheckpoint;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;

final class epzl {
    private static final baun a;
    private final Context b;
    private final eqlx c;
    private final epzk d;
    private final erek e;
    private final boolean f;
    private final boolean g;
    private final ArrayList h;

    static {
        epzl.a = new erqc(new String[]{"D2D", "SourceAccountTransferController"});
    }

    public epzl(Context context0, eqlx eqlx0, epzk epzk0, boolean z, boolean z1, ArrayList arrayList0, erek erek0) {
        batl.s(context0);
        this.b = context0;
        batl.s(eqlx0);
        this.c = eqlx0;
        batl.s(epzk0);
        this.d = epzk0;
        this.f = z;
        this.g = z1;
        this.h = arrayList0;
        this.e = erek0;
    }

    public final void a(AccountBootstrapPayload accountBootstrapPayload0) {
        if(accountBootstrapPayload0.c != null) {
            baun baun0 = epzl.a;
            baun0.h("Processing Challenges to assertions.", new Object[0]);
            eqlx eqlx0 = this.c;
            eqlx0.z(4);
            ArrayList arrayList0 = accountBootstrapPayload0.c;
            batl.s(arrayList0);
            try {
                erek erek0 = this.e;
                Assertion[] arr_assertion = (Assertion[])evrg.n(erek0.bU(((Challenge[])arrayList0.toArray(new Challenge[arrayList0.size()])), this.g, false));
                if(arr_assertion != null && arr_assertion.length > 0) {
                    ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest0 = (ExchangeAssertionsForUserCredentialsRequest)evrg.n(erek0.bZ(((ExchangeAssertionsForUserCredentialsRequest)evrg.n(erek0.bW(arr_assertion)))));
                    if(!TextUtils.isEmpty(exchangeAssertionsForUserCredentialsRequest0.g)) {
                        ProtoLiteBuilder hftp0 = eqlx0.h;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gjog gjog0 = (gjog)hftp0.b_message;
                        gjog0.b |= 4;
                        gjog0.e = true;
                    }
                    baun0.h("Sending ExchangeAssertionsForUserCredentialsRequest to Target.", new Object[0]);
                    eqlx0.z(5);
                    AccountBootstrapPayload accountBootstrapPayload1 = new AccountBootstrapPayload();
                    accountBootstrapPayload1.d = exchangeAssertionsForUserCredentialsRequest0;
                    accountBootstrapPayload1.a.add(Integer.valueOf(4));
                    MessagePayload messagePayload0 = new MessagePayload();
                    messagePayload0.r(accountBootstrapPayload1);
                    this.d.f(messagePayload0);
                }
                else {
                    this.d(10650, "Assertions are empty.");
                }
            }
            catch(ExecutionException | InterruptedException exception0) {
                this.d(10650, "Error while processing challenges. Status code: " + erqf.c(exception0).i);
            }
        }
        if(accountBootstrapPayload0.e != null) {
            epzl.a.h("Processing UserCredentials.", new Object[0]);
            this.c.z(6);
            ArrayList arrayList1 = accountBootstrapPayload0.e;
            batl.s(arrayList1);
            batl.c(this.f, "Target asked to process UserCredentials, but BootstrapOptions don\'t require source-side challenges.");
            this.d.b();
            ArrayList arrayList2 = eqsh.p(arrayList1);
            this.d.d(arrayList2);
        }
    }

    public final void b(ArrayList arrayList0) {
        ArrayList arrayList1 = new ArrayList(arrayList0.size());
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Bundle bundle0 = (Bundle)arrayList0.get(v1);
            String s = bundle0.getString("name");
            String s1 = bundle0.getString("sessionCheckpoint");
            if(TextUtils.isEmpty(s1)) {
                epzl.a.d("Session checkpoint is empty: " + s, new Object[0]);
            }
            else if(s == null) {
                epzl.a.d("Account identifier is null", new Object[0]);
            }
            else {
                arrayList1.add(new SessionCheckpoint(s, s1));
            }
        }
        ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest0 = new ExchangeSessionCheckpointsForUserCredentialsRequest(arrayList1);
        epzl.a.h("Sending ExchangeSessionCheckpointsForUserCredentialsRequest.", new Object[0]);
        this.c.z(7);
        AccountBootstrapPayload accountBootstrapPayload0 = new AccountBootstrapPayload();
        accountBootstrapPayload0.f = exchangeSessionCheckpointsForUserCredentialsRequest0;
        accountBootstrapPayload0.a.add(Integer.valueOf(6));
        MessagePayload messagePayload0 = new MessagePayload();
        messagePayload0.r(accountBootstrapPayload0);
        this.d.f(messagePayload0);
    }

    public final void c() {
        UserBootstrapInfo[] arr_userBootstrapInfo;
        epzl.a.h("Sending BootstrapInfos to Target.", new Object[0]);
        this.c.z(3);
        this.c.s(2);
        ArrayList arrayList0 = this.h;
        int v1 = eqri.a(arrayList0);
        ProtoLiteBuilder hftp0 = this.c.h;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        Account[] arr_account = null;
        gjog gjog0 = (gjog)hftp0.b_message;
        gjog0.b |= 2;
        gjog0.d = v1;
        Context context0 = this.b;
        if(erpb.a(context0).p("com.google").length == 0) {
            this.d(10562, "No accounts found");
            return;
        }
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            int v2 = arrayList0.size();
            Account[] arr_account1 = new Account[v2];
            for(int v = 0; v < v2; ++v) {
                BootstrapAccount bootstrapAccount0 = (BootstrapAccount)arrayList0.get(v);
                arr_account1[v] = new Account(bootstrapAccount0.b, bootstrapAccount0.c);
            }
            arr_account = arr_account1;
        }
        if(arr_account != null && arr_account.length > 0) {
            String s = context0.getResources().getQuantityString(0x7F130096, arr_account.length);  // plurals:smartdevice_d2d_copying_accounts
            this.d.e(s);
            try {
                arr_userBootstrapInfo = (UserBootstrapInfo[])evrg.n(this.e.bY(arr_account));
            }
            catch(ExecutionException | InterruptedException exception0) {
                epzl.a.l(exception0);
                this.d(10573, "Error trying to fetch user bootstrap info");
                return;
            }
            AccountBootstrapPayload accountBootstrapPayload0 = new AccountBootstrapPayload();
            accountBootstrapPayload0.b = new ArrayList(Arrays.asList(arr_userBootstrapInfo));
            accountBootstrapPayload0.a.add(Integer.valueOf(2));
            MessagePayload messagePayload0 = new MessagePayload();
            messagePayload0.r(accountBootstrapPayload0);
            messagePayload0.ai(s);
            this.d.f(messagePayload0);
            return;
        }
        this.d(10562, "No accounts to bootstrap");
    }

    private final void d(int v, String s) {
        epzl.a.f(s, new Object[0]);
        this.d.a(v, s);
    }
}

