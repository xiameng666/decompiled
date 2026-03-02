import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;

public final class fdpr implements Runnable {
    public final fdpy a;
    public final fdpq b;
    public final ffau c;
    public final fdwt d;

    public fdpr(fdpy fdpy0, fdpq fdpq0, ffau ffau0, fdwt fdwt0) {
        this.a = fdpy0;
        this.b = fdpq0;
        this.c = ffau0;
        this.d = fdwt0;
    }

    @Override
    public final void run() {
        fdvk fdvk0;
        SQLiteDatabase sQLiteDatabase0;
        fdvl fdvl0;
        fdvk fdvk1;
        SQLiteDatabase sQLiteDatabase1;
        ffbx ffbx0 = this.c.c == null ? ffbx.a : this.c.c;
        HashSet hashSet0 = new HashSet();
        for(Object object0: (ffbx0.d == null ? fexb.a : ffbx0.d).b) {
            hashSet0.add(fdpl.a(((fexi)object0).c, ((fexi)object0).d));
        }
        fdwt fdwt0 = this.d;
        fdpy fdpy0 = this.a;
        if(fdwt0 == null) {
            fdvl fdvl1 = (fdvl)fdpy0.c.get();
            String s1 = ffbx0.c;
            try {
                sQLiteDatabase1 = fdvl1.c.getWritableDatabase();
                sQLiteDatabase1.beginTransaction();
            }
            catch(SQLiteException sQLiteException0) {
                goto label_44;
            }
            try {
                fdvk1 = fdvl1.l(sQLiteDatabase1, s1, false, hashSet0);
                sQLiteDatabase1.setTransactionSuccessful();
                goto label_39;
            }
            catch(Throwable throwable1) {
                try {
                    sQLiteDatabase1.endTransaction();
                    throw throwable1;
                label_39:
                    sQLiteDatabase1.endTransaction();
                    fdvl1.M(fdvk1.a);
                    fdvl1.K(sQLiteDatabase1, fdvk1.b);
                    goto label_45;
                }
                catch(SQLiteException sQLiteException0) {
                }
            }
        label_44:
            Log.w("DataItems", "Failed to add asset: " + s1, sQLiteException0);
        }
        else {
            String s = fdwt0.a;
            if(ffbx0.c.equals(s)) {
                try {
                    fdpy.l(s, fdwt0.b, hashSet0, "handleSetAsset", fdpy0.a);
                    fdvl0 = (fdvl)fdpy0.c.get();
                    sQLiteDatabase0 = fdvl0.c.getWritableDatabase();
                    sQLiteDatabase0.beginTransaction();
                }
                catch(IOException unused_ex) {
                    goto label_45;
                }
                try {
                    fdvl0.s.h(s, fdwt0.b);
                    fdvk0 = fdvl0.l(sQLiteDatabase0, s, true, hashSet0);
                    sQLiteDatabase0.setTransactionSuccessful();
                    goto label_23;
                }
                catch(Throwable throwable0) {
                    try {
                        sQLiteDatabase0.endTransaction();
                        throw throwable0;
                    label_23:
                        sQLiteDatabase0.endTransaction();
                        fdvl0.M(fdvk0.a);
                        fdvl0.K(sQLiteDatabase0, fdvk0.b);
                    }
                    catch(IOException unused_ex) {
                    }
                    goto label_45;
                }
            }
            Log.w("assets", String.format("SetAsset message has digest differing than the actual digest of the file: %s vs %s (Ignoring)", ffbx0.c, s));
            return;
        }
    label_45:
        ((fdpx)fdpy0.d).a(ffbx0.c);
        File file0 = fdwt0 == null ? null : fdwt0.b;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffau.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fexa.a).v_newBuilder();
        String s2 = ffbx0.c;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        fexa fexa0 = (fexa)hftp1.b_message;
        s2.getClass();
        fexa0.b |= 1;
        fexa0.c = s2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffau ffau0 = (ffau)hftp0.b_message;
        fexa fexa1 = (fexa)hftp1.N_build();
        fexa1.getClass();
        ffau0.d = fexa1;
        ffau0.b |= 2;
        ffau ffau1 = (ffau)hftp0.N_build();
        if(Log.isLoggable("assets", 3)) {
            Log.d("assets", "Sending AckAsset message for " + ffbx0.c);
        }
        this.b.b(ffau1, null);
        fdpy.k(2, hashSet0, file0);
    }
}

