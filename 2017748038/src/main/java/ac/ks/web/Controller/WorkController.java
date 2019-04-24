package ac.ks.web.Controller;

import ac.ks.web.domain.Work;
import ac.ks.web.repository.WorkRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WorkController{

    private WorkRepository workRepository;

    public WorkController(WorkRepository workRepository) {
        this.workRepository = workRepository;
    }

    @GetMapping("/Work")
    public List<String> Work(){

        List<String> workList = new ArrayList<>();

        for(Work s : workRepository.findAll()){
            workList.add(s.getCompany());
        }
        return workList;
    }
}
