package com.google.android.gms.auth.account.be;

import a;
import adgb;
import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import azts;
import bauc;
import bboh;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import erej;
import erek;
import erfc;
import evql;
import evrg;
import gftb;
import ggtj;
import java.util.concurrent.ExecutionException;

public class FinishBootstrapIntentOperation extends IntentOperation {
    private static final bboh a;
    private erek b;

    static {
        FinishBootstrapIntentOperation.a = adgb.a("FinishBootstrapMessengerService");
    }

    public FinishBootstrapIntentOperation() {
    }

    FinishBootstrapIntentOperation(erej erej0, erek erek0) {
        this.b = erek0;
    }

    private static final Message a(String s) {
        Message message0 = Message.obtain(null, 1001);
        Bundle bundle0 = new Bundle();
        ClassLoader classLoader0 = FinishBootstrapIntentOperation.class.getClassLoader();
        gftb.check(classLoader0);
        bundle0.setClassLoader(classLoader0);
        bundle0.putString("errorMsg", s);
        message0.setData(bundle0);
        return message0;
    }

    private static final Message b(Exception exception0, String s) {
        if((exception0 instanceof InterruptedException)) {
            Thread.currentThread().interrupt();
        }
        return FinishBootstrapIntentOperation.a(s);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.b = new azts(this, null);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        UserCredential[] arr_userCredential;
        Message message0;
        ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest1;
        Bundle bundle0 = intent0.getExtras();
        if(bundle0 != null) {
            Messenger messenger0 = (Messenger)bundle0.get("messenger");
            if(messenger0 != null) {
                try {
                    if(!"com.google.android.gms.auth.account.be.finish_bootstrap".equals(intent0.getAction())) {
                        messenger0.send(FinishBootstrapIntentOperation.a("Unknown action"));
                        return;
                    }
                    Account account0 = (Account)intent0.getParcelableExtra("bootstrapAccount");
                    if(account0 == null) {
                        messenger0.send(FinishBootstrapIntentOperation.a("No bootstrap account"));
                        return;
                    }
                    ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest0 = (ExchangeAssertionsForUserCredentialsRequest)bauc.b(intent0, "bootstrapAssertion", ExchangeAssertionsForUserCredentialsRequest.CREATOR);
                    if(exchangeAssertionsForUserCredentialsRequest0 == null) {
                        messenger0.send(FinishBootstrapIntentOperation.a("No partial request to finish bootstrapping"));
                        return;
                    }
                    try {
                        exchangeAssertionsForUserCredentialsRequest1 = (ExchangeAssertionsForUserCredentialsRequest)evrg.n(this.b.ca(exchangeAssertionsForUserCredentialsRequest0));
                    }
                    catch(ExecutionException | InterruptedException exception0) {
                        message0 = FinishBootstrapIntentOperation.b(exception0, "Error calling api to populate target device info");
                        goto label_60;
                    }
                    if(exchangeAssertionsForUserCredentialsRequest1 == null) {
                        message0 = FinishBootstrapIntentOperation.a("No partialRequest");
                    }
                    else {
                        evql evql0 = this.b.bV(exchangeAssertionsForUserCredentialsRequest1);
                        try {
                            arr_userCredential = ((erfc)evrg.n(evql0)).a;
                        }
                        catch(ExecutionException | InterruptedException exception1) {
                            message0 = FinishBootstrapIntentOperation.b(exception1, "Error calling api to exchange user creds");
                            goto label_60;
                        }
                        if(arr_userCredential == null) {
                            message0 = FinishBootstrapIntentOperation.a("Error while fetching credential.");
                        }
                        else if(arr_userCredential.length > 0) {
                            message0 = null;
                            for(int v = 0; v < arr_userCredential.length; ++v) {
                                UserCredential userCredential0 = arr_userCredential[v];
                                int v1 = userCredential0.c;
                                if(v1 == 0) {
                                    if(TextUtils.isEmpty(userCredential0.e)) {
                                        String s = userCredential0.f;
                                        Message message1 = Message.obtain(null, 1);
                                        Bundle bundle1 = new Bundle();
                                        ClassLoader classLoader0 = FinishBootstrapIntentOperation.class.getClassLoader();
                                        gftb.check(classLoader0);
                                        bundle1.setClassLoader(classLoader0);
                                        bundle1.putString("mastercredential", s);
                                        bundle1.putParcelable("dataAccount", account0);
                                        message1.setData(bundle1);
                                        message0 = message1;
                                        break;
                                    }
                                    ((ggtj)FinishBootstrapIntentOperation.a.j()).H("Got a fallback URL, but we do not handle challenges. Status: %s Reason: %s", userCredential0.c, userCredential0.d);
                                    message0 = FinishBootstrapIntentOperation.a("Fallback url.");
                                    break;
                                }
                                ((ggtj)FinishBootstrapIntentOperation.a.j()).H("Error while fetching credential. Status: %s, Reason: %s", v1, userCredential0.d);
                            }
                        }
                        else {
                            message0 = FinishBootstrapIntentOperation.a("Error while fetching credential.");
                        }
                        if(message0 == null) {
                            message0 = FinishBootstrapIntentOperation.a("bootstrap failed");
                        }
                    }
                label_60:
                    messenger0.send(message0);
                }
                catch(RemoteException remoteException0) {
                    a.ae(FinishBootstrapIntentOperation.a.j(), "Exception handling intent", remoteException0);
                }
            }
        }
    }
}

