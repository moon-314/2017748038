package ac.ks.web.repository;

import ac.ks.web.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {

    Location findByAddress(final String address);
}
