import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.auth.cryptauth.KeyRegistrationResult;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.List;
import jeb.synthetic.FIN;

public final class ajkb extends cjtm {
    private final ajhy a;
    private final int b;
    private final List c;
    private final String d;
    private final Account e;
    private final List f;
    private final byte[] g;
    private static final baun h;

    static {
        ajkb.h = new baun(new String[]{"RegisterForKeyPairOperation"}, null);
    }

    public ajkb(ajhy ajhy0, int v, List list0, String s, Account account0, List list1, byte[] arr_b, azug azug0) {
        super(0x81, "RegisterForKeyPairOperation", azug0);
        this.a = ajhy0;
        this.b = v;
        this.c = list0;
        this.d = s;
        this.e = account0;
        this.f = list1;
        this.g = arr_b;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        long v4;
        ygm ygm0;
        gquw gquw0;
        int v;
        SQLiteDatabase sQLiteDatabase0;
        List list1;
        String s;
        List list0;
        ajjd ajjd0 = new ajjd(context0, this.b, this.c, this.d, this.e, this.f, this.g, null, null, null);
        try {
            ajjd0.j.h("ClientName calling Cryptauth is %s", new Object[]{ajjd0.c});
            list0 = ajjd0.e;
            s = ajjd0.d.name;
            if(list0 == null || list0.isEmpty()) {
                ajfq.b.d("Null/empty keyMetadataList.", new Object[0]);
                goto label_25;
            }
            list1 = ajjd0.b;
            batl.q(s);
            batl.c(list1.size() == list0.size(), "KeyNameList and keyMetadataList size don\'t match");
            ajfo ajfo0 = ajfo.c(ajjd0.g.a);
            try {
                sQLiteDatabase0 = ajfo0.getWritableDatabase();
            }
            catch(SQLiteException sQLiteException0) {
                ajfq.b.g("Failed to upload keyMetadata to db", sQLiteException0, new Object[0]);
                goto label_25;
            }
            sQLiteDatabase0.beginTransaction();
            v = 0;
            int v1 = FIN.finallyOpen$NT();
            while(true) {
            label_19:
                if(v >= list1.size()) {
                    sQLiteDatabase0.setTransactionSuccessful();
                    FIN.finallyCodeBegin$NT(v1);
                label_25:
                    byte[] arr_b = ajjd0.f;
                    if(arr_b != null) {
                        try {
                            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gqux.a), arr_b, 0, arr_b.length, hftc.a);
                            ProtoLiteMessage.P_makeImmutable(hftv0);
                            switch(((gqux)hftv0).b) {
                                case 0: {
                                    gquw0 = gquw.a;
                                    break;
                                }
                                case 1: {
                                    gquw0 = gquw.b;
                                    break;
                                }
                                case 2: {
                                    gquw0 = gquw.c;
                                    break;
                                }
                                case 3: {
                                    gquw0 = gquw.d;
                                    break;
                                }
                                case 4: {
                                    gquw0 = gquw.e;
                                    break;
                                }
                                default: {
                                    gquw0 = null;
                                }
                            }
                            if(gquw0 == null) {
                                gquw0 = gquw.f;
                            }
                            ajjd0.g.f(ajjd0.d.name, gquw0, arr_b);
                        }
                        catch(hfur unused_ex) {
                            ajjd0.j.m("Unable to parse featureMetadata. Not adding to db.", new Object[0]);
                        }
                    }
                    if(hptm.a.b().b()) {
                        ajfq ajfq0 = ajjd0.g;
                        Account account0 = ajjd0.d;
                        gquw gquw1 = gquw.d;
                        if(ajfq0.g(account0.name, gquw1) == null) {
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqux.a).v_newBuilder();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gqux gqux0 = (gqux)hftp0.b_message;
                            gqux0.b = gquw1.a();
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqvc.a).v_newBuilder();
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ((gqvc)hftp1.b_message).b = 0L;
                            ByteString hfsf0 = ((gqvc)hftp1.N_build()).getDefaultInstanceForType();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gqux)hftp0.b_message).c = hfsf0;
                            gqux gqux1 = (gqux)hftp0.N_build();
                            ajfq0.f(account0.name, gquw1, gqux1.toBytesArray());
                        }
                    }
                    String s1 = ajjd0.c;
                    gfud gfud0 = ajjd.a;
                    if(gfud0.d().n(hpsx.a.b().a()).contains(s1)) {
                        ygk ygk1 = new ygk();
                        ygk1.a = ygl.o;
                        ygm0 = ygk1.a();
                    }
                    else {
                        gfud gfud1 = gfud0.d();
                        hpta hpta0 = hpta.a;
                        if(gfud1.n(hpta0.g().l()).contains(s1)) {
                            ygm0 = ajjd0.a(ajjd0.b);
                        }
                        else {
                            ajjd0.i.a(ajjd0.d.name, ajjd0.b);
                            String s2 = String.valueOf(ajjd0.d.name);
                            long v2 = hpta0.g().h();
                            long v3 = v2 + hpta0.g().i();
                            ajjd0.h.b.d("schedule enrollment for delayed keys : start=%d, end=%d", new Object[]{v2, v3});
                            ajjd0.h.b("NonImmediateTag_" + s2, ajjd0.d.name, ajje.a, v2, v3, false);
                            ygk ygk0 = new ygk();
                            ygk0.a = ygl.c;
                            ygm0 = ygk0.a();
                        }
                    }
                    break;
                }
                goto label_91;
            }
        }
        catch(ygj ygj0) {
            goto label_112;
        }
        KeyRegistrationResult keyRegistrationResult0 = new KeyRegistrationResult(ajjp.a(ygm0.a), null, null);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.R);
        this.a.b(keyRegistrationResult0, apiMetadata0);
        return;
        try {
        label_91:
            String s3 = (String)list1.get(v);
            byte[] arr_b1 = (byte[])list0.get(v);
            if(arr_b1 != null && arr_b1.length > 0) {
                ajfq.b.d("Updating keyMetadata for key=%s", new Object[]{s3});
                ContentValues contentValues0 = new ContentValues();
                ajfq.d(contentValues0, s);
                contentValues0.put("identifier", "key_" + s3);
                ajfq.e(contentValues0, arr_b1);
                if(hptp.c()) {
                    try {
                        v4 = sQLiteDatabase0.insertWithOnConflict("metadata", null, contentValues0, 5);
                    }
                    catch(SQLiteException sQLiteException1) {
                        ajfq.b.g("Failed to update key metadata", sQLiteException1, new Object[0]);
                        v4 = -1L;
                    }
                }
                else {
                    v4 = sQLiteDatabase0.insertWithOnConflict("metadata", null, contentValues0, 5);
                }
                if(v4 < 0L) {
                    ajfq.b.f("Failed to insert keyMetadata for key=%s", new Object[]{s3});
                }
            }
            ++v;
            goto label_19;
        }
        catch(ygj ygj0) {
        label_112:
            ajkb.h.n("Failed to perform enrollment. StatusCode=" + ygj0.a.toString(), ygj0, new Object[0]);
            Status status0 = ajjp.a(ygj0.a);
            this.a.a(status0, ApiMetadata.b);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, ApiMetadata.b);
    }
}

