package ac.ks.web.domain;

import ac.ks.web.repository.LocationRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class LocationTest {

    @Autowired
    private LocationRepository locationRepository;

    private Location savedLocation;

    @Before
    public void init(){
        savedLocation = locationRepository.save(Location.builder()
                        .address("부산광역시 OO 구 OO 번길 OOO").postcode("12345").build());
    }

    @Test
    public void testFindLocation(){
        Location foundLocation = locationRepository.findById(savedLocation.getIdx()).orElse(null);
        assertThat(foundLocation.getIdx()).isEqualTo(savedLocation.getIdx());
    }

    @Test
    public void testFindAddressLocation(){
        Location foundLocation = locationRepository.findByAddress("부산광역시 OO 구 OO 번길 OOO");
        assertThat(foundLocation.getAddress()).isEqualTo(savedLocation.getAddress());
    }
}
