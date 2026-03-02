import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.UUID;

public final class fvoy implements Runnable {
    public final fvpk a;

    public fvoy(fvpk fvpk0) {
        this.a = fvpk0;
    }

    @Override
    public final void run() {
        BitSet bitSet0;
        int v6;
        int v5;
        int v4;
        fvpk fvpk0 = this.a;
        synchronized(fvpk0) {
            fvpk0.a = true;
        }
        try {
            BufferedReader bufferedReader0 = new BufferedReader(new FileReader(fvob.d(fvpk0.i)));
            try {
                int v1 = fvob.c(bufferedReader0);
                int v2 = fvob.c(bufferedReader0);
                int v3 = fvob.c(bufferedReader0);
                v4 = 0;
                boolean z = v1 >= 2 && fvob.c(bufferedReader0) == 1;
                if(v1 >= 3) {
                    v5 = fvob.c(bufferedReader0);
                    v6 = fvob.c(bufferedReader0);
                }
                else {
                    v5 = 0;
                    v6 = 0;
                }
                int v7 = v1 < 4 ? 0 : fvob.c(bufferedReader0);
                fvob fvob0 = new fvob(z);
                synchronized(fvob0) {
                    fvob0.a = v2;
                    fvob0.b = v3;
                    fvob0.c = v5;
                    fvob0.d = v6;
                    fvob0.e = v7;
                }
            }
            catch(NumberFormatException numberFormatException0) {
                throw new IOException(numberFormatException0.getMessage());
            }
            finally {
                bufferedReader0.close();
            }
        }
        catch(IOException unused_ex) {
            ++fvpk0.j.b;
            fvpk0.c();
            fvpk0.f();
            return;
        }
        if(fvob0.a() <= 0 && fvob0.b() <= 0 && !fvob0.h()) {
            fvpk0.c();
            fvpk0.f();
            return;
        }
        String s = fvpk0.i;
        File[] arr_file = new File(s).listFiles();
        ArrayList arrayList0 = new ArrayList();
        String s1 = null;
        if(arr_file == null) {
            bitSet0 = null;
        }
        else {
            Arrays.sort(arr_file, new fvpg());
            bitSet0 = null;
            int v8 = 0;
            while(v4 < arr_file.length) {
                File file0 = arr_file[v4];
                if(file0 != null) {
                    String s2 = file0.getName();
                    if(".lck".equals(s2)) {
                        v8 = 1;
                    }
                    else if("sessionId".equals(s2)) {
                        s1 = new String(fyba.e(new File(s, s2)), StandardCharsets.UTF_8).trim();
                    }
                    else if("uploadedSeq".equals(s2)) {
                        String s3 = new String(fyba.e(new File(s, s2)), StandardCharsets.UTF_8).trim();
                        BitSet bitSet1 = new BitSet();
                        for(Object object0: gfud.e(',').l(s3)) {
                            String s4 = (String)object0;
                            try {
                                int v9 = Integer.parseInt(s4);
                                if(v9 >= 0x40) {
                                    continue;
                                }
                                bitSet1.set(v9);
                            }
                            catch(NumberFormatException unused_ex) {
                            }
                        }
                        bitSet0 = bitSet1;
                    }
                    else if(!"sessionSummary".equals(s2)) {
                        arrayList0.add(s2);
                    }
                }
                ++v4;
            }
            v4 = v8;
        }
        if(s1 == null || s1.length() == 0) {
            String s5 = huvd.g();
            s1 = s5.length() <= 0 ? "@" + UUID.randomUUID() : "@" + s5 + "-" + UUID.randomUUID();
            fyba.a(new File(s, "sessionId"), s1.getBytes(StandardCharsets.UTF_8));
        }
        if(bitSet0 == null) {
            bitSet0 = new BitSet();
        }
        fvpj fvpj0 = new fvpj(s1, bitSet0, gged_interceptors.i(arrayList0), ((boolean)v4));
        if(fvpj0.c) {
            fvpk0.f();
            return;
        }
        gged_interceptors gged0 = fvpj0.b;
        if(gged0.isEmpty()) {
            fvpk0.c();
            fvpk0.f();
            return;
        }
        fvou fvou0 = new fvou(fvpk0, gged0, fvpj0, fvsw.b(fvpk0.h, fvpk0.d));
        fvpk0.f.execute(fvou0);
    }
}

