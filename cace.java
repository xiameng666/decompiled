import android.accounts.Account;
import com.google.android.gms.auth.folsom.ProductKey;
import j..nio.file.Files;
import j..nio.file.Paths;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class cace extends ibsl implements ibtw {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    int f;
    final cacp g;
    final Account h;
    final List i;

    public cace(cacp cacp0, Account account0, List list0, ibrl ibrl0) {
        this.g = cacp0;
        this.h = account0;
        this.i = list0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cace)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cace(this.g, this.h, this.i, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        BufferedWriter bufferedWriter0;
        String s2;
        gmnb gmnb0;
        byte[] arr_b3;
        String s1;
        byte[] arr_b2;
        File file0;
        gmmg gmmg0;
        byte[] arr_b1;
        cace cace0;
        Object object6;
        Object object5;
        Object object4;
        Object object3;
        Object object2;
        Object object1 = ibrx.a;
        switch(this.f) {
            case 0: {
                ibnx.b(object0);
                String s = this.h.name;
                ibuq.e(s, "name");
                gmcd gmcd0 = this.g.d.c(s);
                this.f = 1;
                object0 = icpu.c(gmcd0, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                try {
                    object2 = this.e;
                    object3 = this.d;
                    object4 = this.c;
                    object5 = this.b;
                    object6 = this.a;
                    ibnx.b(object0);
                    cace0 = this;
                    goto label_49;
                }
                catch(IOException iOException0) {
                    goto label_104;
                }
            }
        }
        ArrayList arrayList0 = new ArrayList(ibpo.q(((List)object0), 10));
        for(Object object7: ((List)object0)) {
            arrayList0.add(new Integer(((ProductKey)object7).a));
        }
        ibpo.ay(arrayList0);
        ArrayList arrayList1 = new ArrayList();
        Iterator iterator1 = this.i.iterator();
        object6 = (List)object0;
        object5 = arrayList1;
        object4 = iterator1;
        while(((Iterator)object4).hasNext()) {
            Object object8 = ((Iterator)object4).next();
            object3 = (cada)object8;
            try {
                object2 = (cacx)ibpo.R(object3.c);
                if(object2 == null) {
                    goto label_101;
                }
                else {
                    this.a = object6;
                    this.b = object5;
                    this.c = object4;
                    this.d = object3;
                    this.e = object2;
                    this.f = 2;
                    cace0 = this;
                    goto label_47;
                }
                break;
            }
            catch(IOException iOException1) {
                cace0 = this;
                goto label_96;
            }
            try {
            label_47:
                object0 = this.g.c(this.h, object3.a, object3.b, cace0);
                if(object0 != object1) {
                label_49:
                    ((ggtj)cacp.a.h()).B("Downloaded file path: %s", ((String)object0));
                    byte[] arr_b = ((ProductKey)ibpo.R(((List)object6))).b;
                    ibuq.e(arr_b, "keyMaterial");
                    ibuq.f(arr_b, "rootKeyBytes");
                    arr_b1 = new byte[0];
                    gmnr.a();
                    if(arr_b.length != 0x20) {
                        throw new IllegalArgumentException("Root key must be 256 bits (32 bytes).");
                    }
                    try {
                        gmpk gmpk0 = new gmpk();
                        gmpk0.b();
                        gmpk0.c(0x20);
                        gmpk0.d();
                        gmpk0.a = gmpl.c;
                        gmmg0 = gnpz.c(gmpb.a(gmpk0.a(), gnsl.c(arr_b), null));
                    }
                    catch(GeneralSecurityException generalSecurityException0) {
                        throw new GeneralSecurityException("Error initializing AEAD with the provided key.", generalSecurityException0);
                    }
                    file0 = cacp.i("decrypted", ((cada)object3).b, "dec");
                    arr_b2 = ((cacx)object2).a;
                    s1 = file0.getPath();
                    ibuq.e(s1, "getPath(...)");
                    ibuq.f(arr_b2, "wrappedKey");
                    ibuq.f(((String)object0), "inputFilename");
                    ibuq.f(s1, "outputFilename");
                    arr_b3 = Files.readAllBytes(Paths.get(ccsb.a.a(((String)object0)), new String[0]));
                    ibuq.e(arr_b3, "readAllBytes(...)");
                    gmnb0 = gmnb.l(gmmh.a(arr_b2), gmmg0, arr_b1);
                    goto label_78;
                }
                return object1;
            }
            catch(IOException iOException1) {
                goto label_96;
            }
            try {
                gmnb0 = gmnb.l(gmmh.a(arr_b2), gmmg0, arr_b1);
                goto label_78;
            }
            catch(IOException unused_ex) {
                try {
                    throw new GeneralSecurityException("Parse keyset failed");
                label_78:
                    byte[] arr_b4 = ((gmmg)gmnb0.o(gmnz.a(), gmmg.class)).a(arr_b3, arr_b1);
                    ibuq.e(arr_b4, "decrypt(...)");
                    Charset charset0 = StandardCharsets.UTF_8;
                    ibuq.e(charset0, "UTF_8");
                    s2 = new String(arr_b4, charset0);
                    bufferedWriter0 = new BufferedWriter(new FileWriter(ccsb.a.a(s1)));
                }
                catch(IOException iOException1) {
                    goto label_96;
                }
            }
            try {
                bufferedWriter0.write(s2);
                goto label_89;
            }
            catch(Throwable throwable0) {
                try {
                    ibsx.a(bufferedWriter0, throwable0);
                    throw throwable0;
                label_89:
                    ibsx.a(bufferedWriter0, null);
                    ((ggtj)cacp.a.h()).B("Decrypted file path: %s", file0.getPath());
                    String s3 = file0.getPath();
                    ibuq.e(s3, "getPath(...)");
                    ((List)object5).add(s3);
                    this = cace0;
                    continue;
                }
                catch(IOException iOException1) {
                }
            }
        label_96:
            IOException iOException2 = iOException1;
            goto label_106;
            try {
            label_101:
                ((ggtj)cacp.a.j()).A("No key found for log file %d", object3.a);
                continue;
            }
            catch(IOException iOException0) {
            label_104:
                iOException2 = iOException0;
                cace0 = this;
            }
        label_106:
            ((ggtj)((ggtj)cacp.a.j()).s(iOException2)).A("Failed to download log file %d", ((cada)object3).a);
            this = cace0;
        }
        return object5;
    }
}

