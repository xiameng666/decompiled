import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.libraries.commerce.hce.ndef.Primitive;
import com.google.android.libraries.commerce.hce.ndef.Text;
import java.util.Calendar;
import java.util.Set;
import java.util.concurrent.Callable;

public final class dvnr implements Callable {
    public final dvnt a;
    public final fgwt b;
    public final Set c;

    public dvnr(dvnt dvnt0, fgwt fgwt0, Set set0) {
        this.a = dvnt0;
        this.b = fgwt0;
        this.c = set0;
    }

    @Override
    public final Object call() {
        gfsx gfsx0 = gfqx.a;
        Calendar calendar0 = Calendar.getInstance();
        calendar0.setTimeInMillis(System.currentTimeMillis());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtle.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hjih.a).v_newBuilder();
        int v = calendar0.get(1);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hjih)hftp1.b_message).b = v;
        int v1 = calendar0.get(2) + 1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hjih)hftp1.b_message).c = v1;
        int v2 = calendar0.get(5);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hjih)hftp1.b_message).d = v2;
        hjih hjih0 = (hjih)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtle gtle0 = (gtle)hftp0.b_message;
        hjih0.getClass();
        gtle0.c = hjih0;
        gtle0.b |= 1;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hjio.a).v_newBuilder();
        int v3 = calendar0.get(11);
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((hjio)hftp2.b_message).b = v3;
        int v4 = calendar0.get(12);
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((hjio)hftp2.b_message).c = v4;
        int v5 = calendar0.get(13);
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((hjio)hftp2.b_message).d = v5;
        hjio hjio0 = (hjio)hftp2.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtle gtle1 = (gtle)hftp0.b_message;
        hjio0.getClass();
        gtle1.d = hjio0;
        gtle1.b |= 2;
        hfst hfst0 = hfyf.k(calendar0.getTimeZone().getOffset(calendar0.getTimeInMillis()));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        Set set0 = this.c;
        gtle gtle2 = (gtle)hftp0.b_message;
        hfst0.getClass();
        gtle2.e = hfst0;
        gtle2.b |= 4;
        gtle gtle3 = (gtle)hftp0.N_build();
        for(Object object0: set0) {
            fgxh fgxh0 = (fgxh)object0;
            if((fgxh0 instanceof dvoh)) {
                gfsx0 = gfsx.m(fgxh0.f());
                break;
            }
        }
        for(Object object1: set0) {
            fgxh fgxh1 = (fgxh)object1;
            if((fgxh1 instanceof dvok)) {
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gvav.a).v_newBuilder();
                String s = ((dvok)fgxh1).b.b;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                gvav gvav0 = (gvav)hftp3.b_message;
                s.getClass();
                gvav0.c = s;
                ByteString hfsf0 = ByteString.copyFrom(fgxh1.d());
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp3.b_message;
                ((gvav)hftv0).d = hfsf0;
                if(!hftv0.isImmutable()) {
                    hftp3.ensureMutable();
                }
                fgwt fgwt0 = this.b;
                ProtoLiteMessage hftv1 = hftp3.b_message;
                gtle3.getClass();
                ((gvav)hftv1).f = gtle3;
                ((gvav)hftv1).b |= 1;
                long v6 = fgwt0.a;
                if(!hftv1.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((gvav)hftp3.b_message).g = v6;
                if(gfsx0.i()) {
                    ByteString hfsf1 = ByteString.copyFrom(((byte[])gfsx0.d()));
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ((gvav)hftp3.b_message).e = hfsf1;
                }
                gfsx gfsx1 = fgwt0.d;
                if(gfsx1.i()) {
                    Text text0 = (Text)gfsx1.d();
                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gvay.a).v_newBuilder();
                    String s1 = text0.d.name();
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp4.b_message;
                    s1.getClass();
                    ((gvay)hftv2).b = s1;
                    String s2 = text0.e;
                    if(!hftv2.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp4.b_message;
                    s2.getClass();
                    ((gvay)hftv3).c = s2;
                    String s3 = text0.f;
                    if(!hftv3.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    gvay gvay0 = (gvay)hftp4.b_message;
                    s3.getClass();
                    gvay0.d = s3;
                    gvay gvay1 = (gvay)hftp4.N_build();
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    gvav gvav1 = (gvav)hftp3.b_message;
                    gvay1.getClass();
                    gvav1.h = gvay1;
                    gvav1.b |= 2;
                }
                gfsx gfsx2 = fgwt0.b;
                if(gfsx2.i()) {
                    gvax gvax0 = ((Primitive)gfsx2.d()).b();
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    gvav gvav2 = (gvav)hftp3.b_message;
                    gvax0.getClass();
                    gvav2.i = gvax0;
                    gvav2.b |= 4;
                }
                gfsx gfsx3 = fgwt0.c;
                if(gfsx3.i()) {
                    gvax gvax1 = ((Primitive)gfsx3.d()).b();
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    gvav gvav3 = (gvav)hftp3.b_message;
                    gvax1.getClass();
                    gvav3.j = gvax1;
                    gvav3.b |= 8;
                }
                gvav gvav4 = (gvav)hftp3.N_build();
                try {
                    dvid dvid0 = this.a.b.b;
                    SQLiteDatabase sQLiteDatabase0 = dmhk.d(dvid0.f).c();
                    sQLiteDatabase0.beginTransaction();
                    try {
                        ByteString hfsf2;
                        for(hfsf2 = gvav4.d; dvid0.a(hfsf2.toByteArray()) != null; hfsf2 = ByteString.copyFrom(arr_b)) {
                            ((ggtj)dvid.a.i()).x("Found existing smart tap event with the same service ID, attempting to insert with a new service ID.");
                            byte[] arr_b = new byte[8];
                            dvid0.i.nextBytes(arr_b);
                        }
                        ContentValues contentValues0 = new ContentValues();
                        contentValues0.put("account_id", dvid0.g);
                        contentValues0.put("environment", dvid0.h);
                        contentValues0.put("valuable_id", gvav4.c);
                        contentValues0.put("service_id", dvid.c(hfsf2));
                        contentValues0.put("history_proto", gvav4.toBytesArray());
                        long v8 = sQLiteDatabase0.insert("SmartTapHistory", null, contentValues0);
                        sQLiteDatabase0.setTransactionSuccessful();
                    }
                    finally {
                        sQLiteDatabase0.endTransaction();
                    }
                    if(v8 != -1L) {
                        continue;
                    }
                }
                catch(dmhl dmhl0) {
                    a.ae(dvif.a.i(), "Failed to insert smart tap event.", dmhl0);
                }
                ((ggtj)dvnt.a.i()).B("Failed to insert smart tap into the database. Tap ID: %s", (gfsx0.i() ? fgzu.b(((byte[])gfsx0.d())) : "none"));
            }
        }
        return null;
    }
}

