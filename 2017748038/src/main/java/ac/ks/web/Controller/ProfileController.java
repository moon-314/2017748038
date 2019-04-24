package ac.ks.web.Controller;

import ac.ks.web.domain.Profile;
import ac.ks.web.repository.LocationRepository;
import ac.ks.web.repository.ProfileRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProfileController {
    private ProfileRepository profileRepository;

    public ProfileController(ProfileRepository profileRepository) {

        this.profileRepository = profileRepository;
    }

    @GetMapping("/Profile")
    public List<String> Profile(){

        List<String> profileList = new ArrayList<>();

        for(Profile s: profileRepository.findAll()){
            profileList.add(s.getNetwork());
        }

        return profileList;
    }
}
