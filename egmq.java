import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.ContactsContract.RawContacts.DefaultAccount.DefaultAccountAndState;
import android.provider.ContactsContract.RawContacts.DefaultAccount;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class egmq extends cjtm {
    private final efzc a;
    private final String b;
    private final ehiy c;
    private final efpr d;
    private final String e;

    public egmq(efzc efzc0, String s, String s1, azug azug0) {
        super(0xD0, "CleanupSyncedGoogleContacts", azug0);
        this.a = efzc0;
        this.b = s;
        this.c = ehiy.a;
        this.d = efpr.a();
        this.e = s1;
    }

    private static final boolean b(String s) {
        return bbmq.X(s) || hxdo.a.b().e().b.contains(s);
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        gmcd gmcd0;
        Throwable throwable2;
        String s1;
        ehbu ehbu0 = ehbu.a(context0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giqp.a).v_newBuilder();
        ehci ehci0 = ehci.a(context0);
        egyq egyq0 = new egyq(context0);
        hxdo hxdo0 = hxdo.a;
        if(hxdo0.b().j() && (!egmq.b(this.e) && (!hxdo0.b().f().b.contains(this.e) || !hxdo0.b().E()))) {
            egig.m("CleanupSyncedGoogleContactsOperation", "calling package %s not allowed", new Object[]{this.e});
            throw new cjuh(10, String.format("calling package %s not allowed", this.e));
        }
        if(hxdo.g() && !egmq.b(this.e) && ContentResolver.getIsSyncable(new Account(this.b, "com.google"), "com.android.contacts") != 0) {
            egig.k("CleanupSyncedGoogleContactsOperation", "sync must be turned off before unsync");
            throw new cjuh(10, "sync must be turned off before unsync");
        }
        gfug gfug0 = gfug.c(gfqs.a);
        String s = this.b;
        egyc egyc0 = egyc.a(new Account(s, "com.google"));
        if(hxdo0.b().v()) {
            try {
                ((glyq)egyc0.f(false)).u();
                Account account0 = new Account(s, "com.google");
                ContentResolver.cancelSync(account0, "com.android.contacts");
                if(hxdo.f() && (!hxdo.g() || egmq.b(this.e))) {
                    ContentResolver.setIsSyncable(account0, "com.android.contacts", 0);
                }
                if(bbqa.a() && hxdo0.b().D()) {
                    ContentResolver contentResolver0 = context0.getContentResolver();
                    ContactsContract.RawContacts.DefaultAccount.DefaultAccountAndState contactsContract$RawContacts$DefaultAccount$DefaultAccountAndState0 = ContactsContract.RawContacts.DefaultAccount.getDefaultAccountForNewContacts(contentResolver0);
                    if(contactsContract$RawContacts$DefaultAccount$DefaultAccountAndState0.getState() == 3 && account0.equals(contactsContract$RawContacts$DefaultAccount$DefaultAccountAndState0.getAccount())) {
                        egig.e("CleanupSyncedGoogleContactsOperation", "reset default account");
                        batl.l(bbqa.a());
                        try {
                            ContactsContract.RawContacts.DefaultAccount.setDefaultAccountForNewContacts(contentResolver0, ContactsContract.RawContacts.DefaultAccount.DefaultAccountAndState.ofNotSet());
                        }
                        catch(RuntimeException runtimeException0) {
                            egig.d("CleanupSyncedGoogleContactsOperation", "Failed to reset default account: %s", new Object[]{runtimeException0});
                            throw new cjuh(8, runtimeException0.getMessage());
                        }
                    }
                }
            }
            catch(InterruptedException | ExecutionException exception0) {
                egig.k("CleanupSyncedGoogleContactsOperation", "reset unsync state: FAILED");
                if(hwyp.h()) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((giqp)hftp0.b_message).c = 7;
                    ((giqp)hftp0.b_message).b |= 1;
                    giqp giqp0 = (giqp)hftp0.N_build();
                    this.d.i(this.b, giqp0);
                }
                throw new cjuh(8, exception0.getMessage());
            }
        }
        try {
            s1 = this.b;
            hxdo hxdo1 = hxdo.a;
            long v = hxdo1.b().a();
            ehix ehix0 = this.c.b(s1, v);
            try {
                long v1 = gfug0.a(TimeUnit.MILLISECONDS);
                if(!hftp0.b_message.isImmutable()) {
                    try {
                        hftp0.ensureMutable();
                    }
                    catch(Throwable throwable1) {
                        throwable2 = throwable1;
                        goto label_83;
                    }
                }
                giqp giqp1 = (giqp)hftp0.b_message;
                giqp1.b |= 4;
                giqp1.e = v1;
                gfug0.g();
                if(ehix0.b()) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((giqp)hftp0.b_message).f = 2;
                }
                else {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((giqp)hftp0.b_message).f = 1;
                }
                ((giqp)hftp0.b_message).b |= 8;
                if(!ehix0.b() && !hxdo1.b().m()) {
                    throw new cjuh(8, "Failed to cleanup Google Contacts. Google Contacts is currently syncing.");
                }
                ehbu0.b(s1, hftp0);
                int v2 = egyq0.c(s1);
                if(hxdo1.b().x()) {
                    if(hwyp.j()) {
                        gmcd0 = egyc0.a.b(new egya(v2, System.currentTimeMillis()), gmap.a);
                    }
                    else {
                        egxw egxw0 = new egxw(v2);
                        gmcd0 = egyc0.a.b(egxw0, gmap.a);
                    }
                    gmbu.t(gmcd0, new egmm(this, ehci0), gmap.a);
                }
                else {
                    gmbu.t(egyc0.f(true), new egmn(this, ehci0, egyc0, v2), gmap.a);
                }
                egig.e("CleanupSyncedGoogleContactsOperation", "contactsSyncApiEvent: SUCCESS");
                goto label_89;
            }
            catch(Throwable throwable0) {
                throwable2 = throwable0;
            }
        label_83:
            if(ehix0 != null) {
                try {
                    ehix0.close();
                }
                catch(Throwable throwable3) {
                    throwable2.addSuppressed(throwable3);
                }
            }
            throw throwable2;
        label_89:
            ehix0.close();
        }
        catch(cjuh cjuh0) {
            if(hwyp.h()) {
                switch(cjuh0.a_OperationException.i) {
                    case 4: {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((giqp)hftp0.b_message).c = 4;
                        ((giqp)hftp0.b_message).b |= 1;
                        break;
                    }
                    case 5: {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((giqp)hftp0.b_message).c = 3;
                        ((giqp)hftp0.b_message).b |= 1;
                        break;
                    }
                    case 8: {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((giqp)hftp0.b_message).c = 6;
                        ((giqp)hftp0.b_message).b |= 1;
                        break;
                    }
                    case 13: {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((giqp)hftp0.b_message).c = 5;
                        ((giqp)hftp0.b_message).b |= 1;
                        break;
                    }
                    default: {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((giqp)hftp0.b_message).c = 2;
                        ((giqp)hftp0.b_message).b |= 1;
                    }
                }
                giqp giqp2 = (giqp)hftp0.N_build();
                this.d.i(this.b, giqp2);
            }
            egig.k("CleanupSyncedGoogleContactsOperation", "contactsSyncApiEvent: FAILED");
            throw cjuh0;
        }
        if(hwyp.h()) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((giqp)hftp0.b_message).c = 1;
            ((giqp)hftp0.b_message).b |= 1;
            giqp giqp3 = (giqp)hftp0.N_build();
            this.d.i(s1, giqp3);
        }
        this.a.c(Status.b, ApiMetadata.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.c(status0, ApiMetadata.b);
    }
}

