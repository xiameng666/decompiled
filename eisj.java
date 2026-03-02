import java.util.Arrays;

public final class eisj {
    public final gocn a;
    public eisn b;

    public eisj(String s, int v, String[] arr_s, int[] arr_v, byte[] arr_b, boolean z, String s1) {
        this.b = null;
        goci goci0 = (goci)((ProtoLiteMessage)gocn.a).v_newBuilder();
        if(!goci0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)goci0).ensureMutable();
        }
        ((gocn)goci0.b_message).c = 2;
        ((gocn)goci0.b_message).d = v;
        if(!goci0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)goci0).ensureMutable();
        }
        gocn gocn0 = (gocn)goci0.b_message;
        gocn0.b |= 8;
        gocn0.l = z;
        if(!goci0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)goci0).ensureMutable();
        }
        ((gocn)goci0.b_message).m = 1;
        ((gocn)goci0.b_message).b |= 16;
        if(s != null) {
            if(!goci0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)goci0).ensureMutable();
            }
            gocn gocn1 = (gocn)goci0.b_message;
            gocn1.b |= 1;
            gocn1.g = s;
        }
        if(arr_s != null && arr_s.length > 0) {
            goci0.a(Arrays.asList(arr_s));
        }
        if(arr_v != null && arr_v.length > 0) {
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                goci0.k(arr_v[v1]);
            }
        }
        if(arr_b != null && arr_b.length > 0) {
            ByteString hfsf0 = ByteString.copyFrom(arr_b);
            if(!goci0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)goci0).ensureMutable();
            }
            gocn gocn2 = (gocn)goci0.b_message;
            gocn2.b |= 4;
            gocn2.k = hfsf0;
        }
        if(s1 != null) {
            if(!goci0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)goci0).ensureMutable();
            }
            ((gocn)goci0.b_message).e = 7;
            ((gocn)goci0.b_message).f = s1;
        }
        this.a = (gocn)((ProtoLiteBuilder)goci0).N_build();
    }
}

