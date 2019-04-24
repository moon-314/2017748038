package ac.ks.web.repository;

import ac.ks.web.domain.Work;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkRepository extends JpaRepository<Work, Long> {

    Work findByCompany(final String company);
}
