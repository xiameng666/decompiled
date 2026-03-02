import android.content.ContentResolver;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class ucb extends ubx {
    private static final UriMatcher b;

    static {
        UriMatcher uriMatcher0 = new UriMatcher(-1);
        ucb.b = uriMatcher0;
        uriMatcher0.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher0.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher0.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher0.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher0.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher0.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public ucb(ContentResolver contentResolver0, Uri uri0, boolean z) {
        super(contentResolver0, uri0, z);
    }

    @Override  // ubl
    public final Class a() {
        return InputStream.class;
    }

    @Override  // ubx
    protected final Object b(Uri uri0, ContentResolver contentResolver0) {
        Object object0;
        switch(ucb.b.match(uri0)) {
            case 3: {
                object0 = ucb.h(contentResolver0, uri0);
                break;
            }
            case 1: 
            case 5: {
                Uri uri1 = ContactsContract.Contacts.lookupContact(contentResolver0, uri0);
                if(uri1 == null) {
                    throw new FileNotFoundException("Contact cannot be found");
                }
                object0 = ucb.h(contentResolver0, uri1);
                break;
            }
            default: {
                if(this.a && ucc.c(uri0) && ucc.b()) {
                    AssetFileDescriptor assetFileDescriptor0 = ucc.a(uri0, contentResolver0);
                    if(assetFileDescriptor0 != null) {
                        try {
                            object0 = assetFileDescriptor0.createInputStream();
                            break;
                        }
                        catch(IOException iOException0) {
                            try {
                                assetFileDescriptor0.close();
                            }
                            catch(Exception unused_ex) {
                            }
                            throw (FileNotFoundException)new FileNotFoundException("Unable to create stream").initCause(iOException0);
                        }
                    }
                    throw new FileNotFoundException("FileDescriptor is null for: " + uri0);
                }
                else {
                    object0 = contentResolver0.openInputStream(uri0);
                }
            }
        }
        if(object0 != null) {
            return object0;
        }
        throw new FileNotFoundException("InputStream is null for " + uri0);
    }

    @Override  // ubx
    protected final void c(Object object0) {
        ((InputStream)object0).close();
    }

    private static final InputStream h(ContentResolver contentResolver0, Uri uri0) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver0, uri0, true);
    }
}

