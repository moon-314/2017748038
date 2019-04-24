package ac.ks.web.repository;

import ac.ks.web.domain.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

    Profile findByNetwork(final String network);
}
