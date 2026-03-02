import android.os.IInterface;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

public interface cppl extends IInterface {
    void addInternalUsageAttributionId(bjgw arg1, String arg2);

    int getRendererType();

    void init(bjgw arg1);

    void initV2(bjgw arg1, int arg2);

    void logInitialization(bjgw arg1, int arg2);

    cpst newBitmapDescriptorFactoryDelegate();

    cpph newCameraUpdateFactoryDelegate();

    cppt newMapFragmentDelegate(bjgw arg1);

    cppw newMapViewDelegate(bjgw arg1, GoogleMapOptions arg2);

    cprc newStreetViewPanoramaFragmentDelegate(bjgw arg1);

    cprf newStreetViewPanoramaViewDelegate(bjgw arg1, StreetViewPanoramaOptions arg2);

    void preInit(bjgw arg1);
}

