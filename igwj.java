import java.util.Arrays;
import java.util.Locale;

final class igwj extends igvx {
    public final boolean e;
    private final int f;
    private int g;

    public igwj(igvt igvt0) {
        super(igvt0, "IPE Value Group Header");
        boolean z = false;
        this.g = 0;
        igvv igvv0 = igvt0.e();
        this.e(new igwe(igvt0, "VGLength"));
        igvv igvv1 = igvt0.e();
        this.e(new igwl(igvt0, "VGBitMap", Arrays.asList(new String[]{"1", "2", "3", "4", "5", "v"})));
        igvt0.g(igvv1);
        int v = igvt0.c(6);
        this.f = v;
        this.e(new igwt(igvt0, "VGFormatRevision", 4));
        igvt0.g(igvv0);
        igvt0.c(16);
        this.c = igvt0.c;
        switch(v >> 1) {
            case 16: {
                this.g = 1;
                break;
            }
            case 24: {
                this.g = 2;
                break;
            }
            case 28: {
                this.g = 3;
                break;
            }
            case 30: {
                this.g = 4;
                break;
            }
            case 0x1F: {
                this.g = 5;
            }
        }
        if(1 == (v & 1)) {
            z = true;
        }
        this.e = z;
    }

    @Override  // igvx
    public final Object b() {
        return (int)this.g;
    }

    @Override  // igvx
    public final String toString() {
        Integer integer0 = (int)this.g;
        return this.e ? String.format(Locale.UK, "%1$d Value Records Supported. %2$s", integer0, "Value Group Extension is present") : String.format(Locale.UK, "%1$d Value Records Supported. %2$s", integer0, "No Value Group Extension");
    }
}

