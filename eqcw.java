import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorAnnotatedData;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.TargetAccountImportController.ChallengeIntentHelper;
import com.google.android.gms.smartdevice.d2d.TargetAccountImportController.ImportReceiver;
import com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.ui.ForwardingChimeraActivity;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public final class eqcw implements Runnable {
    final String[] a;
    final TargetAccountImportController.ImportReceiver b;

    public eqcw(TargetAccountImportController.ImportReceiver targetAccountImportController$ImportReceiver0, String[] arr_s) {
        this.a = arr_s;
        Objects.requireNonNull(targetAccountImportController$ImportReceiver0);
        this.b = targetAccountImportController$ImportReceiver0;
        super();
    }

    @Override
    public final void run() {
        eqcx eqcx0 = this.b.a;
        String[] arr_s = this.a;
        if(arr_s != null) {
            HashSet hashSet0 = ggog.i(arr_s.length);
            Collections.addAll(hashSet0, arr_s);
            if(eqcx0.e.containsAll(hashSet0)) {
                Object[] arr_object = {Arrays.toString(arr_s)};
                eqcx.a.j("Skipping broadcast. %s already processed", arr_object);
                return;
            }
        }
        baun baun0 = eqcx.a;
        baun0.j("Handling authenticatorIds %s", new Object[]{Arrays.toString(arr_s)});
        batl.e(eqcx0.b);
        eqcx0.h.d();
        baun0.j("Additional info requested, importAccount(RETRIEVE_DATA)", new Object[0]);
        adtu adtu0 = new adtu();
        adtu0.c(2);
        AccountTransferMsg accountTransferMsg0 = new AccountTransferMsg(adtu0);
        evql evql0 = eqcx0.c.c(accountTransferMsg0);
        Status status0 = erqf.b(evql0);
        if(!status0.e()) {
            baun0.f("importAccount(RETRIEVE_DATA) error " + status0.i, new Object[0]);
            eqcx0.d.d(10579, "importAccount(RETRIEVE_DATA) error " + status0.i);
            return;
        }
        AccountTransferMsg accountTransferMsg1 = (AccountTransferMsg)evql0.j();
        if(!eqcx0.d(accountTransferMsg1, hygl.e())) {
            if(accountTransferMsg1 == null) {
                baun0.f("AccountTransferMsg was null", new Object[0]);
                return;
            }
            ArrayList arrayList0 = accountTransferMsg1.c;
            if(arrayList0 != null && !arrayList0.isEmpty()) {
                ArrayList arrayList1 = new ArrayList(arrayList0.size());
                for(int v = 0; v < arrayList0.size(); ++v) {
                    AuthenticatorAnnotatedData authenticatorAnnotatedData0 = (AuthenticatorAnnotatedData)arrayList0.get(v);
                    String s = authenticatorAnnotatedData0.f;
                    baun0.j("Processing authenticator data with id(%s)", new Object[]{s});
                    eqcx0.e.add(s);
                    AuthenticatorTransferInfo authenticatorTransferInfo0 = authenticatorAnnotatedData0.c;
                    baun0.d("Processing %s, status: %d", new Object[]{authenticatorTransferInfo0.c, ((int)authenticatorTransferInfo0.d)});
                    switch(authenticatorTransferInfo0.d) {
                        case 3: {
                            arrayList1.add(authenticatorAnnotatedData0);
                            break;
                        }
                        case 4: {
                            TargetAccountImportController.ChallengeIntentHelper targetAccountImportController$ChallengeIntentHelper0 = eqcx0.g;
                            PendingIntent pendingIntent0 = authenticatorTransferInfo0.f;
                            Intent intent0 = new Intent();
                            intent0.setClassName(targetAccountImportController$ChallengeIntentHelper0.a.getApplicationContext(), "com.google.android.gms.smartdevice.d2d.ui.ForwardingActivity");
                            intent0.putExtra("pendingIntent", pendingIntent0);
                            intent0.putExtra("resultReceiver", ForwardingChimeraActivity.k(targetAccountImportController$ChallengeIntentHelper0));
                            PendingIntent pendingIntent1 = cjok.a(targetAccountImportController$ChallengeIntentHelper0.a.getApplicationContext(), 2, intent0, 0xA000000);
                            if(targetAccountImportController$ChallengeIntentHelper0.e) {
                                baun0.j("Queuing additional challenge request", new Object[0]);
                                targetAccountImportController$ChallengeIntentHelper0.b.add(pendingIntent1);
                            }
                            else {
                                targetAccountImportController$ChallengeIntentHelper0.c.b();
                                targetAccountImportController$ChallengeIntentHelper0.e = true;
                                targetAccountImportController$ChallengeIntentHelper0.d.f(pendingIntent1);
                            }
                        }
                    }
                }
                if(!arrayList1.isEmpty()) {
                    adtu adtu1 = new adtu();
                    adtu1.a(arrayList1);
                    adtu1.b(accountTransferMsg1.e);
                    AccountTransferPayload accountTransferPayload0 = new AccountTransferPayload(new AccountTransferMsg(adtu1));
                    MessagePayload messagePayload0 = new MessagePayload();
                    messagePayload0.s(accountTransferPayload0);
                    eqcx0.d.h(messagePayload0);
                }
            }
            else {
                baun0.j("No authenticator data to process", new Object[0]);
            }
        }
    }
}

