import android.accounts.Account;
import android.content.ContentProviderOperation.Builder;
import android.content.ContentProviderOperation;
import android.content.ContentUris;
import android.net.Uri;
import android.provider.ContactsContract.RawContacts;

public final class ehad extends ehac {
    public final ehbp c;
    public final ehim d;

    public ehad(Account account0, boolean z, ehbp ehbp0, ehbo ehbo0, ehim ehim0) {
        super(ehab.d(ContactsContract.RawContacts.CONTENT_URI, account0, z), ehbo0, ehim0);
        this.c = ehbp0;
        this.d = ehim0;
    }

    @Override  // ehac
    public final void m(Long long0) {
        this.i(this.a, long0);
    }

    public final void p(Long long0) {
        this.k(this.a, long0, true);
    }

    public final void q(egzv egzv0, egzv egzv1, int v) {
        Long long0 = egzv0.d;
        batl.s(long0);
        if(v == 2) {
            ContentProviderOperation.Builder contentProviderOperation$Builder0 = ContentProviderOperation.newAssertQuery(ContentUris.withAppendedId(this.a, long0.longValue()));
            this.b.a(contentProviderOperation$Builder0.withValue("dirty", Integer.valueOf(((int)egzv0.g))).withExpectedCount(1), false);
        }
        else if(v == 1) {
            this.h(this.a, long0.longValue(), egzv0.f);
        }
        Uri uri0 = this.a;
        this.b.a(ContentProviderOperation.newAssertQuery(ContentUris.withAppendedId(uri0, long0.longValue())).withValue("starred", Integer.valueOf(((int)egzv0.i))).withExpectedCount(1), false);
        this.e(uri0, long0, egzv1.a(), false);
    }
}

