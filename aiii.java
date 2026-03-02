import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public final class aiii {
    private final Context a;

    public aiii(Context context0) {
        this.a = context0;
    }

    public final hhts a(String s) {
        byte[] arr_b = aiii.b(s);
        byte[] arr_b1 = aiii.c(arr_b);
        try {
            return aihk.d(this.a, arr_b, arr_b1).a;
        }
        catch(InterruptedException | ExecutionException | TimeoutException exception0) {
            throw new aiih(exception0);
        }
    }

    public static byte[] b(String s) {
        if(TextUtils.isEmpty(s)) {
            throw new aiih("Received a server message with empty KEY_PAYLOAD", 5);
        }
        byte[] arr_b = bbmu.f(s);
        if(arr_b.length != 0) {
            return arr_b;
        }
        throw new aiih("Invalid base64 encoding", 6);
    }

    public static byte[] c(byte[] arr_b) {
        arr_b.getClass();
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hhvf.a), arr_b, 0, arr_b.length, hftc.a);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        byte[] arr_b1 = hhuu.a(((hhvf)hftv0)).e.toByteArray();
        if(arr_b1.length != 0) {
            return arr_b1;
        }
        throw new aiih("Missing key handle", 7);
    }
}

