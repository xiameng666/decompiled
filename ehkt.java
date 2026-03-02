import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.phenotype.ExperimentTokens;
import j..util.Optional;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class ehkt {
    public static final UUID a;

    static {
        ehkt.a = new UUID(-1L, -1L);
    }

    public static Optional a(Context context0) {
        azts azts0 = new azts(context0, new faig());
        try {
            return Optional.of(((Boolean)evrg.o(azts0.cn("PERFETTO_UPLOADER"), iaby.e(), TimeUnit.MILLISECONDS)));
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            return Optional.empty();
        }
    }

    public static File b(Context context0) {
        return ehkt.d(context0, "pre_processing_trace");
    }

    public static File c(Context context0) {
        return ehkt.d(context0, "traces");
    }

    public static File d(Context context0, String s) {
        return hrnt.i() ? new File(ccsb.a.b(context0.getFilesDir(), "westworld/perfetto/" + s)) : new File(context0.getFilesDir(), "westworld/perfetto/" + s);
    }

    public static UUID e(File file0) {
        try {
            return UUID.fromString(file0.getName());
        }
        catch(IllegalArgumentException unused_ex) {
            return ehkt.a;
        }
    }

    public static boolean f(Context context0) {
        azts azts0 = new azts(context0, new faig());
        try {
            return ((Boolean)evrg.o(azts0.cn("PERFETTO_UPLOADER_IDENTIFYING"), iaby.e(), TimeUnit.MILLISECONDS)).booleanValue();
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            return false;
        }
    }

    public static hlwy g(einq einq0) {
        ExperimentTokens experimentTokens0;
        try {
            azzc azzc0 = new azzc();
            azzc0.a = new einc(einq0);
            azzc0.c = new Feature[]{eimg.c};
            azzc0.b = false;
            evql evql0 = einq0.iG(azzc0.a());
            evrg.o(evql0, iacm.a.d().d(), TimeUnit.MILLISECONDS);
            experimentTokens0 = (ExperimentTokens)evql0.j();
            ehks.b(0x20);
        }
        catch(ExecutionException | InterruptedException | TimeoutException | CancellationException unused_ex) {
            ehks.b(33);
            return hlwy.a;
        }
        if(experimentTokens0 == null) {
            return hlwy.a;
        }
        hlwx hlwx0 = (hlwx)((ProtoLiteMessage)hlwy.a).v_newBuilder();
        int[] arr_v = experimentTokens0.i;
        if(arr_v != null) {
            for(int v = 0; v < arr_v.length; ++v) {
                int v1 = arr_v[v];
                if(!hlwx0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hlwx0).ensureMutable();
                }
                hlwy hlwy0 = (hlwy)hlwx0.b_message;
                hfuf hfuf0 = hlwy0.b;
                if(!hfuf0.c()) {
                    hlwy0.b = ProtoLiteMessage.C(hfuf0);
                }
                hlwy0.b.i(v1);
            }
        }
        byte[] arr_b = experimentTokens0.d;
        if(arr_b != null && arr_b.length != 0) {
            hlwx0.a(ByteString.copyFrom(arr_b));
        }
        byte[][][] arr3_b = {experimentTokens0.j, experimentTokens0.l, experimentTokens0.g, experimentTokens0.e, experimentTokens0.h, experimentTokens0.f};
        for(int v2 = 0; v2 < 6; ++v2) {
            byte[][] arr2_b = arr3_b[v2];
            if(arr2_b != null) {
                for(int v3 = 0; v3 < arr2_b.length; ++v3) {
                    byte[] arr_b1 = arr2_b[v3];
                    if(arr_b1 != null && arr_b1.length != 0) {
                        hlwx0.a(ByteString.copyFrom(arr_b1));
                    }
                }
            }
        }
        return (hlwy)((ProtoLiteBuilder)hlwx0).N_build();
    }
}

