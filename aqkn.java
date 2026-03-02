import android.content.Context;
import android.net.Uri;
import j..time.Instant;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public final class aqkn {
    public static final baun a;
    public final gmcg b;
    public final frli c;
    private final Context d;

    static {
        aqkn.a = aqql.a("BackupRecords");
    }

    public aqkn(Context context0) {
        ibuq.f(context0, "context");
        super();
        this.d = context0;
        frce frce0 = new frce(context0);
        frce0.d("backup");
        frce0.e("backup_records.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)aqdq.a));
        frie0.h(new frjp(cjtd.a));
        frif frif0 = frie0.a();
        frli frli0 = cjtb.a.a(frif0);
        ibuq.e(frli0, "getOrCreate(...)");
        this.c = frli0;
        this.b = new bblp(1, 10);
    }

    public static final aqdq a(aqdq aqdq0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)aqdq0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)aqdq0));
        aqds aqds0 = aqdr.a(hftp0);
        Instant instant0 = Instant.now().minusMillis(hqgx.a.c().b());
        ibuq.e(instant0, "minusMillis(...)");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: aqds0.b().b()) {
            String s = (String)((Map.Entry)object0).getKey();
            aqhv aqhv0 = (aqhv)((Map.Entry)object0).getValue();
            aqhx aqhx0 = aqhw.a(((ProtoLiteMessage)aqhv.a).v_newBuilder());
            aqhx0.c();
            hfuo hfuo0 = aqhv0.b;
            ibuq.e(hfuo0, "getBackupRecordsList(...)");
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: hfuo0) {
                if(Instant.ofEpochMilli(((aqep)object1).c).isAfter(instant0)) {
                    arrayList0.add(object1);
                }
            }
            ProtoLiteBuilder hftp1 = aqhx0.a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            aqhv aqhv1 = (aqhv)hftp1.b_message;
            aqhv1.b();
            hfrj.E(arrayList0, aqhv1.b);
            aqhv aqhv2 = aqhx0.a();
            hfuo hfuo1 = aqhv2.b;
            ibuq.e(hfuo1, "getBackupRecordsList(...)");
            if(!hfuo1.isEmpty()) {
                linkedHashMap0.put(s, aqhv2);
            }
        }
        aqds0.b();
        ProtoLiteBuilder hftp2 = aqds0.a;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((aqdq)hftp2.b_message).b().clear();
        aqds0.b();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((aqdq)hftp2.b_message).b().putAll(linkedHashMap0);
        return aqds0.a();
    }
}

