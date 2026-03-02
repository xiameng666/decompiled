import android.content.pm.Signature;
import android.util.Base64;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import j..util.DesugarCollections;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map.Entry;

public final class aiyn implements gfsi {
    public final String a;
    public final Signature[] b;
    public final RetrieveBytesRequest c;
    public final int d;

    public aiyn(String s, Signature[] arr_signature, RetrieveBytesRequest retrieveBytesRequest0, int v) {
        this.a = s;
        this.b = arr_signature;
        this.c = retrieveBytesRequest0;
        this.d = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ajbz ajbz0 = (ajbz)object0;
        if(ajbz0 == null) {
            ((ggtj)aizo.a.i()).x("No block data on device");
            ajag ajag0 = ajah.a();
            ajag0.a = 5;
            return ajag0.a();
        }
        String s = this.a;
        bboh bboh0 = aizo.a;
        gfsx gfsx0 = aizr.d(s, this.b, bboh0);
        if(!gfsx0.i()) {
            ajag ajag1 = ajah.a();
            ajag1.a = 4;
            return ajag1.a();
        }
        int v = this.d;
        RetrieveBytesRequest retrieveBytesRequest0 = this.c;
        Object object1 = gfsx0.d();
        HashMap hashMap0 = new HashMap();
        ajag ajag2 = ajah.a();
        if(retrieveBytesRequest0.a) {
            gfsx gfsx1 = aizr.c(ajbz0, ((String)object1), "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY");
            if(gfsx1.i()) {
                try {
                    ajbr ajbr0 = (ajbr)gfsx1.d();
                    int v1 = ajbt.a(ajbz0.d);
                    gfsx gfsx2 = aizr.o("com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY", ajbr0, (v1 == 0 ? 1 : v1), s, v, bboh0);
                    if(gfsx2.i()) {
                        hashMap0.put("com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY", gfsx2.d());
                    }
                    else {
                        ajag2.c(true);
                    }
                }
                catch(aizu | NullPointerException exception0) {
                    ((ggtj)((ggtj)aizo.a.i()).s(exception0)).R("Unable to read data for package \'%s\' associated with key \'%s\'!", s, "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY");
                    ajag2.a = 3;
                    return ajag2.a();
                }
            }
            ajbw ajbw0 = ajbw.a;
            ajbw ajbw1 = (ajbw)ajbz0.e.get(object1);
            if(ajbw1 != null) {
                ajbw0 = ajbw1;
            }
            for(Object object2: DesugarCollections.unmodifiableMap(ajbw0.c).entrySet()) {
                String s1 = new String(Base64.decode(((String)((Map.Entry)object2).getKey()), 2), StandardCharsets.UTF_8);
                ajbr ajbr1 = (ajbr)((Map.Entry)object2).getValue();
                try {
                    int v2 = ajbt.a(ajbz0.d);
                    gfsx gfsx3 = aizr.o(s1, ajbr1, (v2 == 0 ? 1 : v2), s, v, aizo.a);
                    if(gfsx3.i()) {
                        hashMap0.put(s1, gfsx3.d());
                    }
                    else {
                        ajag2.c(true);
                    }
                    continue;
                }
                catch(aizu | NullPointerException exception1) {
                    ((ggtj)((ggtj)aizo.a.i()).s(exception1)).R("Unable to read data for package \'%s\' associated with key \'%s\'!", s, s1);
                    ajag2.a = 3;
                    return ajag2.a();
                }
            }
            ajag2.a = 2;
            ajag2.b(hashMap0);
            return ajag2.a();
        }
        for(Object object3: retrieveBytesRequest0.a()) {
            String s2 = ajca.a(((String)object3));
            gfsx gfsx4 = aizr.c(ajbz0, ((String)object1), s2);
            if(gfsx4.i()) {
                ajbr ajbr2 = (ajbr)gfsx4.d();
                try {
                    gfsx gfsx5 = aizr.o(s2, ajbr2, (ajbt.a(ajbz0.d) == 0 ? 1 : ajbt.a(ajbz0.d)), s, v, aizo.a);
                    if(gfsx5.i()) {
                        hashMap0.put(s2, gfsx5.d());
                        continue;
                    }
                    else {
                        ajag2.c(true);
                        goto label_76;
                    }
                    break;
                }
                catch(aizu | NullPointerException exception2) {
                    ((ggtj)((ggtj)aizo.a.i()).s(exception2)).R("Unable to read data for package \'%s\' associated with key \'%s\'!", s, s2);
                    ajag2.a = 3;
                    return ajag2.a();
                }
            label_76:
            }
            else {
                ((ggtj)aizo.a.h()).R("No block data associated with key %s for package %s", s2, s);
            }
        }
        ajag2.a = 2;
        ajag2.b(hashMap0);
        return ajag2.a();
    }
}

