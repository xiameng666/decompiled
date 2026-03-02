import android.os.Build;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public final class djqr {
    public static final String a() {
        String[] arr_s = djqq.b;
        int v = 0;
        while(true) {
            String s = null;
            if(v < 5) {
                String s1 = arr_s[v];
                try {
                    String s2 = (String)frbg.a.invoke(null, s1, 0);
                    if("".equals(s2)) {
                        goto label_10;
                    }
                    goto label_11;
                }
                catch(Exception exception0) {
                    Log.e("SystemProperties", "get error", exception0);
                }
            label_10:
                s2 = null;
            label_11:
                if(djqq.a(s2)) {
                    s = gfqz.c(s2);
                    break;
                }
                ++v;
                continue;
            }
            break;
        }
        if(s == null) {
            String s3 = Build.HARDWARE;
            if(s3 != null && s3.contains("exynos")) {
                String s4 = s3.substring(s3.indexOf("exynos"));
                if(djqq.a(s4)) {
                    String s5 = gfqz.c(s4);
                    return s5 == null ? "unknown" : s5;
                }
            }
            try {
                ghjm ghjm0 = ghju.a(djqq.c, StandardCharsets.UTF_8);
                ghjq ghjq0 = new ghjq();
            }
            catch(IOException iOException0) {
                goto label_81;
            }
            try {
                BufferedReader bufferedReader0 = new BufferedReader(ghjm0.a());
                ghjq0.b(bufferedReader0);
                ArrayList arrayList0 = new ArrayList();
                String s6;
                while((s6 = bufferedReader0.readLine()) != null) {
                    arrayList0.add(s6);
                }
                gged_interceptors gged0 = gged_interceptors.i(arrayList0);
                goto label_40;
            }
            catch(Throwable throwable0) {
                try {
                    throw ghjq0.a(throwable0);
                }
                catch(Throwable throwable1) {
                    try {
                        ghjq0.close();
                        throw throwable1;
                    label_40:
                        ghjq0.close();
                        int v1 = gged0.size();
                        int v2 = 0;
                        while(v2 < v1) {
                            String s7 = (String)gged0.get(v2);
                            if(s7.startsWith("Hardware")) {
                                List list0 = gfud.e(':').n(s7);
                                if(list0.size() != 2) {
                                    goto label_63;
                                }
                                String s8 = ((String)list0.get(1)).trim();
                                String[] arr_s1 = djqq.d;
                                int v3 = 0;
                                while(v3 < 3) {
                                    String s9 = arr_s1[v3];
                                    if(s8.startsWith(s9)) {
                                        s8 = s8.substring(s9.length()).trim();
                                    }
                                    else {
                                        ++v3;
                                        continue;
                                    }
                                    break;
                                }
                                if(djqq.a(s8)) {
                                    s = gfqz.c(s8);
                                    goto label_83;
                                }
                            }
                        label_63:
                            ++v2;
                        }
                        s = null;
                        int v4 = gged0.size();
                        int v5 = 0;
                        while(true) {
                            if(v5 >= v4) {
                                goto label_83;
                            }
                            String s10 = (String)gged0.get(v5);
                            if(s10.startsWith("model name")) {
                                List list1 = gfud.e(':').n(s10);
                                if(list1.size() == 2) {
                                    String s11 = ((String)list1.get(1)).trim();
                                    String s12 = djqq.e[0];
                                    if(s11.startsWith(s12)) {
                                        s = gfqz.c(s11.substring(s12.length()).trim());
                                        goto label_83;
                                    }
                                }
                            }
                            ++v5;
                        }
                    }
                    catch(IOException iOException0) {
                    }
                }
            }
        label_81:
            a.e(djqq.a.j(), "Unable to read %s", djqq.c, iOException0);
            goto label_84;
        label_83:
            if(s == null) {
            label_84:
                ((ggtj)djqq.a.j()).x("Unknown chipset!");
                return "unknown";
            }
        }
        return s == null ? "unknown" : s;
    }
}

