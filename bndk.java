import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;

public final class bndk implements Cloneable {
    public String a;
    public String b;
    public String c;
    public ChannelIdValue d;

    public bndk() {
        this.d = ChannelIdValue.a;
    }

    public bndk(String s, String s1, String s2, ChannelIdValue channelIdValue0) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = channelIdValue0;
    }

    public final bndl a() {
        return new bndl(this.a, this.b, this.c, this.d);
    }

    @Override
    public final Object clone() {
        return new bndk(this.a, this.b, this.c, this.d);
    }
}

