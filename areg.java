import android.accounts.Account;
import android.app.PendingIntent;
import android.app.backup.BackupDataOutput;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public final class areg extends asdi {
    public static final int a;
    private static final aqql b;
    private final ardy c;
    private final arel d;
    private final Context e;

    static {
        areg.b = new aqql(new String[]{"D2dMigrateHelper"});
    }

    public areg(Context context0) {
        ardy ardy0 = new ardy(context0);
        arel arel0 = new arel(context0);
        super();
        this.e = context0;
        this.d = arel0;
        this.c = ardy0;
    }

    @Override  // asdj
    public final void a(String s, asdm asdm0) {
        try {
            this.c.a(s);
        }
        catch(asdg asdg0) {
            areg.b.n("d2dFileFailure failed; calling onFailure()", asdg0, new Object[0]);
            asdm0.a();
            return;
        }
        asdm0.b();
    }

    @Override  // asdj
    public final void c(String s, ParcelFileDescriptor parcelFileDescriptor0, asdm asdm0) {
        ParcelFileDescriptor.AutoCloseInputStream parcelFileDescriptor$AutoCloseInputStream0 = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor0);
        try {
            try {
                this.c.b(s, parcelFileDescriptor$AutoCloseInputStream0);
                goto label_11;
            }
            catch(asdg asdg0) {
            }
            areg.b.n("d2dFileStart failed; calling onFailure()", asdg0, new Object[0]);
            asdm0.a();
        }
        catch(Throwable throwable0) {
            bbpb.b(parcelFileDescriptor$AutoCloseInputStream0);
            throw throwable0;
        }
        bbpb.b(parcelFileDescriptor$AutoCloseInputStream0);
        return;
    label_11:
        asdm0.b();
    }

    @Override  // asdj
    public final void d(String s, asdm asdm0) {
        try {
            this.c.c(s);
        }
        catch(asdg asdg0) {
            areg.b.n("d2dFileSuccess failed; calling onFailure()", asdg0, new Object[0]);
            asdm0.a();
            return;
        }
        asdm0.b();
    }

    @Override  // asdj
    public final void e(String s, asdh asdh0) {
        asdh0.a(this.c.a.b(s).exists());
    }

    @Override  // asdj
    public final void f(asdm asdm0) {
        ByteArrayOutputStream byteArrayOutputStream0;
        BackupDataOutput backupDataOutput0;
        FileOutputStream fileOutputStream2;
        File file0;
        FileOutputStream fileOutputStream1;
        FileOutputStream fileOutputStream0;
        arel arel0;
        try {
            arel0 = this.d;
            fileOutputStream0 = null;
        }
        catch(arek arek0) {
            areg.b.g("Error generating iOS restore metadata", arek0, new Object[0]);
            asdm0.a();
            return;
        }
        try {
            fileOutputStream1 = new FileOutputStream(arel0.c.b("restore_token_file"));
            goto label_6;
        }
        catch(IOException iOException0) {
            throw new arek("Error generating token file.", iOException0);
            try {
            label_6:
                fileOutputStream1.write("1".getBytes(StandardCharsets.UTF_8));
                fileOutputStream1.close();
                goto label_18;
            }
            catch(IOException iOException0) {
            }
            catch(Throwable throwable0) {
                goto label_15;
            }
            fileOutputStream0 = fileOutputStream1;
            try {
                throw new arek("Error generating token file.", iOException0);
            }
            catch(Throwable throwable0) {
                goto label_16;
            }
        }
        catch(Throwable throwable0) {
            goto label_16;
        }
    label_15:
        fileOutputStream0 = fileOutputStream1;
        try {
        label_16:
            bbpb.b(fileOutputStream0);
            throw throwable0;
        label_18:
            bbpb.b(fileOutputStream1);
            try {
                file0 = arel0.c.b("@pm@");
                file0.createNewFile();
            }
            catch(IOException iOException1) {
                throw new arek("Error generating @pm@ file.", iOException1);
            }
        }
        catch(arek arek0) {
            areg.b.g("Error generating iOS restore metadata", arek0, new Object[0]);
            asdm0.a();
            return;
        }
        try {
            fileOutputStream2 = null;
            fileOutputStream2 = new FileOutputStream(file0);
            backupDataOutput0 = new BackupDataOutput(fileOutputStream2.getFD());
            byteArrayOutputStream0 = new ByteArrayOutputStream();
        }
        catch(Throwable throwable1) {
            goto label_40;
        }
        try {
            DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
            dataOutputStream0.writeInt(23);
            dataOutputStream0.writeUTF("2920157");
            dataOutputStream0.flush();
            byte[] arr_b = byteArrayOutputStream0.toByteArray();
            backupDataOutput0.writeEntityHeader("@meta@", arr_b.length);
            backupDataOutput0.writeEntityData(arr_b, arr_b.length);
            byteArrayOutputStream0.close();
            fileOutputStream2.close();
            goto label_43;
        }
        catch(Throwable throwable1) {
            fileOutputStream0 = byteArrayOutputStream0;
        }
        try {
            try {
            label_40:
                bbpb.b(fileOutputStream0);
                bbpb.b(fileOutputStream2);
                throw throwable1;
            label_43:
                bbpb.b(byteArrayOutputStream0);
                bbpb.b(fileOutputStream2);
                try {
                    new argz(arel0.b).b(file0);
                }
                catch(aqwq aqwq0) {
                    arel.a.g("Failed to add telephony metadata.", aqwq0, new Object[0]);
                }
            }
            catch(IOException iOException1) {
                throw new arek("Error generating @pm@ file.", iOException1);
            }
        }
        catch(arek arek0) {
            areg.b.g("Error generating iOS restore metadata", arek0, new Object[0]);
            asdm0.a();
            return;
        }
        asdm0.b();
    }

    @Override  // asdj
    public final void g(String s, asdh asdh0) {
        File file0 = new arfi(this.e).c.b;
        File file1 = hrnt.i() ? new File(ccsb.a.b(file0, s)) : new File(file0, s);
        asdh0.a(file1.exists() && file1.isFile());
    }

    @Override  // asdj
    public final void h(asdm asdm0) {
        areg.b.h("Responding to ping call.", new Object[0]);
        asdm0.b();
    }

    @Override  // asdj
    public final void i(String s, asdm asdm0) {
        aqle.a(this.e).g(s);
        asdm0.b();
    }

    @Override  // asdj
    public final void j(Account account0, byte[] arr_b, byte[] arr_b1, byte[] arr_b2, ComponentName componentName0, asdm asdm0) {
        Intent intent0 = new Intent("com.google.android.gms.auth.folsom.START_RECOVERY").setPackage("com.google.android.gms").putExtra("com.google.android.gms.auth.folsom.EXTRA_ACCOUNT", account0).putExtra("com.google.android.gms.auth.folsom.EXTRA_LSKF_HASH", arr_b2).putExtra("com.google.android.gms.auth.folsom.EXTRA_VAULT_HANDLE", arr_b).putExtra("com.google.android.gms.auth.folsom.EXTRA_CHALLENGE", arr_b1).putExtra("com.google.android.gms.auth.folsom.EXTRA_PENDING_INTENT", this.m(componentName0));
        intent0.addFlags(0x10000000);
        this.e.sendBroadcast(intent0);
        asdm0.b();
    }

    @Override  // asdj
    public final void k(Account account0, byte[] arr_b, byte[] arr_b1, byte[] arr_b2, byte[] arr_b3, byte[] arr_b4, int v, byte[] arr_b5, ComponentName componentName0, asdm asdm0) {
        Intent intent0 = new Intent("com.google.android.gms.auth.folsom.START_RECOVERY").setPackage("com.google.android.gms").putExtra("com.google.android.gms.auth.folsom.EXTRA_ACCOUNT", account0).putExtra("com.google.android.gms.auth.folsom.EXTRA_LSKF_HASH", arr_b1).putExtra("com.google.android.gms.auth.folsom.EXTRA_CERT_PATH", arr_b2).putExtra("com.google.android.gms.auth.folsom.EXTRA_BACKEND_PUBLIC_KEY", arr_b3).putExtra("com.google.android.gms.auth.folsom.EXTRA_COUNTER_ID", arr_b4).putExtra("com.google.android.gms.auth.folsom.EXTRA_MAX_ATTEMPTS", v).putExtra("com.google.android.gms.auth.folsom.EXTRA_VAULT_HANDLE", arr_b5).putExtra("com.google.android.gms.auth.folsom.EXTRA_CHALLENGE", arr_b).putExtra("com.google.android.gms.auth.folsom.EXTRA_PENDING_INTENT", this.m(componentName0));
        intent0.addFlags(0x10000000);
        this.e.sendBroadcast(intent0);
        asdm0.b();
    }

    @Override  // asdj
    public final void l(asdm asdm0) {
        aqjk aqjk0 = new aqjk(this.e);
        new aqxo(this.e, aqjk0).a(new aref(asdm0));
    }

    private final PendingIntent m(ComponentName componentName0) {
        Intent intent0 = new Intent().setComponent(componentName0);
        return cjok.a(this.e, 1, intent0, 0xA000000);
    }
}

