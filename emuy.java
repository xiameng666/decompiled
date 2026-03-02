import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.semanticlocationhistory.Persona.LocationAffinity;
import com.google.android.gms.semanticlocationhistory.Persona.PersonaMetadata;
import com.google.android.gms.semanticlocationhistory.Persona.TravelModeAffinity;
import com.google.android.gms.semanticlocationhistory.Persona;
import java.util.List;

public final class emuy implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Persona.PersonaMetadata persona$PersonaMetadata0 = null;
        List list0 = null;
        List list1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    persona$PersonaMetadata0 = (Persona.PersonaMetadata)baua.m(parcel0, v1, Persona.PersonaMetadata.CREATOR);
                    break;
                }
                case 2: {
                    list0 = baua.y(parcel0, v1, Persona.LocationAffinity.CREATOR);
                    break;
                }
                case 3: {
                    list1 = baua.y(parcel0, v1, Persona.TravelModeAffinity.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new Persona(persona$PersonaMetadata0, list0, list1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Persona[v];
    }
}

