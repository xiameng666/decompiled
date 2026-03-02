import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import j..util.Collection.-EL;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public final class aqms {
    public static final baun a;

    static {
        aqms.a = aqql.a("ChangeVersionFromVToUBackup");
    }

    public static long a(String s) {
        String s1 = hqlt.a.o().O();
        try {
            Map map0 = gfud.e(',').a(':').a(s1);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            aqms.a.n("Failed to parse the allowlist of packages and U versions", illegalArgumentException0, new Object[0]);
            return ggnf.a.containsKey(s) ? ((long)(((Long)ggnf.a.get(s)))) : 0L;
        }
        ggek ggek0 = new ggek();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Long long0 = glxd.k(((String)map$Entry0.getValue()));
            if(long0 != null) {
                ggek0.i(((String)map$Entry0.getKey()), long0);
            }
        }
        ggeo ggeo0 = ggek0.b();
        return ggeo0.containsKey(s) ? ((long)(((Long)ggeo0.get(s)))) : 0L;
    }

    public static ggfp b(boolean z) {
        List list0 = gfud.e(',').n(hqlt.q());
        if(!z) {
            aqms.a.d("Wallpaper\'s version will not be modified in @pm@ package because shouldIncludeWallpaper is false.", new Object[0]);
            return (ggfp)Collection.-EL.stream(list0).filter(new aqmr()).collect(ggaf.b);
        }
        return ggfp.G(list0);
    }

    public static void c(String s, BackupDataInput backupDataInput0, BackupDataOutput backupDataOutput0) {
        byte[] arr_b = aqms.g(backupDataInput0);
        backupDataOutput0.writeEntityHeader(s, arr_b.length);
        backupDataOutput0.writeEntityData(arr_b, arr_b.length);
    }

    public static void d(String s, long v, BackupDataInput backupDataInput0, BackupDataOutput backupDataOutput0) {
        aqms.a.h("VtoUMitigation: changing @pm@ version code of pkg: %s to new version code: %d", new Object[]{s, v});
        DataInputStream dataInputStream0 = new DataInputStream(new ByteArrayInputStream(aqms.g(backupDataInput0)));
        if(dataInputStream0.readInt() == 0x80000000) {
            dataInputStream0.readLong();
        }
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
        if(v >= 0xFFFFFFFF80000000L && v <= 0x7FFFFFFFL) {
            dataOutputStream0.writeInt(((int)v));
        }
        else {
            dataOutputStream0.writeInt(0x80000000);
            dataOutputStream0.writeLong(v);
        }
        ghjj.b(dataInputStream0, dataOutputStream0);
        byte[] arr_b = byteArrayOutputStream0.toByteArray();
        backupDataOutput0.writeEntityHeader(s, arr_b.length);
        backupDataOutput0.writeEntityData(arr_b, arr_b.length);
    }

    public static boolean e(Context context0) {
        frce frce0 = new frce(context0);
        frce0.d("backup");
        frce0.e("TargetProtoDataStore.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)aqhz.a));
        frif frif0 = frie0.a();
        frli frli0 = cjtb.a.a(frif0);
        try {
            if(((int)(((Integer)((glyq)aqka.a(frli0)).u()))) == 34 && Build.VERSION.SDK_INT == 35) {
                return true;
            }
        }
        catch(InterruptedException | ExecutionException exception0) {
            aqms.a.n("Failed to get target device SDK version from proto data store", exception0, new Object[0]);
        }
        return false;
    }

    public static boolean f(Context context0) {
        frce frce0 = new frce(context0);
        frce0.d("backup");
        frce0.e("TargetProtoDataStore.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)aqhz.a));
        frif frif0 = frie0.a();
        frli frli0 = cjtb.a.a(frif0);
        try {
            String s = (String)((glyq)glzd.f(frli0.a(), new aqjy(), gmap.a)).u();
            return ggfp.G(gfud.e(',').n(hqlt.a.o().Q())).contains(s);
        }
        catch(InterruptedException | ExecutionException exception0) {
            aqms.a.n("Failed to get target device model from proto data store", exception0, new Object[0]);
            return ggfp.G(gfud.e(',').n(hqlt.a.o().Q())).contains("");
        }
    }

    static byte[] g(BackupDataInput backupDataInput0) {
        int v = backupDataInput0.getDataSize();
        byte[] arr_b = new byte[v];
        int v1 = 0;
        do {
            v1 += backupDataInput0.readEntityData(arr_b, v1, v - v1);
        }
        while(v1 < v);
        return arr_b;
    }
}

