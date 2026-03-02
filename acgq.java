import android.os.Parcel;
import android.os.UserHandle;
import com.google.android.gms.appsearch.AppSearchSchema;
import com.google.android.gms.appsearch.aidl.AppSearchAttributionSource;
import com.google.android.gms.appsearch.safeparcel.GenericDocumentParcel;
import j..util.Objects;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Set;

public final class acgq implements Closeable {
    public final AppSearchAttributionSource a;
    public final String b;
    public final UserHandle c;
    public final File d;
    public final File e;
    public int f;
    public final acjk g;
    private final Set h;

    public acgq(acjk acjk0, UserHandle userHandle0, AppSearchAttributionSource appSearchAttributionSource0, String s, Set set0, File file0) {
        this.f = 0;
        this.g = (acjk)Objects.requireNonNull(acjk0);
        this.c = (UserHandle)Objects.requireNonNull(userHandle0);
        this.a = (AppSearchAttributionSource)Objects.requireNonNull(appSearchAttributionSource0);
        this.b = (String)Objects.requireNonNull(s);
        this.d = file0;
        this.e = File.createTempFile("appsearch", null, file0);
        this.h = new bxf(set0.size());
        for(Object object0: set0) {
            this.h.add(((AppSearchSchema)object0).a);
        }
    }

    public final void a(File file0, achs achs0, int v, int v1, ackk ackk0) {
        achh achh0;
        try(DataInputStream dataInputStream0 = new DataInputStream(new FileInputStream(file0)); DataOutputStream dataOutputStream0 = new DataOutputStream(new FileOutputStream(this.e, true))) {
            while(true) {
                try {
                    int v2 = dataInputStream0.readInt();
                    if(v2 == 0) {
                        throw new EOFException();
                    }
                    byte[] arr_b = new byte[v2];
                    dataInputStream0.read(arr_b);
                    Parcel parcel0 = Parcel.obtain();
                    try {
                        parcel0.unmarshall(arr_b, 0, v2);
                        parcel0.setDataPosition(0);
                        achh0 = new achh(((GenericDocumentParcel)GenericDocumentParcel.CREATOR.createFromParcel(parcel0)));
                    }
                    finally {
                        parcel0.recycle();
                    }
                }
                catch(EOFException unused_ex) {
                    ackk0.i = this.f;
                    return;
                }
                if(v < v1) {
                    afa afa0 = aje.a(achh0);
                    afa afa1 = achs0.a.b();
                    if(!afa0.equals(afa1)) {
                        achh0 = aje.b(afa1);
                    }
                }
                else {
                    afa afa2 = aje.a(achh0);
                    afa afa3 = achs0.a.a();
                    if(!afa2.equals(afa3)) {
                        achh0 = aje.b(afa3);
                    }
                }
                ++this.f;
                if(!this.h.contains(achh0.g())) {
                    throw new acjx(7, "Receive a migrated document with schema type: " + achh0.g() + ". But the schema types doesn\'t exist in the request");
                }
                Parcel parcel1 = Parcel.obtain();
                try {
                    ackd.a(achh0.a, parcel1);
                    byte[] arr_b1 = parcel1.marshall();
                    dataOutputStream0.writeInt(arr_b1.length);
                    dataOutputStream0.write(arr_b1);
                }
                finally {
                    parcel1.recycle();
                }
            }
        }
    }

    @Override
    public final void close() {
        this.e.delete();
    }
}

