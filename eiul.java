import android.os.Build;
import android.util.Log;

public final class eiul {
    public final String a;
    private static final ggfp b;

    static {
        eiul.b = ggfp.K("https://www.googleapis.com/experimentsandconfigs/v1/getExperimentsAndConfigs", "https://tac.googleapis.com/experimentsandconfigs/v1/getExperimentsAndConfigs");
    }

    public eiul(String s) {
        if(!"user".equals(Build.TYPE)) {
            this.a = s;
            return;
        }
        if(eiul.b.contains(s)) {
            this.a = s;
            return;
        }
        this.a = "https://www.googleapis.com/experimentsandconfigs/v1/getExperimentsAndConfigs";
        Log.e("HeterodyneServiceUrl", "Invalid URL provided for Heterodyne: " + s + "; falling back to known valid URL: " + "https://www.googleapis.com/experimentsandconfigs/v1/getExperimentsAndConfigs");
    }
}

