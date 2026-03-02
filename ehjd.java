import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public final class ehjd {
    public static ehjd a;
    private static final int[] b;
    private final Context c;
    private final String d;

    static {
        ehjd.b = new int[]{0, 1, 2, 3, 4};
    }

    public ehjd(Context context0) {
        this.c = context0.getApplicationContext();
        this.d = "images/people";
    }

    public static ehjd a(Context context0) {
        synchronized(ehjd.class) {
            if(ehjd.a == null) {
                ehjd.a = new ehjd(context0);
            }
        }
        return ehjd.a;
    }

    public final File b(String s, String s1, String s2) {
        return hrnt.i() ? new File(ccsb.a.a(this.f(s, s1) + "/" + s2)) : new File(this.f(s, s1) + "/" + s2);
    }

    public static String c(Context context0, String s, String s1) {
        return context0.getFilesDir() + "/images/people/" + s + ehjd.g(s1) + "/0";
    }

    public final void d(String s, String s1) {
        synchronized(this) {
            batl.q(s);
            bboc.e((hrnt.i() ? new File(ccsb.a.a(this.f(s, s1))) : new File(this.f(s, s1))));
        }
    }

    public final void e(String s, String s1, String s2, byte[] arr_b) {
        FileOutputStream fileOutputStream2;
        Bitmap bitmap1;
        File file3;
        Throwable throwable2;
        FileOutputStream fileOutputStream1;
        File file2;
        byte[] arr_b1;
        String s4;
        FileOutputStream fileOutputStream0;
        Bitmap bitmap0;
        BitmapFactory.Options bitmapFactory$Options0;
        File file0;
        int v;
        synchronized(this) {
            batl.q(s);
            batl.q(s2);
            v = 0;
            batl.b(arr_b != null);
            String s3 = ehjd.h(s2);
            this.d(s, s1);
            file0 = this.b(s, s1, s3);
            if(!file0.mkdirs()) {
                throw new RuntimeException("Could not create a directory in dir=" + file0.getAbsolutePath());
            }
            try {
                bitmapFactory$Options0 = new BitmapFactory.Options();
                bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length, bitmapFactory$Options0);
                fileOutputStream0 = null;
                if(TextUtils.isEmpty(s3)) {
                    s4 = null;
                }
                else if(ehjm.b(s3) <= 0) {
                    StringBuilder stringBuilder0 = new StringBuilder("https://");
                    if(s3.charAt(0) == 0x7E) {
                        int v1 = s3.indexOf(0x2F);
                        stringBuilder0.append(((String)ehjm.a.get(s3.substring(0, v1))));
                        stringBuilder0.append(s3.substring(v1));
                    }
                    else {
                        stringBuilder0.append(s3);
                    }
                    if(s3.endsWith("/")) {
                        stringBuilder0.append("photo.jpg");
                    }
                    s4 = stringBuilder0.toString();
                }
                else {
                    egig.d("FifeImageUtils", "Uncompressing url that isn\'t compressed. url=%s", new Object[]{s3});
                    s4 = s3;
                }
                baps baps0 = new baps();
                baps0.b(ehjm.a(this.c, 3));
                baps0.c();
                baps0.a = false;
                arr_b1 = baps0.a(s4).getBytes(Charset.forName("US-ASCII"));
                File file1 = this.b(s, s1, ehjd.h(s3));
                file2 = hrnt.i() ? new File(ccsb.a.b(file1, "metadata.txt")) : new File(file1, "metadata.txt");
            }
            catch(FileNotFoundException fileNotFoundException0) {
                goto label_85;
            }
            catch(IOException iOException0) {
                throw new RuntimeException("Couldn\'t update avatar", iOException0);
            }
        }
        try {
            fileOutputStream1 = new FileOutputStream(file2);
        }
        catch(Throwable throwable1) {
            throwable2 = throwable1;
            goto label_46;
        }
        try {
            fileOutputStream1.write(arr_b1);
            goto label_49;
        }
        catch(Throwable throwable2) {
            fileOutputStream0 = fileOutputStream1;
        }
        try {
        label_46:
            if(fileOutputStream0 != null) {
                fileOutputStream0.close();
            }
            throw throwable2;
        label_49:
            fileOutputStream1.close();
            file2.getAbsolutePath();
            int[] arr_v = ehjd.b;
            while(true) {
            label_52:
                if(v >= 5) {
                    goto label_82;
                }
                int v2 = arr_v[v];
                file3 = hrnt.i() ? new File(ccsb.a.b(file0, String.valueOf(v2))) : new File(file0, String.valueOf(v2));
                int v3 = ehjm.a(this.c, v2);
                bitmap1 = Bitmap.createScaledBitmap(bitmap0, v3, v3, true);
                String s5 = bitmapFactory$Options0.outMimeType;
                break;
            }
        }
        catch(FileNotFoundException fileNotFoundException0) {
            goto label_85;
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Couldn\'t update avatar", iOException0);
        }
        catch(Throwable throwable0) {
            throw throwable0;
        }
        try {
            File file4 = hrnt.i() ? new File(ccsb.a.b(this.c.getFilesDir(), this.d)) : new File(this.c.getFilesDir(), this.d);
            if(!file4.exists() && !file4.mkdirs()) {
                throw new RuntimeException("Could not create an avatar directory in dir=" + file4.getAbsolutePath());
            }
            fileOutputStream2 = new FileOutputStream(file3);
        }
        catch(Throwable throwable3) {
            try {
                goto label_73;
            }
            catch(FileNotFoundException fileNotFoundException0) {
                goto label_85;
            }
            catch(IOException iOException0) {
                throw new RuntimeException("Couldn\'t update avatar", iOException0);
            }
            catch(Throwable throwable0) {
                throw throwable0;
            }
        }
        try {
            if("image/jpeg".equals(s5)) {
                int v4 = (int)hxgf.b();
                bitmap1.compress(Bitmap.CompressFormat.JPEG, v4, fileOutputStream2);
            }
            else {
                bitmap1.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
            }
            goto label_76;
        }
        catch(Throwable throwable3) {
            try {
                fileOutputStream0 = fileOutputStream2;
            label_73:
                if(fileOutputStream0 != null) {
                    fileOutputStream0.close();
                }
                throw throwable3;
            label_76:
                fileOutputStream2.close();
                file3.getAbsolutePath();
                if(bitmap1 != bitmap0) {
                    bitmap1.recycle();
                }
                ++v;
                goto label_52;
            label_82:
                bitmap0.recycle();
                return;
            }
            catch(FileNotFoundException fileNotFoundException0) {
            }
            catch(IOException iOException0) {
                throw new RuntimeException("Couldn\'t update avatar", iOException0);
            }
        label_85:
            egig.l("PeopleAvatarFileServer", "Couldn\'t update avatar", fileNotFoundException0);
        }
    }

    private final String f(String s, String s1) {
        String s2 = String.valueOf(this.c.getFilesDir());
        String s3 = ehjd.g(s1);
        return s2 + "/" + this.d + "/" + s + s3;
    }

    private static String g(String s) {
        return TextUtils.isEmpty(s) ? "" : "~" + s;
    }

    private static final String h(String s) {
        String s1 = s.replace(":", "");
        batl.q(s1);
        return s1;
    }
}

