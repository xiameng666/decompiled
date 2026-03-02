import java.util.HashMap;

public enum arnc {
    CHANNEL_WIDTH_UNSPECIFIED(-10),
    CHANNEL_WIDTH_UNKNOWN(-1),
    CHANNEL_WIDTH_20MHZ(0),
    CHANNEL_WIDTH_40MHZ(1),
    CHANNEL_WIDTH_80MHZ(2),
    CHANNEL_WIDTH_160MHZ(3),
    CHANNEL_WIDTH_80MHZ_PLUS_MHZ(4);

    static HashMap h;
    public final int i;

    static {
        arnc.h = new HashMap();
        arnc[] arr_arnc = arnc.values();
        for(int v = 0; v < arr_arnc.length; ++v) {
            arnc arnc0 = arr_arnc[v];
            arnc.h.put(Integer.valueOf(arnc0.i), arnc0);
        }
    }

    private arnc(int v1) {
        this.i = v1;
    }
}

