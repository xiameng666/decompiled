import android.os.Build;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import j..util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

public final class bga implements bse {
    @Override  // bse
    public final Object a(Object object0) {
        int v4;
        int v1;
        bsf bsf0 = ((bfz)object0).a;
        File file0 = bft.a();
        byte[] arr_b = (byte[])bsf0.a;
        try(FileOutputStream fileOutputStream0 = new FileOutputStream(file0)) {
            if(((LargeJpegImageQuirk)bqz.a(LargeJpegImageQuirk.class)) != null && ("Samsung".equalsIgnoreCase(Build.BRAND) && LargeJpegImageQuirk.a.contains(Build.MODEL.toUpperCase(Locale.US)) || LargeJpegImageQuirk.a() || arr_b.length > 10000000)) {
                int v = 2;
                while(true) {
                    if(v + 4 > arr_b.length || arr_b[v] != -1) {
                        goto label_28;
                    }
                    v1 = v + 2;
                    int v2 = arr_b[v1] & 0xFF;
                    int v3 = arr_b[v + 3] & 0xFF;
                    if(arr_b[v + 1] == -38) {
                        break;
                    }
                    v += (v2 << 8 | v3) + 2;
                }
                do {
                    v4 = v1 + 2;
                    if(v4 > arr_b.length) {
                        goto label_28;
                    }
                    int v5 = arr_b[v1];
                    ++v1;
                }
                while(v5 != -1 || arr_b[v1] != -39);
                goto label_30;
            label_28:
                v4 = -1;
            label_30:
                if(v4 == -1) {
                    v4 = arr_b.length;
                }
            }
            else {
                v4 = arr_b.length;
            }
            fileOutputStream0.write(arr_b, 0, v4);
        }
        catch(IOException iOException0) {
            throw new bcf("Failed to write to temp file", iOException0);
        }
        bnr bnr0 = (bnr)Objects.requireNonNull(bsf0.b);
        int v7 = bsf0.f;
        try {
            bnr bnr1 = new bnr(new llf(file0.toString()));
            ArrayList arrayList0 = new ArrayList(bnr.b);
            arrayList0.removeAll(bnr.c);
            int v8 = arrayList0.size();
            for(int v6 = 0; v6 < v8; ++v6) {
                String s = (String)arrayList0.get(v6);
                String s1 = bnr0.d.d(s);
                llf llf0 = bnr1.d;
                if(s1 != null && !Objects.equals(s1, llf0.d(s))) {
                    llf0.e(s, s1);
                }
            }
            if(bnr1.b() != 0 || v7 == 0) {
                throw null;
            }
            if(v7 % 90 != 0) {
                bcs.d("bnr", String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", v7));
                bnr1.d.e("Orientation", "0");
                throw null;
            }
            int v9 = v7 % 360;
            int v10 = bnr1.a();
        alab1:
            while(true) {
            label_64:
                if(v9 >= 0) {
                    while(true) {
                        if(v9 <= 0) {
                            bnr1.d.e("Orientation", String.valueOf(v10));
                            throw null;
                        }
                        v9 += -90;
                        switch(v10) {
                            case 2: {
                                v10 = 7;
                                break;
                            }
                            case 3: {
                                v10 = 8;
                                break;
                            }
                            case 4: {
                                v10 = 5;
                                break;
                            }
                            case 5: {
                                v10 = 2;
                                break;
                            }
                            case 6: {
                                v10 = 3;
                                break;
                            }
                            case 7: {
                                v10 = 4;
                                break;
                            }
                            case 8: {
                                v10 = 1;
                                break;
                            }
                            default: {
                                v10 = 6;
                            }
                        }
                    }
                }
                v9 += 90;
                switch(v10) {
                    case 2: {
                        v10 = 5;
                        break alab1;
                    }
                    case 4: {
                        v10 = 7;
                        break alab1;
                    }
                    case 5: {
                        v10 = 4;
                        break alab1;
                    }
                    case 6: {
                        v10 = 1;
                        break alab1;
                    }
                    case 7: {
                        v10 = 2;
                        break alab1;
                    }
                    case 3: 
                    case 8: {
                        v10 = 6;
                        break alab1;
                    }
                    default: {
                        v10 = 8;
                    }
                }
            }
        }
        catch(IOException iOException1) {
            throw new bcf("Failed to update Exif data", iOException1);
        }
        goto label_64;
    }
}

