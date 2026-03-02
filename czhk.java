import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.nearby.internal.connection.ParcelableOneWayMessage;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import com.google.android.gms.nearby.internal.connection.ParcelableRequest;
import com.google.android.gms.nearby.internal.connection.ParcelableResponse;

public final class czhk {
    public final ParcelablePayload a;

    public czhk() {
        this.a = new ParcelablePayload();
    }

    public final void a(byte[] arr_b) {
        this.a.c = arr_b;
    }

    public final void b(ParcelFileDescriptor parcelFileDescriptor0) {
        this.a.d = parcelFileDescriptor0;
    }

    public final void c(int v) {
        this.a.r = v;
    }

    public final void d(String s) {
        this.a.m = s;
    }

    public final void e(long v) {
        this.a.a = v;
    }

    public final void f(boolean z) {
        this.a.j = z;
    }

    public final void g(String s) {
        this.a.e = s;
    }

    public final void h(long v) {
        this.a.f = v;
    }

    public final void i(long v) {
        this.a.i = v;
    }

    public final void j(ParcelableOneWayMessage parcelableOneWayMessage0) {
        this.a.q = parcelableOneWayMessage0;
    }

    public final void k(String s) {
        this.a.n = s;
    }

    public final void l(long v) {
        this.a.l = v;
    }

    public final void m(ParcelableRequest parcelableRequest0) {
        this.a.o = parcelableRequest0;
    }

    public final void n(ParcelableResponse parcelableResponse0) {
        this.a.p = parcelableResponse0;
    }

    public final void o(int v) {
        this.a.b = v;
    }

    public final void p(Uri uri0) {
        this.a.h = uri0;
    }
}

