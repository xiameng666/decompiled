import android.accounts.Account;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import android.security.keystore.recovery.RecoveryController;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map.Entry;
import javax.crypto.SecretKey;
import jeb.synthetic.TWR;

public final class aqmh {
    private static final baun a;
    private static final bboh b;
    private final Context c;
    private final aqlm d;
    private final aqle e;
    private final RecoveryController f;
    private final Account g;
    private final aqlj h;

    static {
        aqmh.a = aqql.a("RotateSecondaryKeyTask");
        aqmh.b = bboh.b("RotateSecondaryKeyTask", bbcu.dF);
    }

    public aqmh(Context context0, aqlm aqlm0, aqlj aqlj0, aqle aqle0, RecoveryController recoveryController0, Account account0) {
        this.c = context0;
        this.d = aqlm0;
        batl.s(aqle0);
        this.e = aqle0;
        batl.s(aqlj0);
        this.h = aqlj0;
        batl.s(recoveryController0);
        this.f = recoveryController0;
        this.g = account0;
    }

    public final void a() {
        gfsx gfsx1;
        try {
            gfsx gfsx0 = this.e.c();
            if(gfsx0.i()) {
                String s = (String)gfsx0.d();
                gfsx1 = this.d.c(s);
            }
            else {
                gfsx1 = gfqx.a;
            }
        }
        catch(Exception exception0) {
            aqmh.a.g("Error checking for next key", exception0, new Object[0]);
            aqmh.c(exception0);
            return;
        }
        if(!gfsx1.i()) {
            aqmh.a.d("No secondary key rotation task pending. Exiting.", new Object[0]);
            return;
        }
        aqlk aqlk0 = (aqlk)gfsx1.d();
        try {
            String s1 = aqlk0.a;
            baun baun0 = aqmh.a;
            baun0.h("Key rotation to %s is pending. Checking key sync status.", new Object[]{s1});
            int v = this.f.getRecoveryStatus(s1);
            if(v == 3) {
                baun0.f("Permanent failure to sync %s. Cannot possibly rotate to it.", new Object[]{s1});
                this.e.e();
                aqmh.c(new Exception("Permanent failure to sync secondary key."));
                return;
            }
            if(v == 0) {
                baun0.h("Secondary key %s has now synced! Commencing rotation", new Object[]{s1});
            }
            else {
                baun0.h("Sync still pending for %s", new Object[]{s1});
                goto label_33;
            }
            goto label_35;
        }
        catch(InternalRecoveryServiceException internalRecoveryServiceException0) {
            aqmh.a.g("Error encountered checking whether next secondary key is synced", ((Throwable)internalRecoveryServiceException0), new Object[0]);
            aqmh.c(((Exception)internalRecoveryServiceException0));
            return;
        }
    label_33:
        if(v != 0) {
            return;
        }
        try {
        label_35:
            this.b(aqlk0);
        }
        catch(aqyc aqyc0) {
            aqmh.a.g("Network Error trying to rotate to new secondary key", aqyc0, new Object[0]);
        }
        catch(Exception exception1) {
            aqmh.a.g("Error trying to rotate to new secondary key", exception1, new Object[0]);
            aqmh.c(exception1);
        }
    }

