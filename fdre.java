import android.os.ParcelFileDescriptor;
import j..util.Objects;
import java.util.Map;

final class fdre implements ffdl {
    final Object a;
    final fdrf b;

    public fdre(fdrf fdrf0, Object object0) {
        this.a = object0;
        Objects.requireNonNull(fdrf0);
        this.b = fdrf0;
        super();
    }

    @Override  // ffdl
    public final int a(ParcelFileDescriptor parcelFileDescriptor0, byte[] arr_b, int v, int v1) {
        throw null;
    }

    @Override  // ffdl
    public final int b(ParcelFileDescriptor parcelFileDescriptor0, byte[] arr_b, int v, int v1) {
        throw null;
    }

    @Override  // ffdl
    public final void c(ParcelFileDescriptor parcelFileDescriptor0) {
        batl.s(parcelFileDescriptor0);
        batl.c(((boolean)(((ffdm)this.b.b).a.containsKey(parcelFileDescriptor0) ^ 1)), "pfd already registered");
        ((ffdm)this.b.b).a.put(parcelFileDescriptor0, ffdk.a);
        this.b.a.put(parcelFileDescriptor0, this.a);
    }

    @Override
    public final void close() {
        this.b.b.close();
    }

    @Override  // ffdl
    public final void d(ParcelFileDescriptor parcelFileDescriptor0, ffdk ffdk0) {
        batl.s(parcelFileDescriptor0);
        batl.s(ffdk0);
        batl.c(((ffdm)this.b.b).a.containsKey(parcelFileDescriptor0), "pfd not registered");
        ((ffdm)this.b.b).a.put(parcelFileDescriptor0, ffdk0);
    }

    @Override  // ffdl
    public final void e(ParcelFileDescriptor parcelFileDescriptor0) {
        fdrf fdrf0 = this.b;
        Map map0 = fdrf0.a;
        Object object0 = map0.get(parcelFileDescriptor0);
        Object object1 = this.a;
        if(object0 != object1) {
            throw new IllegalStateException(String.format("unregister(...) on an unregistered fd. Expected <%s>, found <%s>", object1, object0));
        }
        batl.s(parcelFileDescriptor0);
        batl.c(((ffdm)fdrf0.b).a.containsKey(parcelFileDescriptor0), "pfd not registered");
        ((ffdm)fdrf0.b).a.remove(parcelFileDescriptor0);
        map0.remove(parcelFileDescriptor0);
    }

    @Override  // ffdl
    public final void f() {
        throw null;
    }

    @Override  // ffdl
    public final boolean g() {
        throw null;
    }
}

