import j..util.Base64;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.zip.DeflaterOutputStream;

public final class fvww extends fvwz {
    public DataOutputStream a;
    private final File c;
    private final long d;
    private int e;
    private final int[] f;
    private long g;
    private fvwx[] h;
    private int i;
    private final gmcg j;

    public fvww(fvxb fvxb0, int v, File file0, long v1, gmcg gmcg0) {
        super(fvxb0, v);
        this.e = 0;
        this.f = new int[0x98];
        this.g = -1L;
        this.c = file0;
        this.d = v1;
        this.j = gmcg0;
        this.h = new fvwx[((int)huph.b())];
        this.g = -1L;
    }

    @Override  // fvwz
    public final void a(fvwx fvwx0) {
        synchronized(this) {
            super.a(fvwx0);
            fvwx[] arr_fvwx = this.h;
            int v1 = this.i;
            this.i = v1 + 1;
            arr_fvwx[v1] = fvwx0;
            if(v1 + 1 == arr_fvwx.length) {
                this.m(false);
            }
        }
    }

    public final void b(DataOutputStream dataOutputStream0, long v) {
        int[] arr_v8;
        int[] arr_v7;
        List list1;
        List list0;
        Object object0;
        ArrayList arrayList0;
        synchronized(this) {
            try {
                if(!huph.e()) {
                    this.m(true);
                    DataOutputStream dataOutputStream1 = this.a;
                    if(dataOutputStream1 != null) {
                        try {
                            dataOutputStream1.flush();
                        }
                        catch(IOException unused_ex) {
                        }
                    }
                }
                fvwr fvwr0 = new fvwr();
                File[] arr_file = this.c.listFiles(fvwr0);
                arrayList0 = new ArrayList(8);
                if(arr_file != null) {
                    for(int v2 = 0; v2 < arr_file.length; ++v2) {
                        File file0 = arr_file[v2];
                        try {
                            DataInputStream dataInputStream0 = new DataInputStream(new BufferedInputStream(new FileInputStream(file0)));
                            if(dataInputStream0.readInt() == -500881805 && dataInputStream0.readInt() == 4) {
                                long v3 = dataInputStream0.readLong();
                                int v4 = dataInputStream0.readInt();
                                short[] arr_v = new short[v4];
                                for(int v5 = 0; v5 < v4; ++v5) {
                                    arr_v[v5] = dataInputStream0.readShort();
                                }
                                object0 = new fvwv(file0, dataInputStream0, v3, arr_v, dataInputStream0.readLong());
                            }
                            else {
                                object0 = null;
                            }
                        }
                        catch(IOException unused_ex) {
                            object0 = null;
                        }
                        if(object0 != null) {
                            arrayList0.add(object0);
                        }
                    }
                }
                Collections.sort(arrayList0);
            }
            catch(Exception unused_ex) {
                list0 = null;
                goto label_161;
            }
            catch(Throwable throwable0) {
                list1 = null;
                goto label_169;
            }
        }
        try {
            int[] arr_v1 = new int[0x2000];
            int[] arr_v2 = new int[0x2000];
            int[][] arr2_v = new int[3][0x2000];
            String[] arr_s = new String[0x2000];
            int[] arr_v3 = new int[0x98];
            int[] arr_v4 = new int[0x2000];
            dataOutputStream0.writeInt(-500881805);
            dataOutputStream0.writeInt(4);
            dataOutputStream0.writeInt(0x98);
            int[] arr_v5 = fvxa.b();
            for(int v6 = 0; v6 < 0x98; ++v6) {
                int v7 = arr_v5[v6];
                String s = fvxa.a(v7);
                if(v7 == 0) {
                    throw null;
                }
                dataOutputStream0.writeShort(s.hashCode());
            }
            int[] arr_v6 = this.f;
            for(int v8 = 0; v8 < 0x98; ++v8) {
                dataOutputStream0.writeInt(arr_v6[v8]);
            }
            dataOutputStream0.writeInt(arrayList0.size());
            int v9 = 0;
            while(true) {
                if(v9 >= arrayList0.size()) {
                    goto label_177;
                }
                fvwv fvwv0 = (fvwv)arrayList0.get(v9);
                if(v > v + 2500L) {
                    fvww.e(dataOutputStream0, 0);
                    arr_v7 = arr_v1;
                    arr_v8 = arr_v2;
                }
                else {
                    DataInputStream dataInputStream1 = fvwv0.b;
                    long v10 = fvwv0.c;
                    short[] arr_v9 = fvwv0.d;
                    long v11 = fvwv0.e;
                    arr_v7 = arr_v1;
                    arr_v8 = arr_v2;
                    int v12 = 0;
                    int v13 = 0;
                    while(v13 < 0x2000) {
                        try {
                            int v14 = dataInputStream1.readByte();
                            if(v14 < 0) {
                                v14 += 0x100;
                            }
                            int v15 = dataInputStream1.readInt();
                            int v16 = dataInputStream1.readInt();
                            int v17 = dataInputStream1.readInt();
                            int v18 = dataInputStream1.readInt();
                            String s1 = dataInputStream1.readUTF();
                            arr_v7[v12] = v14;
                            arr_v8[v12] = v15;
                            arr2_v[0][v12] = v16;
                            arr2_v[1][v12] = v17;
                            arr2_v[2][v12] = v18;
                            arr_s[v12] = s1;
                            ++v12;
                            ++v13;
                            continue;
                        }
                        catch(EOFException unused_ex) {
                        }
                        break;
                    }
                    fyba.b(dataInputStream1);
                    Arrays.fill(arr_v3, -1);
                    for(int v19 = v12 - 1; v19 >= 0; --v19) {
                        int v20 = arr_v7[v19];
                        arr_v4[v19] = arr_v3[v20];
                        arr_v3[v20] = v19;
                    }
                    fvww.e(dataOutputStream0, v12);
                    dataOutputStream0.writeLong(v10);
                    dataOutputStream0.writeInt(arr_v9.length);
                    for(int v21 = 0; v21 < arr_v9.length; ++v21) {
                        dataOutputStream0.writeShort(((int)arr_v9[v21]));
                    }
                    for(int v22 = 0; v22 < v12; ++v22) {
                        dataOutputStream0.writeByte(((int)(((byte)arr_v7[v22]))));
                    }
                    dataOutputStream0.writeLong(v11);
                    for(int v23 = 0; v23 < 4; ++v23) {
                        for(int v24 = 0; v24 < v12; ++v24) {
                            dataOutputStream0.writeByte(arr_v8[v24] >>> v23 * 8);
                        }
                    }
                    for(int v25 = 0; v25 < 0x98; ++v25) {
                        for(int v26 = 0; v26 < 3; ++v26) {
                            for(int v27 = 0; v27 < 4; ++v27) {
                                int v28 = arr_v3[v25];
                                int v29 = 0;
                                while(v28 != -1) {
                                    dataOutputStream0.writeByte(arr2_v[v26][v28] - v29 >>> v27 * 8);
                                    v29 = arr2_v[v26][v28];
                                    v28 = arr_v4[v28];
                                }
                            }
                        }
                        for(int v30 = arr_v3[v25]; v30 != -1; v30 = arr_v4[v30]) {
                            dataOutputStream0.writeUTF(arr_s[v30]);
                        }
                    }
                }
                ++v9;
                arr_v1 = arr_v7;
                arr_v2 = arr_v8;
            }
        }
        catch(Exception unused_ex) {
            list0 = arrayList0;
        label_161:
            if(list0 != null) {
                Iterator iterator0 = list0.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object1 = iterator0.next();
                    fyba.b(((fvwv)object1).b);
                }
            }
            goto label_182;
        }
        catch(Throwable throwable0) {
            list1 = arrayList0;
        }
    label_169:
        if(list1 != null) {
            for(Object object2: list1) {
                fyba.b(((fvwv)object2).b);
            }
        }
        fyba.b(dataOutputStream0);
        throw throwable0;
    label_177:
        for(Object object3: arrayList0) {
            fyba.b(((fvwv)object3).b);
        }
    label_182:
        fyba.b(dataOutputStream0);
    }

    @Override  // fvwz
    public final void c(Format format0, long v, PrintWriter printWriter0) {
        gmcd gmcd0;
        super.c(format0, v, printWriter0);
        if(huph.e()) {
            synchronized(this) {
                gmcd0 = this.m(true);
            }
            try {
                Boolean boolean0 = (Boolean)gmcd0.get();
            }
            catch(ExecutionException | InterruptedException unused_ex) {
            }
        }
        fvxb fvxb0 = this.b;
        long v2 = fvxb0.a();
        printWriter0.println("#### com.google.android.location.utils.logging.CompactLogger Start ####");
        this.b(new DataOutputStream(new BufferedOutputStream(new DeflaterOutputStream(new BufferedOutputStream(Base64.getEncoder().wrap(new fvwt(new BufferedWriter(new fvwu(new fvws(this, printWriter0))))))))), v2);
        printWriter0.println();
        printWriter0.println("#### com.google.android.location.utils.logging.CompactLogger End ####");
        printWriter0.println("compact-log dump duration: " + (fvxb0.a() - v2) + "ms");
    }

    public final void d(fvwx[] arr_fvwx, int v) {
        if(this.a == null) {
            this.a = fvww.n(this.c, this.d);
        }
        for(int v1 = 0; v1 < v; ++v1) {
            fvwx fvwx0 = arr_fvwx[v1];
            long v2 = fvwx0.i;
            try {
                if(this.g == -1L) {
                    this.a.writeLong(v2);
                    this.g = v2;
                }
                ++this.f[fvwx0.k - 1];
                this.a.writeByte(fvwx0.k - 1);
                this.a.writeInt(((int)(v2 - this.g)));
                this.g = v2;
                this.a.writeInt(fvwx0.e);
                this.a.writeInt(fvwx0.f);
                this.a.writeInt(fvwx0.g);
                String s = fvwx0.h == null ? "" : fvwx0.h.toString();
                if(s.length() > 0x40) {
                    s = s.substring(0, 0x40);
                }
                this.a.writeUTF(s);
                int v3 = this.e + 1;
                this.e = v3;
                if(v3 == 0x2000) {
                    this.a.close();
                    this.a = fvww.n(this.c, this.d);
                    this.g = -1L;
                    this.e = 0;
                }
            }
            catch(IOException unused_ex) {
            }
        }
    }

    protected static final void e(DataOutputStream dataOutputStream0, int v) {
        dataOutputStream0.writeInt(-500881805);
        dataOutputStream0.writeInt(v);
    }

    private final gmcd m(boolean z) {
        if(huph.e()) {
            fvwx[] arr_fvwx = this.h;
            int v = this.i;
            this.h = new fvwx[((int)huph.b())];
            this.i = 0;
            fvwq fvwq0 = new fvwq(this, arr_fvwx, v, z);
            return this.j.e(fvwq0);
        }
        this.d(this.h, this.i);
        Arrays.fill(this.h, null);
        this.i = 0;
        return gmbu.i(Boolean.valueOf(true));
    }

    private static DataOutputStream n(File file0, long v) {
        DataOutputStream dataOutputStream0;
        synchronized(fvww.class) {
            if(!file0.exists()) {
                file0.mkdir();
            }
            File file1 = new File(file0, "0.clog");
            for(int v3 = 0; v3 < 8; ++v3) {
                File file2 = new File(file0, v3 + ".clog");
                if(file2.length() == 0L) {
                    file1 = file2;
                    break;
                }
                if(file1.lastModified() > file2.lastModified()) {
                    file1 = file2;
                }
            }
            try {
                dataOutputStream0 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file1)));
                dataOutputStream0.writeInt(-500881805);
                dataOutputStream0.writeInt(4);
                dataOutputStream0.writeLong(v);
                dataOutputStream0.writeInt(0x98);
                int[] arr_v = fvxa.b();
                for(int v2 = 0; v2 < 0x98; ++v2) {
                    int v4 = arr_v[v2];
                    String s = fvxa.a(v4);
                    if(v4 == 0) {
                        throw null;
                    }
                    dataOutputStream0.writeShort(s.hashCode());
                }
            }
            catch(IOException unused_ex) {
                dataOutputStream0 = new DataOutputStream(ghjj.a);
            }
        }
        return dataOutputStream0;
    }
}

