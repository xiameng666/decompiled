import android.content.Context;
import android.media.AudioFormat.Builder;
import android.media.AudioFormat;
import android.os.Build;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class fvon extends fvor {
    private long e;

    public fvon(Context context0, fvls fvls0, fvlt fvlt0, fybc fybc0, fwyd fwyd0) {
        super(context0, fvls0, fvlt0, fybc0);
    }

    @Override  // fvor
    protected final int a() {
        return 2;
    }

    @Override  // fvor
    protected final int d() {
        return 1;
    }

    @Override  // fvor
    protected final int e() {
        return 2;
    }

    @Override  // fvor
    protected final int f() {
        return 44100;
    }

    @Override  // fvor
    protected final AudioFormat g() {
        return new AudioFormat.Builder().setEncoding(2).setSampleRate(44100).setChannelMask(16).build();
    }

    @Override  // fvor
    protected final boolean h(int v, int v1, long v2) {
        Iterator iterator1;
        short[] arr_v3;
        int v3 = v;
        this.e = v2;
        fvom fvom0 = new fvom(v3);
        fvom0.j = v2;
        short[] arr_v = new short[v3];
        while(fvon.a) {
            int v4 = fvon.b.read(arr_v, 0, v3, 0);
            if(v4 < 0) {
                Locale.getDefault();
                return false;
            }
            fvpw fvpw0 = fvom0.e;
            fvpu fvpu0 = fvpw0.b;
            fvpu0.b(0, v4, v3);
            for(int v5 = 0; v5 < v4; ++v5) {
                int v6 = fvpu0.a(fvpu0.d + v5);
                fvpu0.a[v6] = arr_v[v5];
            }
            fvpu0.d(v4);
            ArrayList arrayList0 = new ArrayList();
            while(true) {
                int v7 = fvpu0.d;
                int v8 = fvpw0.a;
                if(v7 < v8) {
                    break;
                }
                short[] arr_v1 = new short[v8];
                int v9 = Math.min(v8, v7);
                for(int v10 = 0; v10 < v9; ++v10) {
                    arr_v1[v10] = fvpu0.a[fvpu0.a(v10)];
                }
                fvpu0.c(v8);
                arrayList0.add(arr_v1);
            }
            ArrayList arrayList1 = new ArrayList();
            Iterator iterator0 = arrayList0.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                short[] arr_v2 = (short[])object0;
                double[] arr_f = new double[arr_v2.length];
                for(int v11 = 0; v11 < arr_v2.length; ++v11) {
                    arr_f[v11] = ((double)arr_v2[v11]) / 32768.0;
                }
                if(fvom0.g == 0) {
                    fvom0.i = SystemClock.elapsedRealtime();
                }
                "Nexus 5".equals(Build.MODEL);
                double f = "Gear Live".equals(Build.MODEL) ? 400000.0 : 100000.0;
                double[] arr_f1 = new double[arr_v2.length];
                for(int v12 = 0; v12 < arr_v2.length; ++v12) {
                    arr_f1[v12] = arr_f[v12] * f;
                }
                double[] arr_f2 = new double[arr_v2.length];
                for(int v13 = 0; v13 < arr_v2.length; ++v13) {
                    arr_f2[v13] = arr_f1[v13] * fvom.b[v13];
                }
                if(arr_v2.length <= 0 || (arr_v2.length - 1 & arr_v2.length) != 0) {
                    throw new IllegalArgumentException("Must be a power of 2");
                }
                ArrayList arrayList2 = new ArrayList();
                for(int v14 = 0; v14 < arr_v2.length; ++v14) {
                    arrayList2.add(Double.valueOf(arr_f2[v14]));
                }
                ArrayList arrayList3 = new ArrayList();
                int v15 = arrayList2.size();
                int v16 = 0;
                while(v16 < v15) {
                    arrayList3.add(new fvmb(((double)(((Double)arrayList2.get(v16)))), 0.0));
                    ++v16;
                    fvom0 = fvom0;
                }
                List list0 = fvmc.a(arrayList3).subList(0, arrayList2.size() / 2);
                ArrayList arrayList4 = new ArrayList();
                for(int v17 = 0; v17 < list0.size(); ++v17) {
                    fvmb fvmb0 = (fvmb)list0.get(v17);
                    arrayList4.add(Double.valueOf(fvmb0.a * fvmb0.a + fvmb0.b * fvmb0.b));
                }
                fvom0.f = arrayList4;
                ArrayList arrayList5 = new ArrayList();
                arrayList5.add(new ArrayList());
                double f1 = 0.5;
                int v18 = 0;
            label_89:
                if(v18 >= 0x200) {
                    arr_v3 = arr_v;
                }
                else {
                    double[] arr_f3 = fvom.d;
                    if(arr_f3 == null) {
                        arr_f3 = new double[0x200];
                        fvom.d = arr_f3;
                        int v19 = 0;
                        while(v19 < 0x200) {
                            arr_f3[v19] = Math.atan(0.00076 * (((double)v19) * 43.066406)) * 13.0 + Math.atan(Math.pow(((double)v19) * 43.066406 / 7500.0, 2.0)) * 3.5;
                            ++v19;
                            arr_f3 = arr_f3;
                            arr_v = arr_v;
                        }
                    }
                    arr_v3 = arr_v;
                    double f2 = arr_f3[v18];
                    if((f2 < 0.5)) {
                        iterator1 = iterator0;
                        ++v18;
                        iterator0 = iterator1;
                        arr_v = arr_v3;
                        goto label_89;
                    }
                    else {
                        while(true) {
                            if(!(f2 > f1)) {
                                goto label_244;
                            }
                            if(arrayList5.size() == 23) {
                                break;
                            }
                            ++f1;
                            arrayList5.add(new ArrayList());
                        }
                    }
                }
                while(arrayList5.size() < 23) {
                    arrayList5.add(new ArrayList());
                }
                int v20 = arrayList5.size();
                double[][] arr2_f = new double[v20][];
                for(int v21 = 0; v21 < arrayList5.size(); ++v21) {
                    arr2_f[v21] = new double[((ArrayList)arrayList5.get(v21)).size()];
                    for(int v22 = 0; true; ++v22) {
                        double[] arr_f4 = arr2_f[v21];
                        if(v22 >= arr_f4.length) {
                            break;
                        }
                        arr_f4[v22] = (double)(((Double)((ArrayList)arrayList5.get(v21)).get(v22)));
                    }
                }
                double[] arr_f5 = new double[v20];
                double[] arr_f6 = new double[v20];
                double[] arr_f7 = new double[v20];
                double f3 = fvom.d(19980.0) / 41.0;
                ArrayList arrayList6 = new ArrayList();
                int v23 = 0;
                while(v23 <= 41) {
                    arrayList6.add(Double.valueOf(fvom.d(20.0) + ((double)v23) * f3));
                    ++v23;
                    arr2_f = arr2_f;
                    arr_f5 = arr_f5;
                }
                double[] arr_f8 = new double[40];
                int v24 = true;
                while(v24 <= 40) {
                    int v25 = v24 - 1;
                    int v26 = fvom.h(fvom.e(((Double)arrayList6.get(v25)).doubleValue()));
                    int v27 = fvom.h(fvom.e(((Double)arrayList6.get(v24)).doubleValue()));
                    ++v24;
                    int v28 = fvom.h(fvom.e(((Double)arrayList6.get(v24)).doubleValue()));
                    int v29 = v26;
                    double f4 = 0.0;
                    while(v29 <= v27 - 1) {
                        f4 += ((double)(((Double)fvom0.f.get(v29)))) * ((double)(v29 - v26)) / (((double)v27) + 0.0 - ((double)v26));
                        ++v29;
                        arr_f6 = arr_f6;
                        arr_f7 = arr_f7;
                    }
                    double f5 = f4 + ((double)(((Double)fvom0.f.get(v27))));
                    int v30 = v27 + 1;
                    while(v30 <= v28) {
                        f5 += ((double)(((Double)fvom0.f.get(v30)))) * ((double)(v28 - v30)) / (((double)v28) + 0.0 - ((double)v27));
                        ++v30;
                        v27 = v27;
                    }
                    arr_f8[v25] = f5;
                    arr_f8 = arr_f8;
                    iterator0 = iterator0;
                    arr_f6 = arr_f6;
                    arr_f7 = arr_f7;
                }
                double[] arr_f9 = new double[40];
                for(int v31 = 0; v31 < 40; ++v31) {
                    arr_f9[v31] = Math.max(Math.log(arr_f8[v31]), -100.0);
                }
                if(fvom.c == null) {
                    fvom.c = new double[40][40];
                    for(int v32 = 0; v32 < 40; ++v32) {
                        for(int v33 = 0; v33 < 40; ++v33) {
                            fvom.c[v32][v33] = Math.cos(((double)v32) * (((double)v33) + 0.5) * 3.141593 / 40.0) * Math.sqrt(0.05);
                        }
                    }
                    for(int v34 = 0; v34 < 40; ++v34) {
                        double[] arr_f10 = fvom.c[0];
                        arr_f10[v34] *= Math.sqrt(0.5);
                    }
                }
                double[] arr_f11 = new double[40];
                for(int v35 = 0; v35 < 40; ++v35) {
                    double f6 = 0.0;
                    for(int v36 = 0; v36 < 40; ++v36) {
                        f6 += arr_f9[v36] * fvom.c[v35][v36];
                    }
                    arr_f11[v35] = f6;
                }
                for(int v37 = 0; v37 < v20; ++v37) {
                    double f7 = fvom.b(arr2_f[v37]);
                    arr_f5[v37] = f7;
                    arr_f6[v37] = fvom.c(arr2_f[v37], f7);
                    arr_f7[v37] = fvom.a(arr2_f[v37]);
                }
                double[] arr_f12 = new double[arr_v2.length];
                for(int v38 = 0; v38 < arr_v2.length; ++v38) {
                    double f8 = arr_f1[v38];
                    arr_f12[v38] = f8 * f8;
                }
                double f9 = fvom.b(arr_f12);
                double f10 = fvom.c(arr_f12, f9);
                double f11 = fvom.a(arr_f12);
                int v39 = 0;
                for(int v40 = true; v40 < 0x400; ++v40) {
                    if((arr_f1[v40 - 1] <= 0.0) && (arr_f1[v40] > 0.0)) {
                        ++v39;
                    }
                }
                long v41 = fvom0.j;
                fvol fvol0 = new fvol(f9, ((double)v39) / 1024.0 * 44100.0, f10, f11, arr_f11, arr_f5, arr_f6, arr_f7, v41);
                fvom0.j = v41 + 23L;
                int v42 = fvom0.g;
                fvom0.h[v42] = f9;
                fvom0.g = v42 + 1;
                if(v42 + 1 >= 0xC7) {
                    boolean z = !(((double)(SystemClock.elapsedRealtime() - fvom0.i)) > 4920.770975);
                    fvom0.f();
                }
                arrayList1.add(fvol0);
                fvom0 = fvom0;
                iterator0 = iterator0;
                arr_v = arr_v3;
                continue;
            label_244:
                iterator1 = iterator0;
                Double double0 = (Double)fvom0.f.get(v18);
                ((ArrayList)arrayList5.get(arrayList5.size() - 1)).add(double0);
                ++v18;
                iterator0 = iterator1;
                arr_v = arr_v3;
                goto label_89;
            }
            for(Object object1: arrayList1) {
                ((fvoq)object1).a(this.m);
            }
            if(SystemClock.elapsedRealtime() - this.e >= 7000L) {
                try {
                    fvon.b.stop();
                }
                catch(IllegalStateException unused_ex) {
                    goto label_285;
                }
                try {
                    synchronized(fvon.c) {
                        if(fvon.a) {
                            Locale.getDefault();
                            fvon.c.wait(53000L);
                        }
                    }
                }
                catch(InterruptedException unused_ex) {
                }
                try {
                    this.e = SystemClock.elapsedRealtime();
                    while(true) {
                        fvon.b.startRecording();
                        if(fvon.b.getRecordingState() == 3 || !fvon.a) {
                            break;
                        }
                        Locale.getDefault();
                        try {
                            synchronized(fvon.c) {
                                if(fvon.a) {
                                    fvon.c.wait(60000L);
                                }
                            }
                            continue;
                        }
                        catch(InterruptedException unused_ex) {
                        }
                        break;
                    }
                    fvom0.e.b.d = 0;
                    fvom0.e.b.c = 0;
                    fvom0.j = SystemClock.elapsedRealtime();
                }
                catch(IllegalStateException unused_ex) {
                }
            }
        label_285:
            v3 = v;
            fvom0 = fvom0;
            arr_v = arr_v;
        }
        return true;
    }
}

