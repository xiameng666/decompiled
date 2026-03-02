import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.FullBackupDataOutput;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build.VERSION;
import android.util.StringBuilderPrinter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public final class aqwp {
    private static final baun a;
    private final Context b;
    private final PackageManager c;

    static {
        aqwp.a = aqql.a("TelephonyBackupUtil");
    }

    public aqwp(Context context0, PackageManager packageManager0) {
        this.b = context0;
        this.c = packageManager0;
    }

    public static ArrayList a(byte[][] arr2_b) {
        ArrayList arrayList0 = new ArrayList(1);
        byte[] arr_b = arr2_b[0];
        MessageDigest messageDigest0 = MessageDigest.getInstance("SHA-256");
        messageDigest0.update(arr_b);
        arrayList0.add(messageDigest0.digest());
        return arrayList0;
    }

    public static void b(BackupDataOutput backupDataOutput0, String s, byte[] arr_b) {
        backupDataOutput0.writeEntityHeader(s, arr_b.length);
        backupDataOutput0.writeEntityData(arr_b, arr_b.length);
    }

    public static void c(Context context0, File file0) {
        FileOutputStream fileOutputStream0;
        BackupDataInput backupDataInput0;
        Throwable throwable1;
        Closeable closeable1;
        Exception exception1;
        FileInputStream fileInputStream0;
        File file1;
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
        Closeable closeable0 = null;
        try {
            file1 = aqze.b(context0, "telephony_metadata");
            fileInputStream0 = new FileInputStream(file0);
        }
        catch(IOException | NoSuchAlgorithmException exception0) {
            exception1 = exception0;
            closeable1 = null;
            fileInputStream0 = null;
            throw new aqwq("Error creating package metadata.", exception1);
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            closeable1 = null;
            fileInputStream0 = null;
            goto label_63;
        }
        try {
            backupDataInput0 = new BackupDataInput(fileInputStream0.getFD());
            fileOutputStream0 = new FileOutputStream(file1);
        }
        catch(IOException | NoSuchAlgorithmException exception2) {
            exception1 = exception2;
            closeable1 = null;
            throw new aqwq("Error creating package metadata.", exception1);
        }
        catch(Throwable throwable2) {
            throwable1 = throwable2;
            closeable1 = null;
            goto label_63;
        }
        try {
            BackupDataOutput backupDataOutput0 = new BackupDataOutput(fileOutputStream0.getFD());
            while(backupDataInput0.readNextHeader()) {
                String s = backupDataInput0.getKey();
                int v = backupDataInput0.getDataSize();
                if(v >= 0 && !"com.android.providers.telephony".equals(s)) {
                    byte[] arr_b = new byte[v];
                    backupDataInput0.readEntityData(arr_b, 0, v);
                    aqwp.b(backupDataOutput0, s, arr_b);
                }
                else {
                    backupDataInput0.skipEntityData();
                }
            }
            dataOutputStream0.writeInt(23);
            aqwp.d(dataOutputStream0, aqwp.a(new byte[][]{aqwp.i(context0)}));
            aqwp.b(backupDataOutput0, "com.android.providers.telephony", byteArrayOutputStream0.toByteArray());
            fileInputStream0.close();
            file0.delete();
            closeable1 = new FileInputStream(file1);
        }
        catch(IOException | NoSuchAlgorithmException exception3) {
            exception1 = exception3;
            closeable1 = null;
            goto label_57;
        }
        catch(Throwable throwable3) {
            throwable1 = throwable3;
            closeable1 = null;
            goto label_62;
        }
        try {
            bboc.c(((InputStream)closeable1), file0);
            file1.delete();
            goto label_69;
        }
        catch(IOException | NoSuchAlgorithmException exception1) {
        label_57:
            closeable0 = fileOutputStream0;
            try {
                throw new aqwq("Error creating package metadata.", exception1);
            }
            catch(Throwable throwable1) {
                goto label_63;
            }
        }
        catch(Throwable throwable1) {
        }
    label_62:
        closeable0 = fileOutputStream0;
    label_63:
        bbpb.b(byteArrayOutputStream0);
        bbpb.b(dataOutputStream0);
        bbpb.b(closeable0);
        bbpb.b(fileInputStream0);
        bbpb.b(closeable1);
        throw throwable1;
    label_69:
        bbpb.b(byteArrayOutputStream0);
        bbpb.b(dataOutputStream0);
        bbpb.b(fileOutputStream0);
        bbpb.b(fileInputStream0);
        bbpb.b(closeable1);
    }

    public static void d(DataOutputStream dataOutputStream0, ArrayList arrayList0) {
        dataOutputStream0.writeInt(arrayList0.size());
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            byte[] arr_b = (byte[])arrayList0.get(v1);
            dataOutputStream0.writeInt(arr_b.length);
            dataOutputStream0.write(arr_b);
        }
    }

    public final void e(File file0) {
        StringBuilder stringBuilder0 = new StringBuilder(0x1000);
        StringBuilderPrinter stringBuilderPrinter0 = new StringBuilderPrinter(stringBuilder0);
        stringBuilderPrinter0.println(Integer.toString(1));
        stringBuilderPrinter0.println("com.android.providers.telephony");
        stringBuilderPrinter0.println(Integer.toString(23));
        stringBuilderPrinter0.println(Integer.toString(Build.VERSION.SDK_INT));
        String s = this.c.getInstallerPackageName("com.android.providers.telephony");
        if(s == null) {
            s = "";
        }
        stringBuilderPrinter0.println(s);
        stringBuilderPrinter0.println("0");
        Signature signature0 = new Signature(aqwp.i(this.b));
        stringBuilderPrinter0.println("1");
        stringBuilderPrinter0.println(signature0.toCharsString());
        FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
        try {
            fileOutputStream0.write(stringBuilder0.toString().getBytes(StandardCharsets.UTF_8));
            fileOutputStream0.close();
        }
        finally {
            bbpb.b(fileOutputStream0);
        }
        file0.setLastModified(0L);
    }

    public static boolean f(String s) {
        return s != null && !s.equals("text/plain") && s.matches("^(image|video|audio|text).*$");
    }

    public static void g(String s, String s1, String s2, FullBackupDataOutput fullBackupDataOutput0) {
        aqwp.a.d("backupToTarV23", new Object[0]);
        try {
            Method method0 = Class.forName("android.app.backup.FullBackup").getDeclaredMethod("backupToTar", String.class, String.class, String.class, String.class, String.class, FullBackupDataOutput.class);
            method0.setAccessible(true);
            method0.invoke(null, "com.android.providers.telephony", s, 0, s1, s2, fullBackupDataOutput0);
        }
        catch(ReflectiveOperationException reflectiveOperationException0) {
            throw new aqwq("Error calling backupToTarV23.", reflectiveOperationException0);
        }
    }

    public static final void h(File file0, File file1) {
        FileOutputStream fileOutputStream0;
        Throwable throwable1;
        DataInputStream dataInputStream0;
        try {
            dataInputStream0 = new DataInputStream(new FileInputStream(file0));
        }
        catch(Throwable throwable0) {
            dataInputStream0 = null;
            throwable1 = throwable0;
            fileOutputStream0 = null;
            bbpb.b(dataInputStream0);
            bbpb.b(fileOutputStream0);
            throw throwable1;
        }
        try {
            fileOutputStream0 = new FileOutputStream(file1);
        }
        catch(Throwable throwable2) {
            throwable1 = throwable2;
            fileOutputStream0 = null;
            bbpb.b(dataInputStream0);
            bbpb.b(fileOutputStream0);
            throw throwable1;
        }
        try {
            byte[] arr_b = new byte[0x100000];
            int v;
            while((v = dataInputStream0.readInt()) > 0) {
                while(v > 0) {
                    int v1 = dataInputStream0.read(arr_b, 0, Math.min(v, 0x100000));
                    fileOutputStream0.write(arr_b, 0, v1);
                    v -= v1;
                }
            }
            fileOutputStream0.close();
        }
        catch(Throwable throwable1) {
            bbpb.b(dataInputStream0);
            bbpb.b(fileOutputStream0);
            throw throwable1;
        }
        bbpb.b(dataInputStream0);
        bbpb.b(fileOutputStream0);
    }

    public static byte[] i(Context context0) {
        byte[] arr_b;
        try(InputStream inputStream0 = context0.getResources().openRawResource(0x7F140251)) {  // raw:sms_signature
            arr_b = new byte[inputStream0.available()];
            inputStream0.read(arr_b);
        }
        return arr_b;
    }
}

