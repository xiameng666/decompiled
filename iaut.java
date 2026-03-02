import j..util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

final class iaut extends iavq {
    final ibfp a;
    final iauw b;

    public iaut(iauw iauw0, ibfp ibfp0) {
        this.a = ibfp0;
        Objects.requireNonNull(iauw0);
        this.b = iauw0;
        super(iauw0.c.e);
    }

    @Override  // iavq
    public final void a() {
        byte[] arr_b1;
        hfsl hfsl0;
        Object object0;
        InputStream inputStream0;
        iauw iauw0 = this.b;
        iaux iaux0 = iauw0.c;
        if(iauw0.b == null) {
            while(true) {
                try {
                label_3:
                    inputStream0 = this.a.f();
                    if(inputStream0 != null) {
                        goto label_5;
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_60;
                }
                try {
                label_5:
                    iaku iaku0 = iauw0.a;
                    gRPCMarshaller iaoh0 = iaux0.b.responseMarshaller_;
                    if((inputStream0 instanceof ibjg)) {
                        ibjg ibjg0 = (ibjg)inputStream0;
                        if(ibjg0.b == ((ibjh)iaoh0).b) {
                            try {
                                object0 = ibjg0.a;
                                if(object0 == null) {
                                    throw new IllegalStateException("message not available");
                                }
                            }
                            catch(IllegalStateException unused_ex) {
                                goto label_13;
                            }
                        }
                        else {
                            goto label_13;
                        }
                    }
                    else {
                        try {
                        label_13:
                            hfsl0 = null;
                            if((inputStream0 instanceof iamr)) {
                                int v = inputStream0.available();
                                if(v > 0 && v <= 0x400000) {
                                    ThreadLocal threadLocal0 = ibjh.a;
                                    Reference reference0 = (Reference)threadLocal0.get();
                                    if(reference0 != null) {
                                        byte[] arr_b = (byte[])reference0.get();
                                        if(arr_b != null && arr_b.length >= v) {
                                            arr_b1 = arr_b;
                                            goto label_26;
                                        }
                                    }
                                    arr_b1 = new byte[v];
                                    threadLocal0.set(new WeakReference(arr_b1));
                                label_26:
                                    int v1;
                                    for(v1 = v; v1 > 0; v1 -= v2) {
                                        int v2 = inputStream0.read(arr_b1, v - v1, v1);
                                        if(v2 == -1) {
                                            break;
                                        }
                                    }
                                    if(v1 != 0) {
                                        throw new RuntimeException("size inaccurate: " + v + " != " + (v - v1));
                                    }
                                    hfsl0 = hfsl.X(arr_b1, v);
                                }
                                else if(v == 0) {
                                    object0 = ((ibjh)iaoh0).c;
                                    goto label_52;
                                }
                            }
                        }
                        catch(IOException iOException0) {
                            throw new RuntimeException(iOException0);
                        }
                        if(hfsl0 == null) {
                            hfsl0 = hfsl.N(inputStream0);
                        }
                        hfsl0.e = 0x7FFFFFFF;
                        try {
                            object0 = ((ibjh)iaoh0).b.n(hfsl0, ibjj.a);
                        }
                        catch(hfur hfur0) {
                            throw new iapn(iapk.p.f("Invalid protobuf byte sequence").e(hfur0));
                        }
                        try {
                            hfsl0.z(0);
                            goto label_52;
                        }
                        catch(hfur hfur1) {
                            try {
                                hfur1.a = object0;
                                throw hfur1;
                            }
                            catch(hfur hfur0) {
                            }
                        }
                        throw new iapn(iapk.p.f("Invalid protobuf byte sequence").e(hfur0));
                    }
                label_52:
                    iaku0.c(object0);
                    goto label_57;
                }
                catch(Throwable throwable1) {
                    try {
                        iayh.h(inputStream0);
                        throw throwable1;
                    label_57:
                        inputStream0.close();
                        goto label_3;
                    }
                    catch(Throwable throwable0) {
                    }
                }
            label_60:
                iayh.g(this.a);
                iapk iapk0 = iapk.c.e(throwable0).f("Failed to read message.");
                this.b.b(iapk0);
                break;
            }
            return;
        }
        iayh.g(this.a);
    }
}

