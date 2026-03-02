import android.content.Context;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService;
import java.util.Arrays;

public final class eisl {
    public final gocn a;
    eisn b;
    hlrs c;
    private final bboh d;
    private final String e;
    private final String f;
    private final String g;

    public eisl(String s, int v, String[] arr_s, byte[] arr_b, String s1, String s2, String s3) {
        this.d = bboh.b("RegisterSyncOperation", bbcu.al);
        this.b = null;
        this.c = null;
        this.e = s1;
        this.f = s2;
        this.g = s3;
        goci goci0 = (goci)((ProtoLiteMessage)gocn.a).v_newBuilder();
        if(!goci0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)goci0).ensureMutable();
        }
        ((gocn)goci0.b_message).c = 2;
        ((gocn)goci0.b_message).d = v;
        if(!goci0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)goci0).ensureMutable();
        }
        ((gocn)goci0.b_message).m = 1;
        ((gocn)goci0.b_message).b |= 16;
        if(s != null) {
            if(!goci0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)goci0).ensureMutable();
            }
            gocn gocn0 = (gocn)goci0.b_message;
            gocn0.b |= 1;
            gocn0.g = s;
        }
        if(s3 != null) {
            if(!goci0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)goci0).ensureMutable();
            }
            ((gocn)goci0.b_message).e = 7;
            ((gocn)goci0.b_message).f = s3;
        }
        if(arr_s != null && arr_s.length > 0) {
            goci0.a(Arrays.asList(arr_s));
        }
        if(arr_b != null && arr_b.length > 0) {
            ByteString hfsf0 = ByteString.copyFrom(arr_b);
            if(!goci0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)goci0).ensureMutable();
            }
            gocn gocn1 = (gocn)goci0.b_message;
            gocn1.b |= 4;
            gocn1.k = hfsf0;
        }
        this.a = (gocn)((ProtoLiteBuilder)goci0).N_build();
    }

    public final Configurations a(Context context0, eiox eiox0) {
        String s = "";
        String s1 = this.e;
        if(s1 == null) {
            throw new eipa(29500, "No user");
        }
        if(!s1.equals("") && !eipt.a(s1, context0)) {
            throw new eipa(29500, "User not on device");
        }
        hxmk hxmk0 = hxmk.a;
        hfuo hfuo0 = hxmk0.c().l().b;
        String s2 = this.g;
        if(hfuo0.contains(s2)) {
            throw new eipa(0x734B, "Calling package in denylist for registerSync.");
        }
        gocn gocn0 = this.a;
        eisn eisn0 = eisq.b(context0, eiox0, gocn0, s1);
        this.b = eisn0;
        gnzv gnzv0 = eisn0.b;
        if(eish.a(gocn0.g, gnzv0)) {
            hlrs hlrs0 = (hlrs)((ProtoLiteMessage)hlrv.a).v_newBuilder();
            this.c = hlrs0;
            if(!hlrs0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlrs0).ensureMutable();
            }
            hlrv hlrv0 = (hlrv)hlrs0.b_message;
            s2.getClass();
            hlrv0.b |= 8;
            hlrv0.f = s2;
            eiud eiud0 = HeterodyneSyncTaskChimeraService.e(context0);
            ((ggtj)this.d.h()).B("Register sync called by %s, syncing since something changed", s2);
            if(!hxmk0.c().s() && !hxmk0.c().j().b.contains(s2)) {
                eiud0.p(gnzv0, gocn0.g, this.c);
            }
            else {
                eiud0.r(gnzv0, gocn0.g, s1, this.c);
            }
        }
        String s3 = gocn0.g;
        String s4 = this.f;
        if(gocn0.e == 7) {
            s = (String)gocn0.f;
        }
        return new eiro(s3, s1, s4, s).c(context0, eiox0);
    }
}

