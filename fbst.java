import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.Base64;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class fbst {
    public static final SharedPreferences a(boolean z) {
        babh babh0 = babh.a();
        return z ? babh0.getSharedPreferences("com.google.android.gms.wallet.service.ib.ParcelableCryptoKeys", 4) : babh0.getSharedPreferences("com.google.android.gms.wallet.service.ib.ParcelableCryptoKeys", 0);
    }

    public static final Parcelable b(Parcelable.Creator parcelable$Creator0, String s) {
        Parcelable parcelable0;
        byte[] arr_b2;
        String[] arr_s = fbst.j(s);
        if(((int)fbst.e(arr_s)) != 2) {
            throw new SecurityException("Wrong key version!");
        }
        boolean z = true;
        String s1 = fbst.f(arr_s[1]);
        SharedPreferences sharedPreferences0 = fbst.a(false);
        if(!sharedPreferences0.contains(s1)) {
            sharedPreferences0 = fbst.a(true);
        }
        String s2 = sharedPreferences0.getString(s1, null);
        if(s2 == null) {
            throw new SecurityException("Could not find key!");
        }
        SecretKey secretKey0 = fbst.h(s2);
        byte[] arr_b = fbst.i(arr_s[2]);
        byte[] arr_b1 = fbst.i(arr_s[3]);
        if(arr_b1.length != 12) {
            z = false;
        }
        batl.c(z, "Wrong number of bytes for IV");
        try {
            Cipher cipher0 = Cipher.getInstance("AES/GCM/NoPadding");
            cipher0.init(2, secretKey0, new IvParameterSpec(arr_b1));
            arr_b2 = cipher0.doFinal(arr_b);
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new SecurityException("Failed to decrypt with AES", generalSecurityException0);
        }
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.unmarshall(arr_b2, 0, arr_b2.length);
            parcel0.setDataPosition(0);
            parcelable0 = (Parcelable)parcelable$Creator0.createFromParcel(parcel0);
        }
        finally {
            parcel0.recycle();
        }
        return parcelable0;
    }

    public static final String c(Parcelable parcelable0) {
        byte[] arr_b;
        String s;
        Parcel parcel0 = Parcel.obtain();
        try {
            parcelable0.writeToParcel(parcel0, 0);
            arr_b = parcel0.marshall();
        }
        finally {
            parcel0.recycle();
        }
        SharedPreferences sharedPreferences0 = fbst.a(false);
        Set set0 = sharedPreferences0.getAll().keySet();
        if(set0.size() == 1) {
            Object object0 = set0.iterator().next();
            s = (String)object0;
            if(((int)fbst.e(fbst.j(s))) != 2) {
                s = null;
            }
        }
        else {
            s = null;
        }
        if(s == null) {
            s = fbst.d(sharedPreferences0, true);
        }
        SecretKey secretKey0 = fbst.h(sharedPreferences0.getString(s, null));
        byte[] arr_b1 = new byte[12];
        fbvx.c().nextBytes(arr_b1);
        try {
            Cipher cipher0 = Cipher.getInstance("AES/GCM/NoPadding");
            cipher0.init(1, secretKey0, new IvParameterSpec(arr_b1));
            return String.format("%s%s%s%s%s", s, "|", fbst.g(cipher0.doFinal(arr_b)), "|", fbst.g(arr_b1));
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new SecurityException("Failed to encrypt with AES", generalSecurityException0);
        }
    }

    public static final String d(SharedPreferences sharedPreferences0, boolean z) {
        String s = fbst.f(UUID.randomUUID().toString());
        String s1 = fbst.k();
        if(!sharedPreferences0.edit().clear().putString(s, s1).commit()) {
            sharedPreferences0.edit().clear().apply();
            if(!z) {
                return null;
            }
            throw new RuntimeException("Unable to save data to shared preferences!");
        }
        return s;
    }

    private static Integer e(String[] arr_s) {
        return Integer.parseInt(arr_s[0], 16);
    }

    private static String f(String s) {
        return String.format("%08X%s%s", ((int)2), "|", s);
    }

    private static String g(byte[] arr_b) {
        return Base64.encodeToString(arr_b, 2);
    }

    private static SecretKey h(String s) {
        byte[] arr_b = fbst.i(s);
        return new SecretKeySpec(arr_b, 0, arr_b.length, "AES");
    }

    private static byte[] i(String s) {
        return Base64.decode(s, 2);
    }

    private static String[] j(String s) {
        return s.split(Pattern.quote("|"));
    }

    private static final String k() {
        try {
            return fbst.g(KeyGenerator.getInstance("AES").generateKey().getEncoded());
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new SecurityException("Failed to generate AES key", generalSecurityException0);
        }
    }
}

