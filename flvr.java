import android.content.Context;
import java.nio.ByteBuffer;
import java.util.UUID;

public final class flvr {
    public static ProtoLiteBuilder a(Context context0, UUID uUID0) {
        flcr flcr0 = flcr.a(context0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnwz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hnwz)hftv0).e = 4;
        int v = flcr0.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hnwz)hftv1).b = v;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((hnwz)hftv2).c = 0;
        int v1 = flcr0.b;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((hnwz)hftv3).d = v1;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((hnwz)hftv4).g = 1;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnwz)hftp0.b_message).f = 65;
        hnwz hnwz0 = (hnwz)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hnxl.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hnxl hnxl0 = (hnxl)hftp1.b_message;
        hnwz0.getClass();
        hnxl0.g = hnwz0;
        hnxl0.b |= 1;
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(16);
        byteBuffer0.putLong(uUID0.getMostSignificantBits());
        byteBuffer0.putLong(uUID0.getLeastSignificantBits());
        ByteString hfsf0 = ByteString.copyFrom(byteBuffer0.array());
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hnxl)hftp1.b_message).d = hfsf0;
        return hftp1;
    }

    public static ProtoLiteBuilder b(Context context0, byte[] arr_b, UUID uUID0) {
        ProtoLiteBuilder hftp0 = flvr.a(context0, uUID0);
        ByteString hfsf0 = ByteString.copyFrom(arr_b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnxl)hftp0.b_message).f = hfsf0;
        return hftp0;
    }
}

