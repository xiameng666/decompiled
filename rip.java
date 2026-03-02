import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager.PackageInfoFlags;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PersistableBundle;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

public final class rip extends Handler {
    public final ReentrantLock a;
    public final Context b;
    private final PackageManager c;

    public rip(Context context0, Looper looper0) {
        super(looper0);
        this.a = new ReentrantLock();
        this.b = context0;
        this.c = context0.getPackageManager();
    }

    public final String a(String[] arr_s, String s) {
        String s6;
        String s5;
        MessageDigest messageDigest0;
        Signature[] arr_signature;
        PackageInfo packageInfo0;
        String s1 = null;
        if(arr_s != null && arr_s.length != 0) {
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < arr_s.length; ++v) {
                String s2 = arr_s[v];
                String[] arr_s1 = s2.split(":", -1);
                int v1 = arr_s1.length;
                if(v1 == 1) {
                    arrayList0.add(s2);
                }
                else if(v1 == 2) {
                    String s3 = arr_s1[0];
                    String[] arr_s2 = arr_s1[1].split(",", -1);
                    for(int v2 = 0; v2 < arr_s2.length; ++v2) {
                        if(arr_s2[v2].equals(s)) {
                            arrayList0.add(s3);
                            break;
                        }
                    }
                }
            }
            if(!arrayList0.isEmpty()) {
                try {
                    if(Build.VERSION.SDK_INT < 33) {
                        packageInfo0 = this.c.getPackageInfo(s, 0x8000000);
                    }
                    else {
                        PackageManager.PackageInfoFlags packageManager$PackageInfoFlags0 = PackageManager.PackageInfoFlags.of(0x8000000L);
                        packageInfo0 = this.c.getPackageInfo(s, packageManager$PackageInfoFlags0);
                    }
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                    Log.e("Ts43AuthLibrary", "Unable to find package name: " + s);
                    arr_signature = null;
                    goto label_41;
                }
                arr_signature = packageInfo0.signatures;
                SigningInfo signingInfo0 = packageInfo0.signingInfo;
                if(signingInfo0 != null) {
                    arr_signature = signingInfo0.hasMultipleSigners() ? signingInfo0.getApkContentsSigners() : signingInfo0.getSigningCertificateHistory();
                }
                if(arr_signature == null) {
                    Log.e("Ts43AuthLibrary", "Unable to find package signatures for package: " + s);
                }
                else {
                    Arrays.toString(arr_signature);
                }
            label_41:
                if(arr_signature == null) {
                    Log.e("Ts43AuthLibrary", "No package signatures for package: " + s);
                    return null;
                }
                try {
                    messageDigest0 = MessageDigest.getInstance("SHA-256");
                }
                catch(NoSuchAlgorithmException unused_ex) {
                    Log.wtf("Ts43AuthLibrary", "Unable to parse SHA-256 hash");
                    return null;
                }
                for(int v3 = 0; v3 < arr_signature.length; ++v3) {
                    byte[] arr_b = messageDigest0.digest(arr_signature[v3].toByteArray());
                    for(Object object0: arrayList0) {
                        String s4 = (String)object0;
                        if(s4 == null) {
                            s5 = s1;
                            s6 = s5;
                        }
                        else {
                            int v4 = s4.length();
                            s5 = new byte[v4 / 2];
                            int v5 = 0;
                            while(v5 < v4) {
                                s5[v5 / 2] = (byte)(rip.d(s4.charAt(v5)) << 4 | rip.d(s4.charAt(v5 + 1)));
                                v5 += 2;
                                s1 = s1;
                            }
                            s6 = s1;
                        }
                        if(Arrays.equals(arr_b, ((byte[])s5))) {
                            return s4;
                        }
                        s1 = s6;
                    }
                }
                Log.e("Ts43AuthLibrary", "No matching certificates for package: " + s);
                return s1;
            }
            Log.e("Ts43AuthLibrary", "No allowed certificates found for package: " + s);
            return null;
        }
        return null;
    }

    public final boolean b(String[] arr_s, String s, String s1) {
        int v = Binder.getCallingUid();
        String[] arr_s1 = this.c.getPackagesForUid(v);
        for(int v1 = 0; v1 < arr_s1.length; ++v1) {
            if(s.equals(arr_s1[v1])) {
                return arr_s == null || arr_s.length == 0 ? true : s1 != null;
            }
        }
        Log.e("Ts43AuthLibrary", "Package name " + s + " does not match those of the calling UID: " + Arrays.toString(arr_s1));
        return false;
    }

    public static final String c(PersistableBundle persistableBundle0, String s, String s1) {
        if(persistableBundle0.getString("override_app_name") != null) {
            return persistableBundle0.getString("override_app_name");
        }
        return !persistableBundle0.getBoolean("append_sha_to_app_name") || s1 == null ? s : a.r(s, s1, "|");
    }

    private static final int d(char c) {
        return Integer.parseInt(String.valueOf(c), 16);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        switch(message0.what) {
            case 0: {
                ((rim)message0.obj).h.execute(new ril(this, ((rim)message0.obj)));
                return;
            }
            case 1: {
                ((rio)message0.obj).h.execute(new rig(this, ((rio)message0.obj)));
                return;
            }
            case 2: {
                ((rin)message0.obj).d.execute(new rij(this, ((rin)message0.obj)));
            }
        }
    }
}

