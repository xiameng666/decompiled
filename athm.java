import android.content.Context;
import android.database.Cursor;
import j..util.Optional;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import javax.crypto.SecretKey;
import jeb.synthetic.TWR;

public final class athm {
    private final aqlq a;
    private final athl b;
    private final athn c;
    private final aqlk d;
    private final String e;

    public athm(Context context0, SecureRandom secureRandom0, athn athn0, aqlk aqlk0, String s) {
        this.d = aqlk0;
        this.e = s;
        this.b = new athl(secureRandom0);
        this.a = new aqlq(context0, aqlk0);
        this.c = athn0;
    }

    public final athk a() {
        Optional optional1;
        Optional optional0;
        this.c.b.a();
        String s = this.e;
        if(this.c.b.c.size() < this.c.c && this.c.a.a(s) >= this.c.a.c) {
            return this.c();
        }
        aqlq aqlq0 = this.a;
        aqlq.b(s);
        try {
            String s1 = aqlq0.a.a;
            Cursor cursor0 = aqlq0.b.c().query("tertiary_keys", new String[]{"_id", "secondary_key_alias", "package_name", "wrapped_key_bytes"}, "secondary_key_alias = ? AND package_name = ?", new String[]{s1, s}, null, null, null);
            try {
                if(cursor0.getCount() == 0) {
                    optional0 = Optional.empty();
                }
                else {
                    cursor0.moveToFirst();
                    optional0 = Optional.of(new aqma(s1, s, cursor0.getBlob(cursor0.getColumnIndexOrThrow("wrapped_key_bytes"))));
                }
            }
            catch(Throwable throwable1) {
                TWR.safeClose$NT(cursor0, throwable1);
                throw throwable1;
            }
            cursor0.close();
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(aqlq0.b, throwable0);
            throw throwable0;
        }
        aqlq0.b.close();
        if(optional0.isEmpty()) {
            optional1 = Optional.empty();
        }
        else {
            byte[] arr_b = ((aqma)optional0.get()).c;
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)arax.a), arr_b, 0, arr_b.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            optional1 = Optional.of(aqlp.b(aqlq0.a.b, ((arax)hftv0)));
        }
        if(optional1.isEmpty()) {
            return this.c();
        }
        Object object0 = optional1.get();
        arax arax0 = aqlp.a(this.d.b, ((SecretKey)object0));
        Object object1 = optional1.get();
        return new athk(this.e, ((SecretKey)object1), arax0, false);
    }

    public final void b(athk athk0) {
        if(athk0.c) {
            String s = this.e;
            this.c.a.b.edit().putInt(s, 0).apply();
            this.c.b.c.add(Long.valueOf(System.currentTimeMillis()));
            this.c.b.a();
            try {
                ArrayList arrayList0 = this.c.b.c;
                FileOutputStream fileOutputStream0 = new FileOutputStream(this.c.b.b);
                try {
                    DataOutputStream dataOutputStream0 = new DataOutputStream(fileOutputStream0);
                    try {
                        for(Object object0: arrayList0) {
                            dataOutputStream0.writeLong(((Long)object0).longValue());
                        }
                    }
                    catch(Throwable throwable1) {
                        TWR.safeClose$NT(dataOutputStream0, throwable1);
                        throw throwable1;
                    }
                    dataOutputStream0.close();
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(fileOutputStream0, throwable0);
                    throw throwable0;
                }
                fileOutputStream0.close();
            }
            catch(IOException iOException0) {
                athp.a.g("Error saving tertiary_key_rotation_windowed_count", iOException0, new Object[0]);
            }
            aqlq aqlq0 = this.a;
            aqlq.b(s);
            byte[] arr_b = aqlp.a(aqlq0.a.b, athk0.a).toBytesArray();
            try {
                long v = aqmb.a(new aqma(aqlq0.a.a, s, arr_b), aqlq0.b);
            }
            catch(Throwable throwable2) {
                TWR.safeClose$NT(aqlq0.b, throwable2);
                throw throwable2;
            }
            aqlq0.b.close();
            if(v == -1L) {
                throw new IOException("Failed to commit to db");
            }
        }
        int v1 = this.c.a.a(this.e) + 1;
        this.c.a.b.edit().putInt(this.e, v1).apply();
        atho.a.d("Recorded an incremental backup for %s. %d more backups until key rotation due.", new Object[]{this.e, Math.max(0, this.c.a.c - v1)});
    }

    private final athk c() {
        SecretKey secretKey0 = this.b.a.generateKey();
        arax arax0 = aqlp.a(this.d.b, secretKey0);
        return new athk(this.e, secretKey0, arax0, true);
    }
}

