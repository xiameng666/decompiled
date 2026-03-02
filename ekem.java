import android.database.Cursor;
import j..util.Map.-EL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ekem implements ekcc {
    public static final ggfp a;
    public final Map b;

    static {
        bboh.b("DCU_RawContactFields", bbcu.bN);
        ekem.a = ggfp.O("contact_id", "_id", "account_name", "account_type", "sourceid", "dirty", new String[]{"starred", "sync1", "sync2", "sync3", "sync4"});
    }

    public ekem() {
        this.b = new HashMap();
    }

    @Override  // ekcc
    public final ggfp a() {
        return ekem.a;
    }

    @Override  // ekcc
    public final void b(Cursor cursor0) {
        himd himd0;
        int v12;
        ekem ekem0;
        int v = cursor0.getColumnCount();
        int v1 = cursor0.getColumnIndex("contact_id");
        batl.p(v1, v, "ContactId index not found.");
        long v2 = cursor0.getLong(v1);
        int v3 = cursor0.getColumnIndex("_id");
        batl.p(v3, v, "RawContactId index not found.");
        long v4 = cursor0.getLong(v3);
        int v5 = cursor0.getColumnIndex("account_name");
        batl.p(v5, v, "AccountName index not found.");
        String s = cursor0.getString(v5);
        int v6 = cursor0.getColumnIndex("account_type");
        batl.p(v6, v, "AccountType index not found.");
        String s1 = cursor0.getString(v6);
        int v7 = cursor0.getColumnIndex("sourceid");
        batl.p(v7, v, "SourceId index not found.");
        String s2 = cursor0.getString(v7);
        int v8 = cursor0.getColumnIndex("dirty");
        batl.p(v8, v, "isDirty index not found.");
        int v9 = cursor0.getInt(v8);
        int v10 = cursor0.getColumnIndex("starred");
        batl.p(v10, v, "Starred id index not found.");
        int v11 = cursor0.getInt(v10);
        if(s1 != null && s1.equals("com.google")) {
            ekem0 = this;
            v12 = v11;
            himd0 = null;
        }
        else {
            int v13 = cursor0.getColumnCount();
            int v14 = cursor0.getColumnIndex("sourceid");
            batl.p(v14, v13, "Source Id index not found.");
            String s3 = cursor0.getString(v14);
            int v15 = cursor0.getColumnIndex("sync1");
            batl.p(v15, v13, "SYNC1 index not found.");
            String s4 = cursor0.getString(v15);
            int v16 = cursor0.getColumnIndex("sync2");
            batl.p(v16, v13, "SYNC2 index not found.");
            String s5 = cursor0.getString(v16);
            int v17 = cursor0.getColumnIndex("sync3");
            batl.p(v17, v13, "SYNC3 index not found.");
            String s6 = cursor0.getString(v17);
            int v18 = cursor0.getColumnIndex("sync4");
            v12 = v11;
            batl.p(v18, v13, "SYNC4 index not found.");
            String s7 = cursor0.getString(v18);
            if(s3 == null && s4 == null && s5 == null && s6 == null && s7 == null) {
                himd0 = null;
            }
            else {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)himd.a).v_newBuilder();
                if(s3 != null) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    himd himd1 = (himd)hftp0.b_message;
                    himd1.b |= 1;
                    himd1.c = s3;
                }
                if(s4 != null) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    himd himd2 = (himd)hftp0.b_message;
                    himd2.b |= 2;
                    himd2.d = s4;
                }
                if(s5 != null) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    himd himd3 = (himd)hftp0.b_message;
                    himd3.b |= 4;
                    himd3.e = s5;
                }
                if(s6 != null) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    himd himd4 = (himd)hftp0.b_message;
                    himd4.b |= 8;
                    himd4.f = s6;
                }
                if(s7 != null) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    himd himd5 = (himd)hftp0.b_message;
                    himd5.b |= 16;
                    himd5.g = s7;
                }
                himd0 = (himd)hftp0.N_build();
            }
            ekem0 = this;
        }
        ekeg ekeg0 = new ekeg();
        ekek ekek0 = new ekek();
        ekek0.b = v2;
        ekek0.a = v4;
        ekek0.c = s;
        ekek0.d = s1;
        ekek0.e = s2;
        ekek0.f = v9;
        ekek0.g = v12;
        ekek0.j = 15;
        ekek0.h = himd0;
        ((List)Map.-EL.computeIfAbsent(ekem0.b, Long.valueOf(v2), ekeg0)).add(ekek0);
    }
}

