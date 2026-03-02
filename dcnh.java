import android.os.Bundle;
import android.os.Messenger;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.StreamAttachment;

public final class dcnh extends dbvl {
    public long a;
    public ParcelFileDescriptor b;
    public ParcelFileDescriptor c;
    public Messenger d;
    public String e;
    public String f;
    private final String g;

    public dcnh(String s) {
        this.g = s;
    }

    public final StreamAttachment a() {
        batl.c(this.g != null, "StreamAttachment must have a description.");
        return new StreamAttachment(this.g, this.a, new Bundle(), this.b, this.c, this.d, this.e, this.f);
    }

    @Override  // dbvl
    public final Attachment b() {
        return this.a();
    }

    @Override  // dbvl
    public final void d(long v) {
        this.a = v;
    }
}

