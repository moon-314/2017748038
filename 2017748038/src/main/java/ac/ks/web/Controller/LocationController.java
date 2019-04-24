package ac.ks.web.Controller;

import ac.ks.web.domain.Location;
import ac.ks.web.repository.LocationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LocationController {

    private LocationRepository locationRepository;

    public LocationController(LocationRepository locationRepository) {

        this.locationRepository = locationRepository;
    }

    @GetMapping("/Location")
    public List<String> Location(){

        List<String> locationList = new ArrayList<>();

        for(Location s: locationRepository.findAll()){
            locationList.add(s.getAddress());
        }

        return locationList;
    }
}
