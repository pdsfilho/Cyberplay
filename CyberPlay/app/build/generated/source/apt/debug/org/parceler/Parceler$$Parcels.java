
package org.parceler;

import java.util.HashMap;
import java.util.Map;
import com.example.paulo.cyberplay.model.Jogo;
import com.example.paulo.cyberplay.model.Jogo$$Parcelable;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2016-05-23T20:43-0300")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class Parceler$$Parcels
    implements Repository<org.parceler.Parcels.ParcelableFactory>
{

    private final Map<Class, org.parceler.Parcels.ParcelableFactory> map$$0 = new HashMap<Class, org.parceler.Parcels.ParcelableFactory>();

    public Parceler$$Parcels() {
        map$$0 .put(Jogo.class, new Parceler$$Parcels.Jogo$$Parcelable$$0());
    }

    public Map<Class, org.parceler.Parcels.ParcelableFactory> get() {
        return map$$0;
    }

    private final static class Jogo$$Parcelable$$0
        implements org.parceler.Parcels.ParcelableFactory<Jogo>
    {


        @Override
        public Jogo$$Parcelable buildParcelable(Jogo input) {
            return new Jogo$$Parcelable(input);
        }

    }

}
