import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.ContactsContract.RawContacts;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jeb.synthetic.TWR;

public final class arqn extends arqo {
    public static final aqql a;
    public final aqrx b;

    static {
        arqn.a = new aqql(new String[]{"ContactsFlavorHandler"});
    }

    public arqn(aqrx aqrx0) {
        this.b = aqrx0;
    }

    @Override  // arqo
    public final File a(asby asby0) {
        throw new IOException("Contacts flavor should not use file payload ");
    }

    @Override  // arqo
    public final InputStream b(asby asby0) {
        return new arrh(new arqm(this));
    }

    @Override  // arqo
    public final List c() {
        grow grow2;
        int v2;
        grol grol0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)asby.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        asby asby0 = (asby)hftp0.b_message;
        asby0.b |= 1;
        asby0.e = "contacts";
        try {
            Context context0 = this.b.b;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grol.a).v_newBuilder();
            if(aqrx.e(context0)) {
                ContentResolver contentResolver0 = context0.getContentResolver();
                aqrv.c = aqsa.a(context0);
                HashMap hashMap0 = new HashMap();
                try(Cursor cursor0 = contentResolver0.query(ContactsContract.RawContacts.CONTENT_URI, aqrv.b, null, null, null)) {
                    if(cursor0 == null) {
                        TWR.useResource$NT(null);
                        aqrv.a.m("Could not query ContactsProvider to fetch RawContacts; disabled? Give up.", new Object[0]);
                        throw new aqry("Raw contacts query cursor is null");
                    }
                    while(true) {
                        if(!cursor0.moveToNext()) {
                            break;
                        }
                        String s = cursor0.getString(cursor0.getColumnIndex("account_type"));
                        if("com.google".equals(s)) {
                            aqrv.a(hashMap0, "google");
                        }
                        else if(aqrv.c.contains(s)) {
                        }
                        else if(s != null && s.matches(".*sim.*|.*SIM.*")) {
                            aqrv.a(hashMap0, "sim");
                        }
                        else {
                            aqrv.a(hashMap0, "local");
                        }
                    }
                    Iterator iterator0 = hashMap0.keySet().iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            break;
                        }
                        Object object0 = iterator0.next();
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grow.a).v_newBuilder();
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        grow grow0 = (grow)hftp2.b_message;
                        ((String)object0).getClass();
                        grow0.b = (String)object0;
                        int v = (int)(((Integer)hashMap0.get(((String)object0))));
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((grow)hftp2.b_message).c = v;
                        grow grow1 = (grow)hftp2.N_build();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        grol grol1 = (grol)hftp1.b_message;
                        grow1.getClass();
                        hfuo hfuo0 = grol1.b;
                        if(!hfuo0.c()) {
                            grol1.b = ProtoLiteMessage.E(hfuo0);
                        }
                        grol1.b.add(grow1);
                    }
                }
                catch(SQLiteException sQLiteException0) {
                    aqrv.a.g("ContentResolver.query threw an exception when fetching raw-contacts.", sQLiteException0, new Object[0]);
                    throw new aqrz("Fetching raw contacts query failed." + sQLiteException0.toString());
                }
            }
            else {
                aqrv.a.m("Doesn\'t have READ_CONTACTS permission, give up reading contacts metadata.", new Object[0]);
            }
            grol0 = (grol)hftp1.N_build();
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: grol0.b) {
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)asbe.a).v_newBuilder();
                String s1 = ((grow)object1).b;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp3.b_message;
                s1.getClass();
                ((asbe)hftv0).b |= 1;
                ((asbe)hftv0).c = s1;
                int v1 = ((grow)object1).c;
                if(!hftv0.isImmutable()) {
                    hftp3.ensureMutable();
                }
                asbe asbe0 = (asbe)hftp3.b_message;
                asbe0.b |= 2;
                asbe0.d = v1;
                arrayList0.add(((asbe)hftp3.N_build()));
            }
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)asbf.a).v_newBuilder();
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            asbf asbf0 = (asbf)hftp4.b_message;
            hfuo hfuo1 = asbf0.b;
            if(!hfuo1.c()) {
                asbf0.b = ProtoLiteMessage.E(hfuo1);
            }
            hfrj.E(arrayList0, asbf0.b);
            asbf asbf1 = (asbf)hftp4.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            asby asby1 = (asby)hftp0.b_message;
            asbf1.getClass();
            asby1.d = asbf1;
            asby1.c = 101;
            v2 = 0;
            Iterator iterator2 = grol0.b.iterator();
            while(true) {
            label_114:
                if(!iterator2.hasNext()) {
                    goto label_124;
                }
                Object object2 = iterator2.next();
                grow2 = (grow)object2;
                if("local".equals(grow2.b) || "sim".equals(grow2.b)) {
                    break;
                }
            }
        }
        catch(aqrz | aqry exception0) {
            arqn.a.g("Unable to fetch contacts", exception0, new Object[0]);
            return ggna.a;
        }
        v2 += grow2.c;
        goto label_114;
    label_124:
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        asby asby2 = (asby)hftp0.b_message;
        asby2.b |= 2;
        asby2.f = ((long)v2) * 0x1000L;
        return gged_interceptors.l(((asby)hftp0.N_build()));
    }

    @Override  // arqo
    public final void d(asby asby0, InputStream inputStream0) {
        bbpb.b(inputStream0);
    }
}

