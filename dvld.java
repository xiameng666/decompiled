import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import dagger.internal.Preconditions;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public final class dvld implements dnqb {
    public static final bboh a;
    public dvlb b;
    public fhwb c;
    public bbng d;
    private String e;

    static {
        dvld.a = bboh.b("Pay", bbcu.cZ);
    }

    @Override  // dnqb
    public final int a(cllr cllr0, Context context0) {
        gged_interceptors gged0;
        ArrayList arrayList0;
        bboh bboh0 = dvld.a;
        ((ggtj)bboh0.h()).x("UCP cache cleanup task is running");
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        new dvlk(domv0).inject(this);
        if(cllr0.a.length() != 0 && ibuq.m(cllr0.a, "cleanupucpcache.oneoff")) {
            Bundle bundle0 = cllr0.b;
            if(bundle0 != null && !bundle0.isEmpty()) {
                String s = bundle0.getString("account_name", "");
                ibuq.c(s);
                if(s.length() > 0) {
                    this.e = s;
                    File[] arr_file = this.c().b.getCacheDir().listFiles();
                    String s1 = null;
                    if(arr_file == null) {
                        arrayList0 = null;
                    }
                    else {
                        arrayList0 = new ArrayList();
                        for(int v = 0; v < arr_file.length; ++v) {
                            File file0 = arr_file[v];
                            if(file0.isFile()) {
                                String s2 = file0.getName();
                                ibuq.e(s2, "getName(...)");
                                if(ibzk.W(s2, "ucp-")) {
                                    String s3 = file0.getName();
                                    ibuq.e(s3, "getName(...)");
                                    if(ibzk.J(s3, ".temp")) {
                                        arrayList0.add(file0);
                                    }
                                }
                            }
                        }
                    }
                    if(arrayList0 != null && !arrayList0.isEmpty()) {
                        gged0 = ggdx.a(arrayList0);
                    }
                    else {
                        gged0 = ggna.a;
                        ibuq.c(gged0);
                    }
                    ggqk ggqk0 = gged0.E();
                    ibuq.e(ggqk0, "iterator(...)");
                    boolean z = true;
                    int v1 = 0;
                    int v2 = 0;
                    while(ggqk0.hasNext()) {
                        File file1 = (File)ggqk0.next();
                        if(this.d == null) {
                            ibuq.j("clock");
                        }
                        long v3 = TimeUnit.SECONDS.toMillis(hwkt.a.g().c());
                        if(System.currentTimeMillis() - file1.lastModified() >= v3) {
                            ++v1;
                            dvlb dvlb0 = this.c();
                            Uri uri0 = Uri.fromFile(file1);
                            ibuq.e(uri0, "fromFile(...)");
                            boolean z1 = dvlb0.a(uri0);
                            if(!z1) {
                                ++v2;
                            }
                            z = z && z1;
                        }
                    }
                    int v4 = gged0.size();
                    ((ggtj)bboh0.h()).X("Total image cache: %d, eligible to delete: %d, fail to delete: %d", Integer.valueOf(v4), Integer.valueOf(v1), Integer.valueOf(v2));
                    if(v4 > 0) {
                        fhwb fhwb0 = this.c;
                        if(fhwb0 == null) {
                            ibuq.j("semanticLogger");
                            fhwb0 = null;
                        }
                        fhvz fhvz0 = fhwa.a(0x35742);
                        String s4 = this.e;
                        if(s4 == null) {
                            ibuq.j("accountName");
                        }
                        else {
                            s1 = s4;
                        }
                        fhvz0.c(fhwp.b(s1));
                        gjca gjca0 = gjbz.a(((gjcd)((ProtoLiteMessage)gjce.a).v_newBuilder()));
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjcc.a).v_newBuilder();
                        ibuq.f(hftp0, "builder");
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        ((gjcc)hftv0).b |= 1;
                        ((gjcc)hftv0).c = v4;
                        if(!hftv0.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp0.b_message;
                        ((gjcc)hftv1).b |= 2;
                        ((gjcc)hftv1).d = v2;
                        if(!hftv1.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gjcc gjcc0 = (gjcc)hftp0.b_message;
                        gjcc0.b |= 4;
                        gjcc0.e = v1;
                        ProtoLiteMessage hftv2 = hftp0.N_build();
                        ibuq.e(hftv2, "build(...)");
                        ibuq.f(((gjcc)hftv2), "value");
                        gjcd gjcd0 = gjca0.a;
                        if(!gjcd0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)gjcd0).ensureMutable();
                        }
                        gjce gjce0 = (gjce)gjcd0.b_message;
                        ((gjcc)hftv2).getClass();
                        gjce0.l = (gjcc)hftv2;
                        gjce0.b |= 0x4000;
                        fhvz0.b(douc.a(gjca0.a()));
                        fhwb0.a(fhvz0.a());
                    }
                    if(gged0.isEmpty()) {
                        ((ggtj)bboh0.h()).x("No cached images found, cancelling cleanup task");
                        cljp.a(context0).d("cleanupucpcache.oneoff", "com.google.android.gms.pay.gcmtask.PayGcmTaskService");
                    }
                    if(!z) {
                        ((ggtj)bboh0.j()).x("Failed to remove all UCP cached image, rescheduling...");
                        return 1;
                    }
                    ((ggtj)bboh0.h()).x("UCP cache cleanup task completed successfully");
                    return 0;
                }
            }
            ((ggtj)bboh0.j()).x("Improper extras were provided in the task params, skipping task");
            return 2;
        }
        ((ggtj)bboh0.j()).x("Bad task tag received");
        return 2;
    }

    @Override  // dnqb
    public final void b(Context context0) {
    }

    public final dvlb c() {
        dvlb dvlb0 = this.b;
        if(dvlb0 != null) {
            return dvlb0;
        }
        ibuq.j("cachedImageHelper");
        return null;
    }
}

