package ie.atu.registrationservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @PostMapping("/confirm")
    public String confirmDetails(@RequestBody UserDetails)

}