    private final void b(aqlk aqlk0) {
        ggeo ggeo2;
        ggeo ggeo0;
        gfsx gfsx0 = this.e.b();
        if(gfsx0.i()) {
            String s = (String)gfsx0.d();
            gfsx gfsx1 = this.d.c(s);
            if(!gfsx1.i()) {
                throw new aqmc(String.format(Locale.US, "Had local active Folsom key alias of %s but key was not in user\'s keychain.", s));
            }
            aqlk aqlk1 = (aqlk)gfsx1.d();
            String s1 = aqlk1.a;
            String s2 = aqlk0.a;
            if(s2.equals(s1)) {
                aqmh.a.h("%s was already the active alias.", new Object[]{s1});
                return;
            }
            aqlq aqlq0 = new aqlq(this.c, aqlk1);
            try {
                String s3 = aqlq0.a.a;
                SQLiteDatabase sQLiteDatabase0 = aqlq0.b.c();
                ggek ggek0 = new ggek();
                Cursor cursor0 = sQLiteDatabase0.query("tertiary_keys", new String[]{"_id", "secondary_key_alias", "package_name", "wrapped_key_bytes"}, "secondary_key_alias = ?", new String[]{s3}, null, null, null);
                while(true) {
                    try {
                        if(!cursor0.moveToNext()) {
                            break;
                        }
                        String s4 = cursor0.getString(cursor0.getColumnIndexOrThrow("package_name"));
                        ggek0.i(s4, new aqma(s3, s4, cursor0.getBlob(cursor0.getColumnIndexOrThrow("wrapped_key_bytes"))));
                    }
                    catch(Throwable throwable1) {
                        TWR.safeClose$NT(cursor0, throwable1);
                        throw throwable1;
                    }
                }
                cursor0.close();
                ggeo0 = ggek0.b();
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(aqlq0.b, throwable0);
                throw throwable0;
            }
            aqlq0.b.close();
            ggek ggek1 = new ggek();
            ggqj ggqj0 = ggeo0.v().om();
            while(ggqj0.hasNext()) {
                Object object0 = ggqj0.next();
                byte[] arr_b = ((aqma)((Map.Entry)object0).getValue()).c;
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)arax.a), arr_b, 0, arr_b.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                ggek1.i(((String)((Map.Entry)object0).getKey()), aqlp.b(aqlq0.a.b, ((arax)hftv0)));
            }
            ggeo ggeo1 = ggek1.b();
            if(ggeo1.isEmpty()) {
                ggeo2 = ggnf.a;
            }
            else {
                ggek ggek2 = new ggek();
                ggqj ggqj1 = ggeo1.w().om();
                while(ggqj1.hasNext()) {
                    Object object1 = ggqj1.next();
                    SecretKey secretKey0 = (SecretKey)ggeo1.get(((String)object1));
                    ggek2.i(((String)object1), aqlp.a(aqlk0.b, secretKey0));
                }
                ggeo ggeo3 = ggek2.b();
                aqlq aqlq1 = new aqlq(this.c, aqlk0);
                aqly aqly0 = aqlq1.b;
                try {
                    Iterator iterator0 = ggeo3.w().iterator();
                    while(true) {
                    label_55:
                        if(!iterator0.hasNext()) {
                            goto label_64;
                        }
                        Object object2 = iterator0.next();
                        byte[] arr_b1 = ((arax)ggeo3.get(((String)object2))).toBytesArray();
                        if(aqmb.a(new aqma(aqlq1.a.a, ((String)object2), arr_b1), aqly0) == -1L) {
                            throw new IOException("Failed to commit to db");
                        }
                    }
                }
                catch(Throwable throwable2) {
                    TWR.safeClose$NT(aqlq1.b, throwable2);
                    throw throwable2;
                }
                goto label_55;
            label_64:
                aqlq1.b.close();
                ggeo2 = ggeo3;
            }
            this.h.a(this.g, s2, ggeo2);
            this.e.f(s2);
            this.e.e();
            try {
                this.f.removeKey(s1);
                this.d.d();
            }
            catch(InternalRecoveryServiceException internalRecoveryServiceException0) {
                aqmh.a.g("Error removing old secondary key from RecoverableKeyStoreLoader", ((Throwable)internalRecoveryServiceException0), new Object[0]);
                aqmh.c(((Exception)internalRecoveryServiceException0));
            }
            return;
        }
        aqmh.a.h("Was asked to rotate secondary key, but local config did not have a secondary key alias set.", new Object[0]);
        throw new aqmg();
    }

    private static final void c(Exception exception0) {
        long v = hqhn.c();
        aqqo.a(aqmh.b, exception0, v);
    }
}

