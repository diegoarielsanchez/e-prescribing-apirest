package org.springframework.das.eprescribing.service.userService;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({"jpa", "hsqldb"})
class UserServiceJpaTests extends AbstractUserServiceTests {

}
