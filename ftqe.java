import com.google.android.gms.pay.ProtoSafeParcelable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public final class ftqe {
    public static final ProtoSafeParcelable a(MessageLite hfvm0) {
        ibuq.f(hfvm0, "<this>");
        ProtoSafeParcelable protoSafeParcelable0 = new ProtoSafeParcelable();
        protoSafeParcelable0.a = hfvm0.toBytesArray();
        return protoSafeParcelable0;
    }

    public static final ProtoSafeParcelable b(MessageLite hfvm0) {
        ProtoSafeParcelable protoSafeParcelable0;
        ibuq.f(hfvm0, "<this>");
        byte[] arr_b = hfvm0.toBytesArray();
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(arr_b.length);
            try {
                GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(byteArrayOutputStream0);
                try {
                    gZIPOutputStream0.write(arr_b);
                    gZIPOutputStream0.close();
                    byte[] arr_b1 = byteArrayOutputStream0.toByteArray();
                    ibuq.e(arr_b1, "toByteArray(...)");
                    protoSafeParcelable0 = new ProtoSafeParcelable();
                    protoSafeParcelable0.a = arr_b1;
                }
                catch(Throwable throwable1) {
                    ibsx.a(gZIPOutputStream0, throwable1);
                    throw throwable1;
                }
                ibsx.a(gZIPOutputStream0, null);
            }
            catch(Throwable throwable0) {
                ibsx.a(byteArrayOutputStream0, throwable0);
                throw throwable0;
            }
            ibsx.a(byteArrayOutputStream0, null);
            return protoSafeParcelable0;
        }
        catch(IOException iOException0) {
            throw new IllegalArgumentException(iOException0);
        }
    }

    public static final MessageLite c(ProtoSafeParcelable protoSafeParcelable0, MessageLite hfvm0) {
        ibuq.f(protoSafeParcelable0, "<this>");
        ibuq.f(hfvm0, "defaultInstance");
        try {
            byte[] arr_b = protoSafeParcelable0.a;
            if(arr_b == null) {
                return hfvm0;
            }
            MessageLite hfvm1 = hfvm0.newBuilderForType().D(arr_b, hftc.a()).build();
            ibuq.d(hfvm1, "null cannot be cast to non-null type M of com.google.android.libraries.tapandpay.protosafeparcelable.ProtoSafeParcelables.parse");
            return hfvm1;
        }
        catch(hfur hfur0) {
            throw new IllegalArgumentException(hfur0);
        }
    }

    public static final MessageLite d(ProtoSafeParcelable protoSafeParcelable0, MessageLite hfvm0) {
        MessageLite hfvm1;
        ibuq.f(protoSafeParcelable0, "<this>");
        ibuq.f(hfvm0, "defaultInstance");
        byte[] arr_b = protoSafeParcelable0.a;
        if(arr_b != null) {
            try {
                ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
                try {
                    GZIPInputStream gZIPInputStream0 = new GZIPInputStream(byteArrayInputStream0);
                    try {
                        Builder hfvl0 = hfvm0.newBuilderForType();
                        hfvl0.L(gZIPInputStream0, hftc.a());
                        hfvm1 = hfvl0.build();
                        ibuq.d(hfvm1, "null cannot be cast to non-null type M of com.google.android.libraries.tapandpay.protosafeparcelable.ProtoSafeParcelables.parseCompacted");
                    }
                    catch(Throwable throwable1) {
                        ibsx.a(gZIPInputStream0, throwable1);
                        throw throwable1;
                    }
                    ibsx.a(gZIPInputStream0, null);
                }
                catch(Throwable throwable0) {
                    ibsx.a(byteArrayInputStream0, throwable0);
                    throw throwable0;
                }
                ibsx.a(byteArrayInputStream0, null);
                return hfvm1;
            }
            catch(IOException iOException0) {
                throw new IllegalArgumentException(iOException0);
            }
        }
        return hfvm0;
    }
}

