import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.gms.mdd.FileGroupResponse;
import com.google.android.gms.mdd.MddFile;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class bwng {
    private final Context a;
    private final bwts b;

    public bwng(Context context0, bwts bwts0) {
        this.a = context0;
        this.b = bwts0;
    }

    final bwki a(String s) {
        return (bwki)bwuy.a(this.a.getSharedPreferences("gms_icing_client_groups_mdd", 0), s, ((Parser)((ProtoLiteMessage)bwki.a).jf(7, null)));
    }

    final boolean b(String s) {
        bwkh bwkh0;
        evql evql0 = new cpvn(this.a).f(s);
        try {
            evrg.o(evql0, 3000L, TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | TimeoutException | InterruptedException exception0) {
            bwne.h("%s Exception while executing mdd read task for group %s : %s", new Object[]{"MDDHelper", s, exception0});
            return false;
        }
        FileGroupResponse fileGroupResponse0 = (FileGroupResponse)evql0.j();
        SharedPreferences sharedPreferences0 = this.a.getSharedPreferences("gms_icing_client_groups_mdd", 0);
        bwki bwki0 = (bwki)bwuy.a(sharedPreferences0, s, ((Parser)((ProtoLiteMessage)bwki.a).jf(7, null)));
        if(bwki0 == null) {
            return fileGroupResponse0.c.isEmpty() ? false : this.c(s, sharedPreferences0, fileGroupResponse0);
        }
        List list0 = fileGroupResponse0.c;
        if(bwki0.d.size() != list0.size()) {
            return this.c(s, sharedPreferences0, fileGroupResponse0);
        }
        for(Object object0: list0) {
            String s1 = ((MddFile)object0).a;
            for(Object object1: bwki0.d) {
                bwkh0 = (bwkh)object1;
                if(!s1.equals(bwkh0.c)) {
                    continue;
                }
                goto label_25;
            }
            bwkh0 = null;
        label_25:
            if(bwkh0 == null || !bwkh0.d.equals(((MddFile)object0).b)) {
                return this.c(s, sharedPreferences0, fileGroupResponse0);
            }
        }
        return false;
    }

    private final boolean c(String s, SharedPreferences sharedPreferences0, FileGroupResponse fileGroupResponse0) {
        bwne.d("%s Writing new client file group for %s", "MDDHelper", s);
        int v = (int)hucy.a.b().e();
        bwts bwts0 = this.b;
        if(bwts0.m(((long)v), false)) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glnx.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            glnx glnx0 = (glnx)hftp0.b_message;
            glnx0.b |= 1;
            glnx0.c = s;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            glnz glnz0 = (glnz)hftp1.b_message;
            glnx glnx1 = (glnx)hftp0.N_build();
            glnx1.getClass();
            glnz0.m = glnx1;
            glnz0.b |= 0x100;
            if(huae.g()) {
                bwts0.t(hftp1);
                bwts0.a.d(cdef.dI, 0x40B, hftp1);
            }
            else {
                bwts0.s(0x40B, hftp1, ((long)v));
            }
        }
        bwkg bwkg0 = (bwkg)((ProtoLiteMessage)bwki.a).v_newBuilder();
        if(!bwkg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwkg0).ensureMutable();
        }
        bwki bwki0 = (bwki)bwkg0.b_message;
        bwki0.b |= 1;
        bwki0.c = s;
        for(int v1 = 0; true; ++v1) {
            List list0 = fileGroupResponse0.c;
            if(v1 >= list0.size()) {
                break;
            }
            MddFile mddFile0 = (MddFile)list0.get(v1);
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)bwkh.a).v_newBuilder();
            String s1 = mddFile0.a;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp2.b_message;
            s1.getClass();
            ((bwkh)hftv0).b |= 1;
            ((bwkh)hftv0).c = s1;
            String s2 = mddFile0.b;
            if(!hftv0.isImmutable()) {
                hftp2.ensureMutable();
            }
            bwkh bwkh0 = (bwkh)hftp2.b_message;
            s2.getClass();
            bwkh0.b |= 2;
            bwkh0.d = s2;
            bwkg0.a(((bwkh)hftp2.N_build()));
        }
        String s3 = Base64.encodeToString(((MessageLite)(((bwki)((ProtoLiteBuilder)bwkg0).N_build()))).toBytesArray(), 3);
        return sharedPreferences0.edit().putString(s, s3).commit();
    }
}

