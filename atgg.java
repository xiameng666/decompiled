import android.app.backup.BackupDataInput;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public final class atgg {
    public final gged_interceptors a;
    public final araq b;

    public atgg(BackupDataInput backupDataInput0, araq araq0, arad arad0, atgd atgd0) {
        gftb.check(araq0);
        gfsx gfsx0;
        gftb.check(arad0);
        ggdy ggdy0 = new ggdy();
        HashMap hashMap0 = new HashMap();
        for(Object object0: araq0.b) {
            hashMap0.put(((arap)object0).c, new athu(((arap)object0).d.toByteArray()));
        }
        athv athv0 = athv.a(arad0);
        ggdy ggdy1 = new ggdy();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        while(backupDataInput0.readNextHeader()) {
            String s = backupDataInput0.getKey();
            if(backupDataInput0.getDataSize() < 0) {
                gfsx0 = gfqx.a;
            }
            else {
                int v = backupDataInput0.getDataSize();
                byte[] arr_b = new byte[v];
                for(int v1 = 0; v1 < v; v1 += backupDataInput0.readEntityData(arr_b, v1, v - v1)) {
                }
                gfsx0 = gfsx.m(arr_b);
            }
            linkedHashMap0.put(s, gfsx0);
        }
        for(Object object1: linkedHashMap0.entrySet()) {
            String s1 = (String)((Map.Entry)object1).getKey();
            gfsx gfsx1 = (gfsx)((Map.Entry)object1).getValue();
            hashMap0.remove(s1);
            if(gfsx1.i()) {
                byte[] arr_b1 = (byte[])gfsx1.d();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)arar.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                arar arar0 = (arar)hftp0.b_message;
                s1.getClass();
                arar0.b |= 1;
                arar0.c = s1;
                ByteString hfsf0 = ByteString.copyFrom(arr_b1);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                arar arar1 = (arar)hftp0.b_message;
                arar1.b |= 2;
                arar1.d = hfsf0;
                atjy atjy0 = atjy.b(new atjv(((arar)hftp0.N_build()).toBytesArray()), atgd0);
                ggdy1.i(atjy0);
                aths.a(s1, atjy0.a, ggdy0);
            }
        }
        for(Object object2: hashMap0.values()) {
            gftb.f(athv0.c(((athu)object2)), "chunk not found in old listing: %s", ((athu)object2));
            atlc atlc0 = athv0.b(((athu)object2));
            gftb.check(atlc0);
            ggdy1.i(new atjy(((athu)object2), atlc0));
        }
        this.a = ggdy1.h();
        for(Object object3: hashMap0.entrySet()) {
            aths.a(((String)((Map.Entry)object3).getKey()), ((athu)((Map.Entry)object3).getValue()), ggdy0);
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)araq.a).v_newBuilder();
        gged_interceptors gged0 = ggdy0.h();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        araq araq1 = (araq)hftp1.b_message;
        hfuo hfuo0 = araq1.b;
        if(!hfuo0.c()) {
            araq1.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(gged0, araq1.b);
        this.b = (araq)hftp1.N_build();
    }
}

