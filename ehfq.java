import android.accounts.Account;
import android.net.Uri;
import android.provider.ContactsContract.RawContactsEntity;
import android.text.TextUtils;

public final class ehfq {
    private final Account a;
    private final ehbp b;

    public ehfq(Account account0, ehbp ehbp0) {
        this.a = account0;
        this.b = ehbp0;
    }

    public final girv a(long v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)girv.a).v_newBuilder();
        int v1 = this.b(null, v);
        if(v1 > 0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            girv girv0 = (girv)hftp0.b_message;
            girv0.b |= 1;
            girv0.c = v1;
            int v2 = this.b(String.format("%s = 1 and %s = 1", "dirty", "deleted"), v);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            girv girv1 = (girv)hftp0.b_message;
            girv1.b |= 8;
            girv1.f = v2;
            int v3 = this.b(String.format("%s = 1 and %s is null", "dirty", "sourceid"), v);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            girv girv2 = (girv)hftp0.b_message;
            girv2.b |= 2;
            girv2.d = v3;
            int v4 = this.b(String.format("%s = 1 and %s is not null", "dirty", "sourceid"), v);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            girv girv3 = (girv)hftp0.b_message;
            girv3.b |= 4;
            girv3.e = v4;
        }
        return (girv)hftp0.N_build();
    }

    private final int b(String s, long v) {
        Uri uri0 = ehab.c(ContactsContract.RawContactsEntity.CONTENT_URI, this.a);
        StringBuilder stringBuilder0 = new StringBuilder("mimetype=\'vnd.android.cursor.item/group_membership\' AND data1=?");
        if(!TextUtils.isEmpty(s)) {
            stringBuilder0.append(" AND  (");
            stringBuilder0.append(s);
            stringBuilder0.append(")");
        }
        return ehab.a(this.b, uri0, stringBuilder0.toString(), new String[]{String.valueOf(v)});
    }
}

