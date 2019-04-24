package ac.ks.web.domain;

import ac.ks.web.repository.BasicRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest

public class BasicTest {

    @Autowired
    private BasicRepository basicRepository;

    private Basic savedBasic;

    @Before
    public void init(){
        savedBasic = basicRepository.save(Basic.builder()
        .name("홍길동").label("웹 프로그래머").email("홍길동@메일주소.도메인").phone("000-1234-5678").build());
    }

    @Test
    public void testFindBasic(){
        Basic foundBasic = basicRepository.findById(savedBasic.getIdx()).orElse(null);
        assertThat(foundBasic.getIdx()).isEqualTo(savedBasic.getIdx());
    }

    @Test
    public void testFindNameBasic(){
        Basic foundBasic = basicRepository.findByName("홍길동");
        assertThat(foundBasic.getName()).isEqualTo(savedBasic.getName());
    }
}
